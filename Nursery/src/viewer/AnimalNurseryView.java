package viewer;

import models.Animal;
import presenter.View;
import presenter.ViewObserver;
import java.util.Collection;

public class AnimalNurseryView implements View {

    private ViewObserver observer;

    public AnimalNurseryView(){
    }

    public void showAnimals(Collection<Animal> animals){
        for(Animal animal: animals){
            System.out.println(animal);
        }
    }

    public void setObserver(ViewObserver observer){this.observer = observer;}

    public void getanimal(String name, String birthday, double weight, String type){
        this.observer.onGetAnimal(name,birthday,weight, type);
    }

    public void loadAnimals(){
        this.observer.loadAnimalRegister();
    }

}
