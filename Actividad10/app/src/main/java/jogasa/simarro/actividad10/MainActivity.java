package jogasa.simarro.actividad10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView lista;
    MiArrayAdapter<Comida> adaptador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Instancia del ListView
        lista = (ListView)findViewById(R.id.lista);
        //Inicializar el adaptador con la fuente de datos
        adaptador = new MiArrayAdapter<Comida>(this, DatosComida.TAREAS);
        //Relacionando la lista con el adaptador
        lista.setAdapter(adaptador);
        lista.setOnItemClickListener(this);
    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Comida comida =(Comida)adaptador.getItem(position);
        String msg="Comida elegida: \n"+ comida.getNombre()+"-"+ comida.getDescripcion();
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}