package pl.project.domain;

import javax.persistence.*;

import pl.project.core.AbstractBean;

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
    private UserBean homeTeam;
    @OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
    private UserBean awayTeam;
    private int[] homeScore;
    private int[] awayScore;

	@Override
	public Long getId() {
		return id;
	}

    public UserBean getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(UserBean homeTeam) {
        this.homeTeam = homeTeam;
    }

    public UserBean getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(UserBean awayTeam) {
        this.awayTeam = awayTeam;
    }

    public int[] getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(int[] homeScore) {
        this.homeScore = homeScore;
    }

    public int[] getAwayScore() {
        return awayScore;
    }

    public void setAwayScore(int[] awayScore) {
        this.awayScore = awayScore;
    }
}
