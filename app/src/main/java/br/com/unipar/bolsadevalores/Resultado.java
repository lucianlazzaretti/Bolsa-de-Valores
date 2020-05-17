package br.com.unipar.bolsadevalores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        segundaAtividade();
    }

    public void segundaAtividade(){
        Bundle b = getIntent().getExtras();
        Double teste = b.getDouble("cod");
        Double primeiro = b.getDouble("lpa");
        Double segundo = b.getDouble("pl");
        Double terceiro = b.getDouble("roe");
        Double quarto = b.getDouble("vpa");
        Double quinto = b.getDouble("pvp");


        TextView textElementlpa = (TextView) findViewById(R.id.lpa);
        textElementlpa.setText("Lucro por Ação (LPA) : \n"+primeiro.toString());

        TextView textElementpl = (TextView) findViewById(R.id.pl);
        textElementpl.setText("Preço Lucro (P/L) : \n"+segundo.toString());

        TextView textElementroe = (TextView) findViewById(R.id.roe);
        textElementroe.setText("Retorno sobre o Patrimônio Líquido (ROE) : \n"+terceiro.toString());

        TextView textElementvpa = (TextView) findViewById(R.id.vpa);
        textElementvpa.setText("Valor Patrimonial por Ação (VPA) : \n"+quarto.toString());

        TextView textElementpvp = (TextView) findViewById(R.id.pvp);
        textElementpvp.setText("Preço sobre o Valor Patrimonial (P/VP) : \n"+quinto.toString());

        }

}
