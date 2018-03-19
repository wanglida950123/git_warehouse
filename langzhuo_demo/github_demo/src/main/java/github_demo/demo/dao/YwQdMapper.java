package github_demo.demo.dao;

import github_demo.demo.entity.YwQd;

public interface YwQdMapper {
    int deleteByPrimaryKey(Long id);

    int insert(YwQd record);

    int insertSelective(YwQd record);

    YwQd selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(YwQd record);

    int updateByPrimaryKey(YwQd record);
}