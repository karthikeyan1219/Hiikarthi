
public class test {

	private void method1() {
   System.out.println("hii"); 
	}
	
	public static void main(String[] args) {
		String s="madam";
		String t="";
		for(int i=s.length()-1;i>=0;i--) {
		
			t=t+s.charAt(i);
		}
		System.out.println(t);
		
		
		
		if(s==t)
		{	
		System.out.println("It is not a Palindrome");
		
		}
		else
		{
		System.out.println("It is  a Palindrome");
		System.out.println("hii");
		System.out.println("hii");

		
		}
		}
}
