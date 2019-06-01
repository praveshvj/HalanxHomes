package pravesh.jaipur.bit.halanx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
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


        SingleItem singleItem1 = new SingleItem(R.drawable.downloadb, "full", "villa", "private", "girls", 2, 28, 108, 5, 5000);
        SingleItem singleItem2 = new SingleItem(R.drawable.downloadc, "semi", "apartment", "flat", "boys", 1, 26, 208, 7, 1000);
        SingleItem singleItem3 = new SingleItem(R.drawable.downloadd, "semi", "bunglow", "shared", "girls,family", 3, 78, 98, 2, 7000);
        SingleItem singleItem4 = new SingleItem(R.drawable.downloade, "full", "apartment", "private", "boys,girls,family", 2, 30, 46, 5, 8000);
        SingleItem singleItem5 = new SingleItem(R.drawable.downloade, "full", "villa", "shared", "girls,boys", 1, 46, 76, 2, 5000);
        SingleItem singleItem6 = new SingleItem(R.drawable.download, "semi", "apartment", "shared", "girls", 1, 45, 14, 2, 10000);

        arrayList.add(singleItem1);
        arrayList.add(singleItem2);
        arrayList.add(singleItem3);
        arrayList.add(singleItem4);
        arrayList.add(singleItem5);
        arrayList.add(singleItem6);
        myAdapter = new MyAdapter(this, arrayList);
        listView.setAdapter(myAdapter);
        setListner();
    }

    private void setListner() {
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                SingleItem singleItem6=arrayList.get(position);
                CustomDialogClass cdd=new CustomDialogClass(Home.this,singleItem6);
                cdd.show();
            }
        });
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
                                    setListner();
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
                                    setListner();
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
                            setListner();
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
                            setListner();
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
