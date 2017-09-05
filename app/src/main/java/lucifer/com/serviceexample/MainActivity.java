package lucifer.com.serviceexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Intent serviceintent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
public void startService(View view )
{
    serviceintent= new Intent(getBaseContext(),MyService.class);
startService(serviceintent);
}
    public void stopService(View view )
    {
        serviceintent= new Intent(getBaseContext(),MyService.class);
        stopService(serviceintent);

    }

}
