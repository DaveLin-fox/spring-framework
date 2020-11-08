package com.imooc.entity.factory;

import com.imooc.entity.User;

/**
 * 静态工厂调用
 *
 * @author lzq
 */
public class StaticFactory {

	public static User getUser() {
		return new User();
	}
}
