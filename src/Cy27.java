public class Cy27 extends Airplane implements StealthTechnology, TurboAcceleration, NuclearStrike, AircraftControl {

    private int maxSpeed;
    private String colorPlane;


    public Cy27(int length, int weight, int width, int maxSpeed, String colorPlane) {
        super(length, width, weight);
        this.maxSpeed = maxSpeed;
        this.colorPlane = colorPlane;
    }

    @Override
    public void moveUp() {
        System.out.println("Літак летить вверх на " + (int) (Math.random() * 100) + " км");
    }

    @Override
    public void moveDown() {
        System.out.println("Літак летить вниз на " + (int) (Math.random() * 100) + " км");
    }

    @Override
    public void moveLeft() {
        System.out.println("Літак летить вліво на " + (int) (Math.random() * 100) + " км");
    }

    @Override
    public void moveRight() {
        System.out.println("Літак летить вправо на " + (int) (Math.random() * 100) + " км");
    }

    @Override
    public void Strike() {
        System.out.println("Ядерних боєголовок яку буде скинуто: " + (int) (Math.random() * 10));
    }

    @Override
    public void Turbo(int MaxSpeed) {
        System.out.println("Швидкість літака Су-27 " + (int) (MaxSpeed + Math.random() * 250) + " км");
    }

    @Override
    public void NotVisible() {
        System.out.println("Літака не видно протягом " + (int) (Math.random() * 60) + " хв");
    }
}
