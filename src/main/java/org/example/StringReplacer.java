package org.example;

public class StringReplacer implements StringTransformer{
    private char x;
    private char y;

    public StringReplacer(char x, char y){this.x = x; this.y = y;}
    @Override
    public void execute(StringDrink drink) {
        String text = drink.getText();
        String newText = "";
        for (int i = 0; i < text.length(); i++){
            if (text.charAt(i) == x){
                newText += y;
            }
            else{
                newText += text.charAt(i);
            }
        }
        drink.setText(newText);
    }

    @Override
    public void undo(StringDrink drink) {
        String text = drink.getText();
        String newText = "";
        for (int i = 0; i < text.length(); i++){
            if (text.charAt(i) == y){
                newText += x;
            }
            else{
                newText += text.charAt(i);
            }
        }
        drink.setText(newText);
    }
}

