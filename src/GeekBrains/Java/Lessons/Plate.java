package GeekBrains.Java.Lessons;

public class Plate {
    private int food;
    // конструктор тарелки
    public Plate (int food){
        this.food = food;
    }

    // метод добавления еды в тарелку
    public void increaseFood (int food){
        this.food = food + food;
    }

    // метод уменьшения количества еды в тарелке
    public void decreaseFood (int appetite) {
        if (!isThereEnoughFoodForAppetite(appetite)){
            System.out.println("В тарелке стало еды " + food);
            return;
        } else
        food = food - appetite;
    }

    // метод определения достаточности еды для аппетита
    public boolean isThereEnoughFoodForAppetite (int appetite){
        if (appetite <= food) return true;
        return false;
    }
}
