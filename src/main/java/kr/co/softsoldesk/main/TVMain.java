package kr.co.softsoldesk.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.co.softsoldesk.beans.TV;

public class TVMain {
	
	public static void main(String[] args) {
		
		//Spring 컨테이너 구동
		//AbstractApplicationContext : BeanFactory + ApplicationContext
		//GenericXmlApplicationContext : 파일과 클래스 관리 설정
		AbstractApplicationContext ctx=new GenericXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		
		//컨테이너로부터 필요한 객체를 요청
		//TV tv=(TV)ctx.getBean("SamsungTV");
		TV tv=(TV)ctx.getBean("SoldeskTV");
		tv.powerOn();
		tv.powerOff();
		tv.volumeUP();
		tv.volumeDown();
		
		ctx.close();
	}
	
	
	
	
	
	
	
	/*
	 * public static void main(String[] args) {
	 * 
	 * ClassPathXmlApplicationContext ctx = new
	 * ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
	 * 
	 * TV SamsungTV=(TV)ctx.getBean("SamsungTV"); TV
	 * SoldeskTV=(TV)ctx.getBean("SoldeskTV");
	 * 
	 * TvAction(SamsungTV); System.out.println("--------------------------------");
	 * TvAction(SoldeskTV); ctx.close(); } public static void TvAction(TV tv) {
	 * tv.powerOn(); tv.volumeUP(); tv.volumeDown(); tv.powerOff(); }
	 */
}
