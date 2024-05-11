package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussxinshangcaipinDao;
import com.entity.DiscussxinshangcaipinEntity;
import com.service.DiscussxinshangcaipinService;
import com.entity.vo.DiscussxinshangcaipinVO;
import com.entity.view.DiscussxinshangcaipinView;

@Service("discussxinshangcaipinService")
public class DiscussxinshangcaipinServiceImpl extends ServiceImpl<DiscussxinshangcaipinDao, DiscussxinshangcaipinEntity> implements DiscussxinshangcaipinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussxinshangcaipinEntity> page = this.selectPage(
                new Query<DiscussxinshangcaipinEntity>(params).getPage(),
                new EntityWrapper<DiscussxinshangcaipinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussxinshangcaipinEntity> wrapper) {
		  Page<DiscussxinshangcaipinView> page =new Query<DiscussxinshangcaipinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussxinshangcaipinVO> selectListVO(Wrapper<DiscussxinshangcaipinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussxinshangcaipinVO selectVO(Wrapper<DiscussxinshangcaipinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussxinshangcaipinView> selectListView(Wrapper<DiscussxinshangcaipinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussxinshangcaipinView selectView(Wrapper<DiscussxinshangcaipinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
