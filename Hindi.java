package pack2;

import java.util.Scanner;


public class Hindi extends language3 {

	//Account Holder Details
    public static void Details()
    {
    	System.out.println("अपना नाम दर्ज करें:");
    	sc = new Scanner(System.in);
    	String name = sc.nextLine();
    	System.out.println(name);
    	
    	System.out.println("अपना Acc_Number डालें:");
    	sc = new Scanner(System.in);
    	 acc_number = sc.nextInt();
    }
    
//Withdraw Money
    public static void Withdraw()
    { 
    	System.out.println("अपना पैसा निकालें");
    	System.out.println("राशि दर्ज करें");
    	sc = new Scanner(System.in);
    	float amount = sc.nextFloat();
        if(amount<=0)
        { 	
    	  System.out.println("कृपया अपनी राशि पुनः दर्ज करें");
        }
        else if(amount>total_bal)
        {
        	System.out.println("अपर्याप्त राशि");
        }
        else{
        	total_bal = total_bal-amount;
        	System.out.println(amount+" अपने खाते से सफलतापूर्वक निकासी करें");
        }
    }
    
//Deposite Money
    public void depositeMoney()
    {
    	Hindi p2 = new Hindi();
    	if(p2.Acc_Number == acc_number)
    	{ 
    		System.out.println("अपनी राशि दर्ज करें");
        	float amount = sc.nextFloat();
        	total_bal = total_bal+amount;
    		System.out.println("राशि सफलतापूर्वक जमा की जाती है:"+total_bal);
    	}
    	else
    	{
    		System.out.println("राशि आपके खाते में जमा नहीं है");
    	}
    }
    
//Check Balance
    public void checkBalance()
    {
    	   System.out.println("आपका बैलेंस है:"+total_bal);
    }
}

class language2 extends Hindi
{
  static language2 p2;
 // Enter Pin 
  public static void Pin2()
  {
	  System.out.println("अपना पिन दर्ज करें");
	  enterpin = sc.nextShort();
	  p2 = new language2();
	  if(enterpin == p2.pin )
	  {
		  language2.Process();
	  }
	  else
	  {
		  System.out.println("अमान्य पिन");
	  }
  }
  
////Select langauge  
//  public static void Language2()
//  {  
//	sc = new Scanner(System.in);  
//	int n = sc.nextInt();
//	switch(n)
//	{
//	 case 1:
//		   break;
//	 case 2:
//		    Pin2();
//		    break;
//	 case 3:
//		    break;
//	}
//  }
  
// Atm Menu
  public static void Menu1()
  {
	  System.out.println("1.पैसे निकालें" +"      "+"2.पैसे जमा करें");
	  System.out.println("3.बैलेंस चेक करें" +"      "+"4.निकासी");
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
		      language2.Withdraw();
		      break;
	   case 2: 
		      language2.Details();
		      p2 = new language2();
		      p2.depositeMoney();
		      break;
	   case 3:
		      p2.checkBalance();
		      break;
	   default:
		      System.out.println("आप बाहर निकल रहे हैं");
		      System.exit(0);
              break;
              
     }  
    }
   }   
}
