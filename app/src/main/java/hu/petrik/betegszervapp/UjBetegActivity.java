package hu.petrik.betegszervapp;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class UjBetegActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uj_beteg);

       final Button ujbeteg = findViewById(R.id.ujbeteg_gomb);
        ujbeteg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO: Komponensektől kérdezzük le a beszúrandó értékeketString id = "";/*    String nev = "";

                final EditText input1 = (EditText)findViewById(R.id.ujbeteg_nev);
                final String   nev   = input1.getText().toString();

                final EditText input2 = (EditText) findViewById(R.id.ujbeteg_taj);
                final String   taj   = input2.getText().toString();

                final Spinner mySpinner=(Spinner) findViewById(R.id.ujbeteg_szerv);
                final String szerv = mySpinner.getSelectedItem().toString();

                final EditText input4 = (EditText) findViewById(R.id.ujbeteg_tipus);
                final String   tipus   = input4.getText().toString();

              //   final String nev = "fgm";
              //   final String taj = "123";
               //  final String szerv = "glhffh";
               //  final String tipus = "lkllljk";



                // ...

                AsyncTask.execute(new Runnable() {
                    @Override
                    public void run() {
                        DbHelper helper = DbHelper.getInstance(UjBetegActivity.this);
                        SQLiteDatabase db = helper.getWritableDatabase();

                        // TODO: Adatbázisba szúrjuk

                        ContentValues beteg = new ContentValues();
                        beteg.put("nev", nev);
                        beteg.put("taj", taj);
                        beteg.put("szerv", szerv);
                        beteg.put("tipus", tipus);
                        beteg.putNull("szerv_id");
                        long betegId = db.insert("beteg", null, beteg);




                        db.close();
                        UjBetegActivity.this.finish();
                    }
                });
            }
        });
    }
}
