/**
 * TODO
 *
 * @author lzq
 */
public class ShutDownTest {

	public static void main(String[] args) {
		Runtime.getRuntime().addShutdownHook(new ShutDownTask());
	}


}
