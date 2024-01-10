package JavaPhonebook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class userInfo {
    int phoneNumber;
    int age;
    String name;
    String address;

    public userInfo(int phoneNumber, int age, String name, String address){
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        HashMap<String, userInfo> phoneHash = new HashMap<>();

        while (true) {
            System.out.println("Welcome to Phonebook");
            System.out.println("1- Add contact");
            System.out.println("2- Search contact");
            System.out.println("3- List all contacts");
            int optionSelected = userInput.nextInt();
            userInput.nextLine();
            if(optionSelected == 1)
            {
                System.out.println("Insert your address: ");
                String userAddress = userInput.nextLine();
                System.out.println("Insert your name: ");
                String userName = userInput.nextLine();
                System.out.println("Insert your contact: ");
                int userPhoneNumber = userInput.nextInt();
                System.out.println("Insert your age: ");
                int userAge = userInput.nextInt();
                phoneHash.put(userName, new userInfo(userPhoneNumber, userAge, userName, userAddress));
            }
            else if(optionSelected == 2)
            {
                System.out.println("Insert the contact name: " );
                String name = userInput.nextLine();
                userInfo temp = phoneHash.get(name);
                System.out.println("Name : " + temp.name);
                System.out.println("Address : " + temp.address);
                System.out.println("Phone Number : " + temp.phoneNumber);
                System.out.println("Age : " + temp.age);

            }
            else if(optionSelected == 3)
            {
               for(Map.Entry<String, userInfo> entry : phoneHash.entrySet()) {
                   System.out.println("Name: " + entry.getValue().name);
                   System.out.println("address: " + entry.getValue().address);
                   System.out.println("phoneNumber: " + entry.getValue().phoneNumber);
                   System.out.println("age: " + entry.getValue().age);
               }
            }
            else
                break;
        }
    }
}