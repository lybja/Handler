package com.handler.utils;

import org.apache.struts2.ServletActionContext;

import com.handler.domain.User;

public class SessionContext {

	public static final String GLOBLE_USER_SESSION = "globle_user";
	
	public static void setUser(User	 user){
		if(user!=null){
			ServletActionContext.getRequest().getSession().setAttribute(GLOBLE_USER_SESSION, user);
		}else{
			ServletActionContext.getRequest().getSession().removeAttribute(GLOBLE_USER_SESSION);
		}
	}
	
	public static User get(){
		return (User) ServletActionContext.getRequest().getSession().getAttribute(GLOBLE_USER_SESSION);
	}
	/**
	 * 
	 * 功能:注销
	 * 作者:李云波
	 * 2017年6月14日下午1:55:49
	 */
	public static void invalidate(){
	  ServletActionContext.getRequest().getSession(false).invalidate();;
	}
}
