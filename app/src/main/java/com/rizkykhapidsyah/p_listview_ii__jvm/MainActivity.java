package com.rizkykhapidsyah.p_listview_ii__jvm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView LV_ListView_IDJAVA;

    String List[] = {
            "Merisya Haldin",
            "Adisti Ariyani Hasibuan",
            "Fachruni Inna",
            "Rizky Khapidsyah",
            "Dessy Puspita Sari",
            "Tri Setiawati",
            "Ghia Ghiaty",
            "Mesem Rini",
            "Hana Zulfina"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LV_ListView_IDJAVA = findViewById(R.id.LV_ListView_IDXML);

        final ArrayList<String> NamaMurid = new ArrayList<>();
        for (int X = 0; X <= 8; X++) {
            NamaMurid.add(List[X]);
        }

        ArrayAdapter<String> Pencocok = new ArrayAdapter<String>(
                this,
                R.layout.support_simple_spinner_dropdown_item,
                NamaMurid);

        LV_ListView_IDJAVA.setAdapter(Pencocok);

        LV_ListView_IDJAVA.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),
                        "Anda Memijit Nama : " + NamaMurid.get(position),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
