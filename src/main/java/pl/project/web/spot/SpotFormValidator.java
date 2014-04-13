package pl.project.web.spot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class SpotFormValidator implements Validator {

	private static final Logger log = LoggerFactory
			.getLogger(SpotFormValidator.class);

	@Override
	public boolean supports(Class<?> clazz) {
		return SpotData.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {

	}

}
