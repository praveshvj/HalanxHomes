package pravesh.jaipur.bit.halanx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Objects;

public class Filter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        Intent intent = getIntent();
        Bundle args = intent.getBundleExtra("BUNDLE");
        ArrayList<SingleItem> singleItems = (ArrayList<SingleItem>) args.getSerializable("ARRAYLIST");

    }
}
