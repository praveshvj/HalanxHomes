package pravesh.jaipur.bit.halanx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Collections.*;
import java.util.Comparator;

import static java.util.Collections.sort;


public class Home extends AppCompatActivity {
    ListView listView;
    ArrayList<SingleItem> arrayList;
    MyAdapter myAdapter;
    int p = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        listView = findViewById(R.id.listview);
        arrayList = new ArrayList<>();

        SingleItem singleItem = new SingleItem();
        singleItem.setRent(4999);
        singleItem.setImage(R.drawable.download);
        singleItem.setBhk_count(1);
        singleItem.setRadius(4);
        singleItem.setGetAccomodation_allowed("girls");

        SingleItem singleItem1 = new SingleItem(R.drawable.downloadb, "full", "villa", "private", "girls", 2, 00, 00, 5, 5000);
        SingleItem singleItem2 = new SingleItem(R.drawable.downloadc, "semi", "apartment", "flat", "boys", 1, 00, 00, 7, 1000);
        SingleItem singleItem3 = new SingleItem(R.drawable.downloadd, "semi", "bunglow", "shared", "girls,", 3, 00, 00, 2, 7000);
        SingleItem singleItem4 = new SingleItem(R.drawable.downloade, "full", "apartment", "private", "boys", 2, 00, 00, 5, 8000);
        SingleItem singleItem5 = new SingleItem(R.drawable.downloade, "full", "villa", "shared", "girls", 1, 00, 00, 2, 5000);

        arrayList.add(singleItem);
        arrayList.add(singleItem1);
        arrayList.add(singleItem2);
        arrayList.add(singleItem3);
        arrayList.add(singleItem4);
        arrayList.add(singleItem5);
        myAdapter = new MyAdapter(this, arrayList);
        listView.setAdapter(myAdapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.filter:
                return true;
                case R.id.rent:
                        return true;
                        case R.id.min:
                            Collections.sort(arrayList, new Comparator<SingleItem>()
                            {
                                @Override
                                public int compare(SingleItem lhs, SingleItem rhs) {
                                    myAdapter=new MyAdapter(Home.this,arrayList);
                                    listView.setAdapter(myAdapter);
                                    return Integer.compare(lhs.getRent(), rhs.getRent());
                                }
                            });
                        return true;
                        case R.id.high:
                            Collections.sort(arrayList, new Comparator<SingleItem>()
                            {
                                @Override
                                public int compare(SingleItem lhs, SingleItem rhs) {
                                    myAdapter=new MyAdapter(Home.this,arrayList);
                                    listView.setAdapter(myAdapter);
                                    return Integer.compare(rhs.getRent(), lhs.getRent());
                                }
                            });
                        return true;
                case R.id.bhk:
                    Collections.sort(arrayList, new Comparator<SingleItem>()
                    {
                        @Override
                        public int compare(SingleItem lhs, SingleItem rhs) {
                            myAdapter=new MyAdapter(Home.this,arrayList);
                            listView.setAdapter(myAdapter);
                            return Integer.compare(lhs.getBhk_count(), rhs.getBhk_count());
                        }
                    });
                        return true;
                case R.id.radius:
                    Collections.sort(arrayList, new Comparator<SingleItem>()
                    {
                        @Override
                        public int compare(SingleItem lhs, SingleItem rhs) {
                            myAdapter=new MyAdapter(Home.this,arrayList);
                            listView.setAdapter(myAdapter);
                            return Integer.compare(lhs.getRadius(), rhs.getRadius());
                        }
                    });
                        return true;
            case R.id.share:
                Toast.makeText(this, "SHARE SELECTED", Toast.LENGTH_LONG).show();
                return true;
                case R.id.about:
                Toast.makeText(this, "About us", Toast.LENGTH_LONG).show();
                return true;
            case R.id.logout:
                Toast.makeText(this, "Logout SELECTED", Toast.LENGTH_LONG).show();
                Intent intent2 = new Intent(this, MainActivity.class);
                startActivity(intent2);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }


    }
}
