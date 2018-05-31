package io.z77z.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * 
 * @Title: SysPermission
 * @Description:
 * @Author: zhaotf
 * @Since:2018年5月25日 上午11:07:54
 */
@TableName("sys_permission")
public class SysPermission extends Model<SysPermission> {

	private static final long serialVersionUID = 1L;

	private String id;
	/**
	 * url地址
	 */
	private String url;
	/**
	 * url描述
	 */
	private String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
