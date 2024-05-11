package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussxinshangcaipinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussxinshangcaipinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussxinshangcaipinView;


/**
 * 新上菜品评论表
 *
 * @author 
 * @email 
 * @date 2021-04-21 14:16:56
 */
public interface DiscussxinshangcaipinService extends IService<DiscussxinshangcaipinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussxinshangcaipinVO> selectListVO(Wrapper<DiscussxinshangcaipinEntity> wrapper);
   	
   	DiscussxinshangcaipinVO selectVO(@Param("ew") Wrapper<DiscussxinshangcaipinEntity> wrapper);
   	
   	List<DiscussxinshangcaipinView> selectListView(Wrapper<DiscussxinshangcaipinEntity> wrapper);
   	
   	DiscussxinshangcaipinView selectView(@Param("ew") Wrapper<DiscussxinshangcaipinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussxinshangcaipinEntity> wrapper);
   	
}

