public class FirstClass {
    //method là 1 hoặc nhiều tập hợp các câu lệnh thực hiện 1 THAO TÁC
    //MAIN METHOD là nơi java tìm kiếm đầu tiên để chạy
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Hello, Thành");
        /* / / ///////// */

        boolean isYasuo = false;
        if (!isYasuo)
        {
            System.out.println("No");
        } else
        {
            System.out.println("Yasuo");
        }
        int topScore = 82;
        int  secondTopscore = 81;
        if( (topScore > secondTopscore) && (topScore < 100) ){
            System.out.println("Cao hơn top score nhỏ hơn 100");
        }
        if((topScore > 90) || (topScore < 100)){
            System.out.println("Cao hơn 90 hoặc nhỏ hơn 100");
        }
        // (&& AND) (|| OR)
        /* Ternary : Toán tử bậc 3 : If then else */
        String isMakeofCar = "Vol";
        boolean isDomestic = isMakeofCar == "Vol" ? true : false;
        if(isDomestic){
            System.out.println(" This car is Domestic to our country");
        }


    }
}
