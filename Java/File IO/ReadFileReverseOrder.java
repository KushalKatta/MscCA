class Main
{
    public static void main(String[] args) {

        FileOperations fo = new FileOperations();
        fo.readFileName();
        System.out.println(fo.readFileReverse());
    }
}