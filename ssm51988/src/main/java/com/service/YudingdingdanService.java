package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YudingdingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YudingdingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YudingdingdanView;


/**
 * 预订订单
 *
 * @author 
 * @email 
 * @date 2021-04-21 14:16:56
 */
public interface YudingdingdanService extends IService<YudingdingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YudingdingdanVO> selectListVO(Wrapper<YudingdingdanEntity> wrapper);
   	
   	YudingdingdanVO selectVO(@Param("ew") Wrapper<YudingdingdanEntity> wrapper);
   	
   	List<YudingdingdanView> selectListView(Wrapper<YudingdingdanEntity> wrapper);
   	
   	YudingdingdanView selectView(@Param("ew") Wrapper<YudingdingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YudingdingdanEntity> wrapper);
   	
}

