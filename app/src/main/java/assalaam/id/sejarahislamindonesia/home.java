package assalaam.id.sejarahislamindonesia;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button call = (Button) findViewById(R.id.sejarah);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View RadioButton) {
                Intent myIntent = new
                        Intent(RadioButton.getContext(), sejarah.class);
                startActivityForResult(myIntent, 0);

            }
        });

    }
}
