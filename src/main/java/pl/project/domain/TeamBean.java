package pl.project.domain;

import pl.project.core.AbstractBean;

import javax.persistence.*;

import java.util.List;

@Entity
@Table(name = "TEAM")
public class TeamBean extends AbstractBean<Long> {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
	private Long id;

	@ManyToOne
    @JoinColumn(name = "FIRST_USER", nullable = true)
    private UserBean firstUsers;
	
	@ManyToOne
    @JoinColumn(name = "SECOND_USER", nullable = true)
    private UserBean secondUser;

	@Override
	public Long getId() {
		return id;
	}

	public UserBean getFirstUsers() {
		return firstUsers;
	}

	public void setFirstUsers(UserBean firstUsers) {
		this.firstUsers = firstUsers;
	}

	public UserBean getSecondUser() {
		return secondUser;
	}

	public void setSecondUser(UserBean secondUser) {
		this.secondUser = secondUser;
	}
}
