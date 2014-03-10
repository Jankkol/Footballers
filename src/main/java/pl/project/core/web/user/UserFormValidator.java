package pl.project.core.web.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import pl.project.web.spot.SpotData;

public class UserFormValidator implements Validator {

	private static final Logger log = LoggerFactory
			.getLogger(UserFormValidator.class);

	@Override
	public boolean supports(Class<?> clazz) {
		return UserData.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		UserData ub = (UserData) target;
		//log.info("Tutaj walidacja: " + sb.getBean().getRound());
		// to jakos inaczej sie robi... zobacz w um, chyba trzeba wypelnic
		// errors i w controllerze sprawdzic (w referenceData albo czyms
		// podobnym)
		// ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName",
		// "required.firstName", "Field text is required.");
	}

}
