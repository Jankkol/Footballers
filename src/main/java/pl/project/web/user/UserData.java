package pl.project.web.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestParam;
import pl.project.core.AbstractData;
import pl.project.core.user.UserDaoBean;
import pl.project.domain.UserBean;

public class UserData extends AbstractData<UserBean> {

    private static final Logger log = LoggerFactory
            .getLogger(UserData.class);

    private UserDaoBean userDao;

    public void mojaMetoda(){
        log.error("Metoda z user Data");
    }

    public String removeAd(@RequestParam("user") long userId) {
        log.error("Jestem przed getUserDao");
        UserBean ub = getUserDao().get(userId);
        log.error(ub.getFirstName() + "Jestem w userRemove");
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
