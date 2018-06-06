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
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Song currentSong = getItem(position);

        TextView artistTextView = listItemView.findViewById(R.id.artist_text_view);

        artistTextView.setText(currentSong.getArtist());

        TextView titleTextView = listItemView.findViewById(R.id.title_text_view);

        titleTextView.setText(currentSong.getTitle());

        TextView albumTextView = listItemView.findViewById(R.id.album_text_view);

        albumTextView.setText(currentSong.getAlbum());

        return listItemView;

    }

}
