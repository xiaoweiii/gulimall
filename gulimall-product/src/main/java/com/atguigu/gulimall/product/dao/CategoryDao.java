package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author xiaowei
 * @email 727745859@qq.com
 * @date 2022-10-12 15:13:01
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
