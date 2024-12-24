class Person{
    protected String Name;
    protected String Address;

    public void setName(String name){
        this.Name = name;
    }

    public void setAddress(String address){
        this.Address = address;
    }

    public String getName(){
        return this.Name;
    }

    public String getAddress(){
        return this.Address;
    }
}


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