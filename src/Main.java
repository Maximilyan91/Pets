public class Main {
    public static void main(String[] args) {

        Cat murzik = new Cat("Мурзик", 10);

      //  murzik.name = "Мурзик";


        murzik.meow();

        Cat begemot = new Cat("Бегемот", -5);

        murzik.setName(null);
        begemot.meow();

//        murzik.friends = null;
//
//
        System.out.println("У кота " + murzik.name + " " + murzik.getFriends().length +  " друзей");

//        murzik.addFriend(begemot);

        System.out.println("У кота " + murzik.name + " " + murzik.getFriends().length +  " друзей");
//
//        murzik.friends[0].meow();



    }
}