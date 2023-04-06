package moe.echo.grainmall.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import moe.echo.common.utils.PageUtils;
import moe.echo.grainmall.user.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author WordlessEcho
 * @email wordless@echo.moe
 * @date 2023-04-06 16:24:35
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

