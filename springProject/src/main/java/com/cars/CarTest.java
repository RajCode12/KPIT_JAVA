package com.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.*;

public class CarTest {
	public static void main(String[] args) {
		System.out.println("Begin main");
		System.out.println("==>Creating application context...");
			ApplicationContext ctx = new ClassPathXmlApplicationContext("myspring.xml");
		System.out.println("=>ApplicationContext created....");
		
		Factory factory = ctx.getBean(Factory.class);//calling by type
					// we can also call by name by writing 
					// @Component("fact") above factory class
		
		
	}
}
@Component
class EngineComponent {
	EngineComponent() {
		super();
	}
	@Autowired
	EngineComponent engineComp;
	EngineComponent getEngine() {
		return engineComp;
	}
}
@Repository
class Engine {
	@Autowired
	EngineComponent engineComp;
	void createEngine() {
		engineComp.getEngine();
	}
}
@Service
class Car {
	@Autowired
	Engine engine;
	void createCar() {
		engine.createEngine();
	}
}
@Controller
class Factory {
	@Autowired
	Factory factory;
}
