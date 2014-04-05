package pl.project.core.team;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import pl.project.core.AbstractDaoBean;
import pl.project.domain.TeamBean;

@Component
@Transactional
public class TeamDaoBean extends AbstractDaoBean<TeamBean, Long> implements
		TeamDao {


}
