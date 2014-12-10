package org.chapa.sample.lombok.log;

import lombok.extern.slf4j.Slf4j;

/**
 * @author kei_misawa
 *
 */
@Slf4j
public class LogSampleMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		log.trace("demo trace log.");
		log.debug("demo debug log.");
		log.info("demo info log.");
		log.warn("demo warn log.");
		log.error("demo error log.");
	}

}
