package github_demo.demo.dao;

import github_demo.demo.entity.DownKfdm;

public interface DownKfdmMapper {
    int deleteByPrimaryKey(String kfdm);

    int insert(DownKfdm record);

    int insertSelective(DownKfdm record);

    DownKfdm selectByPrimaryKey(String kfdm);

    int updateByPrimaryKeySelective(DownKfdm record);

    int updateByPrimaryKey(DownKfdm record);
}