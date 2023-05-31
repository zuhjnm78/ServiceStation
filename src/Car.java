public class Car extends Vehicle{
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void check(){
        System.out.println("Обслуживаем " + getModelName());
        updateTyre();
        checkEngine();
        System.out.println();

}
}
