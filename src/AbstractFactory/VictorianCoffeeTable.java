package AbstractFactory;

public class VictorianCoffeeTable implements CoffeeTable
{
    @Override
    public boolean hasGlass() {
        return true;
    }

    @Override
    public boolean isWooden() {
        return true;
    }
}
