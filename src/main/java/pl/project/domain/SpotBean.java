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
    private List<HomeTeamBean> homeTeam;
    @OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
    private List<AwayTeamBean> awayTeam;
    @OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
    private List<SpotScoreBean> score;

	@Override
	public Long getId() {
		return id;
	}

    public List<HomeTeamBean> getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(List<HomeTeamBean> homeTeam) {
        this.homeTeam = homeTeam;
    }

    public List<AwayTeamBean> getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(List<AwayTeamBean> awayTeam) {
        this.awayTeam = awayTeam;
    }

    public List<SpotScoreBean> getScore() {
        return score;
    }

    public void setScore(List<SpotScoreBean> score) {
        this.score = score;
    }
}
