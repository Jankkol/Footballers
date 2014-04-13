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
    @Column(name = "FIRST_MATCH")
    private String firstMatch;
    @Column(name = "SECOND_MATCH")
    private String secondMatch;
    @Column(name = "THIRD_MATCH")
    private String thirdMatch;

	@Override
	public Long getId() {
		return id;
	}

    public String getFirstMatch() {
        return firstMatch;
    }

    public void setFirstMatch(String firstMatch) {
        this.firstMatch = firstMatch;
    }

    public String getSecondMatch() {
        return secondMatch;
    }

    public void setSecondMatch(String secondMatch) {
        this.secondMatch = secondMatch;
    }

    public String getThirdMatch() {
        return thirdMatch;
    }

    public void setThirdMatch(String thirdMatch) {
        this.thirdMatch = thirdMatch;
    }
}
