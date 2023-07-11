# prueba
Se realizo el aplicativo como prueba del segundo parcial con éxito.

Caratula interfaz 
![image](https://github.com/Mhela4444/prueba/assets/133244582/076ad8b0-8aec-45ae-aae4-268e2b87b463)

Actividades creadas y diseñadas

![image](https://github.com/Mhela4444/prueba/assets/133244582/92844e26-4cc1-4ef7-b084-87c1af89aa68)
![image](https://github.com/Mhela4444/prueba/assets/133244582/75268c31-71a2-47d1-8b47-92e22b4ceb6f)
![image](https://github.com/Mhela4444/prueba/assets/133244582/f22e9b47-8c82-432a-af92-0385deed1504)

Codigo Java 


 public class MainActivity extends AppCompatActivity {
    Button button2;
    Button button3;
    Button button4;

    Button button6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button6 = (Button) findViewById(R.id.button6);


        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, quienesomos.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, rcursos.class);
                startActivity(intent1);

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, contacto.class);
                startActivity(intent1);

            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);

            }
        });
    }
}

Realizado por Tipan Melany, Vallejo Jonathan y Oñate Jimmy





