package edu.up.a301testapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    /**
     * For our drawing example
     *
     * @author CS301
     * @version 11 Sep 2024
     */
    protected void onCreate_drawing_example(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawing_canvas);

    }

    /**
     * Simple examples of changing Views at runtime
     *
     * @author CS301
     * @version 11 Sep 2024
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.complex);

        //Find a reference to an existing object in the GUI
        Button buttCont = findViewById(R.id.buttCont);
        buttCont.setText("Hooray!");
        buttCont.setTextSize(60.0f);

        //Get a reference to the 'Update Me' button
        Button buttUpdate = findViewById(R.id.buttUpdate);

        //Get a reference to a new UpdateMeButtonClickHandler object
        TextView tv = findViewById(R.id.tvCountNum); //this textview that be updated
        UpdateMeButtonClickHandler umbch = new UpdateMeButtonClickHandler(tv);

        //Step 3: Connect the UpdateMe button with the UpdateMeButtonClickHandler object
        buttUpdate.setOnClickListener(umbch);

    }


}
















