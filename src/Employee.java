public class Employee {

    private String name;
    private int id;
    private double salary;
    private String department;
    private String city;

    public Employee(){
        super();
    }
    public Employee(String name,int id,double salary,String department,String city){
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.department=department;
        this.city=city;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getId(){return id;}

    public void setId(int id){
        this.id=id;
    }

    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }

    public String getDepartment(){
        return department;
    }

    public void setDepartment(String department){
        this.department=department;
    }

    public String getCity(){
        return city;
    }

    public void setCity(String city){
        this.city=city;
    }

    @Override
    public String toString(){
        return "Employee[name="+name+",id="+id+",salary="+salary+",department="+department+",city="+city+"]";
    }
}
