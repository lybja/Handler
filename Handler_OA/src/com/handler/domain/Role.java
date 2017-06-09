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
package com.handler.domain;

import java.util.List;

/**
 * 功能:
 * 作者:李云波
 * 2017年6月8日下午4:44:07
 */
public class Role {

	private Long id;
	private String name;
	private List<User> user;
	private List<Ztree> ztree;
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the user
	 */
	public List<User> getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(List<User> user) {
		this.user = user;
	}
	/**
	 * @return the ztree
	 */
	public List<Ztree> getZtree() {
		return ztree;
	}
	/**
	 * @param ztree the ztree to set
	 */
	public void setZtree(List<Ztree> ztree) {
		this.ztree = ztree;
	}
	/**
	 * 
	 */
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param id
	 * @param name
	 * @param user
	 * @param ztree
	 */
	public Role(Long id, String name, List<User> user, List<Ztree> ztree) {
		super();
		this.id = id;
		this.name = name;
		this.user = user;
		this.ztree = ztree;
	}
	
}
