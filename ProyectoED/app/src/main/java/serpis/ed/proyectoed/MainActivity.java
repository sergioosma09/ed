package serpis.ed.proyectoed;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText numero;
    Button calcular;
    TextView resultado;
    AlertDialog.Builder dialogo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero = (EditText) findViewById(R.id.edtxtNumero);
        calcular = (Button) findViewById(R.id.btnCalcular);
        resultado = (TextView) findViewById(R.id.txtResultado);

        calcular.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (calcular.getText().toString().equals("Limpiar")) {
                    numero.setText("");
                    numero.setEnabled(true);
                    numero.requestFocus();
                    resultado.setText("");
                    calcular.setText("Calcular");
                } else {
                    if (numero.getText().length() == 0) {
                        dialogo = new AlertDialog.Builder(MainActivity.this);
                        dialogo.setTitle("Error");
                        dialogo.setMessage("Ingresar el número");
                        dialogo.setCancelable(false);
                        dialogo.setPositiveButton("Cerrar", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialogo, int id) {
                                dialogo.cancel();
                                numero.requestFocus();
                            }
                        });
                        dialogo.show();
                    } else {
                        int numero = Integer.parseInt(MainActivity.this.numero.getText().toString());
                        boolean flat = false;
                        for (int i = 2; i < numero; i++) {
                            if (numero % i == 0) {
                                flat = true;
                            }
                        }
                        if (flat) {
                            resultado.setText("El número " + numero + " no es primo");
                        } else {
                            resultado.setText("El número " + numero + " es primo");
                        }
                        calcular.setText("Limpiar");
                        MainActivity.this.numero.setEnabled(false);
                    }
                }
            }
        });
    }
}