package moe.echo.grainmall.user.dao;

import moe.echo.grainmall.user.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author WordlessEcho
 * @email wordless@echo.moe
 * @date 2023-04-06 16:24:35
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
