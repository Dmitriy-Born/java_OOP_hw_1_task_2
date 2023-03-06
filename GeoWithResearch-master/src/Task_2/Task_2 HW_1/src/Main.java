public class Main {
    public static void main(String[] args) {

        Human human = new Human("Дмитрий", 30, Sex.man);
        Wardrobe wardrobe = new Wardrobe("Шкаф", 10);
        Cat cat = new Cat("Барсик", 10, Sex.man);
        wardrobe.sayHi(human);
        human.closeDoor(wardrobe);
        human.openDoor(wardrobe);
        human.openDoor(wardrobe);
        human.addInWardrobe("Кофе", wardrobe);
        human.seeInWardrobe(wardrobe);
        System.out.println();

        cat.sayHiCat(human);
        human.callCat(cat);
        human.addInWardrobe("Барсик", wardrobe);
        human.seeInWardrobe(wardrobe);
//        human.callCat(cat);
    }
}