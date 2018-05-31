package pl.against.musicalstructure;

import android.content.Context;

public class Song {



        // String value
        private String mArtist;

        // Text color of the text
        private String mTitle;

        private String mAlbum;

        // Context of the app
        private Context mContext;

        /**
         * Constructs a new TextView with initial values for text and text color.
         */
        public Song(String Artist, String Title, String Album) {
            mArtist = Artist;
            mTitle = Title;
            mAlbum = Album;
        }


        /**
         * Gets the string value in the TextView.
         *
         * @return current text in the TextView.
         */
        public String getArtist() {
            return mArtist;
        }

        /**
         * Gets the text color of the TextView.
         *
         * @return current text color.
         */
        public String getTitle() {
            return mTitle;
        }

        public String getAlbum() {
        return mAlbum;
    }
    }

