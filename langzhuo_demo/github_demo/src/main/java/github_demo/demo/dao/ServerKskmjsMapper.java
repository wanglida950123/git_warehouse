package github_demo.demo.dao;

import github_demo.demo.entity.ServerKskmjs;

public interface ServerKskmjsMapper {
    int deleteByPrimaryKey(Long kmjsId);

    int insert(ServerKskmjs record);

    int insertSelective(ServerKskmjs record);

    ServerKskmjs selectByPrimaryKey(Long kmjsId);

    int updateByPrimaryKeySelective(ServerKskmjs record);

    int updateByPrimaryKeyWithBLOBs(ServerKskmjs record);

    int updateByPrimaryKey(ServerKskmjs record);
}