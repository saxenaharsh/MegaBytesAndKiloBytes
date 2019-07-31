public class MegaBytesAndKiloBytes {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }else{
            int bytes = (kiloBytes / 1024);
            int mod = (kiloBytes % 1024);
            System.out.println(kiloBytes +" KB = " + bytes + " MB and " + mod + " KB");
        }
    }

}
