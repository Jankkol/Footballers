package pl.project.domain;

import javax.persistence.*;

import pl.project.core.AbstractBean;

import java.util.List;

@Entity
@Table(name = "SPOT")
public class SpotBean extends AbstractBean<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<TeamBean> homeTeam;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<TeamBean> awayTeam;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ScoreBean> score;

    @Override
    public Long getId() {
        return id;
    }

    public List<TeamBean> getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(List<TeamBean> homeTeam) {
        this.homeTeam = homeTeam;
    }

    public List<TeamBean> getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(List<TeamBean> awayTeam) {
        this.awayTeam = awayTeam;
    }

    public List<ScoreBean> getScore() {
        return score;
    }

    public void setScore(List<ScoreBean> score) {
        this.score = score;
    }
}
