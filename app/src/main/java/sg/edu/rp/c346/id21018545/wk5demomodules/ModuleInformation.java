package sg.edu.rp.c346.id21018545.wk5demomodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleInformation extends AppCompatActivity {

    TextView tvCode, tvName, tvYear, tvSemester, tvCredit, tvVenue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_information);

        tvCode = findViewById(R.id.textViewModuleCode);
        tvName = findViewById(R.id.textViewModuleName);
        tvYear = findViewById(R.id.textViewModuleYear);
        tvSemester = findViewById(R.id.textViewModuleSemester);
        tvCredit = findViewById(R.id.textViewModuleCredit);
        tvVenue = findViewById(R.id.textViewModuleVenue);


        Intent intentReceived = getIntent();

        String moduleCode = intentReceived.getStringExtra("ModuleCode");
        String moduleName = intentReceived.getStringExtra("ModuleName");
        int moduleYear = intentReceived.getIntExtra("ModuleYear", 0);
        int moduleSemester = intentReceived.getIntExtra("ModuleSemester", 0);
        int moduleCredit = intentReceived.getIntExtra("ModuleCredit", 0);
        String moduleVenue = intentReceived.getStringExtra("ModuleVenue");

        tvCode.setText("Module Code: \n" +  moduleCode);
        tvName.setText("Module Name: \n" + moduleName);
        tvYear.setText("Module Year: \n" + moduleYear);
        tvSemester.setText("Module Semester: \n" + moduleSemester);
        tvCredit.setText("Module Credit: \n" + moduleCredit);
        tvVenue.setText("Module Venue: \n" + moduleVenue);

    }
}