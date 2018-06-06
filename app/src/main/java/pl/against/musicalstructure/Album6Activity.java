package pl.against.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Album6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album6);

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Keny Arkana", "La Rage", "Entre ciment et belle étoile "));
        songs.add(new Song("Keny Arkana", "La Mère Des Enfants Perdus", "Entre ciment et belle étoile "));


        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = findViewById(R.id.listview);

        listView.setAdapter(adapter);

    }
}

