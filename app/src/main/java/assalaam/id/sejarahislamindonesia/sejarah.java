package assalaam.id.sejarahislamindonesia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sejarah extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sejarah);

        Button call = (Button) findViewById(R.id.proses);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View RadioButton) {
                Intent myIntent = new
                        Intent(RadioButton.getContext(), prose.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button co = (Button) findViewById(R.id.tahapan);
        co.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View RadioButton) {
                Intent myIntent = new
                        Intent(RadioButton.getContext(), tahap.class);
                startActivityForResult(myIntent, 0);

            }
        });
    }
}