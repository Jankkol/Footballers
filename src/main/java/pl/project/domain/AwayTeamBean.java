package pl.project.domain;

import pl.project.core.AbstractBean;

import javax.persistence.*;

@Entity
@Table(name = "TEAM2_HAS_SPOT")
public class AwayTeamBean extends AbstractBean<Long> {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    @Column(name = "SPOT_ID")
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private int spot;
    @Column(name = "USER_ID")
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private int user;

	@Override
	public Long getId() {
		return id;
	}

    public int getSpot() {
        return spot;
    }

    public void setSpot(int spot) {
        this.spot = spot;
    }

    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }
}
