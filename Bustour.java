import java.util.Scanner;

class Bustour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        
        int busH = scanner.nextInt();
        int bridgeNum = scanner.nextInt();
        int count = 1;
        int bridge = 0;


        while (count <= bridgeNum){
            int bridgeH = scanner.nextInt();

//            System.out.println(count);
//
//            System.out.println(count);

            if (busH >= bridgeH) {
                bridge = count;
                break;
            }
            count++;
        }

        if (bridge == 0 ) {
            System.out.println("Will not crash");
        } else {
            System.out.println("Will crash on bridge " + bridge);
        }
        scanner.close();

    }
}
