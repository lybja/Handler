/**
 * 
 *                       _oo0oo_
 *                      o8888888o
 *                      88" . "88
 *                      (| -_- |)
 *                      0\  =  /0
 *                    ___/`---'\___
 *                  .' \\|     |// '.
 *                 / \\|||  :  |||// \
 *                / _||||| -:- |||||- \
 *               |   | \\\  -  /// |   |
 *               | \_|  ''\---/''  |_/ |
 *               \  .-\__  '-'  ___/-. /
 *             ___'. .'  /--.--\  `. .'___
 *          ."" '<  `.___\_<|>_/___.' >' "".
 *         | | :  `- \`.;`\ _ /`;.`/ - ` : | |
 *         \  \ `_.   \_ __\ /__ _/   .-` /  /
 *     =====`-.____`.___ \_____/___.-`___.-'=====
 *                       `=---='
 *
 *
 *     ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *
 *               佛祖保佑         永无BUG
 *
 */
package com.handler.web.action;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.handler.domain.Role;
import com.handler.domain.User;
import com.handler.domain.User_Role;
import com.handler.domain.Ztree;
import com.handler.service.IUserService;
import com.handler.utils.SessionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 功能:
 * 作者:李云波
 * 2017年6月8日下午4:28:58
 */
@SuppressWarnings("serial")
public class UserAction extends ActionSupport implements ModelDriven<User>,ServletRequestAware,ServletResponseAware{

	private IUserService userService;
	
	private HttpServletRequest request;
	private HttpServletResponse response;
	
	private User user= new User();
	private User_Role ur= new User_Role();
	private Role role= new Role();
	private Ztree ztree= new Ztree();
	private List<Ztree> list= new ArrayList<Ztree>();
	
	
	/**
	 * 
	 * 功能:退出 session销毁
	 * 作者:李云波
	 * @return
	 * 2017年6月13日上午8:37:59
	 */
	public String out(){
		SessionContext.invalidate();
		return "out";
	}
	
	public String info(){
		return "info";
	}
	/**
	 * 
	 * 功能:去门户页面
	 * 作者:李云波
	 * @return
	 * 2017年6月13日上午8:37:59
	 */
	public String portal(){
		//获得该用户的角色id
		ur = this.userService.getRoleId(user);
		//获取权限树
		list=this.userService.getZtreeList(ur);
		return "success";
	}
	
	/**
	 * 
	 * 功能:登录
	 * 作者:李云波
	 * @return
	 * 2017年6月12日下午5:08:27
	 */
	public void login(){
		User u = userService.login(user);
		if(u!=null&&u.getId()!=0){
			try {
				SessionContext.setUser(u);
				response.getWriter().print(true);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else{
			try {
				response.getWriter().print(false);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

	

	/**
	 * @return the userService
	 */
	public IUserService getUserService() {
		return userService;
	}




	/**
	 * @param userService the userService to set
	 */
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}




	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}
	
	/**
	 * 功能:
	 * 作者:李云波
	 * 2017年6月8日下午5:10:14
	 */
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}

	/**
	 * 功能:
	 * 作者:李云波
	 * 2017年6月12日下午5:50:13
	 */
	@Override
	public void setServletResponse(HttpServletResponse response) {
		// TODO Auto-generated method stub
		this.response=response;
	}

	/**
	 * 功能:
	 * 作者:李云波
	 * 2017年6月12日下午5:50:13
	 */
	@Override
	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		this.request=request;
	}

	/**
	 * @return the request
	 */
	public HttpServletRequest getRequest() {
		return request;
	}

	/**
	 * @param request the request to set
	 */
	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	/**
	 * @return the response
	 */
	public HttpServletResponse getResponse() {
		return response;
	}

	/**
	 * @param response the response to set
	 */
	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}

	/**
	 * @return the ur
	 */
	public User_Role getUr() {
		return ur;
	}

	/**
	 * @param ur the ur to set
	 */
	public void setUr(User_Role ur) {
		this.ur = ur;
	}

	/**
	 * @return the role
	 */
	public Role getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(Role role) {
		this.role = role;
	}

	/**
	 * @return the ztree
	 */
	public Ztree getZtree() {
		return ztree;
	}

	/**
	 * @param ztree the ztree to set
	 */
	public void setZtree(Ztree ztree) {
		this.ztree = ztree;
	}

	/**
	 * @return the list
	 */
	public List<Ztree> getList() {
		return list;
	}

	/**
	 * @param list the list to set
	 */
	public void setList(List<Ztree> list) {
		this.list = list;
	}
	
	
	

	
	
}
