package io.z77z.service;

import io.z77z.dao.SysPermissionMapper;
import io.z77z.entity.SysPermission;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author z77z
 * @since 2017-02-10
 */
@Service
public class SysPermissionService extends ServiceImpl<SysPermissionMapper, SysPermission> {

	/**
	 * 
	 * @param map
	 * @return List<SysPermission>
	 */
	public List<SysPermission> findSysPermissions(Map<String, Object> map) {
		return this.baseMapper.findSysPermissions(map);
	}

}
