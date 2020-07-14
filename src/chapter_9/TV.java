package chapter_9;

public class TV {
	int channel=1;//El canal por defecto es el 1
	int volumeLevel=1;//El nivel del volumen por defecto es 1
	boolean on=false;//Variable que determina si est� encendida y que por defecto toma valor false
	
	public TV() {//Constructor		
	}
	//M�todos
	public void turnOn(){//m�todo setter para encender la TV
		on=true;
	}
	public void turnOff(){//m�todo setter para apagar la TV
		on=false;
	}
	public void setChannel(int newChannel) {//m�todo setter para cambiar el canal
		if(on & newChannel>=1 & newChannel<=120)
			channel=newChannel;
	}
	public void setVolume(int newVolumeLevel) {//m�todo setter para cambiar el volumen
		if(on & newVolumeLevel>=1 & newVolumeLevel<=7)
			volumeLevel=newVolumeLevel;			
	}
	public void channelUp() {//m�todo setter para subir un canal
		channel++;
	}
	public void channelUpDown() {//m�todo setter para bajar un canal
	}
	public void volumeUp() {//m�todo setter para subir el volumen
		volumeLevel++;
	}
	public void volumeDown() {//m�todo setter para bajar el volumen
		volumeLevel--;
	}
}
