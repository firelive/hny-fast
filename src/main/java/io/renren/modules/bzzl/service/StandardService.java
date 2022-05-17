package io.renren.modules.bzzl.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.bzzl.entity.PatentEntity;
import io.renren.modules.bzzl.entity.StandardEntity;
import io.renren.modules.bzzl.entity.StanddowEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 *
 * @author Huang
 * @email 779392333@qq.com
 * @date 2022-02-24 16:39:25
 */
public interface StandardService extends IService<StandardEntity> {

    PageUtils queryPage(Map<String, Object> params);

//    List<List<Integer>> updateDelete(List<Integer> params);
//    void updateDelete(StandardEntity id);

    boolean updateDelete(StandardEntity standard);

    List<StanddowEntity> queryDataList();
}

