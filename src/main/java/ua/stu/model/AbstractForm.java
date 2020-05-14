package ua.stu.model;

public abstract class AbstractForm {
    protected Wood wood;
    public abstract float volume();

    public AbstractForm(Wood wood) {
        this.wood = wood;
    }

    public Wood getWood() {
        return wood;
    }

    public float weight() {
        return wood.getDensity() * volume();
    }
}
