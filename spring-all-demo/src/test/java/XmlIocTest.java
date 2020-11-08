import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import top.linxu.ioc.xml.HelloService;
import top.linxu.listener.CloseListener;

/**
 * TODO
 *
 * @author lzq
 */
public class XmlIocTest {
	private FileSystemXmlApplicationContext applicationContext;

	@BeforeEach
	public void init() {
		System.out.println("init");
		applicationContext = new FileSystemXmlApplicationContext("classpath:ioc/demo.xml");
		applicationContext.addApplicationListener(new CloseListener());
	}

	@Test
	public void testHello() {
		HelloService helloService = applicationContext.getBean(HelloService.class);
		System.out.println(helloService.hello());
	}

	@AfterEach
	public void end() {
		applicationContext.close();
		System.out.println("end");
	}


}
