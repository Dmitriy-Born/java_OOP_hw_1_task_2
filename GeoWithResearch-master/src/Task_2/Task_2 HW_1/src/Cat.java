public class Cat {
    private String name;
    private int age;
    private Sex sex;
    private boolean catInOrOutWardrobe;

    private boolean here;

    public Cat (String name, int age, Sex sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.here = false;
        this.catInOrOutWardrobe = false;

    }

    public boolean isCatInOrOutWardrobe() {
        return catInOrOutWardrobe;
    }

    public String getName() {
        return name;
    }

    public boolean catInOrOut(){
        return catInOrOutWardrobe;
    }

    public boolean comeHere(){
        return here;
    }

    public void callCat(){
        this.here = true;
        System.out.println(this.getName() + " лениво идет на зов и начинает драть диван");
    }

    public void mrrr(){
        System.out.println(this.getName() + " мурчит");
    }

    public void sayHiCat (Human human){
        System.out.println(human.getName() + ", не забудь про своего кота " + this.getName() + "а!");
    }


}
