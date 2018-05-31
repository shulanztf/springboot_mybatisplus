package io.z77z.service;

import io.z77z.dao.SysRoleMapper;
import io.z77z.entity.SysRole;

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
public class SysRoleService extends ServiceImpl<SysRoleMapper, SysRole> {

	/**
	 * 获取角色列表
	 * 
	 * @param map
	 * @return List<SysRole>
	 */
	public List<SysRole> findSysRoles(Map<String, Object> map) {
		return baseMapper.findSysRoles(map);
	}

}
