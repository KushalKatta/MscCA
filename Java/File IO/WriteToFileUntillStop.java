import java.io.*;

class FileOperations
{
    static BufferedWriter bw = null;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String fileName = "";

    void readFileName()
    {
        try
        {
            System.out.println("Enter a File Name to Write To: ");
            fileName = br.readLine();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    void writeToFile()
    {
        try {
            
            bw = new BufferedWriter(new FileWriter(fileName));
            
            System.out.println("Start writing Words to input to file, to stop enter \'stop\': ");
            String line = "";
            while(!(line=br.readLine()).equalsIgnoreCase("stop"))
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
                br.close();
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
    }
}
    
    class Main
    {
        public static void main(String[] args) {

            FileOperations fo = new FileOperations();
            fo.readFileName();  //Reading File Name
            fo.writeToFile();   //Writing to File untill stop
    }
}