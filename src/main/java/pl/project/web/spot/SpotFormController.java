package pl.project.web.spot;

import java.beans.PropertyEditorSupport;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import pl.project.core.score.ScoreService;
import pl.project.core.spot.SpotService;
import pl.project.core.user.UserService;
import pl.project.domain.ScoreBean;
import pl.project.domain.SpotBean;
import pl.project.domain.TeamBean;
import pl.project.domain.UserBean;

/**
 * Handles requests for the application home page.
 */

@SuppressWarnings("deprecation")
@Controller
@RequestMapping(value = "/spotForm.htm")
public class SpotFormController extends SimpleFormController {
	private static final Logger log = LoggerFactory
			.getLogger(SpotFormController.class);

	private SpotService spotService;
    private UserService userService;
    private ScoreService scoreService;

	public SpotFormController() {
		super();
		setCommandClass(SpotData.class);
		setCommandName("form");
		setFormView("spotForm");
		setSuccessView("redirect:/spotList.htm");
	}

	@Override
	protected Map<String, List<UserBean>> referenceData(HttpServletRequest request,
			Object command, Errors errors) throws Exception {
        Map<String, List<UserBean>> result = new HashMap<String, List<UserBean>>();

        List<UserBean> users = userService.getAll();

        result.put("users", users);

        return result;
	}
	
	@Override
    protected void initBinder(final HttpServletRequest request, final ServletRequestDataBinder binder) throws Exception {
        binder.registerCustomEditor(UserBean.class, "firstTeamUserOne", new UserPropertyEditor(userService));
        binder.registerCustomEditor(UserBean.class, "firstTeamUserTwo", new UserPropertyEditor(userService));
        binder.registerCustomEditor(UserBean.class, "secondTeamUserOne", new UserPropertyEditor(userService));
        binder.registerCustomEditor(UserBean.class, "secondTeamUserTwo", new UserPropertyEditor(userService));
    }

	@Override
	protected ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {

		SpotData formData = (SpotData) command;
        TeamBean teamBean1 = new TeamBean();
        teamBean1.setFirstUser(formData.getFirstTeamUserOne());
        teamBean1.setSecondUser(formData.getFirstTeamUserTwo());

        TeamBean teamBean2 = new TeamBean();
        teamBean2.setFirstUser(formData.getSecondTeamUserOne());
        teamBean2.setSecondUser(formData.getSecondTeamUserTwo());

        ScoreBean score = new ScoreBean();
        score.setFirstMatch(formData.getFirstMatch());
        score.setSecondMatch(formData.getSecondMatch());
        score.setThirdMatch(formData.getThirdMatch());

        formData.getBean().setHomeTeam(teamBean1);
        formData.getBean().setAwayTeam(teamBean2);
        formData.getBean().setScore(score);

        spotService.saveOrUpdate(formData.getBean());
		return new ModelAndView(getSuccessView());
	}

	@Override
	protected Object formBackingObject(HttpServletRequest request)
			throws Exception {
		SpotData spotData =new SpotData();
		String id = request.getParameter("id");
		SpotBean spot = null;
		if (id != null && !"".equals(id)) {
            log.info("Biore obiekt z serwisu");
            spot = spotService.get(Long.valueOf(id));
            spotData.setBean(spot);
            spotData.setFirstTeamUserOne(spot.getHomeTeam().getFirstUser());
            spotData.setFirstTeamUserTwo(spot.getHomeTeam().getSecondUser());
            spotData.setSecondTeamUserOne(spot.getAwayTeam().getFirstUser());
            spotData.setSecondTeamUserTwo(spot.getAwayTeam().getSecondUser());
            spotData.setFirstMatch(spot.getScore().getFirstMatch());
            spotData.setFirstMatch(spot.getScore().getSecondMatch());
            spotData.setFirstMatch(spot.getScore().getThirdMatch());
		}
		if (spot == null) {
			log.info("Tworze nowy obiekt.");
			spot = new SpotBean();
		}
		spotData.setBean(spot);
		return spotData;
	}

	public SpotService getSpotService() {
		return spotService;
	}

	public void setSpotService(SpotService spotService) {
		this.spotService = spotService;
	}

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public ScoreService getScoreService() {
        return scoreService;
    }

    public void setScoreService(ScoreService scoreService) {
        this.scoreService = scoreService;
    }

}
