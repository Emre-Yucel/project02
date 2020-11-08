package firstPackage;

public class FirstClass {
	
	public static void main(String[] args) {
		System.out.println("first commit from local master branch");
		System.out.println("second commit from local master");
		System.out.println("third commit from local master");
		System.out.println("first commit from remote master branch");
		System.out.println("second commit from remote master branch");
		System.out.println("Third commit from remote master branch");

		System.out.println("Here is a merge conflict I create from local master");

		System.out.println("Here is the conflict we have from remote master branch");
<<<<<<< HEAD
		System.out.println("Here is another conflict from local master branch");
=======
		System.out.println("Here is another conflict from remote master branch");



>>>>>>> f280b911365c392b87e9f7580c69d37fb2c711ca
	}
}
