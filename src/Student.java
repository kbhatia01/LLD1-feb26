public class Student {
    private int id; //default
    public String name; //default


    Student(String name1, int id1){
        id = id1;
        name = name1;
    }

    Student(){

    }

    Student(Student s2){
        id = s2.id;
        name = s2.name;
    }

    private void print_name(){ // default
        System.out.println(name);
    }

    void answer_name(){
        print_name();
    }
    public int get_id(){
        return id;
    }

    void x(){

    }
}


