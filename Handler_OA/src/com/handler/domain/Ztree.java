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
 * 2017年6月8日下午4:46:06
 */
public class Ztree {
	
	private Long id;
	private Long pId;
	private String name;
	private String urls;
	private List<Role> role;
	/**
	 * @param id
	 * @param pId
	 * @param name
	 * @param urls
	 * @param role
	 */
	public Ztree(Long id, Long pId, String name, String urls, List<Role> role) {
		super();
		this.id = id;
		this.pId = pId;
		this.name = name;
		this.urls = urls;
		this.role = role;
	}
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
	 * @return the pId
	 */
	public Long getpId() {
		return pId;
	}
	/**
	 * @param pId the pId to set
	 */
	public void setpId(Long pId) {
		this.pId = pId;
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
	 * @return the urls
	 */
	public String getUrls() {
		return urls;
	}
	/**
	 * @param urls the urls to set
	 */
	public void setUrls(String urls) {
		this.urls = urls;
	}
	/**
	 * @return the role
	 */
	public List<Role> getRole() {
		return role;
	}
	/**
	 * @param role the role to set
	 */
	public void setRole(List<Role> role) {
		this.role = role;
	}
	/**
	 * 
	 */
	public Ztree() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
