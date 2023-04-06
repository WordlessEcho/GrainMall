package moe.echo.grainmall.product.dao;

import moe.echo.grainmall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author WordlessEcho
 * @email wordless@echo.moe
 * @date 2023-04-05 00:21:34
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
