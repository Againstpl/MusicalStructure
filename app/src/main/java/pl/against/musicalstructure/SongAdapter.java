package pl.against.musicalstructure;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Activity context, ArrayList<Song> songs) {
        super(context, 0, songs);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)

    {
        View gridItemView = convertView;
        if (gridItemView == null) {
            gridItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Song currentSong = getItem(position);

        TextView artistTextView = gridItemView.findViewById(R.id.artist_text_view);

        artistTextView.setText(currentSong.getArtist());

        TextView titleTextView = gridItemView.findViewById(R.id.title_text_view);

        titleTextView.setText(currentSong.getTitle());

        TextView albumTextView = gridItemView.findViewById(R.id.album_text_view);

        albumTextView.setText(currentSong.getAlbum());

        return gridItemView;

    }

}
