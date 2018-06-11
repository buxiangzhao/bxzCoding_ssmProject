package com.ssm.entity;

import java.util.Date;

/**
 * Created by SQ_BXZ on 2018-06-11.
 */
public class PermissionInfo {
	private String id;
	private String pid;
	private String name;
	private String url;
	private String unique;
	private String type;
	private String icon;
	private String isVisiable;
	private Integer sortNum;
	private String creater;
	private Date createTime;
	private String updater;
	private Date updateTime;
	private Boolean parentFlag;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUnique() {
		return unique;
	}

	public void setUnique(String unique) {
		this.unique = unique;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getIsVisiable() {
		return isVisiable;
	}

	public void setIsVisiable(String isVisiable) {
		this.isVisiable = isVisiable;
	}

	public Integer getSortNum() {
		return sortNum;
	}

	public void setSortNum(Integer sortNum) {
		this.sortNum = sortNum;
	}

	public String getCreater() {
		return creater;
	}

	public void setCreater(String creater) {
		this.creater = creater;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getUpdater() {
		return updater;
	}

	public void setUpdater(String updater) {
		this.updater = updater;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Boolean getParentFlag() {
		return parentFlag;
	}

	public void setParentFlag(Boolean parentFlag) {
		this.parentFlag = parentFlag;
	}
}
