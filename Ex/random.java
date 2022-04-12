package Ex;

import java.util.Random;

public class random {
	public String randomName() {
		StringBuffer sb= new StringBuffer();
		String[] firstNames = {"Tod", "John", "Michael"};
        String[] lastNames = {"Smith", "Brown", "Davis"};
        
        int random1 = new Random().nextInt(3);
        String firstName = firstNames[random1];
        
        int random2 = new Random().nextInt(3);
        String lastName = lastNames[random2];
        sb.append(firstName).append(" ").append(lastName);
        return sb.toString();
        
	}
	public static void main(String[]args) {
		random sol = new random();
		System.out.println(sol.randomName());
	}

}
