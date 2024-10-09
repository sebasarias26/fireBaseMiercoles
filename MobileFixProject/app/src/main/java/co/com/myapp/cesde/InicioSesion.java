package co.com.myapp.cesde;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class InicioSesion extends AppCompatActivity {

    Button btn_iniciar_sesion;
    Button btn_volver_home;
    EditText input_email;
    EditText input_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        btn_iniciar_sesion = findViewById(R.id.btn_iniciar_sesion);
        btn_volver_home = findViewById(R.id.btn_volver_home);
        input_email = findViewById(R.id.input_email);
        input_password = findViewById(R.id.input_password);

        btn_iniciar_sesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irAlDashBoardDesdeInicio();
            }
        });

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_inicio_sesion);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void irAlDashBoardDesdeInicio() {
        Intent intent = new Intent(this, DashBoard.class);
        startActivity(intent);
    }
}