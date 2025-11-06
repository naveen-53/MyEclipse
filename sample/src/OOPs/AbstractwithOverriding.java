package OOPs;

interface Vehicle{
	void changeGesr(int a);
	void speedUp(int a);
	void applyBrake(int a);
}
class Bicycle implements Vehicle{
	int speed,gear;
	
	@Override
	public void changeGesr(int newGear) {
		gear=newGear;
	}
	@Override
	public void speedUp(int increment) {
		speed=speed+increment;
		
	}
	@Override
	public void applyBrake(int decrement) {
		speed=speed-decrement;
		
	}
	public void print() {
		System.out.println("Speed "+speed+" Gear "+gear);
	}

	
}
class Bike implements Vehicle{
	int speed,gear;
	
	@Override
	public void changeGesr(int newGear) {
		gear=newGear;
	}
	@Override
	public void speedUp(int increment) {
		speed=speed+increment;
		
	}
	@Override
	public void applyBrake(int decrement) {
		speed=speed-decrement;
		
	}
	public void print() {
		System.out.println("Speed "+speed+" Gear "+gear);
	}

	
}

public class AbstractwithOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bicycle b = new Bicycle();
		b.changeGesr(2);
		b.speedUp(3);
		b.applyBrake(1);
		b.print();
		
		Bike bike = new Bike();
		bike.changeGesr(3);
		bike.speedUp(2);
		bike.applyBrake(2);
		bike.print();

	}

}
