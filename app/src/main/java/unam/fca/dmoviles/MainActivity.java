package unam.fca.dmoviles;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static java.lang.Math.abs;

public class MainActivity extends AppCompatActivity {

    private final static int IMAGE_WIDTH = 400;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final float[] result = new float[1];
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){


                TextView editText = findViewById(R.id.editText);
                TextView editText2 = findViewById(R.id.editText2);
                TextView textViewResult = findViewById(R.id.textViewResult);
                float  valor1 = Float.parseFloat(editText.getText().toString());
                float  valor2 = Float.parseFloat(editText2.getText().toString());

                result[0] = ((valor2 - valor1) / abs (valor1)) * 100;
                textViewResult.setText(result[0] + "%");

            }




            //Actividad 8 Creacion de una calculadora de porcentajes
            //En esta actividad crearas una aplicacion que calcule la diferencia relativa en porcentaje entre dos numeros.


            // El archivo del layout de la actividad se encuentra en la carpeta
            // res/layout/activity_main.xml


            //Actividades
            //a) Ejecuta la aplicacion y familiarizate con el layout definido en R.layout.activity_main
            //b) Crea la logica para calcular la diferencia relativa en porcentaje entre dos numeros
            //c) La formula para calcular la diferencia relativa en porcentaje esta en: https://www.calculatorsoup.com/calculators/algebra/percent-change-calculator.php
            //d) La aplicacion debe calcular la diferencia relativa en porcentaje de los valores contenidos en "editText" y "editText2"
            //e) Al hacer click en el boton "button", la aplicacion debera calcular dicha diferencia y poner el resultado en el campo "textViewResult"
            //f) La aplicacion debera manejar adecuadamente el cambio de rotacion para el resultado y los campos de texto
            //e) Anota tus respuestas y las capturas de pantalla en un documento en Word
            //f) Sube tu codigo al repositorio.
            //g) Sube el documento Word a la plataforma Moodle. Incluye la liga a tu repositorio
        });

    }
}
