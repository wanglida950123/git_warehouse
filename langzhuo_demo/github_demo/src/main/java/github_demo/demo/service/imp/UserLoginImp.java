package github_demo.demo.service.imp;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

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

	public String loginValidata(Model model, String username, String password) {
		String result = "";
		User user = userMapper.selectByPrimaryKey(username);
		if(user == null){
			result = "该用户不存在";
			model.addAttribute("result", result);
		}else{
			try {
				if(password != null && password.equals(user.getMm())){
					if(InetAddress.getLocalHost().getHostAddress() == user.getIp()){
						result = "/ks/list";
					}else{
						result = "IP地址错误";
						model.addAttribute("result", result);
					}
				}else{
					result = "密码输入错误";
					model.addAttribute("result", result);
				}
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}


}
