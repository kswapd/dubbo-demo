package models;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by kongxiangwen on 5/15/18 w:20.
 */

@SpringBootApplication
@ImportResource({ "classpath*:applicationConsumer.xml" })
public class ClientMainSpringBoot {
	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(ClientMainSpringBoot.class);
		ApplicationContext applicationContext = springApplication.run(args);

	}
}
