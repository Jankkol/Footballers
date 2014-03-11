package pl.project.domain;

import pl.project.core.AbstractBean;

import javax.persistence.*;

@Entity
@Table(name = "TEAM1_HAS_SPOT")
public class HomeTeamBean extends AbstractBean<Long> {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    @Column(name = "SPOT_ID")
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private SpotBean spot;
    @Column(name = "USER_ID")
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private UserBean user;

	@Override
	public Long getId() {
		return id;
	}

    public SpotBean getSpot() {
        return spot;
    }

    public void setSpot(SpotBean spot) {
        this.spot = spot;
    }

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
    }
}
