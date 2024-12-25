public class Staff extends Person{
    
    private String School;
    private double Salary;

    
    public Staff(String Name, String Address, String School, double Salary) {
        this.Name = Name;
        this.Address = Address;
        this.School = School;
        this.Salary = Salary;
    }

    
    public void setSchool(String school) {
        this.School = school;
    }

    public String getSchool() {
        return School;
    }

    
    public void setSalary(double salary) {
        this.Salary = salary;
    }

    public double getSalary() {
        return Salary;
    }
    @Override
    public String toString(){
        return "Hello I am " + Name + " and I lived in " + Address + ". I am currently woring at " + School + " and my yearly salary is " + Salary + ".";
    }
}
