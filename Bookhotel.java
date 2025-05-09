import java.util.*;
class Bookhotel extends HotelRoomBooking 
{
    static Scanner sc = new Scanner(System.in);
    static Bookhotel obj = new Bookhotel();
    void home()
    {
        System.out.println("---SELECT YOUR LOCATION---");
        System.out.println("1.HYDERABAD");
        System.out.println("2.BANGLORE");
        System.out.println("3.CHENNAI");
        System.out.println("4.Home");
        System.out.println("5.Exit");
        int n = sc.nextInt();
        if (n == 1) 
	   {
            obj.hyderabad();
        } 
 	   else if (n == 2)
	   {
            obj.banglore();
        } 
	    else if (n == 3)
	   {
            obj.chennai();
        } 
	    else if (n == 4) 
 	    {
            obj.home();
        } 
        else if (n == 5)
        {
            System.exit(0);
        }
    }

    void hyderabad() 
	{
        System.out.println("--SELECT YOUR HOTEL---");
        System.out.println("Hotel1 ---> 4.5");
        System.out.println("Hotel2 ---> 4.3");
        System.out.println("Hotel3 ---> 4.0");
        int n = sc.nextInt();
        switch (n) 
	    {
            case 1:
                System.out.println("Welcome to HOTEL 1");
                
                obj.Hotel1();
                break;
            case 2:
                System.out.println("Welcome to HOTEL 2");
                
                obj.Hotel2();
                break;
            case 3:
                System.out.println("Welcome to HOTEL 3");
            
                obj.Hotel3();
                break;
            default:
                obj.home();
        }
    }
	void banglore() 
	{
        System.out.println("--SELECT YOUR HOTEL---");
        System.out.println("Hotel1 ---> 4.5");
        System.out.println("Hotel2 ---> 4.3");
        System.out.println("Hotel3 ---> 4.0");
        int n = sc.nextInt();
        switch (n) 
	    {
            case 1:
                System.out.println("Welcome to HOTEL 1");
                System.out.println("Select room type");
                obj.Hotel4();
                break;
            case 2:
                System.out.println("Welcome to HOTEL 2");
                System.out.println("Select room type");
                obj.Hotel5();
                break;
            case 3:
                System.out.println("Welcome to HOTEL 3");
                System.out.println("Select room type");
                obj.Hotel6();
                break;
            default:
                obj.home();
        }
    }
	void chennai() 
	{
        System.out.println("--SELECT YOUR HOTEL---");
        System.out.println("Hotel1 ---> 4.5");
        System.out.println("Hotel2 ---> 4.3");
        System.out.println("Hotel3 ---> 4.0");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("Welcome to HOTEL 1");
                System.out.println("Select room type");
                obj.Hotel7();
                break;
            case 2:
                System.out.println("Welcome to HOTEL 2");
                System.out.println("Select room type");
                obj.Hotel8();
                break;
            case 3:
                System.out.println("Welcome to HOTEL 3");
                System.out.println("Select room type");
                obj.Hotel9();
                break;
            default:
                obj.home();
        }
    }
    int c1=0;
    void Hotel1() 
	{
		c1++;
		if(c1==1)
		{
			System.out.println("AVALIABLE ROOMS OF HOTEL 1");
			System.out.println();
        		obj.initializeRoomsh1();
			System.out.println();
			obj.Bookroomh1(); 
		}
		else
		{
			System.out.println("WELCOME BACK");
			obj.displayUpdatedRoomsh1(updatedroomh1);
			System.out.println();
	       	obj.Bookroomh1();
			System.out.println();
		}
        System.out.println();
	    obj.home();
     }
	int c2=0;
    void Hotel2() 
	{
       c2++;
			System.out.println("AVALIABLE ROOMS OF HOTEL 2");		
		if(c2==1)
		{
        		obj.initializeRoomsh2();
			System.out.println();
			obj.Bookroomh2(); 
			System.out.println();
		}
		else
		{
			System.out.println("WELCOME BACK");
			obj.displayUpdatedRoomsh2(updatedroomh2);
			System.out.println();
	       	obj.Bookroomh2();  
			System.out.println();
	         
		}
        System.out.println();
	    obj.home();
    }
	int c3=0;
    void Hotel3() {
        c3++;
		System.out.println("AVALIABLE ROOMS OF HOTEL 1");
		if(c3==1)
		{
        		obj.initializeRoomsh3();
			System.out.println();
			obj.Bookroomh3(); 
			System.out.println();
		}
		else
		{
			System.out.println("WELCOME BACK");
			obj.displayUpdatedRoomsh1(updatedroomh3);
			System.out.println();
	       	obj.Bookroomh3(); 
			System.out.println();
	         
			System.out.println();
		}
        System.out.println();
	    obj.home();
    }
