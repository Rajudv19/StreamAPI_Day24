package com.BridgeLabs.day24;
import java.util.*;

public class AddressBook4 {
	public static void main(String[] args) {
		System.out.println("Welcome to the Addres Book System");
		Collection<AddressBookUc1> c = new ArrayList<AddressBookUc1>();
		Scanner scan = new Scanner(System.in);

		int choise;
		do {
			System.out.println("1.CREATE CONTACT");
			System.out.println("2.DISPLAY THE CONTACT");
			System.out.println("3.EDIT THE CONTACT");
			System.out.println("4.DELETE THE CONTACT");
			System.out.println("0.EXIT");
			System.out.println("Enter Your choise : ");
			choise = scan.nextInt();

			switch(choise) {
			case 1:
				System.out.println("Enter First Name : ");
				String firstName = scan.nextLine();
				System.out.println("Enter Last Name : ");
				String lastName = scan.nextLine();
				System.out.println("Enter the Address : ");
				String address = scan.nextLine();
				System.out.println("Enter the State : ");
				String state = scan.nextLine();
				System.out.println("Enter the Zip Code : ");
				int zip = scan.nextInt();
				System.out.println("Enter the Phone Number : ");
				long phoneNumber = scan.nextLong();
				System.out.println("Enter the Email Address : ");
				String eMail = scan.nextLine();


				c.add(new AddressBookUc1(firstName, lastName, address, state, zip, phoneNumber, eMail));
				break;
			case 2:
				Iterator<AddressBookUc1> i = c.iterator();
				while(i.hasNext()) {
					AddressBookUc1 e = i.next();
					System.out.println(e);
				}
				break;
			case 3:
				boolean found = false;
				System.out.print("Enter the Phone Number to Edit the contact: ");
				phoneNumber =  scan.nextLong();
				ListIterator<AddressBookUc1> li = ((ArrayList<AddressBookUc1>) c).listIterator();
				while(li.hasNext()) {
					AddressBookUc1 e = li.next();
					if(e.getPhoneNumber() == phoneNumber) {
						System.out.print("Enter new First Name : ");
						firstName = scan.nextLine();
						System.out.print("Enter new Last Name : ");
						lastName = scan.nextLine();
						System.out.print("Enter the new Address : ");
						address = scan.nextLine();
						System.out.print("Enter the new State : ");
						state = scan.nextLine();
						System.out.print("Enter the Zip new Code : ");
						zip = scan.nextInt();
						System.out.print("Enter the new Phone Number : ");
						phoneNumber = scan.nextLong();
						System.out.print("Enter the new Email Address : ");
						eMail = scan.nextLine();
						li.set(new AddressBookUc1(firstName, lastName , address, state, zip, phoneNumber, eMail));
						found = true;
					}
				}
				if(!found) {
					System.out.println("Record not found");	
				}else {
					System.out.println("Record is Updated successfuly");	
				}
				break;
			case 4:
				found = false;
				System.out.print("Enter the Phone Number to Delete : ");
				phoneNumber = scan.nextLong();
				i = c.iterator();
				while(i.hasNext()) {
					AddressBookUc1 e = i.next();
					if(e.getPhoneNumber() == phoneNumber) {
						i.remove();
						found = true;
					}
				}
				if(!found) {
					System.out.println("Record not found");	
				}else {
					System.out.println("Record is deleted successfuly");	
				}
				break;
			}
		}while(choise != 0);
	}
}
