package github_demo.demo.contorller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import github_demo.demo.service.UserLogin;

@Controller
@RequestMapping("/ks")
public class UserLoginAction {
	
	@Autowired
	private UserLogin userLogin;
	
	@RequestMapping("/login")
	public String login(Model model,@RequestParam(required=true) String username, @RequestParam(required=true) String password){
		String result = userLogin.loginValidata(model, username, password);
		return result;
	}
	

}
