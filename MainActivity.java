package com.example.agendacontacto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String PREF_FILE_NAME = "contact_data";
    private EditText editText1;
    private TextView textView;
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editText1);
        textView = findViewById(R.id.textView);
        sharedPreferences = getSharedPreferences(PREF_FILE_NAME, Context.MODE_PRIVATE);

        Button button = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String contactData = editText1.getText().toString();
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("contact", contactData);
                editor.apply();
                editText1.getText().clear();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String storedContact = sharedPreferences.getString("contact", "");
                if (storedContact.isEmpty()) {
                    textView.setText("No se encontró ningún registro.");
                } else {
                    textView.setText("Datos de contacto:\n" + storedContact);
                }
            }
        });
    }
}
