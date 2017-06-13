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

import java.util.List;

import org.hibernate.SQLQuery;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.handler.dao.IUserDao;
import com.handler.domain.User;
import com.handler.domain.User_Role;
import com.handler.domain.Ztree;

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

	/**
	 * 功能:获取角色id
	 * 作者:李云波
	 * 2017年6月13日上午11:06:10
	 */
	@SuppressWarnings("unchecked")
	@Override
	public User_Role getRoleId(User user) {
		// TODO Auto-generated method stub
		SQLQuery query = this.getSession().createSQLQuery("select rid from user_role where uid="+user.getId());
		List<User_Role> list = query.list();
		User_Role ur = new User_Role();
		String o = String.valueOf(list.get(0));
		System.out.println(o);
		ur.setRid(o);
		return ur;
	}

	/**
	 * 功能:
	 * 作者:李云波
	 * 2017年6月13日下午4:00:38
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Ztree> getZtreeList(User_Role ur) {
		SQLQuery query = this.getSession().createSQLQuery("select  z.id, z.`name`,z.pId, z.urls  from role r  left join ztree_role ur on r.id=ur.rid left join ztree z on z.id= ur.zid where r.id ="+ur.getRid());
		List<Ztree> list = query.list();
		return list;
	}
	
	

}
