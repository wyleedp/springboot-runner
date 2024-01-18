package com.github.wyleedp.springboot.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class SpringbootRunnerScheduling {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	/**
	 * 10초마다 현재일시 로그출력
	 */
	@Scheduled(fixedDelay = 10000, initialDelay = 5000)
	public void executionLogging() {
		logger.info("CurrentTimeMillis : " + System.currentTimeMillis());
	}
	
}
