import java.io.*;

class Main
{
    public static void main(String[] args) {

        FileOperations fo = new FileOperations();
        
        String file1 = fo.readString("Enter first File Name");
        String file2 = fo.readString("Enter second File Name");
        String fileTemp = "fileTemp";
        
        fo.OneFileToAnotherFile(file1, fileTemp);
        fo.OneFileToAnotherFile(file2, file1);
        fo.OneFileToAnotherFile(fileTemp, file2);

        File myFile = new File(fileTemp);
        myFile.delete();
    }
}