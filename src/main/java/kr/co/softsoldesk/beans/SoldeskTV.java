package kr.co.softsoldesk.beans;

public class SoldeskTV implements TV {

	public SoldeskTV() {
		System.out.println("===> SoldeskTV 객체 생성");
	}
	
	@Override
	public void powerOn() {
		System.out.println("===> SoldeskTV ON");
		
	}

	@Override
	public void powerOff() {
		System.out.println("===> SoldeskTV OFF");
		
	}

	@Override
	public void volumeUP() {
		System.out.println("===> SoldeskTV volume UP");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("===> SoldeskTV volume DOWN");
		
	}
}
