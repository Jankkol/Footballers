package pl.project.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
	private int round;

	/*
	 * @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER) private
	 * List<UserBean> firstTeam;
	 * 
	 * @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER) private
	 * List<UserBean> secondTeam;
	 * 
	 * @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER) private
	 * List<Score> scores;
	 */
	@Override
	public Long getId() {
		return id;
	}

	public int getRound() {
		return round;
	}

	public void setRound(int round) {
		this.round = round;
	}

}
