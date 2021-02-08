package day8;

public class CarTestApp {

	public static void main(String[] args) {
		Car c=new Car(1965,"Bat Mobile");
		c.accelerate();
		System.out.println(c.getSpeed());
		c.accelerate();
		System.out.println(c.getSpeed());
		c.accelerate();
		System.out.println(c.getSpeed());
		c.accelerate();
		System.out.println(c.getSpeed());
		c.accelerate();
		System.out.println(c.getSpeed());
		c.brake();
		System.out.println(c.getSpeed());
		c.brake();
		System.out.println(c.getSpeed());
		c.brake();
		System.out.println(c.getSpeed());
		c.brake();
		System.out.println(c.getSpeed());
		c.brake();
		System.out.println(c.getSpeed());
		c.brake();
		System.out.println(c.getSpeed());
		

	}

}
