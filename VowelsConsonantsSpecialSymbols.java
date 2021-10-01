package stringInterview;

import java.util.*;

public class VowelsConsonantsSpecialSymbols {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String x=sc.nextLine();
		x=x.toLowerCase();
		char y[]=x.toCharArray();
		int n=x.length();
		int i=0,vow=0,con=0,spe=0;
		System.out.println(x);
		while(i!=n)
		{
			if(y[i]>='a'&&y[i]<='z')
			{
				if(y[i]=='a'||y[i]=='e'||y[i]=='i'||y[i]=='o'||y[i]=='u')
				{
					vow=vow+1;
				}
				else 
				{
					con=con+1;
				}
			}
			else
			{
				spe=spe+1;
			}
			++i;
		}
		System.out.println("vowels: "+vow+" consonants: "+con+" special symbols: "+spe);
	}

}
