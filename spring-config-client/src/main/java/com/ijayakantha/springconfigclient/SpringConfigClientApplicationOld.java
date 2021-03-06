package com.ijayakantha.springconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringConfigClientApplicationOld {

	public static void main(String[] args) {
		SpringApplication.run(SpringConfigClientApplicationOld.class, args);
	}
}

@RefreshScope
@RestController
class MessageRestControllerOld {

	@Value("${server.url:Unable to connect to config server}")
	private String url;

	@RequestMapping("/server/url")
	String getMsg() {
		return this.url;
	}
}
