package machine;

import java.util.*;

public class CoffeeMachine {

    static String command;
    static int[] coffeeMachine = {400, 540, 120, 9, 550};
    static Scanner scanner = new Scanner(System.in);
    enum Status {
        MENU, BUY, FILL, TAKE, REMAINING, EXIT, COFFEE_ONE, COFFEE_TWO, COFFEE_THREE, BACK
    }
    static Status menu = Status.MENU;
    static boolean end = true;
    static int fill = 0;


    public static void main(String[] args) {

        while (end) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            Action();
            switch (menu) {
                case BUY:
                    Buy();
                    break;
                case FILL:
                    Fill();
                    break;
                case TAKE:
                    Take();
                    break;
                case REMAINING:
                    Remaining();
                    break;
                case EXIT:
                    end = false;
                    break;
            }
        }
    }

    public static void Action() {
        if (menu == Status.FILL) {
            fill = scanner.nextInt();
        } else {
            command = scanner.nextLine();
            switch (command) {
                case "buy":
                    menu = Status.BUY;
                    break;
                case "take":
                    menu = Status.TAKE;
                    break;
                case "fill":
                    menu = Status.FILL;
                    break;
                case "remaining":
                    menu = Status.REMAINING;
                    break;
                case "exit":
                    menu = Status.EXIT;
                    break;
                case "1":
                    menu = Status.COFFEE_ONE;
                    break;
                case "2":
                    menu = Status.COFFEE_TWO;
                    break;
                case "3":
                    menu = Status.COFFEE_THREE;
                    break;
                case "back":
                    menu = Status.BACK;
                    break;
            }
        }
    }

    public static void Buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        Action();
        switch (menu) {
            case COFFEE_ONE:
                if (coffeeMachine[0] < 250) {
                    System.out.println("Sorry, not enough water!");
                    menu = Status.MENU;
                } else if (coffeeMachine[2] < 16) {
                    System.out.println("Sorry, not enough coffee beans!");
                    menu = Status.MENU;
                } else if (coffeeMachine[3] < 1) {
                    System.out.println("Sorry, not enough disposable cups!");
                    menu = Status.MENU;
                } else {
                    System.out.println("I have enough resources, making you a coffee!");
                    coffeeMachine[0] -= 250;
                    coffeeMachine[2] -= 16;
                    coffeeMachine[3] -= 1;
                    coffeeMachine[4] += 4;
                    menu = Status.MENU;
                }
                break;
            case COFFEE_TWO:
                if (coffeeMachine[0] < 350) {
                    System.out.println("Sorry, not enough water!");
                    menu = Status.MENU;
                } else if (coffeeMachine[1] < 75) {
                    System.out.println("Sorry, not enough milk!");
                    menu = Status.MENU;
                } else if (coffeeMachine[2] < 20) {
                    System.out.println("Sorry, not enough coffee beans!");
                    menu = Status.MENU;
                } else if (coffeeMachine[3] < 1) {
                    System.out.println("Sorry, not enough disposable cups!");
                    menu = Status.MENU;
                } else {
                    System.out.println("I have enough resources, making you a coffee!");
                    coffeeMachine[0] -= 350;
                    coffeeMachine[1] -= 75;
                    coffeeMachine[2] -= 20;
                    coffeeMachine[3] -= 1;
                    coffeeMachine[4] += 7;
                    menu = Status.MENU;
                }
                break;
            case COFFEE_THREE:
                if (coffeeMachine[0] < 200) {
                    System.out.println("Sorry, not enough water!");
                    menu = Status.MENU;
                } else if (coffeeMachine[1] < 100) {
                    System.out.println("Sorry, not enough milk!");
                    menu = Status.MENU;
                } else if (coffeeMachine[2] < 12) {
                    System.out.println("Sorry, not enough coffee beans!");
                    menu = Status.MENU;
                } else if (coffeeMachine[3] < 1) {
                    System.out.println("Sorry, not enough disposable cups!");
                    menu = Status.MENU;
                } else {
                    System.out.println("I have enough resources, making you a coffee!");
                    coffeeMachine[0] -= 200;
                    coffeeMachine[1] -= 100;
                    coffeeMachine[2] -= 12;
                    coffeeMachine[3] -= 1;
                    coffeeMachine[4] += 6;
                    menu = Status.MENU;
                }
                break;
            case BACK:
                menu = Status.MENU;
                break;
        }
    }

    public static void Fill() {
        System.out.println("Write how many ml of water you want to add:");
        Action();
        coffeeMachine[0] += fill;
        System.out.println("Write how many ml of milk you want to add:");
        Action();
        coffeeMachine[1] += fill;
        System.out.println("Write how many grams of coffee beans you want to add:");
        Action();
        coffeeMachine[2] += fill;
        System.out.println("Write how many disposable cups of coffee you want to add:");
        Action();
        coffeeMachine[3] += fill;
        menu = Status.MENU;
    }

    public static void Take() {
        System.out.printf("I gave you $%d\n", coffeeMachine[4]);
        coffeeMachine[4] = 0;
        menu = Status.MENU;
    }

    public static void Remaining() {
        System.out.printf("The coffee machine has: \n" + "%d ml of water \n" +
                        "%d ml of milk\n" +
                        "%d g of coffee beans\n" +
                        "%d disposable cups\n" +
                        "$%d of money\n",
                coffeeMachine[0], coffeeMachine[1], coffeeMachine[2], coffeeMachine[3], coffeeMachine[4]);
        menu = Status.MENU;
    }
}
