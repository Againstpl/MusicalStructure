package pl.against.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Album4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album4);

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Florence and the Machine", "You've Got the Love", "Lungs"));
        songs.add(new Song("Florence and the Machine", "I'm Not Calling You a Liar", "Lungs"));


        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = findViewById(R.id.listview);

        listView.setAdapter(adapter);

    }
}

