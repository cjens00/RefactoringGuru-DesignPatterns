package AbstractFactory;

public class VictorianSofa implements Sofa
{
    @Override
    public boolean hasRemovableCushions() {
        return true;
    }

    @Override
    public boolean isLeather() {
        return false;
    }
}
