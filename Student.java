class Student{
    
    private int Student_id;
    private String Name;

    public void setId(int s_id){
        this.Student_id = s_id;
    }

    public void setName(String s_name){
        this.Name = s_name;
    }

    public String getName(){
        return this.Name;
    }

    public int getId(){
        return this.Student_id;
    }

}