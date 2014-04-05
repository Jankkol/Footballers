package pl.project.core.score;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import pl.project.core.AbstractDaoBean;
import pl.project.domain.ScoreBean;

@Component
@Transactional
public class ScoreDaoBean extends AbstractDaoBean<ScoreBean, Long> implements
		ScoreDao {


}
