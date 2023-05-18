package sg.edu.rp.c346.id21018545.wk5demomodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv1, tv2, tv3, tv4, tv5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.textViewModule1);
        tv2 = findViewById(R.id.textViewModule2);
        tv3 = findViewById(R.id.textViewModule3);
        tv4 = findViewById(R.id.textViewModule4);
        tv5 = findViewById(R.id.textViewModule5);



        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, ModuleInformation.class);
                intent.putExtra("ModuleCode", "C218");
                intent.putExtra("ModuleName", "UI/UX DESIGN FOR APPS");
                intent.putExtra("ModuleYear", 2020);
                intent.putExtra("ModuleSemester", 1);
                intent.putExtra("ModuleCredit", 4);
                intent.putExtra("ModuleVenue", "W66M");
                startActivity(intent);
            }
        });
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, ModuleInformation.class);
                intent.putExtra("ModuleCode", "C346");
                intent.putExtra("ModuleName", "ANDROID PROGRAMMING");
                intent.putExtra("ModuleYear", 2020);
                intent.putExtra("ModuleSemester", 1);
                intent.putExtra("ModuleCredit", 4);
                intent.putExtra("ModuleVenue", "W66L");
                startActivity(intent);
            }
        });

        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, ModuleInformation.class);
                intent.putExtra("ModuleCode", "C203");
                intent.putExtra("ModuleName", "WEB APPLICATION DEVELOPMENT");
                intent.putExtra("ModuleYear", 2020);
                intent.putExtra("ModuleSemester", 1);
                intent.putExtra("ModuleCredit", 4);
                intent.putExtra("ModuleVenue", "W66P");
                startActivity(intent);
            }
        });
        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, ModuleInformation.class);
                intent.putExtra("ModuleCode", "C105");
                intent.putExtra("ModuleName", "INTRODUCTION TO PROGRAMMING");
                intent.putExtra("ModuleYear", 2020);
                intent.putExtra("ModuleSemester", 1);
                intent.putExtra("ModuleCredit", 4);
                intent.putExtra("ModuleVenue", "W66J");
                startActivity(intent);
            }
        });
        tv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, ModuleInformation.class);
                intent.putExtra("ModuleCode", "C206");
                intent.putExtra("ModuleName", "SOFTWARE DEVELOPMENT PROCESS");
                intent.putExtra("ModuleYear", 2020);
                intent.putExtra("ModuleSemester", 1);
                intent.putExtra("ModuleCredit", 4);
                intent.putExtra("ModuleVenue", "W66A");
                startActivity(intent);
            }
        });



    }
}