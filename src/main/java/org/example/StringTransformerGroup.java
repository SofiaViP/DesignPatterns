package org.example;

import java.util.List;

public class StringTransformerGroup implements StringTransformer{

    private List<StringTransformer> t;

    public StringTransformerGroup(List<StringTransformer> transformers) {t = transformers;}
    @Override
    public void execute(StringDrink drink) {
        for (StringTransformer s: t){
            s.execute(drink);
        }
    }

    @Override
    public void undo(StringDrink drink) {
        execute(drink);
    }
}
