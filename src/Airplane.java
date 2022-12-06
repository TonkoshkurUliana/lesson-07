public abstract class Airplane {
    private int Length;
    private int width;
    private int weight;
    private Airplane Airplane;

    public Airplane(int length, int weight, int width) {

        this.Length = length;
        this.width = width;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Літак" +
                " Довжина: ( " + Length + " ) \n" +
                " Ширина: ( " + width + " ) \n" +
                " Вага: ( " + weight + " )" + " кг \n";
    }

    void TakeOff() {
        System.out.println("На повному баці літак пролетить " + (int) (Math.random() * 1000) + " км.");
    }

    ;

    void Start() {
        for (int i = (int) (Math.random() * 30); i >= 0; i--) {
            System.out.println("До вилету: " + i);
            if (i == 0) {
                System.out.println("Старт!!!");
            }
        }
    }

    void Landing() {
        System.out.println("Літак іде на посадку");
    }

    ;

}
