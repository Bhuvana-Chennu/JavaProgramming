package Day7;

import java.util.Arrays;

public class REmove_Junkchar {

	public static void main(String[] args) {
		String s="abc&efg@123";
		String x[]=s.split("&");
		System.out.println(Arrays.toString(x));
		String x1[]=x[1].split("@");
		System.out.println(Arrays.toString(x1));

	}

}
