package br.com.unipac.uller;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.unipac.uller.model.domain.Atividade;
import br.com.unipac.uller.model.domain.Materia;
import br.com.unipac.uller.model.domain.Professor;
import br.com.unipac.uller.model.domain.TipoAtividade;


public class MainActivity extends ActionBarActivity {
    Button btnProfessor, btnMateria;
    ListView listaAtiviades;
    private ArrayAdapter<Atividade> mAdaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnProfessor = (Button) findViewById(R.id.btnProfessor);

        btnMateria = (Button) findViewById(R.id.btnMateria);

        listaAtiviades = (ListView) findViewById(R.id.listaAtiviades);

        TextView listatxtAtiviades = (TextView) findViewById(R.id.listaTextAtiviades);

        List<Atividade> atividades = new ArrayList<>();

        Professor professor = new Professor();
        professor.setNome("Nome professors");
        professor.setEmail("email@professors");
        professor.setTelefone("99999999");

        Materia materia = new Materia();
        materia.setProfessor(professor);
        materia.setDescricao("Dispositivos Moveis");

        Atividade atividade = new Atividade();
        atividade.setMateria(materia);
        atividade.setTipoAtividade(TipoAtividade.TRABALHO.getTipoAtividade());
        atividade.setDataEntrega(new Date());
        atividade.setDescricao("escopo da app de entrega");

        atividades.add(atividade);

        Atividade atividade2 = new Atividade();
        atividade2.setMateria(materia);
        atividade2.setTipoAtividade(TipoAtividade.A2.getTipoAtividade());
        atividade2.setDataEntrega(new Date());
        atividade2.setDescricao("Compnentes");

        atividades.add(atividade2);

        Atividade atividade3 = new Atividade();
        atividade3.setMateria(materia);
        atividade3.setTipoAtividade(TipoAtividade.A3.getTipoAtividade());
        atividade3.setDataEntrega(new Date());
        atividade3.setDescricao("Google Service");

        atividades.add(atividade3);

        mAdaptador = new ArrayAdapter<Atividade>(this,android.R.layout.simple_list_item_1, atividades);

        listaAtiviades.setAdapter(mAdaptador);

        for(Atividade at: atividades) {
            listatxtAtiviades.setText("DEscricao" + at.getDescricao() + "\n" + "DataEntrega" + at.getDataEntrega());
        }

        btnProfessor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ProfessorActivity.class);
                startActivity(i);
            }
        });

        btnMateria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MateriaActivity.class);
                startActivity(i);
            }
        });
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
}
