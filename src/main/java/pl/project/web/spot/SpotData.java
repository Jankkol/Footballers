package pl.project.web.spot;

import pl.project.core.AbstractData;
import pl.project.core.user.UserServiceBean;
import pl.project.domain.ScoreBean;
import pl.project.domain.SpotBean;
import pl.project.domain.TeamBean;
import pl.project.domain.UserBean;

import java.util.LinkedList;
import java.util.List;

public class SpotData extends AbstractData<SpotBean> {

    private ScoreBean score;
    private UserServiceBean userService;
    private List<UserBean> team1 = new LinkedList<UserBean>();
    private List<UserBean> team2 = new LinkedList<UserBean>();

    public List<UserBean> getTeam1() {
        return team1;
    }

    public void setTeam1(List<UserBean> team1) {
        this.team1 = team1;
    }

    public List<UserBean> getTeam2() {
        return team2;
    }

    public void setTeam2(List<UserBean> team2) {
        this.team2 = team2;
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

}
