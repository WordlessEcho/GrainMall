package moe.echo.grainmall.storage.dao;

import moe.echo.grainmall.storage.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author WordlessEcho
 * @email wordless@echo.moe
 * @date 2023-04-06 16:38:40
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
