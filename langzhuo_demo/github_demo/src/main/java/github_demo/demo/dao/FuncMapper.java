package github_demo.demo.dao;

import github_demo.demo.entity.Func;

public interface FuncMapper {
    int deleteByPrimaryKey(String funcid);

    int insert(Func record);

    int insertSelective(Func record);

    Func selectByPrimaryKey(String funcid);

    int updateByPrimaryKeySelective(Func record);

    int updateByPrimaryKey(Func record);
}