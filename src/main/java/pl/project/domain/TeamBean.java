package pl.project.domain;

import pl.project.core.AbstractBean;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "TEAM1_HAS_SPOT")
public class TeamBean extends AbstractBean<Long> {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<UserBean> users;

	@Override
	public Long getId() {
		return id;
	}

    public List<UserBean> getUsers() {
        return users;
    }

    public void setUsers(List<UserBean> users) {
        this.users = users;
    }
}
