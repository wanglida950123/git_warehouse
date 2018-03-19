package github_demo.demo.dao;

import github_demo.demo.entity.YwSfsb;

public interface YwSfsbMapper {
    int deleteByPrimaryKey(Long id);

    int insert(YwSfsb record);

    int insertSelective(YwSfsb record);

    YwSfsb selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(YwSfsb record);

    int updateByPrimaryKeyWithBLOBs(YwSfsb record);

    int updateByPrimaryKey(YwSfsb record);
}