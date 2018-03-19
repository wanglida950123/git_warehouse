package github_demo.demo.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import github_demo.demo.dao.UserMapper;
import github_demo.demo.entity.User;
import github_demo.demo.service.UserLogin;

@Service
public class UserLoginImp implements UserLogin {

	@Autowired
	private UserMapper userMapper;
	
	public User queryByUid(String uid) {
		return userMapper.selectByPrimaryKey(uid);
	}


}
