package io.z77z.dao;

import io.z77z.entity.SysPermission;

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
public interface SysPermissionMapper extends BaseMapper<SysPermission> {

	/**
	 * 
	 * @param map
	 * @return List<SysPermission>
	 */
	public List<SysPermission> findSysPermissions(Map<String, Object> map);

}