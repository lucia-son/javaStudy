package inheritance;

class Animal {
    public void move() {
    System.out.println("Animal is moving");
    }

static class Human extends Animal {
     public void move() {
     System.out.println("People walks on foot");
     }
}

static class Tiger extends Animal {
    public void move() {
    System.out.println("Tiger runs on four legs");
    }
}
static class Eagle extends Animal {
    public void move() {
    System.out.println("Eagle is flying");
    }
}
}

public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();
        test.moveAnimal(new Animal.Human());
        test.moveAnimal(new Animal.Tiger());
        test.moveAnimal(new Animal.Eagle());
        //Animal animal = new Human();
    }

    public void moveAnimal(Animal animal) { //매개변수 자료형은 상위클래스
            animal.move(); //재정의된 메서드가 호출
        }
}

