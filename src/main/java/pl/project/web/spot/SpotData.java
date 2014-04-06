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
    private UserBean team1user1 = new UserBean();
    private UserBean team1user2 = new UserBean();
    private UserBean team2user1 = new UserBean();
    private UserBean team2user2 = new UserBean();

    public UserBean getTeam1user1() {
        return team1user1;
    }

    public void setTeam1user1(UserBean team1user1) {
        this.team1user1 = team1user1;
    }

    public UserBean getTeam1user2() {
        return team1user2;
    }

    public void setTeam1user2(UserBean team1user2) {
        this.team1user2 = team1user2;
    }

    public UserBean getTeam2user1() {
        return team2user1;
    }

    public void setTeam2user1(UserBean team2user1) {
        this.team2user1 = team2user1;
    }

    public UserBean getTeam2user2() {
        return team2user2;
    }

    public void setTeam2user2(UserBean team2user2) {
        this.team2user2 = team2user2;
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
