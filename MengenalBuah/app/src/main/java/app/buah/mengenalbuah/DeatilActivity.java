package app.buah.mengenalbuah;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DeatilActivity extends AppCompatActivity {

    TextView tvNamaBuah;
    ImageView ivGambarBuah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deatil);

        String namabuah = getIntent().getStringExtra("DATANAMA");
        int gambarbuah = getIntent().getIntExtra("DATAGAMBAR", 0);

        tvNamaBuah = findViewById(R.id.textDetailGambar);
        ivGambarBuah = findViewById(R.id.detailgambar);

        tvNamaBuah.setText(namabuah);
        ivGambarBuah.setImageResource(gambarbuah);

    }
}
