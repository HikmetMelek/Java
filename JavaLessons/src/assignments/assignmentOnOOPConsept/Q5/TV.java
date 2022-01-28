package assignments.assignmentOnOOPConsept.Q5;

public class TV {
	
	int channel=1;
	int volumeLevel=0;
	boolean on=false;
	String brand= "undefined";

	public TV() {
		System.out.println("Creating TV object using no args-constructor");
	}

	public TV(String brand) {
		this.brand = brand;
		System.out.println("Creating TV object using 1 arg - constructor");
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		isOn();
		if(on==false || channel<=0 || channel>120) System.out.println("ERROR: TV is either OFF or invalid Channel");
		else {
			this.channel = channel;
		}
	}

	public int getVolumeLevel() {
		return volumeLevel;
	}

	public void setVolumeLevel(int volumeLevel) {
		isOn();
		if(on==true && (volumeLevel>=0 || volumeLevel<=7)){
			this.volumeLevel = volumeLevel;
		}else if(on==false || volumeLevel>7 || volumeLevel<0){
			System.out.println("ERROR: TV is either OFF or invalid Volume level");
			this.volumeLevel = volumeLevel;
		}
	}
	
	public boolean isOn(){
		return on;
	}
	
	public void turnOn(){
		System.out.println("TV is already ON");
		on=true;
	}
	
	public void turnOff(){
		System.out.println("TV is already OFF");
		on=false;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void channelUp(){
		if(channel<120)
			channel++;
		else System.out.println("ERROR: TV is either OFF or invalid Channel");
	}

	public void channelDown(){
		if(channel>1)
			channel--;
		else System.out.println("ERROR: TV is either OFF or invalid Channel");
	}

	public void volumeUp(){
		if(volumeLevel<7)
			volumeLevel++;
		else System.out.println("ERROR: TV is either OFF or invalid Volume level");
	}
	public void volumeDown(){
		if(volumeLevel!=0)
			volumeLevel--;
		else System.out.println("ERROR: TV is either OFF or invalid Volume level");
	}

}
