package models;

import interfaces.DemoService;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by kongxiangwen on 8/31/18 w:35.
 */
@Service
public class DubboComponent {

	@Resource
	public DemoService ds;

	@PostConstruct
	public void init(){
		System.out.println("---------------:"+ds.sayHello("DubboComponent"));
	}
	public static void test()
	{
		System.out.println("test");
	}

}
