package pl.project.domain;

import javax.persistence.*;

import pl.project.core.AbstractBean;

import java.util.List;

@Entity
@Table(name = "SPOT")
// @NamedQueries({
// @NamedQuery(name = "spot.getByRound", query =
// "Select s from Spot s where s.round = :round"),
// @NamedQuery(name = "spot.getByid", query =
// "Select s from Spot s where s.id = :id"),
// @NamedQuery(name = "spot.getAll", query = "Select s from Spot s ") })
public class SpotBean extends AbstractBean<Long> {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    @OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
    private HomeTeamBean homeTeam;
    @OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
    private AwayTeamBean awayTeam;
    private List<ScoreBean> score;

	@Override
	public Long getId() {
		return id;
	}

    public HomeTeamBean getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(HomeTeamBean homeTeam) {
        this.homeTeam = homeTeam;
    }

    public AwayTeamBean getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(AwayTeamBean awayTeam) {
        this.awayTeam = awayTeam;
    }

    public List<ScoreBean> getScore() {
        return score;
    }

    public void setScore(List<ScoreBean> score) {
        this.score = score;
    }
}
