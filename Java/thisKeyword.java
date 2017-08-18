class Hotel
{
    int regNo;
    String hotelName;
    String address;

    Room room[];

    Hotel()
    {
        this(1);
    }
    Hotel(int regNo)
    {
        this(regNo, "Hotel1", "ShivajiNagar");
    }
    
    Hotel(int regNo, String hotelName, String address)
    {
        this.regNo=regNo;
        this.hotelName = hotelName;
        this.address = address;

        room = new Room[4];
        this.room[0]= new Room();
        this.room[1]= new Room(2);
        this.room[2]= new Room(3, "Deluxe");
        this.room[3]= new Room(4, "Super Deluxe");
        
        this.displayHotel(this);
    }
    Hotel(int regNo, String hotelName, String address, Room room[])
    {
        this.regNo=regNo;
        this.hotelName = hotelName;
        this.address = address;
        this.room=room;
        
        this.displayHotel(this);
    }
    void displayHotel(Hotel obj)
    {
        System.out.println("Hotel Details: ");
        System.out.println("Reg No: " + obj.regNo);
        System.out.println("Hotel Name: " + obj.hotelName);
        System.out.println("Hotel Address: " + obj.address);
        obj.displayRooms();
        System.out.println();
    }
    void displayRooms()
    {
        System.out.println("Room Details: ");
        
        room[0].display();
        room[1].display();
        room[2].display();
        room[3].display();
    }

}

class Room
{
    int roomNo;
    String roomType;
    Room()
    {
        this(1);
    }
    Room(int roomNo)
    {
        this(roomNo, "Standard");
    }
    Room(int roomNo, String roomType)
    {
        this.roomNo=roomNo;
        this.roomType=roomType;
    }
    void display()
    {
        System.out.println("Room No: " + roomNo);
        System.out.println("Room Type: " + roomType);
    }

    public static void main(String[] args) {
        Hotel hotel1 = new Hotel();
        Hotel Taj = new Hotel(2, "Taj Hari", "Model Colony");
        
        Room room[] = new Room[4];
        room[0] = new Room();
        room[1] = new Room(101);
        room[2] = new Room(102, "Luxury");
        room[3] = new Room(103, "Super Luxury");
        Hotel Hari = new Hotel(3, "Hari Taj", "ShivajiNagar", room);
    }
}