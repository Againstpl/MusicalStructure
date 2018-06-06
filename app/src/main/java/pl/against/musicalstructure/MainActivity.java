package pl.against.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView album1 = findViewById(R.id.album1);

        album1.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent album1Intent = new Intent(MainActivity.this, Album1Activity.class);
                startActivity(album1Intent);
            }
        });


        ImageView album2 = findViewById(R.id.album2);

        album2.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent album2Intent = new Intent(MainActivity.this, Album2Activity.class);
                startActivity(album2Intent);

            }
        });


        ImageView album3 = findViewById(R.id.album3);

        album3.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent album3Intent = new Intent(MainActivity.this, Album3Activity.class);
                startActivity(album3Intent);
            }
        });


        ImageView album4 = findViewById(R.id.album4);

        album4.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent album4Intent = new Intent(MainActivity.this, Album4Activity.class);
                startActivity(album4Intent);
            }
        });


        ImageView album5 = findViewById(R.id.album5);

        album5.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent album5Intent = new Intent(MainActivity.this, Album5Activity.class);
                startActivity(album5Intent);

            }
        });


        ImageView album6 = findViewById(R.id.album6);

        album6.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent album6Intent = new Intent(MainActivity.this, Album6Activity.class);
                startActivity(album6Intent);


            }

        });
    }

}




