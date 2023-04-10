package task2;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Monitor myPhilips1 = new Monitor("Philips", 120, "AB1234", 1920, 1080);
        Monitor myPhilips2 = new Monitor("Philips", 120, "AB1234", 1920, 1080);
        Monitor mySamsung = new Monitor("Samsung", 120, "AB1234", 1920, 1080);
        Device myiPad = new Device("Apple", 300, "ABC67890");
        EthernetAdapter myCom = new EthernetAdapter("COM",50,"562434",100,"1AB2122132");

        System.out.println(myPhilips1);
        System.out.println(myiPad);
        System.out.println(myCom);

        System.out.printf("myPhilips equals mySamsung %b%n", myPhilips1.equals(mySamsung));

        System.out.println("Hashcode of myiPad is " + myiPad.hashCode());
        System.out.println("Hashcode of myPhilips1 is " + myPhilips1.hashCode());
        System.out.println("Hashcode of myPhilips2 is " + myPhilips2.hashCode());
        System.out.println("Hashcode of mySamsung is " + mySamsung.hashCode());

    }
}
