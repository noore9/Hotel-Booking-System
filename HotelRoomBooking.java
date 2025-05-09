import java.util.*;
class HotelRoomBooking extends RoomUpdaterh9
{
    
    static Scanner sc = new Scanner(System.in);
    static HotelRoomBooking ob = new HotelRoomBooking();
    int FLOORS = 2;  // 2 Floors
    int ROOMS_PER_FLOOR = 5;  // 5 Rooms per Floor
    String [][] rooms = new String[FLOORS][ROOMS_PER_FLOOR];

	//HYD LOCATION 
    String [][] updatedroomh1 = new String[FLOORS][ROOMS_PER_FLOOR];
	String [][] updatedroomh2 = new String[FLOORS][ROOMS_PER_FLOOR];
	String [][] updatedroomh3 = new String[FLOORS][ROOMS_PER_FLOOR];
	
	//BANGLORE LOCATION
	String [][] updatedroomh4 = new String[FLOORS][ROOMS_PER_FLOOR];
	String [][] updatedroomh5 = new String[FLOORS][ROOMS_PER_FLOOR];
	String [][] updatedroomh6 = new String[FLOORS][ROOMS_PER_FLOOR];
	
	//CHENNAI LOCATION
	String [][] updatedroomh7 = new String[FLOORS][ROOMS_PER_FLOOR];
	String [][] updatedroomh8 = new String[FLOORS][ROOMS_PER_FLOOR];
	String [][] updatedroomh9 = new String[FLOORS][ROOMS_PER_FLOOR];

    // ANSI escape codes for colors
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

    // HOTEL 1 ROOMS
void initializeRoomsh1() 
{
    for (int i = 0; i < FLOORS; i++) 
    {
        for (int j = 0; j < ROOMS_PER_FLOOR; j++) 
        {
            rooms[i][j] = "Floor " + (i + 1) + " - Room " + (j + 1);
            updatedroomh1[i][j] = rooms[i][j];
            System.out.print(ANSI_GREEN + rooms[i][j] + ANSI_RESET + " || ");
        }
        System.out.println();
    }
}

// hotel 2 rooms
void initializeRoomsh2() 
{
    for (int i = 0; i < FLOORS; i++) 
    {
        for (int j = 0; j < ROOMS_PER_FLOOR; j++) 
        {
            rooms[i][j] = "Floor " + (i + 1) + " - Room " + (j + 1);
            updatedroomh2[i][j] = rooms[i][j]; 
            System.out.print(ANSI_GREEN + rooms[i][j] + ANSI_RESET + " || ");
        }
        System.out.println();
    }
}

// hotel 3 rooms
void initializeRoomsh3() 
{
    for (int i = 0; i < FLOORS; i++) 
    {
        for (int j = 0; j < ROOMS_PER_FLOOR; j++) 
        {
            rooms[i][j] = "Floor " + (i + 1) + " - Room " + (j + 1);
            updatedroomh3[i][j] = rooms[i][j];
            System.out.print(ANSI_GREEN + rooms[i][j] + ANSI_RESET + " || ");
        }
        System.out.println();
    }
}

// hotel 4 rooms
void initializeRoomsh4() 
{
    for (int i = 0; i < FLOORS; i++) 
    {
        for (int j = 0; j < ROOMS_PER_FLOOR; j++) 
        {
            rooms[i][j] = "Floor " + (i + 1) + " - Room " + (j + 1);
            updatedroomh4[i][j] = rooms[i][j];
            System.out.print(ANSI_GREEN + rooms[i][j] + ANSI_RESET + " || ");
        }
        System.out.println();
    }
}

// hotel 5 rooms
void initializeRoomsh5() 
{
    for (int i = 0; i < FLOORS; i++) 
    {
        for (int j = 0; j < ROOMS_PER_FLOOR; j++) 
        {
            rooms[i][j] = "Floor " + (i + 1) + " - Room " + (j + 1);
            updatedroomh5[i][j] = rooms[i][j]; 
            System.out.print(ANSI_GREEN + rooms[i][j] + ANSI_RESET + " || ");
        }
        System.out.println();
    }
}

// hotel 6 rooms
void initializeRoomsh6() 
{
    for (int i = 0; i < FLOORS; i++) 
    {
        for (int j = 0; j < ROOMS_PER_FLOOR; j++) 
        {
            rooms[i][j] = "Floor " + (i + 1) + " - Room " + (j + 1);
            updatedroomh6[i][j] = rooms[i][j]; 
            System.out.print(ANSI_GREEN + rooms[i][j] + ANSI_RESET + " || ");
        }
        System.out.println();
    }
}

// hotel 7 rooms
void initializeRoomsh7() 
{
    for (int i = 0; i < FLOORS; i++) 
    {
        for (int j = 0; j < ROOMS_PER_FLOOR; j++) 
        {
            rooms[i][j] = "Floor " + (i + 1) + " - Room " + (j + 1);
            updatedroomh7[i][j] = rooms[i][j];
            System.out.print(ANSI_GREEN + rooms[i][j] + ANSI_RESET + " || ");
        }
        System.out.println();
    }
}

// hotel 8 rooms
void initializeRoomsh8() 
{
    for (int i = 0; i < FLOORS; i++) 
    {
        for (int j = 0; j < ROOMS_PER_FLOOR; j++) 
        {
            rooms[i][j] = "Floor " + (i + 1) + " - Room " + (j + 1);
            updatedroomh8[i][j] = rooms[i][j]; 
            System.out.print(ANSI_GREEN + rooms[i][j] + ANSI_RESET + " || ");
        }
        System.out.println();
    }
}

// hotel 9 rooms
void initializeRoomsh9() 
{
    for (int i = 0; i < FLOORS; i++) 
    {
        for (int j = 0; j < ROOMS_PER_FLOOR; j++) 
        {
            rooms[i][j] = "Floor " + (i + 1) + " - Room " + (j + 1);
            updatedroomh9[i][j] = rooms[i][j]; 
            System.out.print(ANSI_GREEN + rooms[i][j] + ANSI_RESET + " || ");
        }
        System.out.println();
    }
}


