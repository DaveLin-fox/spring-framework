package top.linxu;

import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * TODO
 *
 * @author lzq
 */
public class Main {

	public static void main(String[] args) {
		AbstractXmlApplicationContext applicationContext = new FileSystemXmlApplicationContext("classpath:ioc/demo.xml");
		applicationContext.refresh();
		applicationContext.registerShutdownHook();

	}
}
