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
package com.handler.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.handler.dao.IUserDao;
import com.handler.domain.User;
import com.handler.domain.User_Role;
import com.handler.domain.Ztree;
import com.handler.service.IUserService;

/**
 * 功能:
 * 作者:李云波
 * 2017年6月8日下午6:32:57
 */
@Service
public class UserService implements IUserService{

	private IUserDao userDao;

	/**
	 * @return the userDao
	 */
	public IUserDao getUserDao() {
		return userDao;
	}

	/**
	 * @param userDao the userDao to set
	 */
	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

	/**
	 * 功能:
	 * 作者:李云波
	 * 2017年6月12日下午5:19:42
	 */
	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		return this.userDao.login(user);
	}

	/**
	 * 功能:获取角色ID
	 * 作者:李云波
	 * 2017年6月13日上午11:04:05
	 */
	@Override
	public User_Role getRoleId(User user) {
		// TODO Auto-generated method stub
		return this.userDao.getRoleId(user);
	}

	/**
	 * 功能:
	 * 作者:李云波
	 * 2017年6月13日下午4:00:13
	 */
	@Override
	public List<Ztree> getZtreeList(User_Role ur) {
		// TODO Auto-generated method stub
		return this.userDao.getZtreeList(ur);
	}

	
	
	
}
