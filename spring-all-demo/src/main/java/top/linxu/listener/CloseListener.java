package top.linxu.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

/**
 * TODO
 *
 * @author lzq
 */
public class CloseListener implements ApplicationListener<ContextClosedEvent> {
	@Override
	public void onApplicationEvent(ContextClosedEvent event) {
		System.out.println("上下文关闭了");
	}
}
