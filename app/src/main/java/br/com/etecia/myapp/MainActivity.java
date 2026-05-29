package br.com.etecia.myapp;

import android.content.Context;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Livro> lstLivros;
    RecyclerView idRecLivros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        idRecLivros = findViewById(R.id.idRecLivros);

        lstLivros = new ArrayList<>();

        lstLivros.add(new Livro("Revolução dos Bichos", "Educativo", R.drawable.revolucaodosbichos, 29.3));
        lstLivros.add(new Livro(" A Hora da Estrela", "Educativo", R.drawable.ahoradaestrela, 27.30));
        lstLivros.add(new Livro("A metamorforse", "Educativo", R.drawable.meta, 20.3));
        lstLivros.add(new Livro("Revolução dos Bichos", "Educativo", R.drawable.revolucaodosbichos, 29.3));
        lstLivros.add(new Livro("Revolução dos Bichos", "Educativo", R.drawable.revolucaodosbichos, 29.3));
        lstLivros.add(new Livro("Revolução dos Bichos", "Educativo", R.drawable.revolucaodosbichos, 29.3));
        lstLivros.add(new Livro("Revolução dos Bichos", "Educativo", R.drawable.revolucaodosbichos, 29.3));
        lstLivros.add(new Livro("Revolução dos Bichos", "Educativo", R.drawable.revolucaodosbichos, 29.3));
        lstLivros.add(new Livro("Revolução dos Bichos", "Educativo", R.drawable.revolucaodosbichos, 29.3));
        lstLivros.add(new Livro("Revolução dos Bichos", "Educativo", R.drawable.revolucaodosbichos, 29.3));

        AdapterLivros adapterLivros = new AdapterLivros(getApplicationContext(), lstLivros);

        idRecLivros.setAdapter(adapterLivros);

        idRecLivros.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
    }
}