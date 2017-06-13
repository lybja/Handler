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

/**
 * 功能:
 * 作者:李云波
 * 2017年6月13日下午1:55:19
 */
public class User_Role {

	private String rid;
	private String uid;
	private String zid;
	/**
	 * @return the rid
	 */
	public String getRid() {
		return rid;
	}
	/**
	 * @param rid the rid to set
	 */
	public void setRid(String rid) {
		this.rid = rid;
	}
	/**
	 * @return the uid
	 */
	public String getUid() {
		return uid;
	}
	/**
	 * @param uid the uid to set
	 */
	public void setUid(String uid) {
		this.uid = uid;
	}
	
	/**
	 * @param rid
	 * @param uid
	 * @param zid
	 */
	public User_Role(String rid, String uid, String zid) {
		super();
		this.rid = rid;
		this.uid = uid;
		this.zid = zid;
	}
	/**
	 * @return the zid
	 */
	public String getZid() {
		return zid;
	}
	/**
	 * @param zid the zid to set
	 */
	public void setZid(String zid) {
		this.zid = zid;
	}
	/**
	 * 
	 */
	public User_Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
