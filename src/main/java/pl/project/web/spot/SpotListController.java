package pl.project.web.spot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.SimpleFormController;
import pl.project.core.spot.SpotServiceBean;
import pl.project.core.user.UserServiceBean;
import pl.project.domain.SpotBean;
import pl.project.domain.UserBean;
import pl.project.web.user.UserData;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping(value = "/spotList.htm")
public class SpotListController extends SimpleFormController {

    private static final Logger log = LoggerFactory
            .getLogger(SpotListController.class);

    private SpotServiceBean spotService;

    public SpotListController() {
        super();
        setCommandClass(UserData.class);
        setCommandName("form");
        setFormView("spotList");
        setSuccessView("redirect:/spotSave.htm");
    }

    @Override
    protected Map<String, List<SpotBean>> referenceData(HttpServletRequest request) throws Exception {
        Map<String, List<SpotBean>> result = new HashMap<String, List<SpotBean>>();

        List<SpotBean> spots = spotService.getAll();
        result.put("spots", spots);

        return result;
    }

    public SpotServiceBean getSpotService() {
        return spotService;
    }

    public void setSpotService(SpotServiceBean spotService) {
        this.spotService = spotService;
    }
}
