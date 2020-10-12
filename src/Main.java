public class Main {
    public static void main(String[] args) {
        SimpleInterface sp = new Pies();
        sp.szczekaj();

        Pet snake = new Snake();
        snake.go();
        snake.jedz();

        Pet fish = new Fish();
        fish.go();
        fish.jedz();

        //Pet pet = new Pet();
    }
}
