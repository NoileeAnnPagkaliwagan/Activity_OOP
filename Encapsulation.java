public class Encapsulation {
    
    public static void main(String[] args){

        
        System.out.println();

        Student s1 = new Student();

        s1.setId(16507);
        s1.setName("Noilee");
        System.out.println("Student ID: " + s1.getId());
        System.out.println("Student Name: " + s1.getName());
        System.out.println();

  
        System.out.println();

        Book b1 = new Book();

        b1.setBookNumber(333);
        b1.setAuthor("Erica");
        b1.setTitle("What Was I made for?");
        b1.setPrice(900.00);
        System.out.println("Book Number: " + b1.getBookNumber());
        System.out.println("Book Title: " + b1.getTitle());
        System.out.println("Book Author: " + b1.getAuthor());
        System.out.println("Book Price: " + b1.getPrice());
        System.out.println();
    }
}