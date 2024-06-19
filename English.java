package pack2;

import java.util.Scanner;



public class English extends language2{
	    
	//Account Holder Details
	    public static void Details()
	    {
	    	System.out.println("Enter Your Name:");
	    	sc = new Scanner(System.in);
	    	String name = sc.nextLine();
	    	System.out.println(name);
	    	
	    	System.out.println("Enter Your Acc_Number:");
	    	sc = new Scanner(System.in);
	    	 acc_number = sc.nextInt();
	    }
	    
	//Withdraw Money
	    public static void Withdraw()
	    { 
	    	System.out.println("Withdraw Your Money");
	    	System.out.println("Enter Amount");
	    	sc = new Scanner(System.in);
	    	float amount = sc.nextFloat();
	        if(amount<=0)
	        { 	
	    	  System.out.println("Please Re-Enter Your Amount");
	        }
	        else if(amount>total_bal)
	        {
	        	System.out.println("Insufficient Amount");
	        }
	        else{
	        	total_bal = total_bal-amount;
	        	System.out.println(amount+" Successfully Withdraw From Your Account");
	        }
	    }
	    
	//Deposite Money
	    public void depositeMoney()
	    {
	    	English	Pro2 = new English();
	    	if(Pro2.Acc_Number == acc_number)
	    	{ 
	    		System.out.println("Enter Your Amount");
	        	float amount = sc.nextFloat();
	        	total_bal = total_bal+amount;
	    		System.out.println("Amount is Successfully Deposited:"+total_bal);
	    	}
	    	else
	    	{
	    		System.out.println("Amount is not Deposited in Your Account");
	    	}
	    }
	    
	//Check Balance
	    public void checkBalance()
	    {
	    	   System.out.println("Your Balance is:"+total_bal);
	    }
	}


class language1 extends English
{
	  static language1 p1;
	 // Enter Pin 
	  public static void Pin1()
	  {
		  System.out.println("Enter Your Pin");
		  enterpin = sc.nextShort();
		  p1 = new language1();
		  if(enterpin == p1.pin )
		  {
			  language1.Process();
		  }
		  else
		  {
			  System.out.println("Invalid Pin");
		  }
	  }
	  
	//Select langauge  
	  public static void Language1()
	  {  
		sc = new Scanner(System.in);  
		int n = sc.nextInt();
		switch(n)
		{
		 case 1:
			    Pin1();
			    break;
		 case 2:
			   System.out.println("Error");
			   // Pin2();
			    break;
		 case 3:
			   System.out.println("Error");
			   //Pin3();
			   break;
		}
	  }
	  
	// Atm Menu
	  public static void Menu1()
	  {
		  System.out.println("1.Withdraw Money" +"      "+"2.Deposite Money");
		  System.out.println("3.Check Balance" +"      "+"4.Exit");
	  }

	 //Select Process
	  public static void Process()
	  {  
		  while(true)
	     {
		   Menu1();	  
		   sc = new Scanner(System.in);
		   int x = sc.nextInt();
		   switch(x) 
		   {
		   case 1:
			      language1.Withdraw();
			      break;
		   case 2: 
			      language1.Details();
			      p1 = new language1();
			      p1.depositeMoney();
			      break;
		   case 3:
			      p1.checkBalance();
			      break;
		   default:
			      System.out.println("You are Exit");
			      System.exit(0);
	              break;
	              
	     }  
	    }
	   }   
	  
}
