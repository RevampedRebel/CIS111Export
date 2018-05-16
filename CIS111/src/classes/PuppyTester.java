package classes;

public class PuppyTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Puppy rexie = new Puppy();
		Puppy mrPuppy = new Puppy(10, "Mr.Puppy", 10.9);
		

		System.out.println("This puppy is named " + mrPuppy.getName() + ". His adorableness level is "  + mrPuppy.getAdorableness() + ", and he weighs " + mrPuppy.getWeight());
	}

}
