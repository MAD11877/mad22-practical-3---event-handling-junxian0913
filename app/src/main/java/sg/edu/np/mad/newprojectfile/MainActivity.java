package sg.edu.np.mad.newprojectfile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent next = getIntent();
        int v = next.getIntExtra("randval",0);
        TextView textview = findViewById(R.id.textView4);
        user chengann = new user();
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent owen = new Intent(MainActivity.this, MessageGroup.class);
                startActivity(owen);
            }
        });
        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chengann.followed = !chengann.followed;

                if(chengann.followed){
                    btn.setText("unfollow");
                    Toast.makeText(getApplicationContext(),"unfollow",Toast.LENGTH_LONG).show();

                }
                else{
                    btn.setText("follow");
                    Toast.makeText(MainActivity.this, "follow",Toast.LENGTH_LONG).show();
                }
            }
        });

        textview.setText("MAD "+ v);

    }
}