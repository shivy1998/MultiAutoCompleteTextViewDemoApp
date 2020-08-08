package lockdown.org.mactvdemoapp;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.MultiAutoCompleteTextView;
import java.util.ArrayList;
import android.widget.MultiAutoCompleteTextView.CommaTokenizer;

public class MainActivity extends AppCompatActivity
{
    MultiAutoCompleteTextView mactv;
    public void onCreate(Bundle b)
    {
        super.onCreate(b);
        setContentView(R.layout.activity_main);
        mactv = findViewById(R.id.mactv);

        ArrayList al = new ArrayList();
        al.add("Python ");
        al.add("PHP ");
        al.add("PERL ");
        al.add("Android ");
        al.add("Apple ");
        ArrayAdapter aa = new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,al);
        mactv.setAdapter(aa);
        mactv.setThreshold(1);
        mactv.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }
}