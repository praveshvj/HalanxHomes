package pravesh.jaipur.bit.halanx;

import android.content.Intent;
import android.net.wifi.hotspot2.pps.HomeSp;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText nameET;
    EditText passET;
    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=nameET.getText().toString().trim();
                String pass=passET.getText().toString().trim();
                chk(name,pass);
            }
        });
    }

    private void chk(String name, String pass) {
        if(name.equals("test")&& pass.endsWith("test")){
            Intent intent=new Intent(this, Home.class);
            startActivity(intent);
        }else {
            Toast.makeText(this,"please register firest",Toast.LENGTH_LONG).show();
        }
    }

    private void init() {
        nameET=findViewById(R.id.nameET);
        passET=findViewById(R.id.passET);
        loginBtn=findViewById(R.id.loginBtn);
    }
}
