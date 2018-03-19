package github_demo.demo.dao;

import github_demo.demo.entity.ServerKsgctp;

public interface ServerKsgctpMapper {
    int deleteByPrimaryKey(Long gczpId);

    int insert(ServerKsgctp record);

    int insertSelective(ServerKsgctp record);

    ServerKsgctp selectByPrimaryKey(Long gczpId);

    int updateByPrimaryKeySelective(ServerKsgctp record);

    int updateByPrimaryKeyWithBLOBs(ServerKsgctp record);

    int updateByPrimaryKey(ServerKsgctp record);
}