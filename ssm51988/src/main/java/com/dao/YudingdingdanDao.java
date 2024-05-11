package com.dao;

import com.entity.YudingdingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YudingdingdanVO;
import com.entity.view.YudingdingdanView;


/**
 * 预订订单
 * 
 * @author 
 * @email 
 * @date 2021-04-21 14:16:56
 */
public interface YudingdingdanDao extends BaseMapper<YudingdingdanEntity> {
	
	List<YudingdingdanVO> selectListVO(@Param("ew") Wrapper<YudingdingdanEntity> wrapper);
	
	YudingdingdanVO selectVO(@Param("ew") Wrapper<YudingdingdanEntity> wrapper);
	
	List<YudingdingdanView> selectListView(@Param("ew") Wrapper<YudingdingdanEntity> wrapper);

	List<YudingdingdanView> selectListView(Pagination page,@Param("ew") Wrapper<YudingdingdanEntity> wrapper);
	
	YudingdingdanView selectView(@Param("ew") Wrapper<YudingdingdanEntity> wrapper);
	
}
