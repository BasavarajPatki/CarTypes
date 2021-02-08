package day8;

 class Car {
	 int yearModel;
	 String make;
	 int speed;
	 
	public Car(int yearModel,String make) {
		this.yearModel=yearModel;
		this.make=make;
		speed=0;
	}

	public int getYearModel() {
		return yearModel;
	}

	public void setYearModel(int yearModel) {
		this.yearModel = yearModel;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void accelerate() {
		speed+=5;  //increase speed by 5
	}
	public void brake() {
		speed-=5;
		if(speed<0)
			speed=0;//decrease speed by 5
	}
	
}
 
 
