package top.linxu;

import top.linxu.entity.InitBean;

/**
 * TODO
 *
 * @author lzq
 */
public class Demo {
	public static void main(String[] args) {
		Class<?> clazz = InitBean.class;
		Class<?> superclass = clazz.getSuperclass();

	}

	private static void printSuperClass(Class<?> clazz) {
		Class<?> superclass = clazz.getSuperclass();
		if(superclass != null) {
			printSuperClass(superclass);
		}
		System.out.println(superclass.getName());
	}

}
