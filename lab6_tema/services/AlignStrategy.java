package lab6_tema.services;

import lab6_tema.models.Context;
import lab6_tema.models.Paragraph;

public interface AlignStrategy {
    void render(Paragraph paragraph, Context context);
}
