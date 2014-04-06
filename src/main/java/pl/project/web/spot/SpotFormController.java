package pl.project.web.spot;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import pl.project.core.spot.SpotService;
import pl.project.core.user.UserService;
import pl.project.core.user.UserServiceBean;
import pl.project.domain.SpotBean;
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

	public SpotFormController() {
		super();
		setCommandClass(SpotData.class);
		setCommandName("form");
		setFormView("spotForm");
		setSuccessView("redirect:/spotSave.htm");
	}

	@Override
	protected Map<String, List<UserBean>> referenceData(HttpServletRequest request,
			Object command, Errors errors) throws Exception {
        Map<String, List<UserBean>> result = new HashMap<String, List<UserBean>>();

        List<UserBean> users = userService.getAll();
        log.error(users.get(0).getFirstName());
        result.put("users", users);

        return result;
	}

	@Override
	protected ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		log.info("onSubmit");
		SpotData formData = (SpotData) command;
        log.error(formData.getTeam1().get(0).getId().toString());
        log.error(formData.getTeam1().get(1).getId().toString());
		//log.info("Tutaj zapisujesz " + formData.getBean().getRound()
		//		+ " przez service jesli obiekt jest nowy.");
		spotService.saveOrUpdate(formData.getBean());
		return new ModelAndView(getSuccessView());
	}

	@Override
	protected Object formBackingObject(HttpServletRequest request)
			throws Exception {
		SpotData spotData =new SpotData();
		// Tutaj dosylaj parametr z listy (w przypadku edycji), jego brak znaczy
		// ze tworzysz nowy
		String id = request.getParameter("id");
		SpotBean ub = null;
		if (id != null && !"".equals(id)) {
			log.info("Dawaj obiekt po id z service i kopnij go do data.");
			// return
		}
		if (ub == null) {
			log.info("Tworze nowy obiekt.");
			ub = new SpotBean();
		}
		spotData.setBean(ub);
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
}
