package jogasa.simarro.actividad10;

import java.util.ArrayList;
import java.util.List;

public class DatosComida {
    static List TAREAS = new ArrayList<Comida>();
    static{
        TAREAS.add(new Comida("Pizza","Spicy Chicken Pizza",300,R.drawable.burguer1));
        TAREAS.add(new Comida("Macarrones","Con Quesico",10,R.drawable.macarronicos));
        TAREAS.add(new Comida("Manguito","Maracaton",2,R.drawable.mango));
        TAREAS.add(new Comida("Pizza","Barbacoa",10,R.drawable.pizza));
        TAREAS.add(new Comida("Platano","De canarias",3,R.drawable.platanico));
    }
}
