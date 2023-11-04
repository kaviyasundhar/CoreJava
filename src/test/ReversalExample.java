package test;

public class ReversalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "I am feeling lucky";
		String ch = "";
	
		// rev the string and show in the output
		
		String[] spl = str1.split(" ");
		
		//System.out.println(str1.split(" ").length); - we cannot print array value 
		
		/*for(int j = 0; j<spl.length;j++)
		{
			System.out.println(spl[j]);
			
		
		}*/
		for(int i=spl.length-1;i>=0;i--) {
			
			ch= ch + spl[i]+" ";
			
			//ch1= ch1 + spl[i].charAt(spl[i].length()-i);
			
			
		}
		System.out.println(ch);
		
		
		
		//int num1 = 10282023;
		
		// find the sum of all the digits in num2
		// find out the rev num of num1
		// do not convert this num into string


		

	}

}
