package github_demo.demo.service;

import org.springframework.ui.Model;

import github_demo.demo.entity.User;

public interface UserLogin {
	
	User queryByUid(String uid);
	
	String loginValidata(Model model, String username, String password);

}
