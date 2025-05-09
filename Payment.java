import java.util.*;
class Payment extends Slot
{
	static Scanner sc=new Scanner(System.in);
	static long pin;
	void display()
	{
		System.out.println("----------PAYMENT OPTIONS----------");
		System.out.println("1.UPI(pay via any App)");
		System.out.println("2.Credit/Debit Card");
		int n=sc.nextInt();
		if(n==1)
		{
			System.out.println("UPI(pay via any App)");
			System.out.println("  1.PhonePe   ");
			System.out.println("  2.Google Pay   ");
			System.out.println("  3.Paytm   ");
			int n1=sc.nextInt();
			if(n1==1)
			{
				System.out.println("WELCOME TO PHONEPE");
				upi();
			}
			else if(n1==2)
			{
				System.out.println("WELCOME TO GOOGLE PAY");
				upi();
			}
			else
			{
				System.out.println("WELCOME TO PAYTM");
				upi();
			}
		}
		else
		{
			while(true)
			{
				System.out.println("ENTER CARD NUMBER (IT MUST CONTAIN 12 DIGITS)");
				String no=sc.next();
				int co=0;
				int co1=3;
				for(int i=0;i<no.length();i++)
				{
					char ch=no.charAt(i);
					if(ch>='0' && ch<='9')
					{
						co++;
					}
				}
				if(no.length()==12 && co==no.length())
				{
					System.out.println("ENTER CVV NUMBER");
					int cv=sc.nextInt();
					int co2=3;
					if(99<cv && cv<1000)
					{
						System.out.println("ENTER EXPIRY DATE (----mm/yyyy---- )");
						String date=sc.next();
						int co3=3;
						if((date.charAt(2)+"").equals("/"))
						{
							System.out.println("YOUR PAYMENT WAS SUCCESSFULL");
							break;
						}
						else 
						{
							System.out.println("INVALID DATE");
							co3--;
							System.out.println("YOU HAVE ONLY"+co3+"ATTEMPTS");
							if(co3==0)
							{
								System.out.println("YOU HAVE ENTERED TOO MANY ATTEMPTS");
								break;
							}

						}
						
					}
					else
					{
						System.out.println("INVALID CVV NUMBER");
						co2--;
						System.out.println("YOU HAVE ONLY"+co2+"ATTEMPTS");

						if(co2==0)
						{
							System.out.println("YOU HAVE ENTERED TOO MANY ATTEMPTS");
							System.out.println("YOU HAVE ONLY"+co2+"ATTEMPTS");
							break;
						}
					}
						
				}
				else
				{
					System.out.println("INVALID CARD NUMBER");
					co1--;
					System.out.println("YOU HAVE ONLY"+co1+"ATTEMPTS");
					if(co1==0)
					{
						System.out.println("YOU HAVE ENTERED TOO MANY ATTEMPTS");
						
						break;
					}
				}
			}
				
			
			
		}
		
		
	}
	static void upi()
	{
		System.out.println("Total payable     ");
		System.out.println("Select Bank Account");
		System.out.println("1.SBI");
		System.out.println("2.Canara Bank");
		int n=sc.nextInt();
		if(n==1 || n==2)
		{
			System.out.println("ENTER 6-DIGIT UPI PIN");
			int c=0;
			while(true)
			{
				pin=sc.nextLong();
				if(pin>99999 && pin<1000000)
				{
					System.out.println("Payment Successful");
					break;
				}
				else if(c==3)
				{
					System.out.println("TOO MANY ATTEMPTS");
					break;
				}
				else
				{
					c++;
					System.out.println("ENTER 6-DIGIT PIN");
				} 
			}
						
		}	
	}
		
	
}