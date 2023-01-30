import Animals.*;

import static Animals.Dog.CMD_SIT;

public class Main {
    public static void main(String[] args) {
//        Cat.Breed bezPorody = new Cat.Breed("беспородная", "Россия", "длинношерстная");
//
        Cat murzik = new Cat("Мурзик", 10);
//        murzik.setBreed(bezPorody);
//
//      //  murzik.name = "Мурзик";
//
//        Cat.FavToy murzikFavToy = murzik.new FavToy("Пищалка", "Мячик");
//        murzik.setToy(murzikFavToy);
//        murzik.eat();
//
//        System.out.println(murzikFavToy.getCatName());
//
//        murzik.talk();
//
        Dog sharik = new Dog("Шарик");
//
//        sharik.talk();
//        sharik.eat();
//
//        Parrot kesha = new Parrot("Кеша");
//        kesha.talk();
//       murzik.meow();
////
////        Cat begemot = new Cat("Бегемот", -5);
////
////
////        murzik.setName(null);
////        begemot.meow();
////
//////        murzik.friends = null;
//////
//////
////        System.out.println("У кота " + murzik.getName() + " " + murzik.getFriends().length +  " друзей");
////
////        murzik.addFriend(begemot);
////
////        System.out.println("У кота " + murzik.getName() + " " + murzik.getFriends().length +  " друзей");
//////
//////        murzik.friends[0].meow();
////
////        System.out.println(Cat.getCount());
//
//
//
//        Hamster hamster = new Hamster("Хомяк");
//        Cat begemot = new Cat("Бегемот", 5);
//
//        murzik.addFriends(sharik);
//        murzik.addFriends(hamster);
//        murzik.addFriends(begemot);
//        murzik.addFriends(kesha);
//
////        System.out.println(sharik.getAllCommands());
//
//        sharik.doCommands("Стоять");\
        Tiger tiger = new Tiger();

        sharik.train(CMD_SIT);

        checkTrained(sharik, tiger);
    }


        public static void checkTrained(Trained... animals){
            for (Trained animal:animals) {
                for (String command : animal.getTrainedCommands()) {
                    animal.doCommands(command);
                }
            }
        

    }

}

