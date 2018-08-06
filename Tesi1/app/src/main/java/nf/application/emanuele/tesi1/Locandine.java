package nf.application.emanuele.tesi1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Locandine extends Activity implements View.OnClickListener {
    private ListView itemsListView;
    private  TextView titleTextView;
    class annunci {
        String name;
        String img;
    }

    @Override
    public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locandine);
        itemsListView = (ListView) findViewById(R.id.itemsListView);
        titleTextView = (TextView) findViewById(R.id.titleTextView);
        titleTextView.setText("Che magnifici Film!");
        Cinemas c = new Cinemas();
        ArrayList<annunci> films = new ArrayList<>();
        for (int i=0; i< c.cinemas.size(); i++){
            for (int j=0; j<c.cinemas.get(i).films.size(); j++){
                for (int k=0; k<films.size(); k++){
                    int controller=0;
                    if (films.get(k).name==c.cinemas.get(i).films.get(j).Titolo){
                        controller=1; break;
                    }
                    if (controller == 0){
                        annunci temp = new annunci();
                        temp.name = c.cinemas.get(i).films.get(j).Titolo;
                        temp.img = c.cinemas.get(i).films.get(j).immagine;
                        films.add(temp);
                    }
                }
            }
        }

        ArrayList<HashMap<String, String>> data = new ArrayList<>();
//trova ttutti i fillm
        for (annunci item: films){
            HashMap<String, String> map = new HashMap<>();
            map.put("img", item.img);
            map.put("title", item.name);
            data.add(map);
        }
        int resource = R.layout.items_listview;
        String[] from = {"img", "title"};
        int[] to = {R.id.imgLocandine, R.id.titleLocandine};
        SimpleAdapter adapter = new SimpleAdapter(this, data, resource, from, to);
        itemsListView.setAdapter(adapter);

    }

    public void onClick(View  view){

    }
}
