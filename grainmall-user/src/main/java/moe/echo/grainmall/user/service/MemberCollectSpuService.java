package moe.echo.grainmall.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import moe.echo.common.utils.PageUtils;
import moe.echo.grainmall.user.entity.MemberCollectSpuEntity;

import java.util.Map;

/**
 * 会员收藏的商品
 *
 * @author WordlessEcho
 * @email wordless@echo.moe
 * @date 2023-04-06 16:24:35
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

