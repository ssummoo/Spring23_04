package kr.co.softsoldesk.main;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import kr.co.softsoldesk.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		//test1();
		//test2();
		//test3();
		test4();
	}
	
	public static void test1() {
		//경로지정 객체 생성
		ClassPathResource res=new ClassPathResource("kr/co/softsoldesk/config/beans.xml");
		//경로지정 객체를 xml로 생성
		XmlBeanFactory factory = new XmlBeanFactory(res);
		
		TestBean t1=factory.getBean("t1", TestBean.class);
		System.out.println("t1 : "+ t1);
		TestBean t2=factory.getBean("t2", TestBean.class);
		System.out.println("t2 : "+ t2);
	}
	public static void test2() {
		//외부패키지
		FileSystemResource fsr=new FileSystemResource("beans.xml");
		//경로지정 객체를 xml로 생성
		XmlBeanFactory factory = new XmlBeanFactory(fsr);
		
		TestBean t3=factory.getBean("t3", TestBean.class);
		System.out.println("t3 : "+ t3);
		TestBean t4=factory.getBean("t4", TestBean.class);
		System.out.println("t4 : "+ t4);
	}

	public static void test3() {
		//Test1의 업그래이드 version
		//자동으로 생성자 생성
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		
		
		TestBean t1=ctx.getBean("t1", TestBean.class);
		System.out.println("t1 : "+ t1);
		TestBean t2=ctx.getBean("t2", TestBean.class);
		System.out.println("t2 : "+ t2);
		
		//ctx.close();
	}
	public static void test4() {
		//Test2의 업그래이드 version
		//외부패키지
		FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("beans.xml");
		
		TestBean t3=ctx.getBean("t3", TestBean.class);
		System.out.println("t3 : "+ t3);
		TestBean t4=ctx.getBean("t4", TestBean.class);
		System.out.println("t4 : "+ t4);
		
		ctx.close();
	}
}
