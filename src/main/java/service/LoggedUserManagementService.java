package service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

@Service
@SessionScope
public class LoggedUserManagementService {

	private String username;
	
	public void setUsername(String name) {
		username = name;
	}
	
	public String getUsername() {
		return username;
	}
	
}
