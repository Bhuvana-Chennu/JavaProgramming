package Day12;

public class PassingparamstoMainMethod {

	public static void main(String[] args) {
		System.out.println(args.length); // here we enter variables through Run as Run configruation and pass arguments in arguments module
		
		for(String v:args) {
			System.out.println(v);
		}

	}

}
