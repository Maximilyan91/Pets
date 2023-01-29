import Animals.Cat;

public class Main {
    public static void main(String[] args) {
        Cat.Breed bezPorody = new Cat.Breed("беспородная", "Россия", "длинношерстная");

        Cat murzik = new Cat("Мурзик", 10);
        murzik.setBreed(bezPorody);

      //  murzik.name = "Мурзик";


        murzik.meow();

        Cat begemot = new Cat("Бегемот", -5);


        murzik.setName(null);
        begemot.meow();

//        murzik.friends = null;
//
//
        System.out.println("У кота " + murzik.getName() + " " + murzik.getFriends().length +  " друзей");

        murzik.addFriend(begemot);

        System.out.println("У кота " + murzik.getName() + " " + murzik.getFriends().length +  " друзей");
//
//        murzik.friends[0].meow();

        System.out.println(Cat.getCount());

    }
}