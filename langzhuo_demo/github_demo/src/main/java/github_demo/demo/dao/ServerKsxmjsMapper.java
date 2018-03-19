package github_demo.demo.dao;

import github_demo.demo.entity.ServerKsxmjs;

public interface ServerKsxmjsMapper {
    int deleteByPrimaryKey(Long xmjsId);

    int insert(ServerKsxmjs record);

    int insertSelective(ServerKsxmjs record);

    ServerKsxmjs selectByPrimaryKey(Long xmjsId);

    int updateByPrimaryKeySelective(ServerKsxmjs record);

    int updateByPrimaryKey(ServerKsxmjs record);
}