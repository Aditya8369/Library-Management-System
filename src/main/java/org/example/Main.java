import operation.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BookOperation book = new BookOperation();
        MemberOperation member = new MemberOperation();
        IssueBookOperation issue = new IssueBookOperation();
        ReturnBookOperation ret = new ReturnBookOperation();
        DisplayOperation display = new DisplayOperation();

        while (true) {

            System.out.println("\n----- Library Management System -----");

            System.out.println("1. Add Book");
            System.out.println("2. Add Member");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Display Books");
            System.out.println("6. Display Members");
            System.out.println("7. Display Issued Books");
            System.out.println("8. Exit");

            System.out.print("Enter Choice : ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    book.addBook();
                    break;

                case 2:
                    member.addMember();
                    break;

                case 3:
                    issue.issueBook();
                    break;

                case 4:
                    ret.returnBook();
                    break;

                case 5:
                    display.displayBooks();
                    break;

                case 6:
                    display.displayMembers();
                    break;

                case 7:
                    display.displayIssuedBooks();
                    break;

                case 8:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}