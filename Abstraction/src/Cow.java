
public class Cow extends Animal{
	public void makeNoise(){
		System.out.println("Cows Moo");
	}
	
	public static void main(String[] args){
		Animal a = new Dog();
		Animal b = new Cow();
		a.eat();
		a.sleep();
		a.makeNoise();
		b.makeNoise();
	}
}
