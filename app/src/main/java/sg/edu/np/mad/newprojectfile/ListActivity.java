package sg.edu.np.mad.newprojectfile;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ImageView picture = findViewById(R.id.picture);
        TextView textview4 = findViewById(R.id.textView4);
        picture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder qiren =new AlertDialog.Builder(ListActivity.this);
                qiren.setTitle("Profile");
                qiren.setMessage("Madness");
                qiren.setNegativeButton("close", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                qiren.setPositiveButton("View", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Random rand = new Random();
                        int selected = rand.nextInt(1000000000);

                        Intent next = new Intent(ListActivity.this,MainActivity.class);
                        next.putExtra("randval",selected);
                        startActivity(next);
                    }
                });
                qiren.show();
            }
        });

    }
}