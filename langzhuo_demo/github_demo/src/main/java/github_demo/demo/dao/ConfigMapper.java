package github_demo.demo.dao;

import github_demo.demo.entity.Config;

public interface ConfigMapper {
    int deleteByPrimaryKey(String name);

    int insert(Config record);

    int insertSelective(Config record);

    Config selectByPrimaryKey(String name);

    int updateByPrimaryKeySelective(Config record);

    int updateByPrimaryKey(Config record);
}