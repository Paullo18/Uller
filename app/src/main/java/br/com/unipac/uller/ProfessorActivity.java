package br.com.unipac.uller;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import br.com.unipac.uller.model.domain.Professor;


public class ProfessorActivity extends ActionBarActivity {
    EditText edtNomeProfessor, edtEmailProfessor, edtTelefoneProfessor;
    Button btnSalvar;

    private Professor professor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professor);

        edtNomeProfessor = (EditText) findViewById(R.id.edtNomeProfessor);
        edtEmailProfessor = (EditText) findViewById(R.id.edtEmailProfessor);
        edtTelefoneProfessor = (EditText) findViewById(R.id.edtTelefoneProfessor);
        btnSalvar = (Button) findViewById(R.id.btnSalvar);

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                professor = new Professor();
                professor.setNome(edtNomeProfessor.getText().toString());
                professor.setEmail(edtEmailProfessor.getText().toString());
                professor.setTelefone(edtTelefoneProfessor.getText().toString());


                Toast.makeText(ProfessorActivity.this, "Professor cadastrador: " + professor.toString(), Toast.LENGTH_LONG).show();
                //[TODO] SALVAR PROFESSOR NO SQLite
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_professor, menu);
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
