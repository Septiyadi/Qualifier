package one.day.qualifier.qualifier;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.TypeInfo;

public class itemselectorActivity extends AppCompatActivity {

    TextView JudulID;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itemselector);
        JudulID = (TextView)findViewById(R.id.txtJudul);

        Typeface Calligrapher = Typeface.createFromAsset(getAssets(),"fonts/calligrapher.ttf");
        JudulID.setTypeface(Calligrapher);
    }
}
