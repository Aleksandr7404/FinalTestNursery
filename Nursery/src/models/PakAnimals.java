package models;

import java.util.ArrayList;

public class PakAnimals extends  Animal{


    public PakAnimals(String name, String birthday, double weight, String type) {
        super(name, birthday, weight, type);

    }

    @Override
    public ArrayList<String> getCommand_animal() {
        command_animal.add("load");
        command_animal.add("upload");
        return command_animal;
    }

}
