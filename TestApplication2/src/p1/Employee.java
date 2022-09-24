package p1;

import java.util.*;

public class Employee {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int monthlySalary=sc.nextInt();
	int annual_sal=monthlySalary*12;
	int hra=(20*annual_sal)/100;
	int da=((40*annual_sal)/100)+hra;
	int ta=0;
	if(annual_sal<500000)
	   ta=0;
	else if(annual_sal>500000 && annual_sal<1000000)
	   ta=(annual_sal*10)/100;
	else if(annual_sal>1000000 && annual_sal<2000000)
	   ta=(annual_sal*20)/100;
	else
	   ta=(annual_sal*30)/100;
    annual_sal-=(hra+da+ta);
    System.out.println("annual sal: "+annual_sal);
    System.out.println("taxAmount: "+ta);
    
}
}
	 
	
	
