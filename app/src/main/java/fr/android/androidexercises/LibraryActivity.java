package fr.android.androidexercises;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class LibraryActivity extends AppCompatActivity {
    private ImageView downloadedImageView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);
        downloadedImageView = (ImageView) findViewById(R.id.downloadImageView);

        // TODO Get image view and load image form URL
        // http://img3.wikia.nocookie.net/__cb20120317101541/harrypotter/images/3/37/Gryffindor_Crest.jpg
        Glide.with(this)
                .load("http://www.pokepedia.fr/images/thumb/0/06/Bazoucan-SL.png/175px-Bazoucan-SL.png")
                .centerCrop()
                .into(downloadedImageView);

    }

}
