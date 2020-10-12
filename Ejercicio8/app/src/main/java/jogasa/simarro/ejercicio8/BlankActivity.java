package jogasa.simarro.ejercicio8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class BlankActivity extends AppCompatActivity {
    private TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blank);
        texto=(TextView)findViewById(R.id.textView);
        String mensaje=this.getIntent().getStringExtra("TEXTO");
        texto.setText(mensaje);
    }
}