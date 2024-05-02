
public class Main {

	public static void main(String[] args) {
		
		//Interface Lesson
		 		
		/*interface = = > a template that can be applied to a class
		 * 				  similar to inheritance, but specifies what a class has/must do
		 * 				  classes can apply more than one interface, inheritance is limited to one superclass
		 * 
		 * */
		
		
		Rabbit rabbit = new Rabbit();
		rabbit.flee();
		Hawk hawk = new Hawk();
		hawk.hunt();
		//hawk.flee(); method flee() is undefined far Hawk class
		
		
		Fish fish = new Fish();
		fish.hunt();
		fish.flee();

	}

}
