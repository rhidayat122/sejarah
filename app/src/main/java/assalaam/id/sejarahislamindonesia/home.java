package assalaam.id.sejarahislamindonesia;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class home extends Activity implements
        View.OnClickListener {
    Button keluar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        keluar = (Button) findViewById(R.id.exitBtn);
        keluar.setOnClickListener(this);
    }
        public void onClick(View clicked) {
        switch (clicked.getId()) {
            case R.id.exitBtn:
                exit();
                break;
        }
    }

    private void exit() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Apakah Kamu Benar-benar ingin keluar ?")
                .setCancelable(false)
                .setPositiveButton("Ya", new
                        DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int id) {
                                home.this.finish();
                            }
                        })
                .setNegativeButton("Tidak", new
                        DialogInterface.OnClickListener(){
                            @Override
                            public void onClick(DialogInterface dialog,
                                                int arg1) {
                                //TODO Auto-generated method stub
                                dialog.cancel();
                            }
                        }).show();


        Button call = (Button) findViewById(R.id.sejarah);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View RadioButton) {
                Intent myIntent = new
                        Intent(RadioButton.getContext(), sejarah.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button call2 = (Button) findViewById(R.id.walisongo);
        call2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View RadioButton) {
                Intent myIntent = new
                        Intent(RadioButton.getContext(), walisongo.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button call3 = (Button) findViewById(R.id.kerajaan);
        call3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View RadioButton) {
                Intent myIntent = new
                        Intent(RadioButton.getContext(), kerajaan.class);
                startActivityForResult(myIntent, 0);

            }
        });

    }
}
