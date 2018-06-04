package pl.against.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import java.util.ArrayList;

public class Album1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album1);

    ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song ("Metallica", "Enter Sandman", "Metallica"));
        songs.add(new Song("Metallica", "Nothing Else Matters", "Metallica"));


    SongAdapter adapter = new SongAdapter(this, songs);

        GridView gridView = findViewById(R.id.gridview);

        gridView.setAdapter(adapter);

    }
}

