package com.BridgeLabs.day24;
import java.util.*;

public class AddressBook6 {
	public static void main(String[] args) {
		System.out.println("Welcome to the Addres Book System");
		Collection<AddressBookUc1> c = new ArrayList<AddressBookUc1>();
		Collection<AddressBookUc1> c1 = new ArrayList<AddressBookUc1>();
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
				System.out.print("Enter First Name : ");
				String firstName = scan.nextLine();
				System.out.print("Enter Last Name : ");
				String lastName = scan.nextLine();
				System.out.print("Enter the Address : ");
				String address = scan.nextLine();
				System.out.print("Enter the State : ");
				String state = scan.nextLine();
				System.out.print("Enter the Zip Code : ");
				int zip = scan.nextInt();
				System.out.print("Enter the Phone Number : ");
				long phoneNumber = scan.nextLong();
				System.out.println("Enter the Email Address : ");
				String eMail = scan.nextLine();
				System.out.print("1.Book_1 \n2.Book_2 \nChoose the Address Book : ");
				int opt = scan.nextInt();
				if(opt == 1) {
					c.add(new AddressBookUc1(firstName, lastName, address, state, zip, phoneNumber, eMail));
				}
				if(opt == 2) {
					c1.add(new AddressBookUc1(firstName, lastName, address, state, zip, phoneNumber, eMail));
				}
				break;
			case 2:
				System.out.print("1.Book_1 \n2.Book_2 \nChoose the Address Book : ");
				opt = scan.nextInt();
				if(opt == 1) {
					Iterator<AddressBookUc1> i = c.iterator();
					while(i.hasNext()) {
						AddressBookUc1 e = i.next();
						System.out.println(e);
					}
				}
				if(opt == 2) {
					Iterator<AddressBookUc1> i = c1.iterator();
					while(i.hasNext()) {
						AddressBookUc1 e = i.next();
						System.out.println(e);
					}
				}
				break;
			case 3:
				boolean found = false;
				System.out.print("1.Book_1 \n2.Book_2 \nChoose the Address Book : ");
				opt = scan.nextInt();
				if(opt == 1) {
					System.out.print("Enter the Phone Number to Edit the contact: ");
					phoneNumber =  scan.nextLong();
					ListIterator<AddressBookUc1> li =  ((ArrayList<AddressBookUc1>) c).listIterator();
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
							System.out.print("1.Book_1 \n 2.Book_2 \n Choose the Address Book : ");
							li.set(new AddressBookUc1(firstName, lastName , address, state, zip, phoneNumber, eMail));
							found = true;
						}
					}
				}
				if(opt == 2) {
					System.out.print("Enter the Phone Number to Edit the contact: ");
					phoneNumber =  scan.nextLong();
					ListIterator<AddressBookUc1> li =  ((ArrayList<AddressBookUc1>) c1).listIterator();
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
							System.out.print("1.Book_1 \n 2.Book_2 \n Choose the Address Book : ");
							li.set(new AddressBookUc1(firstName, lastName , address, state, zip, phoneNumber, eMail));
							found = true;
						}
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
				System.out.print("1.Book_1 \n2.Book_2 \nChoose the Address Book : ");
				opt = scan.nextInt();
				if(opt == 1) {
					System.out.print("Enter the Phone Number to Delete : ");
					phoneNumber = scan.nextLong();
					Iterator<AddressBookUc1> i = c.iterator();
					while(i.hasNext()) {
						AddressBookUc1 e = i.next();
						if(e.getPhoneNumber() == phoneNumber) {
							i.remove();
							found = true;
						}
					}
				}
				if(opt == 2) {
					System.out.print("Enter the Phone Number to Delete : ");
					phoneNumber = scan.nextLong();
					Iterator<AddressBookUc1> i = c1.iterator();
					while(i.hasNext()) {
						AddressBookUc1 e = i.next();
						if(e.getPhoneNumber() == phoneNumber) {
							i.remove();
							found = true;
						}
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
