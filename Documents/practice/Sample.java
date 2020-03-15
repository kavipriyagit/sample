import java.util.LinkedHashMap;
import java.util.Map;

public class Sample {
	public static void main(String[] args) {
		
		
//		String s1="welcome to java class";
//		 String[] ss = s1.split("");
//		Map<String, Integer>mp=new LinkedHashMap<>();
//	for (String d : ss) {
//		
//			if(mp.containsKey(d))
//			{
//				Integer i=mp.get(d);
//				mp.put(d, i+1);
//			}
//			else
//			{
//				mp.put(d, 1);
//			}
//		}
//		System.out.println(mp);
		

//		
//		
		//upper case/lower case
		String s="tPriYA8973@gmail.com";
		int uppercount=0;
		int lowercount=0;
		int digitcount=0;
		int splcount=0;
		String upper="";
		String lower="";
		String digit="";
		String spl="";
		
		for (int i = 0; i < s.length(); i++) {
			char c= s.charAt(i);
			if(c>='A'&& c<='Z')
			{
				uppercount++;
				upper=upper+c;
				
			}
			
			else  if(c>='a'&& c<='z')
			{
				lowercount++;
				lower=lower+c;
				
			}
			else if(c>='0'&&c<='9')                  
			{
				digitcount++;
				digit=digit+c;
			}
			else
			{
				splcount++;
				spl=spl+c;
			}
			System.out.println(uppercount+" "+upper);
			System.out.println(lowercount+" "+lower);
			System.out.println(digitcount+" "+digit);
			System.out.println(splcount+" "+spl);
		}
			
		
		
	}

}
