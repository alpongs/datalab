package datalab;


import java.util.LinkedList;

enum AninmalType {
    CAT,
    DOG
}

class Aninmal {
    private int order;          // 입고된 고유번호.
    private String name;        // 동물의 이름
    private AninmalType type;   // 동물의 종류

    public Aninmal(String name, AninmalType type) {
        this.name = name;
        this.type = type;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getOrder() {
        return order;
    }

    public String getName() {
        return name;
    }

    public AninmalType getType() {
        return type;
    }
}

class Dog extends Aninmal {

    public Dog(String name, AninmalType type) {
        super(name, type);
    }
}

class Cat extends Aninmal {

    public Cat(String name, AninmalType type) {
        super(name, type);
    }
}

class AnimalShelter {

    LinkedList<Aninmal> cats = new LinkedList<>();
    LinkedList<Aninmal> dogs = new LinkedList<>();

    public LinkedList<Aninmal> getCats() {
        return cats;
    }

    public LinkedList<Aninmal> getDogs() {
        return dogs;
    }

    int order;

    public AnimalShelter() {
        this.order = 1;
    }


    public void add(Aninmal aninmal) {
        aninmal.setOrder(order);
        order++;

        // 강아지
        if (aninmal.getType() == AninmalType.DOG) {
            dogs.add(aninmal);
        }
        // 고양이
        else {
            cats.add(aninmal);
        }
    }

    // 고양이 분양 해주세요
    public Aninmal pollCat() {
        return cats.poll();
    }

    // 강아지 분양 해주세요
    public Aninmal pollDog() {
        return dogs.poll();
    }

    // 우선순위가 분양 해주세요.
    public Aninmal poll() {
        if(cats.isEmpty() && dogs.isEmpty()){
            System.out.println("both empty");
            return null;
        }
        if(cats.isEmpty()){
            return dogs.poll();
        }
        if(dogs.isEmpty()){
            return cats.poll();
        }
        Aninmal D = dogs.peek();
        Aninmal C = cats.peek();
        if(D.getOrder() > C.getOrder()){
            return cats.poll();
        }
        else{
            return dogs.poll();
        }

    }
}
public class PetHomes {

    public static void main(String[] args) {
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
    }
}

