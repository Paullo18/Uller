package br.com.unipac.uller;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import br.com.unipac.uller.model.domain.Materia;
import br.com.unipac.uller.model.domain.Professor;


public class MateriaActivity extends ActionBarActivity {
    Spinner spProfessor;
    EditText edtMateria;
    Button btnSalvar;

    private ArrayAdapter<String> mAdaptador;

    private Materia materia;

    private static final String[] professores = new String[] {"Daniel","Thiago","Diego","Rogério"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materia);

        spProfessor = (Spinner) findViewById(R.id.spProfessor);
        edtMateria = (EditText) findViewById(R.id.edtMateria);
        btnSalvar = (Button) findViewById(R.id.btnSalvar);

        spProfessor.setOnItemSelectedListener(new CustomOnItemSelectedListener());

        mAdaptador = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, professores);

        spProfessor.setAdapter(mAdaptador);

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                materia = new Materia();
                Professor professor = new Professor();
                professor.setNome("daniel");
                materia.setProfessor(professor);
                materia.setDescricao(edtMateria.getText().toString());

                Toast.makeText(MateriaActivity.this, "Materia cadastrada\n" + materia.toString(), Toast.LENGTH_LONG).show();


            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_materia, menu);
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
