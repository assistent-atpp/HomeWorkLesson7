package GeekBrains.Java.Lessons;

public class Main {

    public static void main(String[] args) {
        Cat[] cats = new Cat[3];
	    cats[0] = new Cat("Barsik", 16);
	    cats[1] = new Cat("Murzik", 16);
	    cats[2] = new Cat("Tutik", 16);

	    Plate plate = new Plate(10);

	    for (int cat = 0; cat < cats.length; cat++){
	        cats[cat].eat(plate);
        }

        addFoodToPlate (plate, 20);

	    for (int cat = 0; cat < cats.length; cat++){
	        cats[cat].eat(plate);
        }
    }
    // метод добавления еды в тарелку из класса мэйн
    static void addFoodToPlate (Plate plate, int food){
        plate.increaseFood(food);
    }
}
