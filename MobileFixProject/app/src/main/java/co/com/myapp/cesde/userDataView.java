package co.com.myapp.cesde;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class userDataView extends AppCompatActivity {

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference reference = database.getReference().child("usuarios");

    Button btnBuscar;
    Button btnVolverDashBoard;
    EditText etId;
    EditText etNombre;
    EditText etApellido;
    EditText etCorreo;
    EditText etTelefono;
    EditText etContrasena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_user_data_view);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Mapeo de componentes
        btnBuscar = findViewById(R.id.btnBuscar);
        btnVolverDashBoard = findViewById(R.id.btnVolverDashBoard);
        etId = findViewById(R.id.etId);
        etNombre = findViewById(R.id.etNombre);
        etApellido = findViewById(R.id.etApellido);
        etCorreo = findViewById(R.id.etCorreo);
        etTelefono = findViewById(R.id.etTelefono);
        etContrasena = findViewById(R.id.etContrasena);
    }

    public void recuperarDataUsuario() {
        String usuarioId = etId.getText().toString();

        DatabaseReference referenciaUsuario = reference.child(usuarioId);

        referenciaUsuario.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.exists()) {
                    String nombre = snapshot.child("Nombre").getValue(String.class);
                    String apellido = snapshot.child("Apellido").getValue(String.class);
                    String correo = snapshot.child("Correo").getValue(String.class);
                    String telefono = snapshot.child("Telefono").getValue(String.class);
                    String contrasena = snapshot.child("Contrasena").getValue(String.class);

                    etNombre.setText("Nombre: " + nombre);
                    etApellido.setText("Apellido: " + apellido);
                    etCorreo.setText("Correo: " + correo);
                    etTelefono.setText("Telefono: " + telefono);
                    etContrasena.setText("Contrasena: " + contrasena);
                } else {
                    Toast.makeText(userDataView.this, "Datos no encontrados", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                // Manejo de errores
            }
        });
    }
}
