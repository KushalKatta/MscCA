/*
Author: Kushal Katta
Date: 18 July 2017
*/
class Room
{
    int room_no;
    String room_type, room_area;

    void setData()
    {
        this.room_no=1;
        this.room_type="Twin Sharing";
        this.room_area="Shivajinagar";
    }

    void setData(int room_no)
    {
        this.room_no=room_no;
        this.room_type="Twin Sharing";
        this.room_area="Shivajinagar";
    }

/*
    int setData(int room_no)
    {
        this.room_no=room_no;
        this.room_type="Twin Sharing";
        this.room_area="Shivajinagar";
    }
*/

    void setData(int room_no, String room_type, String room_area)
    {
        this.room_no=room_no;
        this.room_type=room_type;
        this.room_area=room_area;
    }

    void displayData()
    {
        System.out.println("Room No = " + room_no);
        System.out.println("Room Type = " + room_type);
        System.out.println("Room Area = " + room_area);
    }
}
class Hostel
{
    void roomList()
    {
        Room my_room, your_room, employee_room;
        
        my_room = new Room();
        your_room = new Room();
        employee_room = new Room();

        my_room.setData();
        my_room.displayData();

        your_room.setData(2,"Your Rooms", "Model Colony");
        your_room.displayData();

        employee_room.setData(3);
        //employee_room.setData((byte) 3);      //Widening
        //employee_room.setData((float) 3.35);  //Narrowing
        employee_room.displayData();
    }
}
class Main
{
    public static void main (String []a)
    {
        Hostel vishwabhawan = new Hostel();
        vishwabhawan.roomList();
    }
}