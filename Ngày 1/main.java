public class main  {
    public static void main(String[] args) {
        System.out.println("Hello world");
        short myMinShortValue = Short.MIN_VALUE;
        Integer myMinIntValue = Integer.MIN_VALUE;
        Long myMinLongValue = Long.MIN_VALUE;
        //Casting là chuyển 1 số dạng này sang dạng khác
        //Do giá trị mặc định trả về của phép tính là kiểu Integer
        short myNewShort = (short) (myMinShortValue/2);
        System.out.println(myNewShort);
        //Double là loại mặc định cho bất kì loại số thực nào
        System.out.println("Float value range:("+ Float.MIN_VALUE+ "to" +Float.MAX_VALUE+")");
        System.out.println("Double valur range:("+ Double.MIN_VALUE+ "to" +Double.MAX_VALUE+")");

        float myOtherFloatValue = (float) 5.25 ;
        myOtherFloatValue = 5f /3f;
        System.out.println(myOtherFloatValue);
        //Char và String
        //Char lưu 1 và only 1 trong ngoặc đơn//String lưu đa kí tự trong ngoặc kép
        //Char hien thị kí tự,Unicode,DecimalChar
        //Boolean chỉ có True False
        String myString = "I wish I had \u00241,000,000.00";
        System.out.println(myString);
    }


}