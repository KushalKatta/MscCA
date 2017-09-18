class Main
{
    public static void main(String[] args) {
        FileOperations fo = new FileOperations();
        String inputStr = fo.readString("Enter a String to Encrypt");
        System.out.println("Enter String: " + inputStr);
        System.out.println("Encrypted String: " + fo.encryptString(inputStr));
    }
}