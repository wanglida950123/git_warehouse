package github_demo.demo.dao;

import github_demo.demo.entity.CarSession;

public interface CarSessionMapper {
    int deleteByPrimaryKey(String kcxh);

    int insert(CarSession record);

    int insertSelective(CarSession record);

    CarSession selectByPrimaryKey(String kcxh);

    int updateByPrimaryKeySelective(CarSession record);

    int updateByPrimaryKey(CarSession record);
}