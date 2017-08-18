//Write a Java Program, which shows train and station details
/*
Author: Kushal Katta
Date Created: 1 Aug 2017
Date Last Modified: 1 Aug 2017
*/
class Train
{
    int trainNo;
    String trainName;
    Station stationList[];

    Train(int trainNo, String trainName, Station stationList[])
    {
        this.trainNo=trainNo;
        this.trainName=trainName;
        this.stationList=stationList;
    }
    Train(int trainNo, String trainName, Station stationList)
    {
        this.trainNo=trainNo;
        this.trainName=trainName;
        this.stationList=new Station[1];
        this.stationList[0]=stationList;
    }

    void display()
    {
        System.out.println("Train No: " + trainNo);
        System.out.println("Train Name: " + trainName);
        for(int i=0; i<stationList.length; i++)
        {
            stationList[i].display();
        }
        System.out.println();
    }
}
class Station
{
    int stationNo;
    String stationName, stationType; 

    Station()
    {
        this.stationNo=1;
        this.stationName="Pune";
        this.stationType="Regional";
    }
    Station(int stationNo, String stationName, String stationType)
    {
        this.stationNo=stationNo;
        this.stationName=stationName;
        this.stationType=stationType;
    }

    void display()
    {
        System.out.println("Station No: " + stationNo);
        System.out.println("Station Name: " + stationName);
        System.out.println("Station Type: " + stationType);
    }
}

class Main
{

    public static void main(String[] args) {
        Station station1 = new Station();
        Station station2 = new Station(2, "Jodhpur", "Main");
        Station station3 = new Station(3, "Lonavala", "Sub");
        Station station4 = new Station(4, "Mumbai", "Main");

        Station stationList1[]=new Station[3];
        stationList1[0]=station1;
        stationList1[1]=station2;
        stationList1[2]=station3;

        Station stationList2[]=new Station[3];
        stationList2[0]=station1;
        stationList2[1]=station3;
        stationList2[2]=station4;

        Train train1 = new Train(1, "SBC Jodhpur Express", stationList1);
        Train train2 = new Train(2, "Deccan Express", stationList2);
        Train train3 = new Train(3, "Pune Express", stationList2[0]);

        train1.display();
        train2.display();
        train3.display();
    }
}