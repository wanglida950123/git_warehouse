package github_demo.demo.dao;

import github_demo.demo.entity.ServerKskf;

public interface ServerKskfMapper {
    int deleteByPrimaryKey(Long kskfId);

    int insert(ServerKskf record);

    int insertSelective(ServerKskf record);

    ServerKskf selectByPrimaryKey(Long kskfId);

    int updateByPrimaryKeySelective(ServerKskf record);

    int updateByPrimaryKey(ServerKskf record);
}