package github_demo.demo.service;

import github_demo.demo.entity.User;

public interface UserLogin {
	
	User queryByUid(String uid);

}
