import animalspractice.*;
import driver.DriverB;
import driver.DriverC;
import driver.DriverD;
import product.Product;
import product.Recipe;
import product.RecipeBook;
import transport.Transport;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Тренировка
        System.out.println("Тренировка");
        Cat.Breed brShBreed = new Cat.Breed(
                "Британская короткошерстная",
                "ВБ",
                Cat.Breed.HairType.SHORT
        );
        Cat murzik = new Cat("Мурзик");
        //*Cat.FavToy murzikFavToy = murzik.new FavToy("Рыбка", "заводная");
        //murzik.setToy(murzikFavToy);
        //System.out.println(murzikFavToy.getCatName());
        //murzik.age = 3;
        //murzik.meow();
        //System.out.println(murzik.getName());
        Cat begemot = new Cat("Бегемот", 5);
        //begemot.age = -5;
        //begemot.setName(null);
        //begemot.meow();
        //System.out.println("У кота " + murzik.name + " " + murzik.getFriends().length + " друзей");
        //System.out.println("У кота " + murzik.getName() + " " + murzik.getFriends().length + " друзей");
        //murzik.friends[0].meow();
        //System.out.println(Cat.getCount());
        //System.out.println();

        //murzik.talk();
        //murzik.eat();

        Dog sharik = new Dog("Шарик", 2005);
        Dog tuzik = new Dog("Тузик", 2005);
        Dog ponchik = new Dog("Пончик", 2005);
        Dog qvadro = new Dog("Квадратик", 2005);
        //sharik.setAddress("random address");
        //Dog sharik2 = new Dog("Шарик",2005);
        //sharik2.setAddress("random address");
//
        //if (sharik.equals(sharik2)) {
        //    sharik2 = sharik;
        //}

        //sharik.talk();
        //sharik.eat();

        Parrot kesha = new Parrot("Кеша");
        //kesha.talk();

//        murzik.getFriends().add(begemot);
//        murzik.getFriends().add(sharik);
//        murzik.getFriends().add(kesha);

        /*for (Pet friend : murzik.getFriends()) {
            if (friend instanceof Cat) {
                Cat cat = (Cat) friend;
                cat.meow();
            } else if (friend.getClass() == Parrot.class) {
                try {
                    ((Parrot) friend).talk();
                } catch (CantTalkException e) {
                    throw new RuntimeException(e);
                }
            } else {
                System.out.println(friend);
            }
        }

        for (int i = 0; i < murzik.getFriends().size(); i++) {
            murzik.getFriends().get(i);
        }*/

        //murzik.getFriends().remove(sharik);

        //System.out.println(murzik.getFriends().size());

        //Trained trained = new Trained();

        Tiger tiger = new Tiger();

        Trainer<Dog> ivanTrainer = new Trainer<>("Ivan");
        Trainer<Dog> ivanTrainer2 = new Trainer<>("Ivan");
        ivanTrainer.train(sharik);
        ivanTrainer2.train(ponchik);
        ivanTrainer2.train(qvadro);

        Trainer<Dog> olgaTrainer = new Trainer<>("Olga");
        olgaTrainer.train(tuzik);

        System.out.println(Trainer.getTrainedAnimals());

        /*sharik.train("Апорт");
        sharik.train("Голос");
        sharik.train(TrainedCommand.CMD_SIT.name());
        sharik.train(TrainedCommand.CMD_LIE_DOWN.name());


        checkTrained(sharik);

        System.out.println();

        sharik.doCommand("Апорт");
        sharik.doCommand("Голос");
        sharik.doCommand("Сидеть");
        sharik.doCommand("Лежать");*/

        //sharik.train("апорт");
        //sharik.doCommand("апорт");

        /*Trainer<Dog> alex = new Trainer<>("Alex");
        alex.train(sharik);

        Trainer<Cat> mike = new Trainer<>("Mike");
        mike.train(murzik);

        Trainer bob = new Trainer<>("Bob");
        bob.train(tiger);
        bob.train(sharik);
        bob.train(murzik);*/

        Fish nemo = new Fish("Nemo");
        //nemo.talk();

        //talk(murzik, nemo, begemot, sharik);

//        Veterinarian<Cat> ivanIvanovich = new Veterinarian<>("Иван Иванович", "Старший ветеринар");
//        ivanIvanovich.addPatient(murzik);
//        ivanIvanovich.addPatient(begemot);
//
//        ivanIvanovich.treat();

        ArrayList<String> list = new ArrayList<>();
        list.add("Шарик");
        list.add("Тузик");
        list.add("Шарик");
        list.add("Пончик");
        list.add("Тузик");

        list.get(0);

        System.out.println(Arrays.toString(list.toArray()));

        Set<String> set = new HashSet<>();
        set.add("Шарик");
        set.add("Тузик");
        set.add("Шарик");
        set.add("Пончик");
        set.add("Тузик");
        set.add("Квардратик");
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");
        set.add("5");
        set.add("6");
        set.add("7");
        set.add("8");
        set.add("9");
        set.add("10");
        set.add("11");
        set.add("12");

        System.out.println(Arrays.toString(set.toArray()));

        murzik.getFriends().add(new Dog("Sharik"));
        murzik.getFriends().add(new Dog("Sharik"));
        murzik.getFriends().add(new Dog("Sharik"));
        murzik.getFriends().add(new Dog("Sharik"));

        System.out.println();

        for (Pet friend : murzik.getFriends()) {
            System.out.println(friend.getName());
        }
        System.out.println();

        HashMap<String, String> map = new HashMap<>();
        map.put("Иванов И.И.", "86135495485");
        map.put("Петров И.И.", "+76135495485");
        map.put("Сидоров И.И.", "76135495485");
        map.put("Смирнов И.И.", "6135495485");
        map.put("Андреев И.И.", "8(613)5495485");
        map.put("Александров И.И.", "8 613 549 54 85");

        System.out.println(map.get("Смирнов И.И.1"));
        System.out.println();

        // Задание 1-1
        System.out.println("Задание 1-1");
        PhoneBook phoneBook = new PhoneBook();
        for (int i = 0; i < 20; i++) {
            phoneBook.addSubscriber("Иван Иванов" + i, i < 10 ? "7981965454" + i : "798196545" + i);
        }
        phoneBook.printPhoneBook();
        System.out.println();

        // Задание 1-2
        System.out.println("Задание 1-2");
        Product banana = new Product("Банан");
        banana.setPrice(5.75);
