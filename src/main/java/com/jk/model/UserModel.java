package com.jk.model;

import java.io.Serializable;
import java.util.Date;

public class UserModel implements Serializable  {
    /**
	 * 
	 */
	private static final long serialVersionUID = 3811094965818326595L;

	private Integer userid;

    private String username;

    private String userpass;
    private String  mobilesend;  //手机号
    private String  code; //验证码
    public String getMobilesend() {
		return mobilesend;
	}

	public void setMobilesend(String mobilesend) {
		this.mobilesend = mobilesend;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private Date userDate;
    private Date userStartDate;
    private Date userEndDate;
    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass == null ? null : userpass.trim();
    }

	public Date getUserDate() {
		return userDate;
	}

	public void setUserDate(Date userDate) {
		this.userDate = userDate;
	}

	public Date getUserStartDate() {
		return userStartDate;
	}

	public void setUserStartDate(Date userStartDate) {
		this.userStartDate = userStartDate;
	}

	public Date getUserEndDate() {
		return userEndDate;
	}

	public void setUserEndDate(Date userEndDate) {
		this.userEndDate = userEndDate;
	}


}