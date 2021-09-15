package org.aplas.basicappx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Spinner;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private Distance dist = new Distance();
    private Weight weight = new Weight();
    private Temperature temp = new Temperature();
    private Button convertBtn;
    private EditText inputTxt;
    private EditText outputTxt;
    private Spinner unitOri;
    private Spinner unitConv;
    private RadioGroup unitType;
    private CheckBox roundBox;
    private CheckBox formBox;
    private ImageView imgView;

    protected double convertUnit(String type, String oriUnit, String convUnit, double value) {
        switch (type) {
            case "Temperature":
                value = temp.convert(oriUnit, convUnit, value);
                break;
            case "Distance":
                value = dist.convert(oriUnit, convUnit, value);
                break;
            case "Weight":
                value =weight.convert(oriUnit, convUnit, value);
                break;
        }
        return value;
    }

    protected String strResult(double val, boolean rounded){
        String value;
        if (rounded) {
            DecimalFormat f = new DecimalFormat("#.##");
            value = String.valueOf(f.format(val));
        } else {
            DecimalFormat f = new DecimalFormat("#.#####");
            value = String.valueOf(f.format(val));
        }
        return value;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}