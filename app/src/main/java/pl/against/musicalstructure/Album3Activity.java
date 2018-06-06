package pl.against.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Album3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album3);

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Massive Attack", "Angel", "Mezzanine"));
        songs.add(new Song("Massive Attack", "Teardrop", "Mezzanine"));


        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = findViewById(R.id.listview);

        listView.setAdapter(adapter);

    }
}

