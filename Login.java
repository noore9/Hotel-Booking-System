import java.util.*;
class Login extends Bookhotel
{
	static Scanner sc=new Scanner(System.in);
	static Login ob=new Login();
	static String n[]={"Kalyan","Sanjay","Noor"};
	static String p[]={"123","456","789"};
	static String r[]={"12345","67890","34567"};
	String nam="";
	String pas="";
	boolean validatemobile()
	{
		System.out.println("Enter your Mobile Number");
		String mobno=sc.next();
		boolean b=false;
		for(int i=0;i<r.length;i++)
		{
			if(r[i].equals(mobno))
			{
					System.out.println("Your Username is :"+n[i]);
					System.out.println("Your Password is :"+p[i]);
					
					b=true;
			}
		}
		return b;
	}
	//to validate mobile number
	void validmobileno()
	{
        System.out.println(ANSI_RED+"ENTER MOBILE NUMBER"+ANSI_RESET);
        String no = sc.next();
		
	   if (no.length() != 10)
	   {
            System.out.println(ANSI_RED+"Invalid Mobile number. It must be exactly 10 digits."+ANSI_RESET);
            ob.validmobileno();
	   }
	   else if(no.length() == 10)
	   {
			char ch1 = no.charAt(0);
        		if (ch1 < '6' || ch1 > '9')
	     	{
          	    System.out.println(ANSI_RED+"Invalid Indian format. The number must start with a digit between 6 and 9."+ANSI_RESET);
		 	    ob.validmobileno();
          	}
			 else
			 {
				for (int i=0;i< no.length();i++) 
	   			{
         		   		if (no.charAt(i) < '0' || no.charAt(i) > '9')
					{
         		       		System.out.println(ANSI_RED+"Invalid Mobile number. It should only contain digits."+ANSI_RESET);
         		      		ob.validmobileno();
         		   		}
				}
        		}
		}
		
	}
	String newuser()
	{
		ob.validmobileno();
		System.out.println(ANSI_YELLOW+"Valid mobile number"+ANSI_RESET);	
		String name="";
		int c=3;
		while(c>=0)
		{
			System.out.println(ANSI_PURPLE+"YOUR OTP IS"+ANSI_RESET);
			int ot=otp();
			System.out.println(ot);
			int otp=sc.nextInt();
			if(otp==ot)
			{
				System.out.println(ANSI_BLUE+"ENTER YOUR NAME"+ANSI_RESET);
				this.nam=sc.next();
				System.out.println(ANSI_RED+"ENTER YOUR PASSWORD"+ANSI_RESET);
				this.pas=sc.next();
				System.out.println(ANSI_GREEN+"YOUR REGISTER SUCCESSFULL"+ANSI_RESET);
				System.out.println();
				System.out.println(ANSI_PURPLE+"WELCOME TO HOTEL ROOM BOOKING'S "+nam+ANSI_RESET);

				System.out.println();
				ob.home();
				break;
			
			}
			else
			{
				
				System.out.println(ANSI_RED+"ENTERED WRONG OPT"+ANSI_RESET);
				System.out.println(ANSI_BLUE+"ATTEMPTS YOU LEFT "+c--+ANSI_RESET);
			}

		}
		return name;	
		
		
	}
	static int otp()
	{
		Random r=new Random();
		int a=r.nextInt(8999)+1000;
		return a;
	}
	String olduser()
	{
		String name="";
		
		
			int attempts=3;
			boolean isvalid=false;
			while(attempts>0 && !isvalid)
			{
				System.out.println("ENTER YOUR NAME");
				name=sc.next();
				System.out.println("ENTER YOUR PASSWORD");
				String pass=sc.next();

				for (int i=0;i<n.length;i++) 
				{
					
                    			if(n[i].equals(name)&&p[i].equals(pass))
					{
                        			System.out.println("WELCOME TO HOTEL ROOM BOOKING'S "+n[i]);
						System.out.println();
						isvalid = true;
						ob.home();
						break;
                        			
					}
				}
				if(this.nam.equals(name)&&this.pas.equals(pass))
				{
					isvalid = true;
					System.out.println("WELCOME TO HOTEL ROOM BOOKING'S ");
					System.out.println(nam);
					name=nam;
					ob.home();
				}
				if(!isvalid)
				{
					attempts--;
					if(attempts>0)
					{
						System.out.println("WRONG USERNAME OR PASSWORD.PLEASE TRY AGAIN.");
						System.out.println("REMAINING ATTEMPTS: " + attempts);

					}
					else 
					{
                    				System.out.println("TOO MANY FAILED ATTEMPTS. ACCESS DENIED.");
						System.out.println("enter 1 for validate mobile number or 2 for exit");
						int n=sc.nextInt();
						if(n==1)
						{
							if(ob.validatemobile())
							{
								ob.olduser();
							}
							else
							{
								return "exit";
							}
						}
						else
						{
							return "exit";
						}
					}
				}

			}
		
		return name;
	
	}
	public static void main(String args[]) 
	{
   
		System.out.println("1.FOR SIGN UP \n 2.FOR LOGIN");
		int n1=sc.nextInt();
		if(n1==1)
			ob.newuser();
		else
			ob.olduser();
    }
			
}