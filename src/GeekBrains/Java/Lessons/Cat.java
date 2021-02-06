package GeekBrains.Java.Lessons;

public class Cat {
    private String name;
    private int appetite;
    private boolean isCatFull;

    // конструктор кота
    public Cat (String name, int appetite){
        this.name = name;
        this.appetite = appetite;
        isCatFull = false;
    }

    // метод приёма еды котом
    public void eat (Plate plate){
        if (plate.isThereEnoughFoodForAppetite(appetite) && !isCatFull){
            plate.decreaseFood(appetite);
            isCatFull = true;
            System.out.println(name + " покушал");
        } else if (isCatFull){
            System.out.println(name + " не хочет кушать");
        } else {
            System.out.println(name + " не покушал - мало еды в тарелке");
        }
    }
}
