package services;


import interfaces.DemoService;
import org.springframework.stereotype.Service;

/**
 * Created by kongxiangwen on 5/15/18 w:20.
 */
@Service("demoService")
public class DemoServiceImpl implements DemoService {


	public String sayHello(String name) {
		System.out.println("init : " + name);

		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationProvider.xml"});
		//context.start();
		//ApplicationContext context = RpcContext.getContext();

		/*ApplicationContext context= ServiceBean.getSpringContext();
		BarService bar = (BarService) context.getBean("barService");
		String barStr = bar.sayBar("bar");*/

		return "hello from dubbo provider "  +  name;
	}


	public String Test2(String name){
		return "test2";
	}

}
