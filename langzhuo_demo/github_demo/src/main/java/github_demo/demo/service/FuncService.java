package github_demo.demo.service;

import java.util.List;

import github_demo.demo.entity.Func;

public interface FuncService {
	
	List<Func> queryFuncByUid(String uid);
}
