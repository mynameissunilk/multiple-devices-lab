package sunil.multipledeviceslab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    ImageView imgv;
    Button mb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView)findViewById(R.id.labtextview);
        imgv = (ImageView)findViewById(R.id.labicon);
        mb = (Button)findViewById(R.id.labbutton);

        mb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(R.string.button_text_clicked);
                imgv.setImageResource(R.drawable.ic_insert_emoticon_black_24dp);
                imgv.setBackgroundResource(R.drawable.ic_insert_emoticon_black_24dp);
            }
        });
    }
}
