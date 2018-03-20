package github_demo.demo.service.imp;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import github_demo.demo.dao.FuncMapper;
import github_demo.demo.entity.Func;
import github_demo.demo.service.FuncService;

@Service
public class FuncServiceImp implements FuncService {

	@Autowired
	private FuncMapper funcMapper;
	
	public List<Func> queryFuncByUid(String uid) {
		
		return funcMapper.selectByUid(uid);
	}
	
}
