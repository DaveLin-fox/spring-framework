package top.linxu.entity;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.SmartInitializingSingleton;

/**
 * TODO
 *
 * @author lzq
 */
public class InitBean implements InitializingBean, SmartInitializingSingleton, DisposableBean {
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("I'm afterPropertiesSet");
	}

	@Override
	public void afterSingletonsInstantiated() {
		System.out.println("I'm afterSingletonsInstantiated");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("I'm destroy");
	}
}
