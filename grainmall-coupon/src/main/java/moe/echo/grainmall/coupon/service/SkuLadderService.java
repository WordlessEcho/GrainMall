package moe.echo.grainmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import moe.echo.common.utils.PageUtils;
import moe.echo.grainmall.coupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author WordlessEcho
 * @email wordless@echo.moe
 * @date 2023-04-06 16:12:35
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

