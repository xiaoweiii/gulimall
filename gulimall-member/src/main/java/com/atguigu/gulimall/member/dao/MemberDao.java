package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author xiaowei
 * @email 727745859@qq.com
 * @date 2022-10-13 15:16:45
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
