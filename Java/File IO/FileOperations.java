/*
Question 1:
Write a Java Program to read a String from User and encrypt it.
Encryption Key - Characters will be replaced by next Character. (a->b, b->c, z->a)

Question 2:
Read the file in Reverse Order

Question 3:
Read a file Name from user and count how many times word "is" has occured.

Question 4:
Read a file name, words from User and keep on writing words into file till 'stop' word is entered. 

Question 5:
Accept 2 file names and swap the content of those files.
*/

import java.io.*;

class FileOperations
{
    static BufferedWriter bw = null;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String fileName = "";

    //Take the File Name as Input from User and Store in Instance Variable
    void readFileName()
    {
        try
        {
            System.out.print("Enter a File Name: ");
            fileName = br.readLine();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    //Read String from User
    String readString(String msgPrint)
    {
        String readedStr = "";
        try
        {
            System.out.print(msgPrint + ": ");
            readedStr = br.readLine();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return readedStr;
    }

    //Input String as Parameter and Return Encrypted String
    String encryptString(String inputString)                //Q1
    {
        String encryptedStr = "";
        try {
            char[] strChar = inputString.toCharArray();
            for(int i=0; i<strChar.length; i++)
            {
                int intChar = strChar[i];
                if((intChar>=97 & intChar<122) || (intChar>=65 && intChar<90))
                {
                    // System.out.println(strChar[i]);
                    // System.out.println(++intChar);
                    // System.out.print(strChar[i]);
                    strChar[i] = (char) (intChar+1);
                    encryptedStr+=strChar[i];
                }
                else if((intChar==122) || (intChar == 90))
                {
                    strChar[i] = (char) (intChar-26+1);
                    encryptedStr+=strChar[i];
                }
                else
                {
                    encryptedStr+=strChar[i];
                }
            }
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e.getMessage());
        }
        return encryptedStr;
    }

    //Input 2 File Name and Copy Content of file1 To file2
    void OneFileToAnotherFile(String file1, String file2)   //Q5
    {
        String line;
        try {
            BufferedReader br1 = new BufferedReader(new FileReader(file1));
            bw = new BufferedWriter(new FileWriter(file2));

            while((line = br1.readLine())!=null)
            {
                bw.write(line);
                bw.newLine();
            }
            
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e.getMessage());
        }

        finally
        {
            try
            {
                bw.close();
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
    }

    //Write to file untill "stop" word is entered by User
    void writeToFile(String stopChar)                       //Q4
    {
        try {
            
            bw = new BufferedWriter(new FileWriter(fileName));
            
            System.out.println("Start writing Words to input to file, to stop enter \'stop\': ");
            String line = "";
            while(!(line=br.readLine()).equalsIgnoreCase(stopChar))
            {
                bw.write(line);
                bw.newLine();
            }
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e.getMessage());
        }
        finally
        {
            try {
                bw.close();
                // br.close();
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
    }

    //Count How Many Times a word "is" occured in a file
    void countWordIs()                                      //Q3
    {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(fileName);
            br = new BufferedReader(new InputStreamReader(new DataInputStream(fis)));
            int intData;
            int count=0;
            boolean halfDone = false;

            while((intData = fis.read())!=-1)
            {
                if((char)intData == "i".charAt(0) || (char)intData == "I".charAt(0))
                {
                    halfDone=true;
                }
                else if(halfDone & ((char)intData == "s".charAt(0) || (char)intData == "S".charAt(0)))
                {
                    count += 1;
                }
                else
                {
                    halfDone=false;
                }
            }
            System.out.println("\'Is\' Character is Repeated " + count + " times");
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e.getMessage());
        }
    }

    //Reads and Returns file in a Reverse Manner
    String readFileReverse()                                //Q2
    {
        char[] charData = null;

        FileInputStream fis = null;
        try {
            fis = new FileInputStream(fileName);
            
            File file1 = new File(fileName);
            long fileLength = file1.length();
            
            charData = new char[(int)fileLength];
            int intData;
            
            for(long i=fileLength-1; i>0; i--)
            {
                charData[(int)i]=(char)fis.read();
            }
            // br = new BufferedReader(fis);
            // while((intData = fis.read())!=-1)
            // {
            //     System.out.print((char)intData);
            // }
            // fos.write(charData);
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e.getMessage());
        }

        return (new String(charData));
    }
    
}