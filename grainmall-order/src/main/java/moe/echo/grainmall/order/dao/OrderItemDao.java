package moe.echo.grainmall.order.dao;

import moe.echo.grainmall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author WordlessEcho
 * @email wordless@echo.moe
 * @date 2023-04-06 16:34:34
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
