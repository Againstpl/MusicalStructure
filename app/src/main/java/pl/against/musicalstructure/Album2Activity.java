package pl.against.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Album2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album2);

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Pink Floyd", "Shine on You Crazy Diamond", "Wish you were here"));
        songs.add(new Song("Pink Floyd", "Wish You Were Here", "Wish You Were Here"));


        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = findViewById(R.id.listview);

        listView.setAdapter(adapter);

    }
}

