package pl.project.web.spot;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */

@Controller
public class SpotFormContinueController {

	private static final Logger log = LoggerFactory
			.getLogger(SpotFormContinueController.class);
	private String view;

	public SpotFormContinueController() {
		setView("/spotContinue");
	}

	@RequestMapping(value = "/spotSave.htm")
	public ModelAndView save(ModelMap model) {
		log.info("save");
		return new ModelAndView(this.getView(), model);
	}
	
	@RequestMapping(value = "/spotRemove.htm")
	public ModelAndView remove(ModelMap model) {
		log.info("remove");
		return new ModelAndView(this.getView(), model);
	}

	public String getView() {
		return view;
	}

	public void setView(String view) {
		this.view = view;
	}
}
