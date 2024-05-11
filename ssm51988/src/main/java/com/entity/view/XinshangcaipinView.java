package com.entity.view;

import com.entity.XinshangcaipinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 新上菜品
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-21 14:16:56
 */
@TableName("xinshangcaipin")
public class XinshangcaipinView  extends XinshangcaipinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XinshangcaipinView(){
	}
 
 	public XinshangcaipinView(XinshangcaipinEntity xinshangcaipinEntity){
 	try {
			BeanUtils.copyProperties(this, xinshangcaipinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
