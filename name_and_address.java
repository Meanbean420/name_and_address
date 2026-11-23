// Mariah Castorena
// Colorado State University Global Campus
// CSC320 Programming 1 
// Dr. Brandes 
// November 22, 2026

import java.util.Scanner;

public class name_and_address {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first name: ");
        String firstname = input.nextLine();
        
        System.out.print("Enter the last name: ");
        String lastname = input.nextLine();

        System.out.print("Enter the street address: ");
        String streetaddress = input.nextLine();

        System.out.print("Enter the city: ");
        String city = input.nextLine(); 

        System.out.print("Enter the zip code: ");
        String zipcode = input.nextLine(); 

        System.out.println(firstname + " " + lastname);
        System.out.println(streetaddress);
        System.out.println(city + ", " + zipcode);



    }
}