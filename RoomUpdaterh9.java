class RoomUpdaterh1
{
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";

    void displayUpdatedRoomsh1(String[][] updatedroomh1) 
    {
        System.out.println("Available rooms after booking:");

        for (int i = 0; i < updatedroomh1.length; i++) 
        {
            for (int j = 0; j < updatedroomh1[i].length; j++) 
            {
                if (updatedroomh1[i][j].equals("Booked")) 
                {
                    System.out.print(ANSI_RED + updatedroomh1[i][j] + ANSI_RESET + " || ");
                } 
                else 
                {
                    System.out.print(ANSI_GREEN + updatedroomh1[i][j] + ANSI_RESET + " || ");
                }
            }
            System.out.println();
        }
    }
}

class RoomUpdaterh2 extends RoomUpdaterh1
{
    void displayUpdatedRoomsh2(String[][] updatedroomh2) 
    {
        System.out.println("Available rooms after booking:");

        for (int i = 0; i < updatedroomh2.length; i++) 
        {
            for (int j = 0; j < updatedroomh2[i].length; j++) 
            {
                if (updatedroomh2[i][j].equals("Booked")) 
                {
                    System.out.print(ANSI_RED + updatedroomh2[i][j] + ANSI_RESET + " || ");
                } 
                else 
                {
                    System.out.print(ANSI_GREEN + updatedroomh2[i][j] + ANSI_RESET + " || ");
                }
            }
            System.out.println();
        }
    }
}

class RoomUpdaterh3 extends RoomUpdaterh2
{
    void displayUpdatedRoomsh3(String[][] updatedroomh3) 
    {
        System.out.println("Available rooms after booking:");

        for (int i = 0; i < updatedroomh3.length; i++) 
        {
            for (int j = 0; j < updatedroomh3[i].length; j++) 
            {
                if (updatedroomh3[i][j].equals("Booked")) 
                {
                    System.out.print(ANSI_RED + updatedroomh3[i][j] + ANSI_RESET + " || ");
                } 
                else 
                {
                    System.out.print(ANSI_GREEN + updatedroomh3[i][j] + ANSI_RESET + " || ");
                }
            }
            System.out.println();
        }
    }
}

class RoomUpdaterh4 extends RoomUpdaterh3
{
    void displayUpdatedRoomsh4(String[][] updatedroomh4) 
    {
        System.out.println("Available rooms after booking:");

        for (int i = 0; i < updatedroomh4.length; i++) 
        {
            for (int j = 0; j < updatedroomh4[i].length; j++) 
            {
                if (updatedroomh4[i][j].equals("Booked")) 
                {
                    System.out.print(ANSI_RED + updatedroomh4[i][j] + ANSI_RESET + " || ");
                } 
                else 
                {
                    System.out.print(ANSI_GREEN + updatedroomh4[i][j] + ANSI_RESET + " || ");
                }
            }
            System.out.println();
        }
    }
}

class RoomUpdaterh5 extends RoomUpdaterh4
{
    void displayUpdatedRoomsh5(String[][] updatedroomh5) 
    {
        System.out.println("Available rooms after booking:");

        for (int i = 0; i < updatedroomh5.length; i++) 
        {
            for (int j = 0; j < updatedroomh5[i].length; j++) 
            {
                if (updatedroomh5[i][j].equals("Booked")) 
                {
                    System.out.print(ANSI_RED + updatedroomh5[i][j] + ANSI_RESET + " || ");
                } 
                else 
                {
                    System.out.print(ANSI_GREEN + updatedroomh5[i][j] + ANSI_RESET + " || ");
                }
            }
            System.out.println();
        }
    }
}

class RoomUpdaterh6 extends RoomUpdaterh5
{
    void displayUpdatedRoomsh6(String[][] updatedroomh6) 
    {
        System.out.println("Available rooms after booking:");

        for (int i = 0; i < updatedroomh6.length; i++) 
        {
            for (int j = 0; j < updatedroomh6[i].length; j++) 
            {
                if (updatedroomh6[i][j].equals("Booked")) 
                {
                    System.out.print(ANSI_RED + updatedroomh6[i][j] + ANSI_RESET + " || ");
                } 
                else 
                {
                    System.out.print(ANSI_GREEN + updatedroomh6[i][j] + ANSI_RESET + " || ");
                }
            }
            System.out.println();
        }
    }
}

class RoomUpdaterh7 extends RoomUpdaterh6
{
    void displayUpdatedRoomsh7(String[][] updatedroomh7) 
    {
        System.out.println("Available rooms after booking:");

        for (int i = 0; i < updatedroomh7.length; i++) 
        {
            for (int j = 0; j < updatedroomh7[i].length; j++) 
            {
                if (updatedroomh7[i][j].equals("Booked")) 
                {
                    System.out.print(ANSI_RED + updatedroomh7[i][j] + ANSI_RESET + " || ");
                } 
                else 
                {
                    System.out.print(ANSI_GREEN + updatedroomh7[i][j] + ANSI_RESET + " || ");
                }
            }
            System.out.println();
        }
    }
}

class RoomUpdaterh8 extends RoomUpdaterh7
{
    void displayUpdatedRoomsh8(String[][] updatedroomh8) 
    {
        System.out.println("Available rooms after booking:");

        for (int i = 0; i < updatedroomh8.length; i++) 
        {
            for (int j = 0; j < updatedroomh8[i].length; j++) 
            {
                if (updatedroomh8[i][j].equals("Booked")) 
                {
                    System.out.print(ANSI_RED + updatedroomh8[i][j] + ANSI_RESET + " || ");
                } 
                else 
                {
                    System.out.print(ANSI_GREEN + updatedroomh8[i][j] + ANSI_RESET + " || ");
                }
            }
            System.out.println();
        }
    }
}

class RoomUpdaterh9 extends RoomUpdaterh8
{
    void displayUpdatedRoomsh9(String[][] updatedroomh9) 
    {
        System.out.println("Available rooms after booking:");

        for (int i = 0; i < updatedroomh9.length; i++) 
        {
            for (int j = 0; j < updatedroomh9[i].length; j++) 
            {
                if (updatedroomh9[i][j].equals("Booked")) 
                {
                    System.out.print(ANSI_RED + updatedroomh9[i][j] + ANSI_RESET + " || ");
                } 
                else 
                {
                    System.out.print(ANSI_GREEN + updatedroomh9[i][j] + ANSI_RESET + " || ");
                }
            }
            System.out.println();
        }
    }
}
