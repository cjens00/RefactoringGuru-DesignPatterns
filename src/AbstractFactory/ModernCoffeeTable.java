package AbstractFactory;

public class ModernCoffeeTable implements CoffeeTable {
    @Override
    public boolean hasGlass() {
        return true;
    }

    @Override
    public boolean isWooden() {
        return false;
    }

}
