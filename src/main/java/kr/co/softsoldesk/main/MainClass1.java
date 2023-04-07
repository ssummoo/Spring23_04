package kr.co.softsoldesk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.TestBean;

public class MainClass1 {

	public static void main(String[] args) {
	
		//#1
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans1.xml");
		//ctx.close();
		
		//#2
		//id가 test1 bean객체의 주소값을 	받아온다
		TestBean t1=ctx.getBean("test1", TestBean.class);
		System.out.println("t1 : "+t1);
		
		
		//id가 test2인 객체의 주소값을 받아온다 ->>sington
		TestBean t2=ctx.getBean("test2", TestBean.class);
		System.out.println("t2 : "+t2);
		
		TestBean t2_2=ctx.getBean("test2", TestBean.class);
		System.out.println("t2 : "+t2_2);
		
		//id가 test3인 객체의 주소값 scope="prototype"
		TestBean t3=ctx.getBean("test3", TestBean.class);
		System.out.println("t3 : "+t3);
		TestBean t3_3=ctx.getBean("test3", TestBean.class);
		System.out.println("t3_3 : "+t3_3);
		
		
		ctx.close();
		
	}

}
