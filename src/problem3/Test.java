package problem3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //Create a library of n documents ;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the library capacity: ");
        int n = s.nextInt();
        s.nextLine();
        Library lib=new Library(n);
        lib.add(new Novel("Les Miserables", "Victor Hugo", 500, 222,lib));
        lib.add(new Magazine("Science", "10", 2026,lib));

        //the menu repeatedly

        int choice;
        do {
            System.out.println("\n===== LIBRARY MENU =====");
            System.out.println("1-> Display all documents");
            System.out.println("2-> Add a document");
            System.out.println("3-> Delete a document");
            System.out.println("4-> Search for a document by record number");
            System.out.println("5-> Display authors");
            System.out.println("0-> Exit");
            System.out.print("Your choice:");

            choice = s.nextInt();
            s.nextLine();

            switch (choice) {
                case 1:
                    lib.displayDocument();
                    break;

                case 2:
                    System.out.println("Choose document type:");
                    System.out.println("1-> Novel");
                    System.out.println("2-> Textbook");
                    System.out.println("3-> Magazine");
                    System.out.println("4-> Dictionary");
                    System.out.print("Your choice:");

                    int type = s.nextInt();
                    s.nextLine();

                    System.out.print("Enter the title: ");
                    String title = s.nextLine();

                    switch (type) {
                        case 1:
                            System.out.print("Enter author: ");
                            String author = s.nextLine();

                            System.out.print("Enter number of pages: ");
                            int pages = s.nextInt();

                            System.out.print("Enter price: ");
                            double price = s.nextInt();
                            s.nextLine();

                            if (lib.add(new Novel(
                                    title, author, price,pages,lib))) {
                                System.out.println("Novel added.");
                            } else {
                                System.out.println("Could not add novel.");
                            }
                            break;

                        case 2:
                            System.out.print("Enter author:");
                            author = s.nextLine();

                            System.out.print("Enter number of pages: ");
                            pages = s.nextInt();
                            s.nextLine();

                            System.out.print("Enter level: ");
                            String level = s.nextLine();

                            if (lib.add(new Textbook(
                                    title,level, author, pages,lib))) {
                                System.out.println("Textbook added.");
                            } else {
                                System.out.println("Could not add textbook.");
                            }
                            break;

                        case 3:
                            System.out.print("Enter month: ");
                            String month = s.nextLine();

                            System.out.print("Enter year: ");
                            int year = s.nextInt();
                            s.nextLine();

                            if (lib.add(
                                    new Magazine(title, month, year,lib))) {
                                System.out.println("Magazine added.");
                            } else {
                                System.out.println("Could not add magazine.");
                            }
                            break;

                        case 4:
                            System.out.print("Enter language: ");
                            String language = s.nextLine();

                            if (lib.add(
                                    new Dictionary(title, language,lib))) {
                                System.out.println("Dictionary added.");
                            } else {
                                System.out.println("Could not add dictionary.");
                            }
                            break;

                        default:
                            System.out.println("Invalid document type.");
                    }
                    break;

                case 3:
                    System.out.print("Enter record number to delete: ");
                    int num = s.nextInt();
                    s.nextLine();

                    Document doc = lib.document(num);

                    if (doc != null && lib.delete(doc)) {
                        System.out.println("Document deleted.");
                    } else {
                        System.out.println("Document not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter record number: ");
                    num = s.nextInt();
                    s.nextLine();

                    doc = lib.document(num);

                    if (doc != null) {
                        System.out.println(doc);
                    } else {
                        System.out.println("Document not found.");
                    }
                    break;

                case 5:
                    lib.displayAuthor();
                    break;

                case 0:
                    System.out.println("Exiting the program...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        s.close();
    }
}
