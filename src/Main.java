public class Main {
    public static void main(String[] args) {

        Cy27 cy27 = new Cy27(700, 300, 3000, 678, "White");

        cy27.Start();
        cy27.TakeOff();
        cy27.moveUp();
        cy27.moveRight();
        cy27.moveDown();
        cy27.moveLeft();
        cy27.NotVisible();
        cy27.Strike();
        cy27.Turbo(250);
        cy27.Landing();

    }
}