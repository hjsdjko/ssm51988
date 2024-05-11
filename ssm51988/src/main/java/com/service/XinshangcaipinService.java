package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XinshangcaipinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XinshangcaipinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XinshangcaipinView;


/**
 * 新上菜品
 *
 * @author 
 * @email 
 * @date 2021-04-21 14:16:56
 */
public interface XinshangcaipinService extends IService<XinshangcaipinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XinshangcaipinVO> selectListVO(Wrapper<XinshangcaipinEntity> wrapper);
   	
   	XinshangcaipinVO selectVO(@Param("ew") Wrapper<XinshangcaipinEntity> wrapper);
   	
   	List<XinshangcaipinView> selectListView(Wrapper<XinshangcaipinEntity> wrapper);
   	
   	XinshangcaipinView selectView(@Param("ew") Wrapper<XinshangcaipinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XinshangcaipinEntity> wrapper);
   	
}

