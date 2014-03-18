package pl.project.web.user;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.SimpleFormController;
import pl.project.core.user.UserDaoBean;
import pl.project.domain.UserBean;


@Controller
@RequestMapping(value = "/userList.htm")
public class UserListController extends SimpleFormController {

    private static final Logger log = LoggerFactory
            .getLogger(UserListController.class);

    private UserDaoBean userDao;

    public UserListController() {
        super();
        setCommandClass(UserData.class);
        setCommandName("form");
        setFormView("userList");
        setSuccessView("redirect:/userSave.htm");
    }

    @Override
    protected Map<String, List<UserBean>> referenceData(HttpServletRequest request) throws Exception {
        Map<String, List<UserBean>> result = new HashMap<String, List<UserBean>>();

        List<UserBean> users = userDao.getAllUsers();
        log.error(users.get(0).getFirstName());
        result.put("users", users);

        return result;
    }

    public String removeAd(@RequestParam("user") long userId) {
        UserBean ub = getUserDao().get(userId);
        log.error(ub.getFirstName());
        getUserDao().delete(ub);
        return "redirect:/userList";
    }

    public UserDaoBean getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDaoBean userDao) {
        this.userDao = userDao;
    }
}
