package zoo;

public class Frog extends Predator implements Swimable {

    private int swimSpeed = 5;

    public Frog(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Kva";
    }

    @Override
    public int getSpeedSwim() {
        return this.swimSpeed;
    }
}
