package github_demo.demo.service.imp;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import github_demo.demo.dao.UserMapper;
import github_demo.demo.entity.User;
import github_demo.demo.service.UserLogin;

@Service
public class UserLoginImp implements UserLogin {

	@Autowired
	private UserMapper userMapper;

	public String loginValidata(String username, String password) {
		String result = "";
		User user = userMapper.selectByPrimaryKey(username);
		if(user == null){
			result = "���û�������";
		}else{
			try {
				if(password != null && "EDdZ3ax/nngh/NvftsNwwae9F5uPTzBgWuZJbpQYwn4=".equals(user.getMm())){
					if(InetAddress.getLocalHost().getHostAddress().toString().equals("192.168.1.4")){
						result = "success";
					}else{
						result = "IP��ַ����";
					}
				}else{
					result = "�����������";
				}
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}


}
