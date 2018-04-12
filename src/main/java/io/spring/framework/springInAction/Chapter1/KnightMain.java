package io.spring.framework.springInAction.Chapter1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {

	public static void main(String[] args) throws Exception{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("chapter1.xml");
		Knight knight = context.getBean(Knight.class);
		knight.embarkOnQuest();
		context.close();
	}

}

  