public class Human_Main {
    public static void main(String[] args) {
        Human human1 = new Human("Harry", 28, 78.45, 190.44);
        Human human2 = new Human("Maguire", 27, 82.74, 193.74);

        System.out.println(human1.name);
        human2.eat();
        human1.drink();
    }
}
