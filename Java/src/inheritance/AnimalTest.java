package inheritance;

class Animal {
    public void move() {
    System.out.println("Animal is moving");
    }

static class Human extends Animal {
     public void move() {
         System.out.println("People walks on foot");
     }
    public void read() {
        System.out.println("People read a book");
    }
}

static class Tiger extends Animal {
    public void move() {
    System.out.println("Tiger runs on four legs");
    }
    public void hunt() {
        System.out.println("Tiger hunts for food");
    }
}
static class Eagle extends Animal {
    public void move() {
    System.out.println("Eagle is flying");
    }
    public void fly() {
        System.out.println("Eagle can fly");
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
        test.showAnimal(new Animal.Human());
    }

    public void moveAnimal(Animal animal) { //매개변수 자료형은 상위클래스
            animal.move(); //재정의된 메서드가 호출
    }

    //다운캐스팅
    private void showAnimal(Animal animal) {
        animal.move();
        if(animal instanceof Animal.Human) {
            Animal.Human human = (Animal.Human)animal;
            human.read();
        }
    }

}

