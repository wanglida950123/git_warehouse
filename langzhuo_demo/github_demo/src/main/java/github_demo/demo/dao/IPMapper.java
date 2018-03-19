package github_demo.demo.dao;

import github_demo.demo.entity.IP;

public interface IPMapper {
    int deleteByPrimaryKey(String id);

    int insert(IP record);

    int insertSelective(IP record);

    IP selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(IP record);

    int updateByPrimaryKey(IP record);
}