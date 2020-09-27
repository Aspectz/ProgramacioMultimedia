package jogasa.simarro.calculadora;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private EditText et1,et2;
    private TextView tv3;
    private Button calcular;
    private RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        tv3=(TextView)findViewById(R.id.tv3);
        calcular=(Button)findViewById(R.id.calcular);
        radioGroup=(RadioGroup)findViewById((R.id.radiogroup));
        radioGroup.setOnCheckedChangeListener( new RadioGroup.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId){
                final RadioButton rb=(RadioButton)findViewById(checkedId);
            }
        });


    }



    public void sumar(View view){
        String valor1=et1.getText().toString();
        String valor2=et2.getText().toString();
        int n1=Integer.parseInt(valor1);
        int n2=Integer.parseInt(valor2);
        int suma=n1+n2;
        String res=String.valueOf(suma);
        tv3.setText(res);
    }
    public void restar(View view){
        String valor1=et1.getText().toString();
        String valor2=et2.getText().toString();
        int n1=Integer.parseInt(valor1);
        int n2=Integer.parseInt(valor2);
        int resta=n1-n2;
        String res=String.valueOf(resta);
        tv3.setText(res);
    }
    public void multiplicar(View view){
        String valor1=et1.getText().toString();
        String valor2=et2.getText().toString();
        int n1=Integer.parseInt(valor1);
        int n2=Integer.parseInt(valor2);
        int multiplicacion=n1*n2;
        String res=String.valueOf(multiplicacion);
        tv3.setText(res);
    }
    public void dividir(View view){
        String valor1=et1.getText().toString();
        String valor2=et2.getText().toString();
        int n1=Integer.parseInt(valor1);
        int n2=Integer.parseInt(valor2);
        int division=n1/n2;
        String res=String.valueOf(division);
        tv3.setText(res);
    }
}