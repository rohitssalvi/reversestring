package reversestring;

public class reversestring {
	public static void main(String[] args) {
		
		String value="rohit",reverse = "";
		
		for(int i=value.length()-1;i>=0;i--)
		{
			reverse=reverse+value.charAt(i);
		}
		
		
		System.out.println("reverse String is:"+reverse);
	}

}
