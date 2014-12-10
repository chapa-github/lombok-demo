package org.chapa.sample.lombok.data;

/**
 * @author kei_misawa
 *
 */
public class DataSampleMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("--- All args Constructor ---");
		DataSampleBean bean1 = new DataSampleBean("name-A", 1);
		System.out.println(bean1.toString());

		System.out.println("--- No args Constructor ---");
		DataSampleBean bean2 = new DataSampleBean();
		bean2.setName("name-B");
		bean2.setId(2);
		System.out.println(bean2.toString());
	}

}
