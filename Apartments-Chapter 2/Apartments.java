import java.util.ArrayList;
import java.util.Scanner;

public class Apartments {
    public static void main(String[] args) {
        ArrayList<ApartmentClass> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        ApartmentClass a1 = new ApartmentClass(1234, 1, 1, 900.00),
                a2 = new ApartmentClass(4321, 2, 1, 1200.00),
                a3 = new ApartmentClass(1498, 4, 2, 1600.00),
                a4 = new ApartmentClass(1515, 5, 4, 2000.00),
                a5 = new ApartmentClass(2211, 3, 3, 1800.00);
        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);
        list.add(a5);


        System.out.println("Enter your minimum number of bedrooms required:");
        int minBed = input.nextInt();
        System.out.println("Enter minimum number of bathrooms:");
        int minBath = input.nextInt();
        System.out.println("Enter maximum rent per month:");
        double maxRent = input.nextDouble();
        System.out.println("Searching apartments for minimum bed:" + minBed + " minimum bath:" + minBath + " and maximum rent:" + maxRent);

        boolean ifPrint = false;
        for (int i = 0; i < list.size(); i++) {
            boolean flag = true;

            if (minBed > list.get(i).getNumRooms()) {
                flag = false;
            }
            if (minBath > list.get(i).getNumBaths() && flag) {
                flag = false;
            }
            if (maxRent < list.get(i).getRentCost() && flag) {
                flag = false;
            }
            if (flag) {
                System.out.println(list.get(i));
                ifPrint = true;
            }
        }

        if (!ifPrint) {
            System.out.println("No apartments founds with this search, please come back next week.");
        }
    }
}
