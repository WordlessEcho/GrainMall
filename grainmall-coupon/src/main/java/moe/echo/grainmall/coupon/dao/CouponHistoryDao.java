package moe.echo.grainmall.coupon.dao;

import moe.echo.grainmall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author WordlessEcho
 * @email wordless@echo.moe
 * @date 2023-04-06 16:12:35
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
