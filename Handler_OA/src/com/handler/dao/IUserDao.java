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
package com.handler.dao;

import java.util.List;

import com.handler.domain.User;
import com.handler.domain.User_Role;
import com.handler.domain.Ztree;

/**
 * 功能:
 * 作者:李云波
 * 2017年6月8日下午6:33:53
 */
public interface IUserDao {

	/**
	 * 功能:
	 * 作者:李云波
	 * @param user
	 * @return
	 * 2017年6月12日下午5:20:00
	 */
	User login(User user);

	/**
	 * 功能:
	 * 作者:李云波
	 * @param user
	 * @return
	 * 2017年6月13日上午11:05:29
	 */
	User_Role getRoleId(User user);

	/**
	 * 功能:
	 * 作者:李云波
	 * @param ur
	 * @return
	 * 2017年6月13日下午4:00:31
	 */
	List<Ztree> getZtreeList(User_Role ur);

}
