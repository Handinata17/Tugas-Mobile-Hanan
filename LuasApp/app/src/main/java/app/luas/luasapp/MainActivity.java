package app.luas.luasapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edSisi;
    Button btHitung;
    TextView tvHasil;
    Spinner spPilihan;
    String[] pilihan = {"Volume", "Keliling", "Luas Permukaan"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edSisi = findViewById(R.id.etSisi);
        btHitung = findViewById(R.id.btnHitung);
        tvHasil = findViewById(R.id.hasil);
        spPilihan = findViewById(R.id.spinnerpilihan);

        btHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (spPilihan.getSelectedItem().toString().equals(pilihan[0])) {
                    rumusVolume();
                } else if (spPilihan.getSelectedItem().toString().equals(pilihan[1])) {
                    Double sisi = Double.valueOf(edSisi.getText().toString());
                    rumusKeliling(sisi);
                } else if (spPilihan.getSelectedItem().toString().equals(pilihan[2])) {
                    Double hasil = rumusLuas();
                    tvHasil.setText(hasil.toString());
                }
            }
        });

        // data spinner
        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, R.layout.support_simple_spinner_dropdown_item, pilihan);
        spPilihan.setAdapter(adapter);
    }

    private Double rumusLuas() {
        Double sisi = Double.valueOf(edSisi.getText().toString());
        Double hasil = 12 * sisi;
        return hasil;
    }

    private void rumusKeliling(Double sisi) {
        Double hasil = 6 * sisi;
        tvHasil.setText(hasil.toString());
    }

    private void rumusVolume() {
        Double sisi = Double.valueOf(edSisi.getText().toString());
        Double hasil = sisi * sisi * sisi;
        tvHasil.setText(hasil.toString());
    }
}
