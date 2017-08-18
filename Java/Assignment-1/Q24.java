//Ballot Count
/*
An election is contested by five candidates. The candidates are numbered 1 to 5 and the voting is
done by marking the candidate number on the ballot paper. 

So reading the ballots from users and counting the votes cast for each candidates.
In case a number is outside the range 1 to 5 the ballot is considered as a ‘spoilt ballot’ and also counting the no.of spoilt ballots.
*/

/*
Author: Kushal Katta
Date Created: 31 Jul 2017
Date Last Modified: 31 Jul 2017
*/

import java.util.Scanner;
class Ballot
{
    int candidate1=0, candidate2=0, candidate3=0, candidate4=0, candidate5=0, candidateSpoilt=0;

    //Counting Vote
    void count(int ballotNo)
    {
        switch (ballotNo)
		{
			case 1:
                candidate1++;
                break;
			case 2:
				candidate2++;
				break;
			case 3:
				candidate3++;
				break;
			case 4:
				candidate4++;
                break;
            case 5:
				candidate5++;
				break;
			default:
				candidateSpoilt++;
				break;
        }
    }

    //Printing Total Votes For Each Candidate
    void print()
    {
        System.out.println("No of Votes to 1st Candidate: " + candidate1);
        System.out.println("No of Votes to 2nd Candidate: " + candidate2);
        System.out.println("No of Votes to 3rd Candidate: " + candidate3);
        System.out.println("No of Votes to 4th Candidate: " + candidate4);
        System.out.println("No of Votes to 5th Candidate: " + candidate5);
        System.out.println("No of Spoilt Ballot: " + candidateSpoilt);
    }
}
class Q24
{
    public static void main(String []a)
    {
        Scanner scan = new Scanner(System.in);
        int ballotNo = 0;
        
        Ballot ballot = new Ballot();
        scan.close();
        
        for(int i=0;i<5;i++)
        {
            System.out.print("Select a Candidate from 1 to 5: ");
            ballotNo = scan.nextInt();
            ballot.count(ballotNo);
        }
        
        ballot.print();
    }
}