//BANGLORE LOCATION HOTELS
    int c4=0;
    void Hotel4() 
	{
		c4++;
		if(c4==1)
		{
			System.out.println("AVALIABLE ROOMS OF HOTEL 1");
			System.out.println();
        		obj.initializeRoomsh4();
			System.out.println();
			obj.Bookroomh4(); 
		}
		else
		{
			System.out.println("WELCOME BACK");
			obj.displayUpdatedRoomsh4(updatedroomh4);
			System.out.println();
	       	obj.Bookroomh4();
			System.out.println();
	         
		}
        System.out.println();
	    obj.home();
     }
	int c5=0;
    void Hotel5() {
       c5++;
			System.out.println("AVALIABLE ROOMS OF HOTEL 5");		
		if(c5==1)
		{
        		obj.initializeRoomsh5();
			System.out.println();
			obj.Bookroomh5(); 
			System.out.println();
		}
		else
		{
			System.out.println("WELCOME BACK");
			obj.displayUpdatedRoomsh5(updatedroomh2);
			System.out.println();
	       	obj.Bookroomh5();  
			System.out.println();
	         
		}
        System.out.println();
	    obj.home();
    }
int c6=0;
    void Hotel6() {
        c6++;
		System.out.println("AVALIABLE ROOMS OF HOTEL 6");
		if(c6==1)
		{
        		obj.initializeRoomsh6();
			System.out.println();
			obj.Bookroomh6(); 
			System.out.println();
		}
		else
		{
			System.out.println("WELCOME BACK");
			obj.displayUpdatedRoomsh6(updatedroomh3);
			System.out.println();
	       	obj.Bookroomh6(); 
			System.out.println();
	         
			System.out.println();
		}
        System.out.println();
	    obj.home();
    }
//CHENNAI LOCATION
    int c7=0;
    void Hotel7() 
	{
		c7++;
		if(c7==1)
		{
			System.out.println("AVALIABLE ROOMS OF HOTEL 7");
			System.out.println();
        		obj.initializeRoomsh7();
			System.out.println();
			obj.Bookroomh7(); 
		}
		else
		{
			System.out.println("WELCOME BACK");
			obj.displayUpdatedRoomsh7(updatedroomh7);
			System.out.println();
	       	obj.Bookroomh7();
			System.out.println();
	         
		}
        System.out.println();
	    obj.home();
     }
	int c8=0;
    void Hotel8() {
       c8++;
			System.out.println("AVALIABLE ROOMS OF HOTEL 8");		
		if(c8==1)
		{
        		obj.initializeRoomsh8();
			System.out.println();
			obj.Bookroomh8(); 
			System.out.println();
		}
		else
		{
			System.out.println("WELCOME BACK");
			obj.displayUpdatedRoomsh8(updatedroomh8);
			System.out.println();
	       	obj.Bookroomh8();  
			System.out.println();
	         
		}
        System.out.println();
	    obj.home();
    }
int c9=0;
    void Hotel9() {
        c9++;
		System.out.println("AVALIABLE ROOMS OF HOTEL 9");
		if(c9==1)
		{
        		obj.initializeRoomsh9();
			System.out.println();
			obj.Bookroomh9(); 
			System.out.println();
		}
		else
		{
			System.out.println("WELCOME BACK");
			obj.displayUpdatedRoomsh9(updatedroomh9);
			System.out.println();
	       	obj.Bookroomh9(); 
			System.out.println();
	         
			System.out.println();
		}
        System.out.println();
	    obj.home();
    }
	
}

