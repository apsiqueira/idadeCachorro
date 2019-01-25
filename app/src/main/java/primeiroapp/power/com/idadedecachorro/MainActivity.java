package primeiroapp.power.com.idadedecachorro;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView imgDog;
    private TextView msnPrincipal;
    private EditText entradaAnosHumanos;
    private Button btn_IdadeCachorro;
    private TextView saidaIdade;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        imgDog=(ImageView)findViewById(R.id.img_dog);
        msnPrincipal=(TextView)findViewById(R.id.txt_msn);
        entradaAnosHumanos=(EditText)findViewById(R.id.txt_entradaIdade);
        btn_IdadeCachorro=(Button)findViewById(R.id.btn_descobrirIdade);
        saidaIdade=(TextView)findViewById(R.id.txt_idadeResultado);



        btn_IdadeCachorro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String idadeTemp = entradaAnosHumanos.getText().toString();
                if (idadeTemp.isEmpty()) {
                    saidaIdade.setText("Voce deve entrar com a idade do seu cachorrinho!!!");


                }
                else {
                    int idadeInttemp =Integer.parseInt(idadeTemp);


                    if ( idadeInttemp!= 0) {

                        saidaIdade.setText("Seu cachorrinho tem :" + (idadeInttemp*=7) + " anos");
                    } else {
                        saidaIdade.setText("Seu cachorrinho nao pode ter 0 anos de vida");

                    }

                }




            }
        });





    }
}
