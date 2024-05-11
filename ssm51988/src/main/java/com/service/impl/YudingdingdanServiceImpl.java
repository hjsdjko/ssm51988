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


import com.dao.YudingdingdanDao;
import com.entity.YudingdingdanEntity;
import com.service.YudingdingdanService;
import com.entity.vo.YudingdingdanVO;
import com.entity.view.YudingdingdanView;

@Service("yudingdingdanService")
public class YudingdingdanServiceImpl extends ServiceImpl<YudingdingdanDao, YudingdingdanEntity> implements YudingdingdanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YudingdingdanEntity> page = this.selectPage(
                new Query<YudingdingdanEntity>(params).getPage(),
                new EntityWrapper<YudingdingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YudingdingdanEntity> wrapper) {
		  Page<YudingdingdanView> page =new Query<YudingdingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YudingdingdanVO> selectListVO(Wrapper<YudingdingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YudingdingdanVO selectVO(Wrapper<YudingdingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YudingdingdanView> selectListView(Wrapper<YudingdingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YudingdingdanView selectView(Wrapper<YudingdingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
