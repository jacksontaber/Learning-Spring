package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load the spring configuration
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach theCoach2 = context.getBean("myCoach", Coach.class);
		
		//check if they are the same
		boolean result = (theCoach == theCoach2);
		
		System.out.println(result);
		
		System.out.println("Memory Location for theCoach: " + theCoach);
		
		System.out.println("Memory Location for theCoach2: " + theCoach2);
		
		//close the context
		context.close();

	}

}
