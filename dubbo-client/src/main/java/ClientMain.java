import interfaces.BarService;
import interfaces.DemoService;
import interfaces.FooService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by kongxiangwen on 5/15/18 w:20.
 */
public class ClientMain {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "applicationConsumer.xml" });
		context.start();

		DemoService service = (DemoService) context.getBean("demoService");
		System.out.println(service.sayHello("hello"));


		FooService foo = (FooService) context.getBean("fooService");
		System.out.println(foo.sayFoo("world "));


		//BarService bar = (BarService) context.getBean("barService");
		//System.out.println(bar.sayBar("world "));


		System.out.println("dddd");
		context.close();
	}
}
