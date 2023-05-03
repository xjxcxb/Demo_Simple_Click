package sg.edu.rp.c346.id22001027.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    //step 1, find ID
    //step 2, creating object for ui element
    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton tbtn;

    RadioGroup rgGender;




    @Override
    protected void onCreate(Bundle savedInstanc eState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tbtn = findViewById(R.id.toggleButtonEnabled);

        tvDisplay = findViewById(R.id.textViewDisplay);
        btnDisplay = findViewById(R.id.buttonDisplay);
        etInput = findViewById(R.id.editTextInput);

        //step 3, linking ui element with java object by id





        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        String stringResponse = etInput.getText().toString();
                        int checkedRadioId = rgGender.getCheckedRadioButtonId();
                        if (checkedRadioId == R.id.radioButtonGenderMale) {
                            // append "He says " to the string response
                            stringResponse = "He says " + stringResponse;
                        } else if (checkedRadioId == R.id.radioButtonGenderFemale) {
                            // append "She says " to the string response
                            stringResponse = "She says " + stringResponse;
                        }
                        tvDisplay.setText(stringResponse);
                    }
                });





        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tbtn.isChecked()) {
                    etInput.setEnabled(true);
                } else {
                    etInput.setEnabled(false);

                }
            }
        });

    }
}
