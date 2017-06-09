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


import com.handler.domain.User;
import com.handler.service.IUserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 功能:
 * 作者:李云波
 * 2017年6月8日下午4:28:58
 */
@SuppressWarnings("serial")
public class UserAction extends ActionSupport implements ModelDriven<User>{

	private IUserService userService;
	
	
	public String portal(){
		
		return "success";
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
	private User user= new User();
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

}
