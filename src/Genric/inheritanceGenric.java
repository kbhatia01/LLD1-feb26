package Genric;

import java.util.ArrayList;
import java.util.List;

class Animal{
    String name;
}

class  Cat extends Animal{

}
class Dog extends Animal{

}

class Labrador extends Dog{


}

class GermanShef extends Dog{

}


class main{

    public void printList(List<? extends Dog> d){
        for (int i = 0; i < d.size(); i++) {
            System.out.println(d.get(i));
        }
    }


    public void printListTop(List<? super Dog> d){
        for (int i = 0; i < d.size(); i++) {
            System.out.println(d.get(i));
        }
    }
    public static void main(String[] args) {

//        List<Animal> a= new ArrayList<>();
//        Dog d = new Dog();
//        a.add(d);

        List<Labrador> aa = new ArrayList<>();
        Labrador z = new  Labrador();
        aa.add(z);


//        printListTop(aa);
        Animal animal = new Animal();
        List<Animal> am = new ArrayList<>();
        am.add(animal);
//        printListTop(am);
//        printList(aa);



    }


}