
public class Main {

	public static void main(String[] args) {
		// constructor = special method that is called when an object is instantiated(created)
		
		Human human = new Human("asd",65,70);
		Human human2 = new Human("das",61,69);
		System.out.println(human.name);
		System.out.println(human2.name);
		
		human2.eat();
		human.drink();
	}

}

