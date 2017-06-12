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
package com.handler.dao.impl;

import java.util.Iterator;
import java.util.List;

import org.hibernate.SQLQuery;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.handler.dao.IUserDao;
import com.handler.domain.User;

/**
 * 功能:
 * 作者:李云波
 * 2017年6月8日下午6:34:24
 */
public class UserDao extends HibernateDaoSupport  implements IUserDao {

	/**
	 * 功能:登录
	 * 作者:李云波
	 * 2017年6月12日下午5:20:05
	 */
	@SuppressWarnings("unchecked")
	@Override
	public User login(User user) {
		User user2 = new User();
		System.out.println(user.getName());
		// TODO Auto-generated method stub
		List<User> list = this.getSession().createQuery("From User where name='"+user.getName()+"' and pwd = '"+user.getPwd()+"'").list();
		if(list.size()!=0&&list!=null){
			user2=list.get(0);
		} 
		
		 return user2;
	}
	
	

}
