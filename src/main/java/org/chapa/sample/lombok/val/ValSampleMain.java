package org.chapa.sample.lombok.val;

import java.util.HashMap;

import lombok.val;

/**
 * @author kei_misawa
 *
 */
public class ValSampleMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("--- val final field ---");
		int i = 1;
		val map = new HashMap<String, Integer>();
		map.put("key-A", i++);
		map.put("key-B", i++);
		map.put("key-C", i++);
		map.put("key-D", i++);
		map.put("key-E", i++);
		map.put("key-F", i++);
		map.put("key-G", i++);
		map.put("key-H", i++);

		map.forEach((k, v) -> {
			System.out.println("key : " + k + " , value : " + v);
		});
	}

}
