package pl.project.web.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.project.core.AbstractData;
import pl.project.domain.UserBean;

public class UserData extends AbstractData<UserBean> {

    private static final Logger log = LoggerFactory
            .getLogger(UserData.class);

    public void mojaMetoda(){
        log.error("Metoda z user Data");
    }

}
