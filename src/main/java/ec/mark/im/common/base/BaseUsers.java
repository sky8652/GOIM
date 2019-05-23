package ec.mark.im.common.base;

import io.jboot.db.model.JbootModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by Jboot, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseUsers<M extends BaseUsers<M>> extends JbootModel<M> implements IBean {

	public void setId(java.lang.Long id) {
		set("id", id);
	}
	
	public java.lang.Long getId() {
		return getLong("id");
	}

	public void setUserPhone(java.lang.String userPhone) {
		set("user_phone", userPhone);
	}
	
	public java.lang.String getUserPhone() {
		return getStr("user_phone");
	}

	public void setUserPwd(java.lang.String userPwd) {
		set("user_pwd", userPwd);
	}
	
	public java.lang.String getUserPwd() {
		return getStr("user_pwd");
	}

	public void setUserAvatar(java.lang.String userAvatar) {
		set("user_avatar", userAvatar);
	}
	
	public java.lang.String getUserAvatar() {
		return getStr("user_avatar");
	}

	public void setUserName(java.lang.String userName) {
		set("user_name", userName);
	}
	
	public java.lang.String getUserName() {
		return getStr("user_name");
	}

	public void setUserRemark(java.lang.String userRemark) {
		set("user_remark", userRemark);
	}
	
	public java.lang.String getUserRemark() {
		return getStr("user_remark");
	}

	public void setUserSign(java.lang.String userSign) {
		set("user_sign", userSign);
	}
	
	public java.lang.String getUserSign() {
		return getStr("user_sign");
	}

	public void setUserSex(java.lang.Integer userSex) {
		set("user_sex", userSex);
	}
	
	public java.lang.Integer getUserSex() {
		return getInt("user_sex");
	}

	public void setUserState(java.lang.Integer userState) {
		set("user_state", userState);
	}
	
	public java.lang.Integer getUserState() {
		return getInt("user_state");
	}

	public void setIsVip(java.lang.Integer isVip) {
		set("is_vip", isVip);
	}
	
	public java.lang.Integer getIsVip() {
		return getInt("is_vip");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
	}
	
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	public void setUpdateTime(java.util.Date updateTime) {
		set("update_time", updateTime);
	}
	
	public java.util.Date getUpdateTime() {
		return get("update_time");
	}

}