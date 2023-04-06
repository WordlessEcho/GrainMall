package moe.echo.grainmall.storage.dao;

import moe.echo.grainmall.storage.entity.WareOrderTaskEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 库存工作单
 * 
 * @author WordlessEcho
 * @email wordless@echo.moe
 * @date 2023-04-06 16:38:40
 */
@Mapper
public interface WareOrderTaskDao extends BaseMapper<WareOrderTaskEntity> {
	
}
