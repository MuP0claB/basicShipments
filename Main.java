package christmass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Shipment> shipmentsAll = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        printMenu();
        int number;

        while ((number = Integer.parseInt(scanner.nextLine())) != 0) {

            printMenu();
            switch (number) {
                case 1:
                    create(shipmentsAll);
                    break;
                case 2:
                    printCurrent(shipmentsAll);
                    break;
                case 3:
                    trackingByNumber(shipmentsAll);
                    break;
                case 4:
                    relocate(shipmentsAll);
                    break;
                case 5:
                    cancelled(shipmentsAll);
                    break;
                case 6:
                    delivery(shipmentsAll);
                    break;
                default:
                    return;
            }
        }

        Shipment shipment = new Shipment();
    }

    public static void printMenu() {
        System.out.println("За да създадете товарителница натиснете 1");
        System.out.println("За да принтирате товарителница натиснете 2");
        System.out.println("За да проследите товарителница натиснете 3");
        System.out.println("За да препратите пратката натиснете 4");
        System.out.println("За да откажете товарителница натиснете 5");
        System.out.println("За да отложите доставка натиснете 6");
        System.out.println("За изход натиснете 0");
    }

    public static void create(List<Shipment> shipmentsAll) {
        Shipment shipment1 = new Shipment();

        shipment1.setNumber(1);
        shipment1.setRecipient("Miroslav");
        shipment1.setRecipientNumber("+359896255300");
        shipment1.setSenderName("TechnoMarket");
        shipment1.setWeight(7086);
        shipment1.setLocation("Gorublyane 7");
        shipment1.setDeliveryDate("03 Feb");
        shipmentsAll.add(shipment1);

        Shipment shipment2 = new Shipment();

        shipment2.setNumber(2);
        shipment2.setRecipient("Katya");
        shipment2.setRecipientNumber("+35989904784");
        shipment2.setSenderName("Douglas");
        shipment2.setWeight(3033);
        shipment2.setLocation("Pop Chariton str 101");
        shipment2.setDeliveryDate("18 Feb");
        shipmentsAll.add(shipment2);

        Shipment shipment3 = new Shipment();

        shipment3.setNumber(3);
        shipment3.setRecipient("Ginka");
        shipment3.setRecipientNumber("052999747");
        shipment3.setSenderName("Bulgarian Rose");
        shipment3.setWeight(12440);
        shipment3.setLocation("Chayka, flat 39");
        shipment3.setDeliveryDate("24 Aug");
        shipmentsAll.add(shipment3);

        Shipment shipment4 = new Shipment();

        shipment4.setNumber(4);
        shipment4.setRecipient("Georgi");
        shipment4.setRecipientNumber("+359877145789");
        shipment4.setSenderName("eMag");
        shipment4.setWeight(68909);
        shipment4.setLocation("Bogoridi str");
        shipment4.setDeliveryDate("09 Dec");
        shipmentsAll.add(shipment4);
    }

    public static void printCurrent(List<Shipment> shipmentsAll) {

        if (shipmentsAll.size() > 0) {
            for (int i = 0; i < shipmentsAll.size(); i++) {
                System.out.println("Shipment with number " + (i + 1));
                System.out.println(shipmentsAll.get(i).getNumber());
                System.out.println(shipmentsAll.get(i).getRecipient());
                System.out.println(shipmentsAll.get(i).getRecipientNumber());
                System.out.println(shipmentsAll.get(i).getSenderName());
                System.out.println(shipmentsAll.get(i).getWeight());
                System.out.println(shipmentsAll.get(i).getLocation());
                System.out.println(shipmentsAll.get(i).getDeliveryDate());
                System.out.println(" ");
            }
        } else {
            System.out.println("Sorry, no shipments for printing.");
        }
    }

    public static void relocate(List<Shipment> shipmentsAll) {
        Scanner scanner = new Scanner(System.in);
        String inputName = scanner.nextLine();

        int shipmentIndex = -1;
        for (int i = 0; i < shipmentsAll.size(); i++) {
            Shipment shipment = shipmentsAll.get(i);
            if (inputName.equals(shipment.getRecipient())) {
                shipmentIndex = i;
            }
        }

        if (shipmentIndex != -1) {
            Shipment shipment = shipmentsAll.get(shipmentIndex);
            shipment.setLocation("Dondukov blvd");
            System.out.println(shipment.getLocation());

        } else {
            System.out.println("Sorry, no shipments for " + inputName);
        }
    }

    public static void trackingByNumber(List<Shipment> shipmentsAll) {
        Scanner scanner = new Scanner(System.in);
        String inputPhone = scanner.nextLine();

        int shipmentIndex = -1;
        for (int i = 0; i < shipmentsAll.size(); i++) {
            Shipment shipment = shipmentsAll.get(i);
            if (inputPhone.equals(shipment.getRecipientNumber())) {
                shipmentIndex = i;
            }
        }

        if (shipmentIndex != -1) {
            Shipment shipment = shipmentsAll.get(shipmentIndex);
            System.out.println(shipment.getLocation());

        } else {
            System.out.println("Sorry, no shipments for " + inputPhone);
        }
    }

    public static void delivery(List<Shipment> shipmentsAll) {
        Scanner scanner = new Scanner(System.in);
        String inputDate = scanner.nextLine();

        int shipmentIndex = -1;
        for (int i = 0; i < shipmentsAll.size(); i++) {
            Shipment shipment = shipmentsAll.get(i);
            if (inputDate.equals(shipment.getDeliveryDate())) {
                shipmentIndex = i;
            }
        }

        if (shipmentIndex != -1) {
            Shipment shipment = shipmentsAll.get(shipmentIndex);
            shipment.setDeliveryDate("22 Dec");
            System.out.println(shipment.getDeliveryDate());

        } else {
            System.out.println("Sorry, no shipments for " + inputDate);
        }
    }

    public static void cancelled(List<Shipment> shipmentsAll) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int shipmentIndex = -1;
        for (int i = 0; i < shipmentsAll.size(); i++) {
            Shipment shipment = shipmentsAll.get(i);
            if (input.equals(shipment.getSenderName())) {
                shipmentIndex = i;
            }
        }

        if (shipmentIndex != -1) {
            Shipment shipment = shipmentsAll.get(shipmentIndex);
            shipmentsAll.remove(shipment);

        } else {
            System.out.println("Sorry, no shipments for " + input);
        }
    }
}