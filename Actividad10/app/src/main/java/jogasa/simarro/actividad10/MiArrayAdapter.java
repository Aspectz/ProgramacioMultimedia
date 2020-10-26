package jogasa.simarro.actividad10;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MiArrayAdapter<T> extends ArrayAdapter {
    public MiArrayAdapter(Context context, List<T> objects) {
        super(context,0,objects);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        //Obteniendo una instancia del inflater
        LayoutInflater inflater = (LayoutInflater)getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //Salvando la referencia del View de la fila
        View listItemView = convertView;
        //Comprobando si el View no existe
        if (null == convertView) {
        //Si no existe, entonces inflarlo con image_list_view.xml
            listItemView = inflater.inflate(
                    R.layout.image_list_item,
                    parent,
                    false);
        }
        TextView nombre = (TextView)listItemView.findViewById(R.id.text1);
        TextView desc = (TextView)listItemView.findViewById(R.id.text2);
        TextView precio=(TextView)listItemView.findViewById(R.id.text3);
        ImageView imageView = (ImageView)listItemView.findViewById(R.id.category);

        //Obteniendo instancia de la Tarea en la posición actual
        Comida item = (Comida) getItem(position);
        nombre.setText(item.getNombre());
        desc.setText(item.getDescripcion());
        precio.setText(String.valueOf(item.getPrecio()));
        imageView.setImageResource(item.getCategoria());
        //Devolver al ListView la fila creada
        return listItemView;
}



}
