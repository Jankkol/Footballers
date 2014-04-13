package pl.project.web.user;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import pl.project.core.user.UserService;
import pl.project.domain.UserBean;

/**
 * Handles requests for the application home page.
 */

@Controller
public class UserFormContinueController {

	private static final Logger log = LoggerFactory
			.getLogger(UserFormContinueController.class);
	private String view;

    private UserService userService;
    
	public UserFormContinueController() {
		setView("/userContinue");
	}

	@RequestMapping(value = "/userSave.htm")
	public ModelAndView save(ModelMap model) {
		log.info("save");
		return new ModelAndView(this.getView(), model);
	}

	@RequestMapping(value = "/userRemove.htm")
	public ModelAndView remove(@RequestParam("user") List<String> users, ModelMap model) {
		
		for(String str: users){
			Long id = Long.valueOf(str);
			UserBean user = userService.get(id);
			userService.delete(user);
		}
		log.info("remove");
		return new ModelAndView(this.getView(), model);
	}

	public String getView() {
		return view;
	}

	public void setView(String view) {
		this.view = view;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}
