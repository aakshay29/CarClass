
public class AnimalApp {

	public static void main(String[] args) {
		Animal a = new Animal();
		print("Animal: " + a.eat());
		print("Animal: " + a.sleep() + "\n");

		Cat c = new Cat();
		print("Cat: " + c.eat());
		print("Cat: " + c.sleep());
		print("Cat: " + c.play() + "\n");

		Bird b = new Bird();
		print("Bird: " + b.eat());
		print("Bird: " + b.sleep());
		print("Bird: " + b.fly() + "\n");
		
		Dog d = new Dog();
		print("Dog: " + d.eat());
		print("Dog: " + d.sleep());
		print("Dog: " + d.bark() + "\n");
		
		Elephant e = new Elephant();
		print("Elephant: " + e.eat());
		print("Elephant: " + e.sleep());
		print("Elephant: " + e.bathe() + "\n");
		
		Tiger t = new Tiger();
		print("Tiger: " + t.eat());
		print("Tiger: " + t.sleep());
		print("Tiger: " + t.hunt());
	}
	public static void print(String input){
		System.out.println(input);
	}

}
