package pl.project.web.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.project.core.user.UserDao;


@Controller
@RequestMapping(value = "/userlist.htm")
public class UserListController {

    private static final Logger log = LoggerFactory
            .getLogger(UserListController.class);

    private UserDao userDao;

    @Override
    public ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object command, BindException errors) throws Exception {
        log.error("handle");
        ModelAndView mv = super.handle(request, response, command, errors);
        log.error("handle");
        return mv;
    }

    public UserListController() {
        super();
        setListView("userList");
        //setRemoveView("userRemove");
        //setContinueView("usersuccessfulremove.htm");
    }

    @Override
    protected Map<String, Object> referenceData(HttpServletRequest request) throws Exception {
        Map<String, Object> result = new HashMap<String, Object>();
        return result;
    }


    @Override
    protected ModelAndView handleDeleteInternal(HttpServletRequest request, HttpServletResponse response, Object command, BindException errors)
            throws Exception {
        log.error("handleDeleteInternal");

        if (!hasEditPrivilege()) {
            throw new Exception("Lack of privileges");
        }

        userAccessControl.checkUserManagementAccess();

        List<String> loggedUsers = filterCurrentlyLoggedUsers(((ListFilterAbstract<UserBean, String>) command).getRemoveItems());
        List<UserBean> removeItems = filterItemsToRemove(((ListFilterAbstract<UserBean, String>) command).getRemoveItems());
        Map model = errors.getModel();
        model.put(getCommandName(), command);
        model.put("loggedUsers", loggedUsers);
        log.info("getRemoveView: " + getRemoveView());
        log.exit("handleDeleteInternal");
        return new ModelAndView(getRemoveView(), deleteReferenceData(removeItems, model));
    }

    @Override
    protected ModelAndView removeConfirmation(HttpServletRequest request, HttpServletResponse response, Object command, BindException errors) throws Exception {
        log.entry("removeConfirmation");

        return new ModelAndView(getContinueView(), model);
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }

}
