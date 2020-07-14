package chapter_9;

public class TestTV {
	//Pag 351 Listing 9.3 y 9.4
	public static void main(String[] args) {
		TV tv1=new TV();
		tv1.turnOn();
		tv1.setChannel(30);
		tv1.setVolume(3);
		
		TV tv2=new TV();
		tv2.turnOn();
		tv2.channelUp();
		tv2.channelUp();
		tv2.volumeUp();
		
		System.out.println("El canal de la tv1 es "+tv1.channel+" y el nivel del volumen es "+tv1.volumeLevel+".");
		System.out.println("El canal de la tv2 es "+tv2.channel+" y el nivel del volumen es "+tv2.volumeLevel+".");
	}

}