//        banana.setWeight(2.5);
        Product orange = new Product("Апельсин");
        orange.setPrice(6.44);
//        orange.setWeight(1.02);
        Product kivi = new Product("КИВИ");
        kivi.setPrice(7.65);
//        kivi.setWeight(1.85);
        Product grape = new Product("Грейпфрут");
        Recipe fruitSalad = new Recipe("Фруктовый салат");
        fruitSalad.addProductToRecipe(banana, -0.45);
        fruitSalad.addProductToRecipe(orange, 0.00);
        fruitSalad.addProductToRecipe(kivi, 0.95);

        Product cucumber = new Product("Огурец");
        cucumber.setPrice(4.65);
//        cucumber.setWeight(0.68);
        Product tomato = new Product("Помидор");
        tomato.setPrice(3.75);
//        tomato.setWeight(0.85);
        Product lettuce = new Product("Лист салата");
        lettuce.setPrice(2.12);
//        lettuce.setWeight(0.95);
        Recipe greenSalad = new Recipe(null);
        greenSalad.addProductToRecipe(cucumber,0.68);
        greenSalad.addProductToRecipe(tomato,0.85);
        greenSalad.addProductToRecipe(lettuce);
        Recipe mixSalad = new Recipe("");
        mixSalad.addProductToRecipe(cucumber,0.55);
        mixSalad.addProductToRecipe(tomato,0.65);
        mixSalad.addProductToRecipe(lettuce,0.75);

        System.out.println(fruitSalad);
        System.out.println(greenSalad);
        System.out.println(mixSalad);
        System.out.println();

        RecipeBook recipeBook = new RecipeBook();

        recipeBook.addRecipeToBook(fruitSalad);
        recipeBook.addRecipeToBook(greenSalad);
        recipeBook.addRecipeToBook(mixSalad);

//        fruitSalad.printRecipe();
//        greenSalad.printRecipe();
//        mixSalad.printRecipe();
        recipeBook.printRecipeBook();
//        recipeBook.addRecipeToBook(fruitSalad);
        System.out.println();

        // Задание 1-3
        System.out.println("Задание 1-3");
        Exercise3 exercise = new Exercise3();
        exercise.add("str1",2);
        System.out.println(exercise);
        exercise.add("str2",1);
        System.out.println(exercise);
        try {
            exercise.add("str1", 2);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(exercise);
        exercise.add("str1",5);
        System.out.println(exercise);
        System.out.println();

        // Задание 2-1
        System.out.println("Задание 2-1");
        Map<String, List<Integer>> map21 = new HashMap<>();
//        map21.put("string1", List.of(1,6,12));
//        map21.put("string2", List.of(200,150,350));
        int map21Size = 5;
        int randomNumbersSize = 3;
        for (int i = 0; i < map21Size; i++) {
            List<Integer> randomNumbers = new ArrayList<>(randomNumbersSize);
            for (int j = 0; j < randomNumbersSize; j++) {
                randomNumbers.add((int) (Math.random() * 1001));
            }
            map21.put(String.valueOf(i),randomNumbers);
        }
        System.out.println(map21);

        Map<String, Integer> map211 = new HashMap<>();
        for (Map.Entry<String, List<Integer>> entry : map21.entrySet()) {
            int sum = 0;
            for (int i = 0; i < entry.getValue().size(); i++) {
                sum = sum + entry.getValue().get(i);
            }
            map211.put(entry.getKey(),sum);
        }
        System.out.println(map211);
        System.out.println();

        // Задание 2-2
        System.out.println("Задание 2-2");
        Map<Integer, String> map22 = new LinkedHashMap<>();
        int map22Size = 10;
        for (int i = 0, j = 100; i < map22Size; j -= 10, i++) {
//            int k;
//            if (i % 2 == 0) {
//                k = 5;
//            } else {
//                k = -5;
//            }
            map22.put(j,String.valueOf(i));
        }
        System.out.println(map22);
        System.out.println();

        //Задание 1 с платформы
        System.out.println("Задание 1 с платформы");
        DriverB dmitriev = new DriverB(
                "Дмитриев Дмитрий Дмитриевич",
                true,
                5,
                "B"
        );

        DriverC alexeev = new DriverC(
                "Алексеев Алексей Алексеевич",
                true,
                4,
                "C"
        );
        DriverD alexandrov = new DriverD(
                "Александров Александр Александрович",
                true,
                3,
                "D"
        );
        DriverD alexandrov1 = new DriverD(
                "Александров Александр Александрович",
                true,
                3,
                "D"
        );
        Transport.addDriver(dmitriev);
        Transport.addDriver(alexeev);
        Transport.addDriver(alexandrov);
        Transport.addDriver(alexandrov1);
        Transport.printDrivers();
    }
}