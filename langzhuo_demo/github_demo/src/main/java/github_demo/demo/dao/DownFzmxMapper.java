package github_demo.demo.dao;

import github_demo.demo.entity.DownFzmx;

public interface DownFzmxMapper {
    int deleteByPrimaryKey(Long fzmxId);

    int insert(DownFzmx record);

    int insertSelective(DownFzmx record);

    DownFzmx selectByPrimaryKey(Long fzmxId);

    int updateByPrimaryKeySelective(DownFzmx record);

    int updateByPrimaryKey(DownFzmx record);
}