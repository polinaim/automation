public class Student {
    private String name;
    private int age;
    private double GPO;

    public Student(String Name, int Age, double GPO){
        this.name=Name;
        this.age=Age;
        this.GPO=GPO;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public double getGPO(){
        return GPO;
    }

}
