package main;

import java.io.IOException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by kongxiangwen on 5/15/18 w:20.
 */
/**
 * If use this, must to mark ServerMainSpringBoot as a blank class, otherwise will report duplicated demoService error.
 */
public class ServerMain{
		public static void main(String[] args) throws IOException {

			System.setProperty("java.net.preferIPv4Stack", "true");
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationProvider.xml"});


			context.start();
			System.out.println("输入任意按键退出 ~ ");
			System.in.read();
			//context.close();
		}


}
