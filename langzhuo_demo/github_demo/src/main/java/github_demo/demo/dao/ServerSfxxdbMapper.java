package github_demo.demo.dao;

import github_demo.demo.entity.ServerSfxxdb;

public interface ServerSfxxdbMapper {
    int deleteByPrimaryKey(Long sfxxdbId);

    int insert(ServerSfxxdb record);

    int insertSelective(ServerSfxxdb record);

    ServerSfxxdb selectByPrimaryKey(Long sfxxdbId);

    int updateByPrimaryKeySelective(ServerSfxxdb record);

    int updateByPrimaryKeyWithBLOBs(ServerSfxxdb record);

    int updateByPrimaryKey(ServerSfxxdb record);
}