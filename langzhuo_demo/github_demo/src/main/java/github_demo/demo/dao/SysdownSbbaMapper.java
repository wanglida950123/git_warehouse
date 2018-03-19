package github_demo.demo.dao;

import github_demo.demo.entity.SysdownSbba;

public interface SysdownSbbaMapper {
    int deleteByPrimaryKey(String xh);

    int insert(SysdownSbba record);

    int insertSelective(SysdownSbba record);

    SysdownSbba selectByPrimaryKey(String xh);

    int updateByPrimaryKeySelective(SysdownSbba record);

    int updateByPrimaryKey(SysdownSbba record);
}