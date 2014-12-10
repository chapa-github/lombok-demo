package org.chapa.sample.lombok.getter;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author kei_misawa
 *
 */
public class GetterSampleMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("--- method modifier ---");
		System.out.println("class is " + GetterSampleBean.class.getSimpleName());
		for (Method method : GetterSampleBean.class.getDeclaredMethods()) {
			switch (method.getModifiers()) {
			case Modifier.PUBLIC:
				System.out.println("public : " + method.getName());
				break;

			case Modifier.PROTECTED:
				System.out.println("protected : " + method.getName());
				break;

			case Modifier.PRIVATE:
				System.out.println("private : " + method.getName());
				break;

			default:
				System.out.println("other : " + method.getName());
				break;
			}
		}
	}

}
