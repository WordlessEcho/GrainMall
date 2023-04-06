package moe.echo.grainmall.product.dao;

import moe.echo.grainmall.product.entity.SpuCommentEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价
 * 
 * @author WordlessEcho
 * @email wordless@echo.moe
 * @date 2023-04-05 00:21:34
 */
@Mapper
public interface SpuCommentDao extends BaseMapper<SpuCommentEntity> {
	
}