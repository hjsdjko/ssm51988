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


import com.dao.XinshangcaipinDao;
import com.entity.XinshangcaipinEntity;
import com.service.XinshangcaipinService;
import com.entity.vo.XinshangcaipinVO;
import com.entity.view.XinshangcaipinView;

@Service("xinshangcaipinService")
public class XinshangcaipinServiceImpl extends ServiceImpl<XinshangcaipinDao, XinshangcaipinEntity> implements XinshangcaipinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XinshangcaipinEntity> page = this.selectPage(
                new Query<XinshangcaipinEntity>(params).getPage(),
                new EntityWrapper<XinshangcaipinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XinshangcaipinEntity> wrapper) {
		  Page<XinshangcaipinView> page =new Query<XinshangcaipinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XinshangcaipinVO> selectListVO(Wrapper<XinshangcaipinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XinshangcaipinVO selectVO(Wrapper<XinshangcaipinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XinshangcaipinView> selectListView(Wrapper<XinshangcaipinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XinshangcaipinView selectView(Wrapper<XinshangcaipinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
