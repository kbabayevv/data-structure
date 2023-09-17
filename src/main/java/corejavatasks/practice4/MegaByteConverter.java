package corejavatasks.practice4;

public class MegaByteConverter {
    public static void main(String[] args) {

        printMegaByteAndKiloByte(5000);

    }

    public static void printMegaByteAndKiloByte(int kilobyte) {
        int megaBytes = kilobyte / 1024;
        int kilobytes = kilobyte % 1024;
        if (kilobyte < 0) {
            System.out.println("Invalid");
            return;
        }
        System.out.println(megaBytes + " MB " + kilobytes + " KB");

    }
}
