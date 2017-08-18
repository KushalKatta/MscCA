class Boxing
{
    public static void main(String []a)
    {
        //Primitive Data Type
        float var1 = 10.5f;
        System.out.println("Primitive float: " + var1);
        //Boxing
        Float floatObj = new Float(var1);
        System.out.println("Boxed : " + floatObj);
        //Printed Concat of Object and String
        
        //value stored in memory named floatobj
        
        //Unboxing using method of Float Class
        float var2=floatObj.floatValue();
        System.out.println("Unboxed: " + var2);

        //byte
        byte no = 1;
        Byte noObj = new Byte(no);
        System.out.println("Boxed : " + noObj);

        //short
        short no1 = 3;
        Short no1Obj = new Short(no1);
        System.out.println("Boxed : " + no1Obj);

        //long
        long no2 = 15;
        Long no2Obj = new Long(no2);
        System.out.println("Boxed : " + no2Obj);
        
        //char
        char no3 = '1';
        Character no3Obj = new Character(no3);
        System.out.println("Boxed : " + no3Obj);
    }
}