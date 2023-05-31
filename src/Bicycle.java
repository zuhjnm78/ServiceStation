public class Bicycle extends Vehicle{
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void check(){
        System.out.println("Обслуживаем " + getModelName());
        updateTyre();
        System.out.println();
    }

}
