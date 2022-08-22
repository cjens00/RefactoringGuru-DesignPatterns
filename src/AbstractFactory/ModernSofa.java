package AbstractFactory;

public class ModernSofa implements Sofa
{
    @Override
    public boolean hasRemovableCushions() {
        return true;
    }

    @Override
    public boolean isLeather() {
        return true;
    }
}
