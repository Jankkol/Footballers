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

    private UserBean firstTeamUserOne;
    private UserBean firstTeamUserTwo;
    private UserBean secondTeamUserOne;
    private UserBean secondTeamUserTwo;
    private String firstMatch;
    private String secondMatch;
    private String thirdMatch;

    public UserBean getFirstTeamUserOne() {
        return firstTeamUserOne;
    }

    public void setFirstTeamUserOne(UserBean firstTeamUserOne) {
        this.firstTeamUserOne = firstTeamUserOne;
    }

    public UserBean getFirstTeamUserTwo() {
        return firstTeamUserTwo;
    }

    public void setFirstTeamUserTwo(UserBean firstTeamUserTwo) {
        this.firstTeamUserTwo = firstTeamUserTwo;
    }

    public UserBean getSecondTeamUserOne() {
        return secondTeamUserOne;
    }

    public void setSecondTeamUserOne(UserBean secondTeamUserOne) {
        this.secondTeamUserOne = secondTeamUserOne;
    }

    public UserBean getSecondTeamUserTwo() {
        return secondTeamUserTwo;
    }

    public void setSecondTeamUserTwo(UserBean secondTeamUserTwo) {
        this.secondTeamUserTwo = secondTeamUserTwo;
    }

    public String getFirstMatch() {
        return firstMatch;
    }

    public void setFirstMatch(String firstMatch) {
        this.firstMatch = firstMatch;
    }

    public String getSecondMatch() {
        return secondMatch;
    }

    public void setSecondMatch(String secondMatch) {
        this.secondMatch = secondMatch;
    }

    public String getThirdMatch() {
        return thirdMatch;
    }

    public void setThirdMatch(String thirdMatch) {
        this.thirdMatch = thirdMatch;
    }
}
