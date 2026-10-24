package problem5;

public class Main {

        public static void main(String[] args) {

            Book hobbit = new Book("The Hobbit", "J.R.R. Tolkien", 1937);
            Book nineteenEightyFour =
                    new Book("1984", "George Orwell", 1949);
            Book cleanCode =
                    new Book("Clean Code", "Robert C. Martin", 2008);

            //STACK
            System.out.println("=== Stack Test ===");

            BookStack stack=new BookStack();
            stack.push(hobbit);
            stack.push(nineteenEightyFour);
            stack.push(cleanCode);
            stack.display();
            System.out.println("Popped: "+stack.pop());
            System.out.println("Top: "+stack.peek());
            stack.display();

            //QUEUE
            System.out.println("=== Queue Test ===");
            BookQueue queue = new BookQueue();
            queue.enqueue(hobbit);
            queue.enqueue(nineteenEightyFour);
            queue.enqueue(cleanCode);
            queue.display();
        }
    }

