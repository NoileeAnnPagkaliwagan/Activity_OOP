public class Main {

    public static void main(String[] args)
    {
        Student student = new Student("Noilee Ann Pagkaliwagan", "Navotas,Balayan, Batangas", "BSIT", 2);
        
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Address: " + student.getAddress());
        System.out.println("Student Program: " + student.getProgram());
        System.out.println("Student Year: " + student.getYear());
        System.out.println(student.toString());
    }

}