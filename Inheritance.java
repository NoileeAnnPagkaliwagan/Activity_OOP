public class Inheritance {
    public static void main(String[] args){
        
        Student student1 = new Student("Noilee Pagkaliwagan", "Brgy. Navotas", "BSIT", 2);
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Student Address: " + student1.getAddress());
        System.out.println("Student Program: " + student1.getProgram());
        System.out.println("Student Year: " + student1.getYear());
        System.out.println();
     
        Staff staff1 = new Staff("Richelle Roxas", "Santol", "BSU-Balayan", 100000.00);
        System.out.println("Staff Name: " + staff1.getName());
        System.out.println("Staff Address: " + staff1.getAddress());
        System.out.println("Staff Program: " + staff1.getSchool());
        System.out.println("Staff Year: " + staff1.getSalary());
    }
}
