package com.example.papu.appchistes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ChisteActivity extends AppCompatActivity {

    private Button btOtro;
    private TextView tvChiste;
    private String[] listaChistes = new String[13];
    private ArrayList<Integer> vistos = new ArrayList<>();
    private int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiste);

        cargarChistes();

        tvChiste = (TextView) findViewById(R.id.tvChiste);

        btOtro = (Button) findViewById(R.id.btOtro);
        btOtro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                do{i = (int) (Math.random()*13);}while(vistos.contains(i));
                tvChiste.setText(listaChistes[i]+"\nChiste: "+i+"\nVistos: "+vistos.size());
                vistos.add(i);
                if(vistos.size()==listaChistes.length) vistos.clear();
            }
        });
    }

    public void cargarChistes(){
        listaChistes[0] = "En el restaurante:\n" +
                "– Camarero, ¿el pescado viene solo?\n" +
                "– No, no, se lo traeré yo.\n";
        listaChistes[1] = "¿Sabes por qué el mar no se seca?\n" +
                "- Por que no tiene toalla.\n";
        listaChistes[2] = "Un niño fue pegado por la vecina y la madre furiosa fue a pedirle explicaciones: \n" +
                "- ¿Por qué le pegó a mi hijo? \n" +
                "- Por maleducado, me llamó gorda. \n" +
                "- ¿Y cree que pegándole va a adelgazar?";
        listaChistes[3] = "¿Qué quiere ser la servilleta cuando sea grande?\n" +
                "Billete.";
        listaChistes[4] = "- Buenos días, me gustaría alquilar Batman Forever.\n" +
                "- No es posible, tiene que devolverla tomorrow.\n";
        listaChistes[5] = "Se abre el telón y aparece un culo muy gordo con solo un pelo. Se cierra el telón, ¿Cómo se llama la pelcula?\n" +
                "El peliculón.";
        listaChistes[6] = "- Ayer me dijeron que soy fea.\n" +
                "- No te preocupes, a mí me han dicho cosas peores.\n" +
                "- ¿Qué te han dicho?\n" +
                "- Que también eres bastante tonta.";
        listaChistes[7] = "- ¿Sabe? soy vidente, y por 10 euros le digo su futuro.\n" +
                "- ¿10 euros? OK.\n" +
                "- Yo seré vidente, tú serás vidente, él será vidente…\n";
        listaChistes[8] = "- Soy bidente.\n" +
                "- ¿Puedes ver el futuro?\n" +
                "- No, sólo tengo dos dientes.\n" +
                "- ¿Eres idiota?\n" +
                "- No, soy un conejo.\n";
        listaChistes[9] = "- Doctor, doctor, ¿qué puedo hacer para que mi hijo no se mee en la cama?\n" +
                "- Que duerma en el baño.\n";
        listaChistes[10] = "- Hola ¿es la carnicería?\n" +
                "- No, es la zapatería.\n" +
                "- Disculpe, me he equivocado de número.\n" +
                "- No importa, tráigalos, se los cambiamos.\n";
        listaChistes[11] = "- ¿Por qué los adivinos no pueden tener hijos?\n" +
                "- Porque tienen las bolas de cristal.\n";
        listaChistes[12] = "-Estoy a favor de la libertad de expresión.\n" +
                "-Y yo.\n" +
                "-Tú te callas. \n";
    }
}
