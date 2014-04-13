package pl.project.web.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

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


	}

}
