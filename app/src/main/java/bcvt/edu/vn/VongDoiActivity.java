package bcvt.edu.vn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class VongDoiActivity extends AppCompatActivity {

    EditText txtThongTin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtThongTin = findViewById(R.id.txtThongTin);
        Log.d("test", "1. onCreate");
    }

    public void onStart(){
        super.onStart();
        Log.d("test", "2. onStart");
    }

    public void onResume(){
        super.onResume();
        Log.d("test", "3. onResume");
    }

    public void onPause(){
        super.onPause();
        Log.d("test", "4. onPause");
    }

    public void onStop(){
        super.onStop();
        Log.d("test", "5. Stop");
    }

    public void onDestroy(){
        super.onDestroy();
        Log.d("test", "6. Stop");
    }
}
