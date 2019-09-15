public class Course {

    private String name;
    private Student studentList[] = new Student[20];
    private int i=0;

    public Course(String name){
        this.name=name;
    }
    public void addStudent(Student student){
        studentList[i]=student;
        i++;
    }
    public void print(){
        System.out.println("Course"+name+"list of students:");
        for(int j=0; j<i; j++){
            System.out.println(studentList[j].getName()+"which is"+studentList[j].getAge()+" years old with GPO of" + studentList[j].getGPO());
        }
    }
    public String getName(){
        return name;
    }

}
