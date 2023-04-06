package moe.echo.grainmall.storage.dao;

import moe.echo.grainmall.storage.entity.UndoLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author WordlessEcho
 * @email wordless@echo.moe
 * @date 2023-04-06 16:38:40
 */
@Mapper
public interface UndoLogDao extends BaseMapper<UndoLogEntity> {
	
}
