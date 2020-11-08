package com.imooc.entity.factory;

import com.imooc.entity.User;

/**
 * 实例工厂调用
 *
 * @author lzq
 */
public class UserFactory {

	/**
	 * 返回User对象
	 *
	 * @return
	 */
	public User getUser() {
		return new User();
	}
}
