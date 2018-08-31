package models;

import interfaces.BarService;
import interfaces.DemoService;
import interfaces.FooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by kongxiangwen on 5/15/18 w:20.
 */

/**
 * If use this, must to mark ClientMainSpringBoot as a blank class, otherwise will report duplicated demoService error.
 */
public class ClientMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "applicationConsumer.xml" });
		context.start();

		DemoService service = (DemoService) context.getBean("demoService");
		System.out.println(service.sayHello("hello"));


		//DemoService service = (DemoService) context.getBean("demoService");
		System.out.println(service.Test2("tttttt"));

		context.close();
	}
}
