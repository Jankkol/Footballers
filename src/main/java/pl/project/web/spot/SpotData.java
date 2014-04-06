package pl.project.web.spot;

import pl.project.core.AbstractData;
import pl.project.core.user.UserServiceBean;
import pl.project.domain.ScoreBean;
import pl.project.domain.SpotBean;
import pl.project.domain.TeamBean;
import pl.project.domain.UserBean;

import java.util.List;

public class SpotData extends AbstractData<SpotBean> {

    private TeamBean teamBean;
    private ScoreBean score;
    private UserServiceBean userService;
    private List<UserBean> users;

    public TeamBean getTeamBean() {
        return teamBean;
    }

    public void setTeamBean(TeamBean teamBean) {
        this.teamBean = teamBean;
    }

    public ScoreBean getScore() {
        return score;
    }

    public void setScore(ScoreBean score) {
        this.score = score;
    }

    public UserServiceBean getUserService() {
        return userService;
    }

    public void setUserService(UserServiceBean userService) {
        this.userService = userService;
    }

    public List<UserBean> getUsers() {
        return userService.getAll();
    }

    public void setUsers(List<UserBean> users) {
        this.users = users;
    }
}
