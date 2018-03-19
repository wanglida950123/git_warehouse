package github_demo.demo.dao;

import github_demo.demo.entity.CzlogCar;

public interface CzlogCarMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CzlogCar record);

    int insertSelective(CzlogCar record);

    CzlogCar selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CzlogCar record);

    int updateByPrimaryKey(CzlogCar record);
}