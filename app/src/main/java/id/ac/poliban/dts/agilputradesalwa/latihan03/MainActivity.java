package id.ac.poliban.dts.agilputradesalwa.latihan03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //kenalkan view ke object di source kode kita
        EditText etUserName = findViewById(R.id.etUserName);
        EditText etPassword = findViewById(R.id.etPassword);
        Button btClear = findViewById(R.id.btClear);
        Button btLogin = findViewById(R.id.btLogin);

        btClear.setOnClickListener(v -> {
            //mengosongkan edit text
            etUserName.setText("");
            etPassword.setText("");
            //meletakan kursor di etusername
            etUserName.requestFocus();
        } );
        btLogin.setOnClickListener(v ->{
            etUserName.setText("");
            etPassword.setText("");
            etUserName.requestFocus();
            Toast.makeText(this, "you have logged", Toast.LENGTH_SHORT).show();
        });
    }
}