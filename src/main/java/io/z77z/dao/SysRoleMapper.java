package io.z77z.dao;

import io.z77z.entity.SysRole;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author z77z
 * @since 2017-02-10
 */
public interface SysRoleMapper extends BaseMapper<SysRole> {

	/**
	 * 获取角色列表
	 * @param map
	 * @return List<SysRole>
	 */
	public List<SysRole> findSysRoles(Map<String, Object> map);

}