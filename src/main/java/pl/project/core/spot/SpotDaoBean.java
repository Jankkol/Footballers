package pl.project.core.spot;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import pl.project.core.AbstractDaoBean;
import pl.project.domain.SpotBean;

@Component
@Transactional
public class SpotDaoBean extends AbstractDaoBean<SpotBean, Long> implements
		SpotDao {

	/*
	 * @SuppressWarnings("unchecked")
	 * 
	 * @Override public List<SpotBean> getAllSpots() { return
	 * sessionFactory.getCurrentSession().getNamedQuery("spot.getAll") .list();
	 * }
	 * 
	 * @Override public SpotBean getSpotById(SpotBean spot) { return (SpotBean)
	 * sessionFactory.getCurrentSession().getNamedQuery("spot.getByid")
	 * .setInteger("id", spot.getId()).uniqueResult(); }
	 * 
	 * @SuppressWarnings("unchecked")
	 * 
	 * @Override public List<SpotBean> getSpotsByRound(int round) { return
	 * sessionFactory.getCurrentSession()
	 * .getNamedQuery("spot.getByRound").setInteger("round", round) .list(); }
	 */

}
