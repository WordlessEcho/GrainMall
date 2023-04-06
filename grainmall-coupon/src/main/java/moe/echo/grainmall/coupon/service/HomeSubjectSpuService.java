package moe.echo.grainmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import moe.echo.common.utils.PageUtils;
import moe.echo.grainmall.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * 专题商品
 *
 * @author WordlessEcho
 * @email wordless@echo.moe
 * @date 2023-04-06 16:12:35
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

