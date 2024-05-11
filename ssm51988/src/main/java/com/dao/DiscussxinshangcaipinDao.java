package com.dao;

import com.entity.DiscussxinshangcaipinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussxinshangcaipinVO;
import com.entity.view.DiscussxinshangcaipinView;


/**
 * 新上菜品评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-21 14:16:56
 */
public interface DiscussxinshangcaipinDao extends BaseMapper<DiscussxinshangcaipinEntity> {
	
	List<DiscussxinshangcaipinVO> selectListVO(@Param("ew") Wrapper<DiscussxinshangcaipinEntity> wrapper);
	
	DiscussxinshangcaipinVO selectVO(@Param("ew") Wrapper<DiscussxinshangcaipinEntity> wrapper);
	
	List<DiscussxinshangcaipinView> selectListView(@Param("ew") Wrapper<DiscussxinshangcaipinEntity> wrapper);

	List<DiscussxinshangcaipinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussxinshangcaipinEntity> wrapper);
	
	DiscussxinshangcaipinView selectView(@Param("ew") Wrapper<DiscussxinshangcaipinEntity> wrapper);
	
}
