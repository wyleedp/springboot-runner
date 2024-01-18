package com.github.wyleedp.springboot.runner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

/**
 * 스프링 설정
 */
@SpringBootApplication
@EnableAdminServer
@EnableScheduling
public class SpringbootRunnerApplication {

}
