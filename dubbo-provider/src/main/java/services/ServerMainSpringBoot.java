package services;

import java.io.IOException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by kongxiangwen on 5/15/18 w:20.
 */
@SpringBootApplication
@ImportResource({ "classpath*:applicationProvider.xml" })
public class ServerMainSpringBoot {
		public static void main(String[] args) throws IOException {

			SpringApplication springApplication = new SpringApplication(ServerMainSpringBoot.class);
			ApplicationContext applicationContext = springApplication.run(args);
			System.out.println("输入任意按键退出 ~ ");
			System.in.read();
		}

}
