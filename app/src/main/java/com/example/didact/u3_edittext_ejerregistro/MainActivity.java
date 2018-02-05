package com.example.didact.u3_edittext_ejerregistro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    EditText etNombre, etApellidos, etEdad;
    RadioGroup rgSexo;
    Spinner spProvincia;
    CheckBox cbEstudiante;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombre=(EditText)findViewById(R.id.et_Nombre);
        etApellidos=(EditText)findViewById(R.id.et_Apellidos);
        etEdad=(EditText)findViewById(R.id.et_Edad);
        rgSexo=(RadioGroup)findViewById(R.id.rgSexo);
        spProvincia=(Spinner) findViewById(R.id.spProvincia);
        cbEstudiante=(CheckBox) findViewById(R.id.cbEstudiante);


    }//FIN onCreate

    public void clickVer (View view){

        String nombre = etNombre.getText().toString();
        String apellidos = etApellidos.getText().toString();
        String edad = etEdad.getText().toString();

        int id = rgSexo.getCheckedRadioButtonId();
        RadioButton rbSeleccionado = (RadioButton)findViewById(id);
        String textoRBSeleccionado= rbSeleccionado.getText().toString();

        String provinciaSeleccionada




    }
}//FIN MainActivity
