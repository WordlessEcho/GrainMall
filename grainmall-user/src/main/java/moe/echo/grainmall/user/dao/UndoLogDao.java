package moe.echo.grainmall.user.dao;

import moe.echo.grainmall.user.entity.UndoLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author WordlessEcho
 * @email wordless@echo.moe
 * @date 2023-04-06 16:24:35
 */
@Mapper
public interface UndoLogDao extends BaseMapper<UndoLogEntity> {
	
}
