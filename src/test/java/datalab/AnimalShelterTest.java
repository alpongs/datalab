package datalab;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalShelterTest {

    @Test
    void add() {
        AnimalShelter manager = new AnimalShelter();
        Dog dog1 = new Dog("A", AninmalType.DOG);
        Dog dog2 = new Dog("B", AninmalType.DOG);
        Cat cat3 = new Cat("C", AninmalType.CAT);
        Cat cat4 = new Cat("D", AninmalType.CAT);
        Dog dog5 = new Dog("E", AninmalType.DOG);
        manager.add(dog1);
        manager.add(dog2);
        manager.add(cat3);
        manager.add(cat4);
        manager.add(dog5);
        Assertions.assertEquals(5,dog5.getOrder());
        Assertions.assertEquals(3,manager.getDogs().size());
        Assertions.assertEquals(2,manager.getCats().size());

        //Assertions.assertEquals(5,dog5);

    }

    @Test
    void pollCat() {
        AnimalShelter manager = new AnimalShelter();
        Dog dog1 = new Dog("A", AninmalType.DOG);
        Dog dog2 = new Dog("B", AninmalType.DOG);
        Cat cat3 = new Cat("C", AninmalType.CAT);
        Cat cat4 = new Cat("D", AninmalType.CAT);
        Dog dog5 = new Dog("E", AninmalType.DOG);
        manager.add(dog1);
        manager.add(dog2);
        manager.add(cat3);
        manager.add(cat4);
        manager.add(dog5);
        // pollcat 하면 cat3이 나와야한다
        Assertions.assertEquals(2,manager.getCats().size());
        Aninmal aninmal = manager.pollCat();
        Assertions.assertEquals(aninmal.getName(),"C");
        Assertions.assertEquals(1,manager.getCats().size());



    }

    @Test
    void pollDog() {
        AnimalShelter manager = new AnimalShelter();
        Dog dog1 = new Dog("A", AninmalType.DOG);
        Dog dog2 = new Dog("B", AninmalType.DOG);
        Cat cat3 = new Cat("C", AninmalType.CAT);
        Cat cat4 = new Cat("D", AninmalType.CAT);
        Dog dog5 = new Dog("E", AninmalType.DOG);
        manager.add(dog1);
        manager.add(dog2);
        manager.add(cat3);
        manager.add(cat4);
        manager.add(dog5);
        Assertions.assertEquals(3,manager.getDogs().size());
        Aninmal aninmal = manager.pollDog();
        Assertions.assertEquals(aninmal.getName(),"A");
        Assertions.assertEquals(2,manager.getDogs().size());


    }

    @Test
    void poll() {
        AnimalShelter manager = new AnimalShelter();
        Dog dog1 = new Dog("A", AninmalType.DOG);
        Dog dog2 = new Dog("B", AninmalType.DOG);
        Cat cat3 = new Cat("C", AninmalType.CAT);
        Cat cat4 = new Cat("D", AninmalType.CAT);
        Dog dog5 = new Dog("E", AninmalType.DOG);
        manager.add(dog1);
        manager.add(dog2);
        manager.add(cat3);
        manager.add(cat4);
        manager.add(dog5);
        Assertions.assertEquals(3,manager.getDogs().size());
        Assertions.assertEquals(2,manager.getCats().size());
        Aninmal aninmal = manager.poll();

        Assertions.assertEquals(aninmal.getName(),"A");
        Aninmal aninmal2 = manager.poll();

        Assertions.assertEquals(aninmal2.getName(),"B");
        Aninmal aninmal3 = manager.poll();

        Assertions.assertEquals(aninmal3.getName(),"C");
    }
    @Test
    void poll2(){
        AnimalShelter manager = new AnimalShelter();
        Dog dog1 = new Dog("A", AninmalType.DOG);
        Dog dog2 = new Dog("B", AninmalType.DOG);
        Cat cat3 = new Cat("C", AninmalType.CAT);
        Cat cat4 = new Cat("D", AninmalType.CAT);
        Dog dog5 = new Dog("E", AninmalType.DOG);
        manager.add(dog1);
        manager.add(dog2);
        manager.add(cat3);
        manager.add(cat4);
        manager.add(dog5);
        manager.pollCat();
        manager.pollCat();
        Aninmal aninmal = manager.poll();
        Aninmal aninmal2 = manager.poll();
        Aninmal aninmal3 = manager.poll();
        Aninmal aninmal4 = manager.poll();
    }
}