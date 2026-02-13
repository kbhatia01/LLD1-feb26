//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

void x(){

}
void main() {

    Student s = new Student("karan", 10);
//
//    Student s2 = new Student();
//    System.out.println(s2.get_id());
//    s.answer_name();

//    Exam e1 = new Exam("abc", 1, 1, s);
//    System.out.println(e1.name);
//    Exam e2 = new Exam(e1);
//    e1.s.name = "student changed";
//    e1.name="mno";
//    System.out.println(e1.s.name);
//
//    System.out.println(e2.s.name);
//

    for (int i = 0; i < 100000; i++) {
        Thread t1 = new Thread(new threading(i));
        t1.start();

    }


}
