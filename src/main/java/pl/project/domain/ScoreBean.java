package pl.project.domain;

import pl.project.core.AbstractBean;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "SCORE")
public class ScoreBean extends AbstractBean<Long> {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    @Column(name = "HOME_SCORE")
    private int homeScore;
    @Column(name = "AWAY_SCORE")
    private int awayScore;

	@Override
	public Long getId() {
		return id;
	}

    public int getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(int homeScore) {
        this.homeScore = homeScore;
    }

    public int getAwayScore() {
        return awayScore;
    }

    public void setAwayScore(int awayScore) {
        this.awayScore = awayScore;
    }

}
