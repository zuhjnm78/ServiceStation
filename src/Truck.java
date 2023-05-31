public class Truck extends Car {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void check(){
        System.out.println("Обслуживаем " + getModelName());
        updateTyre();
        checkEngine();
        System.out.println("Проверяем прицеп");
        System.out.println();
    }

}
