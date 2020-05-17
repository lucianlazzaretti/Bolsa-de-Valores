package br.com.unipar.bolsadevalores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private EditText edCodigoEmpresa, edLucroLiquido, edPatrimonio, edAcoes, edPreco;
    Double lpa,pl,roe,vpa,pvp;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void CalcularBolsa(View view) {
        calcular();
        segundaTela (view);
    }

    private void calcular() {
        edCodigoEmpresa = findViewById(R.id.edCodigoEmpresa);
        edLucroLiquido = findViewById(R.id.edLucroLiquido);
        edPatrimonio = findViewById(R.id.edPatrimonio);
        edAcoes = findViewById(R.id.edAcoes);
        edPreco = findViewById(R.id.edPreco);

        String codigoempresa = edCodigoEmpresa.getText().toString();
        Double lucroLiquido = Double.parseDouble(edLucroLiquido.getText().toString());
        Double patrimonio = Double.parseDouble(edPatrimonio.getText().toString());
        Long numeroAcoes = Long.parseLong(edAcoes.getText().toString());
        Double preco = Double.parseDouble(edPreco.getText().toString());

        lpa = (lucroLiquido / numeroAcoes);
        pl = (preco / lpa);
        roe = (lucroLiquido / patrimonio) * 100;
        vpa = (patrimonio / numeroAcoes);
        pvp = (preco / vpa);
    }

    public void segundaTela (View view){
        Intent intent = new Intent(this, Resultado.class);
        Bundle b = new Bundle();
        b.putDouble("lpa",lpa);
        b.putDouble("pl",pl);
        b.putDouble("roe",roe);
        b.putDouble("vpa",vpa);
        b.putDouble("pvp",pvp);
        intent.putExtras(b);
        startActivity(intent);
        finish();
    }
}


