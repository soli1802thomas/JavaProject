package assignments;

public class StringPalindrome {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Ara";
		boolean flag=true;
		String a=s.toLowerCase();
		for(int i=0;i<=s.length()/2;i++)
		{
			if (a.charAt(i)!=a.charAt(a.length()-i-1))
			{
				flag=false;
				break;
			}
		}
			if(flag)
			{
				System.out.println("String is palindrome");
			}
			else
			{
				System.out.println("String is not palindrome");
			}
		}

	

}
