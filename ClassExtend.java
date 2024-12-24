class Student extends Person{
    private String Program;
    private Integer Year;

    public Student(String name, String address, String program, Integer year){
        this.Name = name;
        this.Address = address;
        this.Program = program;
        this.Year = year;
    }

    public void setProgram(String Program){
        this.Program = Program;
    }

    public void setYear(Integer Year){
        this.Year = Year;
    }

    public Integer getYear(){
        return this.Year;
    }

    public String getProgram(){
        return this.Program;
    }
}


class Staff extends Person{
    private String School;
    private Double Salary;

    public Staff(String name, String address, String school, Double salary){
        this.Name = name;
        this.Address = address;
        this.School = school;
        this.Salary = salary;
    }

    public void setSchool(String school){
        this.School = school;
    }

    public void setSalary(Double salary){
        this.Salary = salary;
    }

    public String getSchool(){
        return this.School;
    }

    public Double getSalary(){
        return this.Salary;
    }
}
