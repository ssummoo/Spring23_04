package kr.co.softsoldesk.beans;

public class SamsungTV implements TV {
	
	public SamsungTV() {
		System.out.println("===> SamsungTV 객체 생성");
	}
	
	@Override
	public void powerOn() {
		System.out.println("===> SamsungTV ON");
		
	}

	@Override
	public void powerOff() {
		System.out.println("===> SamsungTV OFF");
		
	}

	@Override
	public void volumeUP() {
		System.out.println("===> SamsungTV volume UP");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("===> SamsungTV volume DOWN");
		
	}

}
