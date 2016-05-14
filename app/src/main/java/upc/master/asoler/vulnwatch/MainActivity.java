package upc.master.asoler.vulnwatch;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import android.content.Intent;
import android.widget.EditText;
import android.view.View;



public class MainActivity extends Activity {

    EditText passwdEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        passwdEditText = (EditText) this.findViewById(R.id.passwdEditText);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void login(View v) {
        String password = "Sup3rS3cret!";
        if(checkPasswd(passwdEditText.getText().toString(), password)) {
            Toast.makeText(getApplicationContext(), "Congratulations! You have been hooked!", Toast.LENGTH_LONG).show();
            startActivity(new Intent(getApplicationContext(), CompleteActivity.class));
            finish();
        } else {
            Toast.makeText(getApplicationContext(), "Wrong! Try Harder!", Toast.LENGTH_LONG).show();
        }
    }


    public boolean checkPasswd(String user_passwd,  String actual_password) {
        if (user_passwd.equals(actual_password)) {
            return true;
        } else {
            return false;
        }
    }
}
