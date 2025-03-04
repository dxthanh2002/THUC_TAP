public class MegaBytesConverter {
    // write code here
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }else{
            int megabytes = kiloBytes / 1024;
            int kilobytesdu = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + kilobytesdu + " KB");
        }
    }
}