package fireapp.com.fireapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.firebase.client.Firebase;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private Firebase mRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Firebase.setAndroidContext(this);

        mRef = new Firebase("https://fireapp-9c763.firebaseio.com/");
        btn = (Button) findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Firebase mRefChild = mRef.child("name1");
                mRefChild.setValue("Dindi");
            }
        });
    }
}
