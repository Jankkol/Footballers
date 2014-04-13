package pl.project.web.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import pl.project.core.user.UserDaoBean;
import pl.project.core.user.UserService;
import pl.project.domain.UserBean;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Handles requests for the application home page.
 */

@SuppressWarnings("deprecation")
@Controller
@RequestMapping(value = "/userForm.htm")
public class UserFormController extends SimpleFormController {
	private static final Logger log = LoggerFactory.getLogger(UserFormController.class);

	private UserService userService;

	public UserFormController() {
		super();
		setCommandClass(UserData.class);
		setCommandName("form");
		setFormView("userForm");
		setSuccessView("redirect:/userList.htm");
	}

	@Override
	protected Map<String, Object> referenceData(HttpServletRequest request, Object command, Errors errors) throws Exception {
		log.info("referenceData");
        Map<String, Object> model = new HashMap<String, Object>();

        return model;
	}

	@Override
	protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command, BindException errors) throws Exception {
		log.error("onSubmit");
		UserData formData = (UserData) command;
		log.error("Tutaj zapisujesz " + formData.getBean().getFirstName() + ", " + formData.getBean().getLastName()
				+ " przez service jesli obiekt jest nowy.");
		userService.saveOrUpdate(formData.getBean());
		return new ModelAndView(getSuccessView());
	}

	@Override
	protected Object formBackingObject(HttpServletRequest request) throws Exception {
		UserData userData = new UserData();
		String id = request.getParameter("id");
		UserBean ub = null;
		if (id != null && !"".equals(id)) {
			log.info("Biore obiekt z serwisu.");
			ub = userService.get(Long.valueOf(id));
			userData.setBean(ub);
			// return
		}
		if (ub == null) {
			if (ub == null)
				log.info("Tworze nowy obiekt.");
			ub = new UserBean();
		}
		userData.setBean(ub);
		return userData;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}
