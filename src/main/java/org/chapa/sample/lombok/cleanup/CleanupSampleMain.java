package org.chapa.sample.lombok.cleanup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import lombok.Cleanup;

/**
 * @author kei_misawa
 *
 */
public class CleanupSampleMain {

	private static final String FILE_PATH = "cleanup_sample.txt";

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		System.out.println("--- resource cleanup ---");

		@Cleanup
		InputStreamReader isr = new InputStreamReader(ClassLoader.getSystemResourceAsStream(FILE_PATH));

		@Cleanup
		BufferedReader br = new BufferedReader(isr);

		br.lines().forEach(line -> {
			System.out.println(line);
		});
	}

}
