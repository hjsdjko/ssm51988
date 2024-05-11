package com.dao;

import com.entity.XinshangcaipinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XinshangcaipinVO;
import com.entity.view.XinshangcaipinView;


/**
 * 新上菜品
 * 
 * @author 
 * @email 
 * @date 2021-04-21 14:16:56
 */
public interface XinshangcaipinDao extends BaseMapper<XinshangcaipinEntity> {
	
	List<XinshangcaipinVO> selectListVO(@Param("ew") Wrapper<XinshangcaipinEntity> wrapper);
	
	XinshangcaipinVO selectVO(@Param("ew") Wrapper<XinshangcaipinEntity> wrapper);
	
	List<XinshangcaipinView> selectListView(@Param("ew") Wrapper<XinshangcaipinEntity> wrapper);

	List<XinshangcaipinView> selectListView(Pagination page,@Param("ew") Wrapper<XinshangcaipinEntity> wrapper);
	
	XinshangcaipinView selectView(@Param("ew") Wrapper<XinshangcaipinEntity> wrapper);
	
}
