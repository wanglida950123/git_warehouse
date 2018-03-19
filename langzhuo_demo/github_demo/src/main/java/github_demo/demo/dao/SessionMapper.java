package github_demo.demo.dao;

import github_demo.demo.entity.Session;

public interface SessionMapper {
    int deleteByPrimaryKey(String uid);

    int insert(Session record);

    int insertSelective(Session record);

    Session selectByPrimaryKey(String uid);

    int updateByPrimaryKeySelective(Session record);

    int updateByPrimaryKey(Session record);
}