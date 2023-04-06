package moe.echo.grainmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import moe.echo.common.utils.PageUtils;
import moe.echo.grainmall.coupon.entity.CouponSpuRelationEntity;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author WordlessEcho
 * @email wordless@echo.moe
 * @date 2023-04-06 16:12:35
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

