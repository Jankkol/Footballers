package pl.project.domain;

import pl.project.core.AbstractBean;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "SPOT_HAS_SCORE")
public class SpotScoreBean extends AbstractBean<Long> {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    @Column(name = "SPOT_ID")
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private SpotBean spot;
    @Column(name = "SCORE_ID")
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private ScoreBean score;

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

    public ScoreBean getScore() {
        return score;
    }

    public void setScore(ScoreBean score) {
        this.score = score;
    }
}

