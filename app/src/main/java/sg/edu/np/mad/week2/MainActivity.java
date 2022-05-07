package sg.edu.np.mad.week2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.net.FileNameMap;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User m = new User();
        Button btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                m.followed = !m.followed;

                if(m.followed ){
                    btn.setText("Unfollow");

                    Toast.makeText(getApplicationContext(), "Unfollow",Toast.LENGTH_LONG).show();


                }
                else{
                    btn.setText("Follow");

                    Toast.makeText(getApplicationContext(), "follow",Toast.LENGTH_LONG).show();

                }


            }
        });
    }




    }






