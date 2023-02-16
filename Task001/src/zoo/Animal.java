package zoo;

import zoo.radio.Sayable;

public abstract class Animal implements Sayable {

    private String name;

    protected Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract String feed();

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        if (this instanceof Runable) {
            str.append(" Скорость бега - > " + ((Runable) this).getSpeedRun());
        }
        if (this instanceof Flyable) {
            str.append(" Скорость полёта - > " + ((Flyable) this).getSpeedFlyable());
        }
        if (this instanceof Swimable) {
            str.append(" Скорость плаванья - > " + ((Swimable) this).getSpeedSwim());
        }
        return String.format(str + " %s ест %s", this.name, this.feed());
    }
}
