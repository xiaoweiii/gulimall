package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author xiaowei
 * @email 727745859@qq.com
 * @date 2022-10-13 14:30:41
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
