package AbstractFactory;

public class VictorianChair implements Chair
{
    @Override
    public boolean hasLegs() {
        return true;
    }

    @Override
    public void sitOn(){
        System.out.println("You sit on the victorian chair. Elegant!");
    }
}
