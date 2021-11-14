package lab6_tema.services;

import lab6_tema.models.Context;
import lab6_tema.models.Paragraph;

public class AlignRight implements AlignStrategy{

    public void render(Paragraph paragraph, Context context) {
        // TODO Auto-generated method stub
        System.out.println("Align right: " + paragraph);
    }
    
}
