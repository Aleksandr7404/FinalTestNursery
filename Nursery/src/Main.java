import models.AnimalRegistryService;
import presenter.AnimalPresenter;
import viewer.AnimalNurseryView;
import java.util.Scanner;

public class Main {
    public Main(){
    }

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.println("\n      Учет домашних животных");
        AnimalRegistryService animalRegistryService = new AnimalRegistryService();
        AnimalNurseryView animalNurseryView = new AnimalNurseryView();
        new AnimalPresenter(animalRegistryService,animalNurseryView);
        boolean obs = true;
        while (obs){
            System.out.println("""
                    \nВыберите пункт меню
                    1 - Завести новое животное
                    2 - Увидеть список команд, которые выполняет животное
                    3 - Обучить животное новым командам
                    4 - Вывести всеx животных питомника
                    5 - Выйти
                    """);
            String choice = console.nextLine();
            String name_animal = null;
            String birthday = null;
            double weight = 0;
            String type_animal = null;
            String new_skill = null;
            switch (choice){
                case "1" -> {
                    System.out.println("Для этого вам необоходимо ввести имя животного, дату его рождения, " +
                            "вес и род животного ");
                    System.out.println("Введите имя животного: ");
                    name_animal = console.nextLine();
                    try {
                        System.out.println("Введите дату рождения животного в формате (2022-01-10): ");
                        birthday = console.nextLine();
                        if(birthday.length() == 10){
                            System.out.println("Введите вес животного: ");
                            weight = Double.parseDouble(console.nextLine());
                            System.out.println("Введите род животного (Кошка Собака Хомяк Лошадь Верблюд Осёл): ");
                            type_animal = console.nextLine();
                        }
                        else {
                            System.out.println("Неправильный формат даты, повторите ввод");
                        }
                    }
                    catch (Exception e){
                        System.out.println("Данные введены неверно, повторите ввод");
                    }

                    animalNurseryView.getanimal(name_animal,birthday,weight,type_animal);

                }
                case "2" -> {
                    System.out.println("Введите имя животного для проверки способностей");
                    name_animal = console.nextLine();
                    try {
                        animalRegistryService.get_command_animal(name_animal);
                    }
                    catch (Exception e){
                        System.out.println("К сожалению в нашем питомнике нет такого животного");
                    }

                }
                case "3" -> {
                    System.out.println("Введите имя животного для обучения");
                    name_animal = console.nextLine();
                    System.out.println("Введите команду которой нужно обучить животное");
                    new_skill = console.nextLine();
                    try {
                        animalRegistryService.learn_command_animal(name_animal,new_skill);
                    }
                    catch (Exception e){
                        System.out.println("К сожалению в нашем питомнике нет такого животного");
                    }

                }
                case "4" -> {
                        animalNurseryView.loadAnimals();
                }
                case "5" -> {
                    String by = "До свидания";
                    System.out.println("\n" + by);
                    obs = false;
                }

            }

        }

    }


}