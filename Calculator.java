import java.util.Scanner;
import java.lang.Math;

class PenCopCalc {
    
    public static double pennyCalc (double c, double z) {
        double cA = .00651356;
        double zA = .00034282 / 2000;
        
        return ((cA * c) + (zA * z));
    }
    
    public static void main(String[] args) {
        
        Scanner copperScan = new Scanner(System.in);
        System.out.println("Current copper price:");
        double copperP = copperScan.nextDouble();
        
        Scanner zincScan = new Scanner(System.in);
        System.out.println("\nCurrent zinc price:");
        double zincP = zincScan.nextDouble();
        
        double pennyVal = pennyCalc(copperP, zincP);
        
        System.out.println("A pre 1982 penny is worth " + pennyVal);
        
    }
}
