package sg.edu.rp.c346.id21018545.wk5demomodules;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
public class Summary extends AppCompatActivity {
    TextView tvYear, tvSemester, tvTotal, tvModule;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);
        tvYear = findViewById(R.id.AcademicYear);
        tvSemester = findViewById(R.id.Semester);
        tvTotal = findViewById(R.id.TotalModularCredits);
        tvModule = findViewById(R.id.Modules);
        Intent intentReceived = getIntent();
        int academic_year = intentReceived.getIntExtra("AcademicYear", 0);
        int semester = intentReceived.getIntExtra("Semester", 0);
        int total_modular_credits = intentReceived.getIntExtra("TotalModularCredits", 0);
        String modules = intentReceived.getStringExtra("Modules");
        tvYear.setText("Academic Year: \n" + academic_year);
        tvSemester.setText("Semester: \n" + semester);
        tvTotal.setText("Total Modular Credits: \n" + total_modular_credits);
        tvModule.setText("Module names: \n" + modules);
    }
}