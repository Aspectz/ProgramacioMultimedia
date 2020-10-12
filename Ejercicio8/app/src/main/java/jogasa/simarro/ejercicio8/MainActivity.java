package jogasa.simarro.ejercicio8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClickDashBoard(View v){
        Toast.makeText(this, getResources().getResourceEntryName(v.getId()).toString(), Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this, BlankActivity.class);
        switch (v.getId()){
            case R.id.anadir:
                intent.putExtra("TEXTO","Anadir");
                break;
            case R.id.borrar:
                intent.putExtra("TEXTO","Borrar");
                break;
            case R.id.camara:
                intent.putExtra("TEXTO","Camara");
                break;
            case R.id.galeria:
                intent.putExtra("TEXTO","Galeria");
                break;
            case R.id.guardar:
                intent.putExtra("TEXTO","Guardar");
                break;
            case R.id.enviar:
                intent.putExtra("TEXTO","Enviar");
                break;
        }
        startActivity(intent);
    }
}