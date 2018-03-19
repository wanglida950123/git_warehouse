package github_demo.demo.dao;

import github_demo.demo.entity.Status;

public interface StatusMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Status record);

    int insertSelective(Status record);

    Status selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Status record);

    int updateByPrimaryKey(Status record);
}