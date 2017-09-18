class Main
{
    public static void main(String[] args) {

        FileOperations fo = new FileOperations();
        
        String file1 = fo.readString("Enter first File Name");
        String file2 = fo.readString("Enter second File Name");
        
        fo.OneFileToAnotherFile(file1, file2);
    }
}