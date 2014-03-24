package pl.project.web.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.SimpleFormController;
import pl.project.core.user.UserDaoBean;
import pl.project.domain.UserBean;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
public class UserRemoveController extends SimpleFormController {

    private static final Logger log = LoggerFactory
            .getLogger(UserRemoveController.class);

    private UserDaoBean userDao;

    public UserRemoveController() {
        super();
        setCommandClass(UserData.class);
        setCommandName("form");
        setFormView("userRemove");
        setSuccessView("redirect:/userSave.htm");
    }

    public UserDaoBean getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDaoBean userDao) {
        this.userDao = userDao;
    }
}
