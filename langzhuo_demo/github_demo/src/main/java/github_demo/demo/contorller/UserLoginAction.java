package github_demo.demo.contorller;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

import org.apache.ibatis.annotations.Param;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import github_demo.demo.entity.User;
import github_demo.demo.service.UserLogin;

@Controller
@RequestMapping("/ks")
public class UserLoginAction {
	
	@Autowired
	private UserLogin userLogin;
	
	@RequestMapping("/login")
	public String login(Model model,@RequestParam(required=true) String username, @RequestParam(required=true) String password){
		String result = "";
		if(userLogin.queryByUid(username) == null){
			result = "该用户不存在";
			model.addAttribute("result", result);
		}else{
			try {
				User user = userLogin.queryByUid(username);
				if(InetAddress.getLocalHost().getHostAddress() == user.getIp()){
					if(password != null && password.equals(user.getMm())){
						result = "/ks/list";
					}else{
						result = "密码输入错误";
						model.addAttribute("result", result);
					}
				}else{
					result = "IP地址错误";
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
