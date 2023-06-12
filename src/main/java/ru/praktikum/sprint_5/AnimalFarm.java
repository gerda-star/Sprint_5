package ru.praktikum.sprint_5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class AnimalFarm {
    public List<String> farmAnimals;

    public AnimalFarm(String[] arrayFarmAnimals) {
        this.farmAnimals =  Arrays.asList(arrayFarmAnimals);
    }

    public HashMap<Animal, Integer> countedAnimals() {
        HashMap<Animal, Integer> mapFarmAnimals = new HashMap<>();
        for (String animal : farmAnimals) {
            String type = animal.split(" ")[0];
            //проверка на тип животного из возможных
            Animal typeAnimal;
            switch (type.toLowerCase()) {
                case "cat" :
                    typeAnimal = Animal.CAT;
                    break;
                case "cow" :
                    typeAnimal = Animal.COW;
                    break;
                case "dog" :
                    typeAnimal = Animal.DOG;
                    break;
                case "horse" :
                    typeAnimal = Animal.HORSE;
                    break;
                default:
                    typeAnimal = Animal.NOT_DEFINED;
                    System.out.println("Please correct string [ "+ animal + " ] Incorrect input data");
            }
            int count = 1;
            if (mapFarmAnimals.containsKey(typeAnimal)) {
                count = mapFarmAnimals.get(typeAnimal) + 1;
            }
            mapFarmAnimals.put(typeAnimal, count);

        }

        return mapFarmAnimals;
    }
}
