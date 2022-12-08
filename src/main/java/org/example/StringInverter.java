package org.example;

public class StringInverter implements StringTransformer{
    @Override
    public void execute(StringDrink drink) {
        StringBuilder str = new StringBuilder((drink.getText()));
        StringBuilder reverseStr = str.reverse();
        drink.setText(reverseStr.toString());
    }

    @Override
    public void undo(StringDrink drink) {
        execute(drink);
    }
}
