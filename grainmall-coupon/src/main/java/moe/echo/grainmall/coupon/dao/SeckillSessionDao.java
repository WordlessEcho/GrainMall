package moe.echo.grainmall.coupon.dao;

import moe.echo.grainmall.coupon.entity.SeckillSessionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动场次
 * 
 * @author WordlessEcho
 * @email wordless@echo.moe
 * @date 2023-04-06 16:12:35
 */
@Mapper
public interface SeckillSessionDao extends BaseMapper<SeckillSessionEntity> {
	
}