package AbstractFactory;

public class ModernChair implements Chair
{
    @Override
    public boolean hasLegs() {
        return false;
    }

    @Override
    public void sitOn() {
        System.out.println("You sit in the modern chair. You feel buyer's remorse.");
    }
}