    // HYD LOC Book rooms
void Bookroomh1() 
{
    System.out.println();

    
    boolean allBooked = true;
    for (int i = 0; i < FLOORS; i++) 
    {
        for (int j = 0; j < ROOMS_PER_FLOOR; j++) 
        {
            if (!updatedroomh1[i][j].equals("Booked")) 
            {
                allBooked = false;
                break;
            }
        }
        if (!allBooked) break;
    }

    if (allBooked) 
    {
        System.out.println(ANSI_RED + "All rooms are booked! Please choose another hotel." + ANSI_RESET);
        return;
    }

    
    System.out.println("Enter the number of rooms you want to book:");
    int roomsToBook = sc.nextInt();

    if (roomsToBook <= 0) 
    {
        System.out.println(ANSI_RED + "Invalid number of rooms!" + ANSI_RESET);
        return;
    }

    
    int availableRooms = 0;
    for (int i = 0; i < FLOORS; i++) 
    {
        for (int j = 0; j < ROOMS_PER_FLOOR; j++) 
        {
            if (!updatedroomh1[i][j].equals("Booked")) 
            {
                availableRooms++;
            }
        }
    }

    if (roomsToBook > availableRooms) 
    {
        System.out.println(ANSI_RED + "Not enough available rooms. Only " + availableRooms + " rooms are available." + ANSI_RESET);
        return;
    }

    
    for (int n = 1; n <= roomsToBook; n++) 
    {
        System.out.println("Booking room " + n + " of " + roomsToBook);
        System.out.println("Enter floor no & room no to book:");
        int floor = sc.nextInt();
        int roomno = sc.nextInt();

        if (floor < 1 || floor > FLOORS || roomno < 1 || roomno > ROOMS_PER_FLOOR) 
        {
            System.out.println(ANSI_RED + "Invalid floor or room number! Please try again." + ANSI_RESET);
            n--;
            continue;
        }

        if (updatedroomh1[floor - 1][roomno - 1].equals("Booked")) 
        {
            System.out.println(ANSI_RED + "Room Already Booked!" + ANSI_RESET);
            n--;  
            continue;
        }

        updatedroomh1[floor - 1][roomno - 1] = "Booked";
        System.out.println(ANSI_GREEN + "Room " + roomno + " on floor " + floor + " booked successfully!" + ANSI_RESET);
    }

    
    for (int i = 0; i < FLOORS; i++) 
    {
        for (int j = 0; j < ROOMS_PER_FLOOR; j++) 
        {
            if (updatedroomh1[i][j].equals("Booked")) 
            {
                System.out.print(ANSI_RED + updatedroomh1[i][j] + ANSI_RESET + " || ");
            } 
            else 
            {
                System.out.print(ANSI_GREEN + rooms[i][j] + ANSI_RESET + " || ");
            }
        }
        System.out.println();
    }
    System.out.println();
}
void Bookroomh2() 
{
    System.out.println();

    System.out.println("Enter the number of rooms you want to book:");
    int roomsToBook = sc.nextInt();

    if (roomsToBook <= 0) 
    {
        System.out.println(ANSI_RED + "Invalid number of rooms!" + ANSI_RESET);
        return;
    }

    for (int n = 1; n <= roomsToBook; n++) 
    {
        System.out.println("Booking room " + n + " of " + roomsToBook);
        System.out.println("Enter floor no & room no to book:");
        int floor = sc.nextInt();
        int roomno = sc.nextInt();

        if (floor < 1 || floor > FLOORS || roomno < 1 || roomno > ROOMS_PER_FLOOR) 
        {
            System.out.println(ANSI_RED + "Invalid floor or room number! Please try again." + ANSI_RESET);
            n--;
            continue;
        }

        if (updatedroomh2[floor - 1][roomno - 1].equals("Booked")) 
        {
            System.out.println(ANSI_RED + "Room Already Booked!" + ANSI_RESET);
            n--;
            continue;
        }

        updatedroomh2[floor - 1][roomno - 1] = "Booked";
        System.out.println(ANSI_GREEN + "Room " + roomno + " on floor " + floor + " booked successfully!" + ANSI_RESET);
    }

    for (int i = 0; i < FLOORS; i++) 
    {
        for (int j = 0; j < ROOMS_PER_FLOOR; j++) 
        {
            if (updatedroomh2[i][j].equals("Booked")) 
            {
                System.out.print(ANSI_RED + updatedroomh2[i][j] + ANSI_RESET + " || ");
            } 
            else 
            {
                System.out.print(ANSI_GREEN + rooms[i][j] + ANSI_RESET + " || ");
            }
        }
        System.out.println();
    }
    System.out.println();
}

void Bookroomh3() 
{
    System.out.println();

    System.out.println("Enter the number of rooms you want to book:");
    int roomsToBook = sc.nextInt();

    if (roomsToBook <= 0) 
    {
        System.out.println(ANSI_RED + "Invalid number of rooms!" + ANSI_RESET);
        return;
    }

    for (int n = 1; n <= roomsToBook; n++) 
    {
        System.out.println("Booking room " + n + " of " + roomsToBook);
        System.out.println("Enter floor no & room no to book:");
        int floor = sc.nextInt();
        int roomno = sc.nextInt();

        if (floor < 1 || floor > FLOORS || roomno < 1 || roomno > ROOMS_PER_FLOOR) 
        {
            System.out.println(ANSI_RED + "Invalid floor or room number! Please try again." + ANSI_RESET);
            n--;
            continue;
        }

        if (updatedroomh3[floor - 1][roomno - 1].equals("Booked")) 
        {
            System.out.println(ANSI_RED + "Room Already Booked!" + ANSI_RESET);
            n--;
            continue;
        }

        updatedroomh3[floor - 1][roomno - 1] = "Booked";
        System.out.println(ANSI_GREEN + "Room " + roomno + " on floor " + floor + " booked successfully!" + ANSI_RESET);
    }

    for (int i = 0; i < FLOORS; i++) 
    {
        for (int j = 0; j < ROOMS_PER_FLOOR; j++) 
        {
            if (updatedroomh3[i][j].equals("Booked")) 
            {
                System.out.print(ANSI_RED + updatedroomh3[i][j] + ANSI_RESET + " || ");
            } 
            else 
            {
                System.out.print(ANSI_GREEN + rooms[i][j] + ANSI_RESET + " || ");
            }
        }
        System.out.println();
    }
    System.out.println();
}

void Bookroomh4() 
{
    System.out.println();

    System.out.println("Enter the number of rooms you want to book:");
    int roomsToBook = sc.nextInt();

    if (roomsToBook <= 0) 
    {
        System.out.println(ANSI_RED + "Invalid number of rooms!" + ANSI_RESET);
        return;
    }

    for (int n = 1; n <= roomsToBook; n++) 
    {
        System.out.println("Booking room " + n + " of " + roomsToBook);
        System.out.println("Enter floor no & room no to book:");
        int floor = sc.nextInt();
        int roomno = sc.nextInt();

        if (floor < 1 || floor > FLOORS || roomno < 1 || roomno > ROOMS_PER_FLOOR) 
        {
            System.out.println(ANSI_RED + "Invalid floor or room number! Please try again." + ANSI_RESET);
            n--;
            continue;
        }

        if (updatedroomh4[floor - 1][roomno - 1].equals("Booked")) 
        {
            System.out.println(ANSI_RED + "Room Already Booked!" + ANSI_RESET);
            n--;
            continue;
        }

        updatedroomh4[floor - 1][roomno - 1] = "Booked";
        System.out.println(ANSI_GREEN + "Room " + roomno + " on floor " + floor + " booked successfully!" + ANSI_RESET);
    }

    for (int i = 0; i < FLOORS; i++) 
    {
        for (int j = 0; j < ROOMS_PER_FLOOR; j++) 
        {
            if (updatedroomh4[i][j].equals("Booked")) 
            {
                System.out.print(ANSI_RED + updatedroomh4[i][j] + ANSI_RESET + " || ");
            } 
            else 
            {
                System.out.print(ANSI_GREEN + rooms[i][j] + ANSI_RESET + " || ");
            }
        }
        System.out.println();
    }
    System.out.println();
}
void Bookroomh5() 
{
    System.out.println();

    System.out.println("Enter the number of rooms you want to book:");
    int roomsToBook = sc.nextInt();

    if (roomsToBook <= 0) 
    {
        System.out.println(ANSI_RED + "Invalid number of rooms!" + ANSI_RESET);
        return;
    }

    for (int n = 1; n <= roomsToBook; n++) 
    {
        System.out.println("Booking room " + n + " of " + roomsToBook);
        System.out.println("Enter floor no & room no to book:");
        int floor = sc.nextInt();
        int roomno = sc.nextInt();

        if (floor < 1 || floor > FLOORS || roomno < 1 || roomno > ROOMS_PER_FLOOR) 
        {
            System.out.println(ANSI_RED + "Invalid floor or room number! Please try again." + ANSI_RESET);
            n--;
            continue;
        }

        if (updatedroomh5[floor - 1][roomno - 1].equals("Booked")) 
        {
            System.out.println(ANSI_RED + "Room Already Booked!" + ANSI_RESET);
            n--;
            continue;
        }

        updatedroomh5[floor - 1][roomno - 1] = "Booked";
        System.out.println(ANSI_GREEN + "Room " + roomno + " on floor " + floor + " booked successfully!" + ANSI_RESET);
    }

    for (int i = 0; i < FLOORS; i++) 
    {
        for (int j = 0; j < ROOMS_PER_FLOOR; j++) 
        {
            if (updatedroomh5[i][j].equals("Booked")) 
            {
                System.out.print(ANSI_RED + updatedroomh5[i][j] + ANSI_RESET + " || ");
            } 
            else 
            {
                System.out.print(ANSI_GREEN + rooms[i][j] + ANSI_RESET + " || ");
            }
        }
        System.out.println();
    }
    System.out.println();
}

void Bookroomh6() 
{
    System.out.println();

    System.out.println("Enter the number of rooms you want to book:");
    int roomsToBook = sc.nextInt();

    if (roomsToBook <= 0) 
    {
        System.out.println(ANSI_RED + "Invalid number of rooms!" + ANSI_RESET);
        return;
    }

    for (int n = 1; n <= roomsToBook; n++) 
    {
        System.out.println("Booking room " + n + " of " + roomsToBook);
        System.out.println("Enter floor no & room no to book:");
        int floor = sc.nextInt();
        int roomno = sc.nextInt();

        if (floor < 1 || floor > FLOORS || roomno < 1 || roomno > ROOMS_PER_FLOOR) 
        {
            System.out.println(ANSI_RED + "Invalid floor or room number! Please try again." + ANSI_RESET);
            n--;
            continue;
        }

        if (updatedroomh6[floor - 1][roomno - 1].equals("Booked")) 
        {
            System.out.println(ANSI_RED + "Room Already Booked!" + ANSI_RESET);
            n--;
            continue;
        }

        updatedroomh6[floor - 1][roomno - 1] = "Booked";
        System.out.println(ANSI_GREEN + "Room " + roomno + " on floor " + floor + " booked successfully!" + ANSI_RESET);
    }

    for (int i = 0; i < FLOORS; i++) 
    {
        for (int j = 0; j < ROOMS_PER_FLOOR; j++) 
        {
            if (updatedroomh6[i][j].equals("Booked")) 
            {
                System.out.print(ANSI_RED + updatedroomh6[i][j] + ANSI_RESET + " || ");
            } 
            else 
            {
                System.out.print(ANSI_GREEN + rooms[i][j] + ANSI_RESET + " || ");
            }
        }
        System.out.println();
    }
    System.out.println();
}

void Bookroomh7() 
{
    System.out.println();

    System.out.println("Enter the number of rooms you want to book:");
    int roomsToBook = sc.nextInt();

    if (roomsToBook <= 0) 
    {
        System.out.println(ANSI_RED + "Invalid number of rooms!" + ANSI_RESET);
        return;
    }

    for (int n = 1; n <= roomsToBook; n++) 
    {
        System.out.println("Booking room " + n + " of " + roomsToBook);
        System.out.println("Enter floor no & room no to book:");
        int floor = sc.nextInt();
        int roomno = sc.nextInt();

        if (floor < 1 || floor > FLOORS || roomno < 1 || roomno > ROOMS_PER_FLOOR) 
        {
            System.out.println(ANSI_RED + "Invalid floor or room number! Please try again." + ANSI_RESET);
            n--;
            continue;
        }

        if (updatedroomh7[floor - 1][roomno - 1].equals("Booked")) 
        {
            System.out.println(ANSI_RED + "Room Already Booked!" + ANSI_RESET);
            n--;
            continue;
        }

        updatedroomh7[floor - 1][roomno - 1] = "Booked";
        System.out.println(ANSI_GREEN + "Room " + roomno + " on floor " + floor + " booked successfully!" + ANSI_RESET);
    }

    for (int i = 0; i < FLOORS; i++) 
    {
        for (int j = 0; j < ROOMS_PER_FLOOR; j++) 
        {
            if (updatedroomh7[i][j].equals("Booked")) 
            {
                System.out.print(ANSI_RED + updatedroomh7[i][j] + ANSI_RESET + " || ");
            } 
            else 
            {
                System.out.print(ANSI_GREEN + rooms[i][j] + ANSI_RESET + " || ");
            }
        }
        System.out.println();
    }
    System.out.println();
}

void Bookroomh8() 
{
    System.out.println();

    System.out.println("Enter the number of rooms you want to book:");
    int roomsToBook = sc.nextInt();

    if (roomsToBook <= 0) 
    {
        System.out.println(ANSI_RED + "Invalid number of rooms!" + ANSI_RESET);
        return;
    }

    for (int n = 1; n <= roomsToBook; n++) 
    {
        System.out.println("Booking room " + n + " of " + roomsToBook);
        System.out.println("Enter floor no & room no to book:");
        int floor = sc.nextInt();
        int roomno = sc.nextInt();

        if (floor < 1 || floor > FLOORS || roomno < 1 || roomno > ROOMS_PER_FLOOR) 
        {
            System.out.println(ANSI_RED + "Invalid floor or room number! Please try again." + ANSI_RESET);
            n--;
            continue;
        }

        if (updatedroomh8[floor - 1][roomno - 1].equals("Booked")) 
        {
            System.out.println(ANSI_RED + "Room Already Booked!" + ANSI_RESET);
            n--;
            continue;
        }

        updatedroomh8[floor - 1][roomno - 1] = "Booked";
        System.out.println(ANSI_GREEN + "Room " + roomno + " on floor " + floor + " booked successfully!" + ANSI_RESET);
    }

    for (int i = 0; i < FLOORS; i++) 
    {
        for (int j = 0; j < ROOMS_PER_FLOOR; j++) 
        {
            if (updatedroomh8[i][j].equals("Booked")) 
            {
                System.out.print(ANSI_RED + updatedroomh8[i][j] + ANSI_RESET + " || ");
            } 
            else 
            {
                System.out.print(ANSI_GREEN + rooms[i][j] + ANSI_RESET + " || ");
            }
        }
        System.out.println();
    }
    System.out.println();
}

void Bookroomh9() 
{
    System.out.println();

    System.out.println("Enter the number of rooms you want to book:");
    int roomsToBook = sc.nextInt();

    if (roomsToBook <= 0) 
    {
        System.out.println(ANSI_RED + "Invalid number of rooms!" + ANSI_RESET);
        return;
    }

    for (int n = 1; n <= roomsToBook; n++) 
    {
        System.out.println("Booking room " + n + " of " + roomsToBook);
        System.out.println("Enter floor no & room no to book:");
        int floor = sc.nextInt();
        int roomno = sc.nextInt();

        if (floor < 1 || floor > FLOORS || roomno < 1 || roomno > ROOMS_PER_FLOOR) 
        {
            System.out.println(ANSI_RED + "Invalid floor or room number! Please try again." + ANSI_RESET);
            n--;
            continue;
        }

        if (updatedroomh9[floor - 1][roomno - 1].equals("Booked")) 
        {
            System.out.println(ANSI_RED + "Room Already Booked!" + ANSI_RESET);
            n--;
            continue;
        }

        updatedroomh9[floor - 1][roomno - 1] = "Booked";
        System.out.println(ANSI_GREEN + "Room " + roomno + " on floor " + floor + " booked successfully!" + ANSI_RESET);
    }

    for (int i = 0; i < FLOORS; i++) 
    {
        for (int j = 0; j < ROOMS_PER_FLOOR; j++) 
        {
            if (updatedroomh9[i][j].equals("Booked")) 
            {
                System.out.print(ANSI_RED + updatedroomh9[i][j] + ANSI_RESET + " || ");
            } 
            else 
            {
                System.out.print(ANSI_GREEN + rooms[i][j] + ANSI_RESET + " || ");
            }
        }
        System.out.println();
    }
    System.out.println();
}
}