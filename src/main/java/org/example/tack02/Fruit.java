package org.example.tack02;
/**
 * Фрукт
 */
public class Fruit implements HealthyFood{
    @Override
    public boolean getProteins() {
        return false;
    }

    @Override
    public boolean getFats() {
        return false;
    }

    @Override
    public boolean getCarbohydrates() {
        return true;
    }

    @Override
    public String getName() {
        return "Фрукт";
    }
}