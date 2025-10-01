package CustomException;

public class customException {
	static void validateAge(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("Age must be 18 or above to register for voting.");
		} else {
			System.out.println("Registration successful! Age = " + age);
		}
	}
	
	public static void main(String[] args) {
		try {
			validateAge(17);
		} catch (InvalidAgeException e){
			System.out.println("Caught Exception: " + e.getMessage());
		}
		
		try {
			validateAge(24);
		} catch (InvalidAgeException e){
			System.out.println("Caught Exception: " + e.getMessage());
		}
		
	}
}
