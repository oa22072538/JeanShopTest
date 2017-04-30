package bestao.tre.jeanshoptest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private UserTABLE objUserTABLE;
    private JeanTABLE objJeanTABLE;
    private OrderTABLE objOrderTABLE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        connectedSQLite();
    }
    private void connectedSQLite(){
        objUserTABLE = new UserTABLE(this);
        objJeanTABLE = new JeanTABLE(this);
        objOrderTABLE = new OrderTABLE(this);

    }
}
