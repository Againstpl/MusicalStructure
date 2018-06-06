package pl.against.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Album5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album5);

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("MØ", "Never Wanna Know", "No Mythologies to Follow"));
        songs.add(new Song("MØ", "Walk This Way", "No Mythologies to Follow"));


        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = findViewById(R.id.listview);

        listView.setAdapter(adapter);

    }
}

