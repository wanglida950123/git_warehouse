package github_demo.demo.dao;

import github_demo.demo.entity.DownKsyy;

public interface DownKsyyMapper {
    int deleteByPrimaryKey(Long ksyyId);

    int insert(DownKsyy record);

    int insertSelective(DownKsyy record);

    DownKsyy selectByPrimaryKey(Long ksyyId);

    int updateByPrimaryKeySelective(DownKsyy record);

    int updateByPrimaryKey(DownKsyy record);
}