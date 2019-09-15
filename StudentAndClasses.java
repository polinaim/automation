public class StudentAndClasses {
    public static void main(String[] args){

        Student moshe = new Student("Moshe", 25, 4.0);
        Student Sarit = new Student("Sarit", 22, 3.75);
        Student Dana = new Student("Dana", 29, 3.5);
        Student Sergei = new Student("Sergei", 31, 4.0);
        Student Daniel = new Student("Daniel", 19, 3.11);

        Course Infi = new Course("Infi1");
        Course Algo = new Course("Algo");

        Infi.addStudent(moshe);
        Infi.addStudent(Sarit);
        Infi.addStudent(Dana);

        Algo.addStudent(Sergei);
        Algo.addStudent(Daniel);

        Infi.print();
        Algo.print();
    }



}
