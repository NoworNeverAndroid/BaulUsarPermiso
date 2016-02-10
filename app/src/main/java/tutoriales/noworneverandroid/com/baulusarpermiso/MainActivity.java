package tutoriales.noworneverandroid.com.baulusarpermiso;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void accionLlamada(View view){
        Intent i = new Intent();



        i.setClassName("tutoriales.noworneverandroid.com.baulnuevopermiso",
                "tutoriales.noworneverandroid.com.baulnuevopermiso.LLamadaTelefono");


        startActivity(i);
    }
}


