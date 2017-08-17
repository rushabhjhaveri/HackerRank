public class Day4 {
    private int age;	
  
	public Day4(int initialAge) {
  		// Add some more code to run some checks on initialAge
        if(initialAge < 0){
            age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
        else{
            age = initialAge;
        }
	}

	public void amIOld() {
        if(age < 13){
            System.out.print("You are young.");
        }
        else if(age >= 13 && age < 18){
            System.out.print("You are a teenager.");
        }
        else{
            System.out.print("You are old.");
        }
  		// Write code determining if this person's age is old and print the correct statement:
        System.out.println();
	}

	public void yearPasses() {
  		// Increment this person's age.
        age++;
	}
}