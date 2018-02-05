package com.example.didact.u3_edittext_ejerregistro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etNombre, etApellidos, etEdad;
    RadioGroup rgSexo;
    Spinner spProvincia;
    CheckBox cbEstudiante;
    TextView tvResultado;



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
        tvResultado=(TextView) findViewById(R.id.tvResultado);

        //Contenido Spinner
        String [] provincias = {"Selecciona","Cadiz","Sevilla","Huelva","Málaga","Córdoba","Granada",
                "Jaén","Almería"};
        ArrayAdapter<String> adaptador= new ArrayAdapter<String>(this,
                android.R.layout.simple_expandable_list_item_1, provincias);
        spProvincia.setAdapter(adaptador);


    }//FIN onCreate

    //Boton
    public void clickVer (View view){
        //Declarar EditTet
        String nombre = etNombre.getText().toString();
        String apellidos = etApellidos.getText().toString();
        String edad = etEdad.getText().toString();

        //Declarar Radio Group
        int id = rgSexo.getCheckedRadioButtonId();
        RadioButton rbSeleccionado = (RadioButton)findViewById(id);
        String sexo = ( rbSeleccionado == null ? "" : rbSeleccionado.getText().toString() );

        /* String sexo = "";
        int id = rgSexo.getCheckedRadioButtonId();
        if ( id != -1 ) {
            RadioButton rbSeleccionado = (RadioButton)findViewById(id);
            sexo = rbSeleccionado.getText().toString();
        } */

        // Código Try Catch //
        /*int id = rgSexo.getCheckedRadioButtonId();
        RadioButton rbSeleccionado = (RadioButton)findViewById(id);
        try{
            String textoRBSeleccionado = rbSeleccionado.getText().toString();
        } catch ( Exception e ) {
            String textoRBSeleccionado = "";
        }*/
        // ---------------- //


        //Declarar spinner
        String provinciaSeleccionada= spProvincia.getSelectedItem().toString();


        //Declarar CheckBox

        boolean estaChequeado = false; //Por defecto no hay nada chequeado
        String estudiante = "";

        if (cbEstudiante.isChecked()){
            estudiante+=cbEstudiante.getText().toString();
            estaChequeado=true;
        }

        if (
             nombre.equals("") ||
             apellidos.equals("") ||
             sexo.equals("") ||
             provinciaSeleccionada.equals("Selecciona")
            ){ // No se cumple algunas de las validaciones

            Toast.makeText(getApplicationContext(),"Debes indicar los campos obligatorios *",
                    Toast.LENGTH_LONG).show();

        } else { // Pasa todas las validaciones
                 tvResultado.setText(
                                 "Nombre: " + nombre +
                                 "\nApellidos: " + apellidos +
                                 "\nEdad: " + edad +
                                 "\nProvincia: " + provinciaSeleccionada +
                                 "\nEstudiante: " + ( cbEstudiante.isChecked() ? "Si" : "No" )
                 );
        }






    }//FIN del Boton
}//FIN MainActivity
