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
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private TeamBean homeTeam;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private TeamBean awayTeam;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ScoreBean> score;

    @Override
    public Long getId() {
        return id;
    }

    public TeamBean getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(TeamBean homeTeam) {
        this.homeTeam = homeTeam;
    }

    public TeamBean getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(TeamBean awayTeam) {
        this.awayTeam = awayTeam;
    }

    public List<ScoreBean> getScore() {
        return score;
    }

    public void setScore(List<ScoreBean> score) {
        this.score = score;
    }
}
