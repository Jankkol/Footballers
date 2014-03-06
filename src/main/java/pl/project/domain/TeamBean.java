package pl.project.domain;

import pl.project.core.AbstractBean;

import javax.persistence.*;

@Entity
@Table(name = "TEAM")
// @NamedQueries({
// @NamedQuery(name = "spot.getByRound", query =
// "Select s from Spot s where s.round = :round"),
// @NamedQuery(name = "spot.getByid", query =
// "Select s from Spot s where s.id = :id"),
// @NamedQuery(name = "spot.getAll", query = "Select s from Spot s ") })
public class TeamBean extends AbstractBean<Long> {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    @OneToOne(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
    private UserBean user1;
    @OneToOne(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
    private UserBean user2;


    public UserBean getUser2() {
        return user2;
    }

    public void setUser2(UserBean user2) {
        this.user2 = user2;
    }
    public UserBean getUser1() {
        return user1;
    }
    public void setUser1(UserBean user1) {
        this.user1 = user1;
    }

    @Override
	public Long getId() {
		return id;
	}

}
