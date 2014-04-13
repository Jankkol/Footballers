package pl.project.web.spot;

import java.beans.PropertyEditorSupport;

import pl.project.core.user.UserService;
import pl.project.domain.UserBean;

public class UserPropertyEditor extends PropertyEditorSupport {
	private UserService userService;

	public UserPropertyEditor(UserService userService) {
		this.userService = userService;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		if (!"".equals(text)) {
			Long id = Long.parseLong(text);
			setValue(userService.get(id));
		} else {
			setValue(null);
		}
	}

	@Override
	public String getAsText() {
		UserBean obj = (UserBean) getValue();
		return obj != null ? Long.toString(obj.getId()) : "";
	}
}
