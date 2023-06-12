import ru.praktikum.sprint_5.AnimalFarm;

public class Main {
    public static void main(String[] args) {
        AnimalFarm farm1 = new AnimalFarm(new String[]{"CAT Муся", "CAT Гоша", "Dog Виски", "Rabbit Вера"});
        System.out.println(farm1.countedAnimals());

    }
}
