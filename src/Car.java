public class Car extends Bicycle{
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    public void check(){
        System.out.println("Обслуживаем " + getModelName());
        updateTyre();
        checkEngine();
        System.out.println();

    }
}

