package pack2;

import java.util.Scanner;

public class Marathi {
	final int Acc_Number = 1234567891;
    static int acc_number;
    static Scanner sc;
    static float total_bal= 0;
    static short enterpin;
    final short pin = 1234;
    
	//Account Holder Details
    public static void Details()
    {
    	System.out.println("आपले नाव प्रविष्ट करा:");
    	sc = new Scanner(System.in);
    	String name = sc.nextLine();
    	System.out.println(name);
    	
    	System.out.println("आपले Acc_Number प्रविष्ट करा:");
    	sc = new Scanner(System.in);
    	 acc_number = sc.nextInt();
    }
    
    //Withdraw Money
    public static void Withdraw()
    { 
    	System.out.println("आपले पैसे काढा");
    	System.out.println("रक्कम प्रविष्ट करा");
    	sc = new Scanner(System.in);
    	float amount = sc.nextFloat();
        if(amount<=0)
        { 	
    	  System.out.println("कृपया आपली रक्कम पुन्हा प्रविष्ट करा");
        }
        else if(amount>total_bal)
        {
        	System.out.println("अपुरी रक्कम");
        }
        else{
        	total_bal = total_bal-amount;
        	System.out.println(amount+" आपल्या खात्यातून यशस्वीरित्या काढा");
        }
    }
    
    //Deposite Money
    public void depositeMoney()
    {
    	Marathi p2 = new Marathi();
    	if(p2.Acc_Number == acc_number)
    	{ 
    		System.out.println("आपली रक्कम प्रविष्ट करा");
        	float amount = sc.nextFloat();
        	total_bal = total_bal+amount;
    		System.out.println("रक्कम यशस्वीरित्या जमा केली जाते:"+total_bal);
    	}
    	else
    	{
    		System.out.println("तुमच्या खात्यात रक्कम जमा होत नाही");
    	}
    }
    
    //Check Balance
    public void checkBalance()
    {
    	   System.out.println("आपला शिल्लक आहे:"+total_bal);
    }
}

class language3 extends Marathi
{
  public static Scanner sc;
  static language3 p3;
  
  // Enter Pin 
  public static void Pin3()
  {
	  System.out.println("आपला पिन प्रविष्ट करा");
	  enterpin = sc.nextShort();
	  p3 = new language3();
	  if(enterpin == p3.pin )
	  {
		  language3.Process();
	  }
	  else
	  {
		  System.out.println("अवैध पिन");
	  }
  }
  
  // Atm Menu
  public static void Menu1()
  {
	  System.out.println("1.पैसे काढा" +"      "+"2.पैसे जमा करा");
	  System.out.println("3.बॅलन्स तपासा" +"      "+"4.बाहेर जाणे");
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
		      language3.Withdraw();
		      break;
	   case 2: 
		      language3.Details();
		      p3 = new language3();
		      p3.depositeMoney();
		      break;
	   case 3:
		      p3.checkBalance();
		      break;
	   default:
		      System.out.println("तुम्ही एक्झिट आहात");
		      System.exit(0);
              break;
              
     }  
    }
   }   
}
