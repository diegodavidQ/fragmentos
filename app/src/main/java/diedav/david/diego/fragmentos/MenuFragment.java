package diedav.david.diego.fragmentos;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class MenuFragment extends Fragment {

    private final int [] BOTONESMENU = {R.id.venecia,R.id.florencia,R.id.coliseo};



    public MenuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View mimenu = inflater.inflate(R.layout.fragment_menu, container, false);

        ImageButton botonmenu;

        for(int i=0; i<BOTONESMENU.length;i++){
            botonmenu=(ImageButton)mimenu.findViewById(BOTONESMENU[i]);
            final int queBoton=i;

            botonmenu.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View view) {

                    Activity actividadActual = getActivity();

                    ((ComunicacionMenu) actividadActual).menu(queBoton);
                }
            });
        }



        return mimenu;
    }

}
