package BtWork;

public class TuiBot {
    public static void main(String[] args) {
        if(canPack(0,5,4)){
            System.out.println("can pack 1");
        }
        if(canPack(1,0,5)){
            System.out.println("can pack 2");
        }
        if(canPack(-2,4,5)){
            System.out.println("can pack");
        }
    }
    public static boolean canPack(int bigCount,int smallCount, int goal){
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int maxBigbag = goal/5;
        int useBigbag = Math.min(maxBigbag,bigCount);
        int soKgconlai = goal - (useBigbag*5);
        return soKgconlai <= smallCount;
    }
}
