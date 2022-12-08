package org.example;
import java.util.List;

public class StringRecipe{
    private List<StringTransformer> t;

    public StringRecipe(List<StringTransformer> transformers) {t = transformers;}

    public void mix(StringDrink drink){
        for (StringTransformer s: t){
            s.execute(drink);
        }
    }
}
