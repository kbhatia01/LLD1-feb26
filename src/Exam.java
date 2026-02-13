public class Exam {
    String name;
    int id;
    int year;
    Student s;

    Exam(String name1, int id1, int year1, Student s1){
        name = name1;
        id = id1;
        year = year1;
        s= s1;
    }
    public Exam(Exam e1){
        name = e1.name;
        id = e1.id;
        year = e1.year;
        s = new Student(e1.s);
    }

}
