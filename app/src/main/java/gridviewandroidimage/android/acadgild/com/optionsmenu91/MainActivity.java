package gridviewandroidimage.android.acadgild.com.optionsmenu91;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            getSupportActionBar();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater M = getMenuInflater();
        M.inflate(R.menu.main, menu);



        //  getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        TextView tview = (TextView) findViewById(R.id.txtView);
        if (id == R.id.red) {
            tview.setBackgroundResource(R.color.colorRed);
            return true;
        }else if (id == R.id.green) {
            tview.setBackgroundResource(R.color.colorGreen);
            return true;
        }else if (id == R.id.blue) {
            tview.setBackgroundResource(R.color.colorBlue);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
