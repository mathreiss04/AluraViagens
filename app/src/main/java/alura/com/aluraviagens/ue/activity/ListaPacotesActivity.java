package alura.com.aluraviagens.ue.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

import alura.com.aluraviagens.R;
import alura.com.aluraviagens.ue.adapter.ListaPacotesAdapter;
import alura.com.aluraviagens.ue.dao.PacoteDAO;
import alura.com.aluraviagens.ue.model.Pacote;

public class ListaPacotesActivity extends AppCompatActivity {

    public static final String TITULO_APPBAR = "Pacotes";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_pacotes);

        setTitle(TITULO_APPBAR);
        configuraLista();
    }

    private void configuraLista() {
        ListView listaDepacotes = findViewById(R.id.lista_pacotes_listview);
        List<Pacote> pacotes = new PacoteDAO().lista();
        listaDepacotes.setAdapter(new ListaPacotesAdapter(pacotes, this));
    }
}
