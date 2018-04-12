package io.spring.framework.springInAction.Chapter1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {

	public static void main(String[] args) throws Exception{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("chapter1.xml");
		Knight knight = context.getBean(Knight.class);
		knight.embarkOnQuest();
		context.close();
		
		AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext(KnightConfig.class);
		Knight knight2 = context2.getBean(Knight.class);
		knight2.embarkOnQuest();
		context2.close();
	}

}

  