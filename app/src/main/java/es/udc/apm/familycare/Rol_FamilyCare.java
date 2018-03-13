package es.udc.apm.familycare;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Rol_FamilyCare extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rol__family_care);
    }

    public void onClickRolVigilante(View v){
        Context context = getApplicationContext();
        CharSequence text = getString(R.string.text_toast_vigilante);
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void onClickRolVigilado(View v){
        Context context = getApplicationContext();
        CharSequence text = getString(R.string.text_toast_vigilado);
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
