package app.afg.movies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //https://run.mocky.io/v3/d921465b-b870-4ce3-b2a5-17a4b7621f96
    private static String JSON_URL = "https://run.mocky.io/v3/d921465b-b870-4ce3-b2a5-17a4b7621f96";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "first commit", Toast.LENGTH_SHORT).show();
    }
}