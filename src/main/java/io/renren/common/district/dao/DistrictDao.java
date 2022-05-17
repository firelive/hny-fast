package io.renren.common.district.dao;

import io.renren.common.district.entity.District;

import java.util.List;

public interface DistrictDao {

    /**
     *
     *
     */
    List<District> findByParent(Integer parent);


}
