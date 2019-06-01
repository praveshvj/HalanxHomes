package pravesh.jaipur.bit.halanx;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import pravesh.jaipur.bit.halanx.R;

public class CustomDialogClass extends Dialog implements
        android.view.View.OnClickListener {

    private final SingleItem singleItem;
    public Activity c;
    public Dialog d;
    TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9,tv10,tv11,tv12,tv13,tv14,tv15,tv16;
    ImageView imageView;
    CustomDialogClass(Activity a, SingleItem singleItem) {
        super(a);
        // TODO Auto-generated constructor stub
        this.c = a;
        this.singleItem=singleItem;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.custom_dialog);
        init();
        setValues();
    }

    private void setValues() {
        imageView.setImageResource(singleItem.getImage());
        tv2.setText(singleItem.getFurnish_type());
        tv4.setText(singleItem.getHouse_type());
        tv6.setText(singleItem.getGetAccomodation_allowed());
        tv8.setText(singleItem.getBhk_count()+"");
        tv10.setText(singleItem.getAccomodation_type());
        tv12.setText(singleItem.getLatitude()+"");
        tv14.setText(singleItem.getLongitude()+"");
        tv16.setText(singleItem.getRadius()+"");
    }

    private void init() {
        imageView=findViewById(R.id.myimageD);
        tv1=findViewById(R.id.tv1);
    tv2=findViewById(R.id.tv2);
    tv3=findViewById(R.id.tv3);
    tv4=findViewById(R.id.tv4);
    tv6=findViewById(R.id.tv6);
    tv8=findViewById(R.id.tv8);
    tv10=findViewById(R.id.tv10);
    tv12=findViewById(R.id.tv12);
    tv14=findViewById(R.id.tv14);
    tv16=findViewById(R.id.tv16);
    tv1=findViewById(R.id.tv1);
    tv1=findViewById(R.id.tv1);
    tv1=findViewById(R.id.tv1);
    tv1=findViewById(R.id.tv1);
    tv1=findViewById(R.id.tv1);
    tv1=findViewById(R.id.tv1);
    }

    @Override
    public void onClick(View v) {
        dismiss();
    }
}