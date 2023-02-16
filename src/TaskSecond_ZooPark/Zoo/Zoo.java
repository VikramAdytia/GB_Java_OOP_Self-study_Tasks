package TaskSecond_ZooPark.Zoo;

import TaskSecond_ZooPark.Zoo.Animals.*;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private List<Animal> animals = new ArrayList<>();

    public List<Animal> addAnimals(List<Animal> animals) {
        this.animals.addAll(animals);
        return this.animals;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public List<AbleToRun> getRunning(){
        List<AbleToRun> result = new ArrayList<>();
        for (Animal item : animals) {
            if (item instanceof AbleToRun){
                result.add((AbleToRun) item);
            }
        }
        return result;
    }

    public List<AbleToSwim> getSwimming(){
        List<AbleToSwim> result = new ArrayList<>();
        for (Animal item : animals) {
            if (item instanceof AbleToSwim){
                result.add((AbleToSwim) item);
            }
        }
        return result;
    }

    public List<AbleToFly> getFlying(){
        List<AbleToFly> result = new ArrayList<>();
        for (Animal item : animals) {
            if (item instanceof AbleToFly){
                result.add((AbleToFly) item);
            }
        }
        return result;
    }

    public List<HasVocal> getVocals(){
        List<HasVocal> result = new ArrayList<>();
        for (Animal item : animals) {
            if (item instanceof HasVocal){
                result.add((HasVocal) item);
            }
        }
        return result;
    }

    public List<AbleToRun> AbleToRun(){
        List<AbleToRun> result = new ArrayList<>();
        for (Animal item : animals) {
            if (item instanceof AbleToRun){
                result.add((AbleToRun) item);
            }
        }
        return result;
    }

    public List<AbleToFly> AbleToFly(){
        List<AbleToFly> result = new ArrayList<>();
        for (Animal item : animals) {
            if (item instanceof AbleToFly){
                result.add((AbleToFly) item);
            }
        }
        return result;
    }

    public List<AbleToSwim> AbleToSwim(){
        List<AbleToSwim> result = new ArrayList<>();
        for (Animal item : animals) {
            if (item instanceof AbleToSwim){
                result.add((AbleToSwim) item);
            }
        }
        return result;
    }

    private Radio radio = new Radio();
    public List<HasVocal> GetVocals(){
        List<HasVocal> result = new ArrayList<>();
        for (Animal item : animals) {
            if (item instanceof HasVocal){
                result.add((HasVocal) item);
            }
        }
        result.add(radio);
        return result;
    }


    public AbleToRun getFastestRunner(){
        List<AbleToRun> animals = AbleToRun();
        List<Animal> champions = new ArrayList<>();
        AbleToRun winner = animals.get(0);;
        for (AbleToRun item : animals) {
            if (winner.runningSpeed() < item.runningSpeed()){
                winner = item;
            }
        }

        for (AbleToRun item : animals) {
            if (item instanceof Animal){
                champions.add((Animal) item);
            }
        }

       System.out.println("participants in the championship");
       //System.out.println(champions);
       int i = 1;
       for ( Animal champion: champions ) {
           System.out.println(i);
           i++;
          System.out.println(champion.getName());
       }

        return winner;
    }

    public AbleToFly getFastestFlyer(){
        List<AbleToFly> animals = AbleToFly();
        AbleToFly winner = animals.get(0);
        for (AbleToFly item : animals) {
            if (winner.flyingSpeed() < item.flyingSpeed()){
                winner = item;
            }
        }
        return winner;
    }
    public AbleToSwim getFastestSwimmer(){
        List<AbleToSwim> animals = AbleToSwim();
        AbleToSwim winner = animals.get(0);
        for (AbleToSwim item : animals) {
            if (winner.swimmingSpeed() < item.swimmingSpeed()){
                winner = item;
            }
        }
        return winner;
    }

    public HasVocal getLoudest(){
        List<HasVocal> animals = GetVocals();
        HasVocal winner = animals.get(0);
        for (HasVocal item : animals) {
            if (winner.sound().compareTo(winner.sound()) < winner.sound().compareTo(item.sound()) ){
                winner = item;
            }
        }
        return winner;


    }


}
