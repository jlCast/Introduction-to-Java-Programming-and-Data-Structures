package chapter_9;

public class TV {
	int channel=1;//El canal por defecto es el 1
	int volumeLevel=1;//El nivel del volumen por defecto es 1
	boolean on=false;//Variable que determina si está encendida y que por defecto toma valor false
	
	public TV() {//Constructor		
	}
	//Métodos
	public void turnOn(){//método setter para encender la TV
		on=true;
	}
	public void turnOff(){//método setter para apagar la TV
		on=false;
	}
	public void setChannel(int newChannel) {//método setter para cambiar el canal
		if(on & newChannel>=1 & newChannel<=120)
			channel=newChannel;
	}
	public void setVolume(int newVolumeLevel) {//método setter para cambiar el volumen
		if(on & newVolumeLevel>=1 & newVolumeLevel<=7)
			volumeLevel=newVolumeLevel;			
	}
	public void channelUp() {//método setter para subir un canal
		channel++;
	}
	public void channelUpDown() {//método setter para bajar un canal
	}
	public void volumeUp() {//método setter para subir el volumen
		volumeLevel++;
	}
	public void volumeDown() {//método setter para bajar el volumen
		volumeLevel--;
	}
}
