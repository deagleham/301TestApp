package edu.up.a301testapp;

import android.os.Bundle;
import android.view.View;
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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawing_canvas);

    }

    /**
     * Simple examples of changing Views at runtime
     *
     * @author CS301
     * @version 11 Sep 2024
     */

    protected void onCreate_Original(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.complex);

        //Find a reference to an existing object in the GUI
        Button buttCont = findViewById(R.id.buttCont);
        buttCont.setText("Hooray!");
        buttCont.setTextSize(60.0f);
    }

    public void incrementMe(View theView) {
        Button buttUpdate = findViewById(R.id.buttUpdate);
        //get a reference to the tvCountNum textview
        TextView tvCountNum = findViewById(R.id.tvCountNum);

        //extract the current value of tvCountNum as a string
        CharSequence cseq = tvCountNum.getText();
        String textVal = cseq.toString();

        //convert the string to an integer
        /**
         * External Citation
         *
         * I had to lookup how to convert a string to an int
         * https://stackoverflow.com/questions/5585779/how-do-i-convert-a-string-to-an-int-in-java
         */
        int intVal = Integer.parseInt(textVal);

        //increment the result
        intVal++;

        //put the new value back into the tv as a string
        tvCountNum.setText("" + intVal);
    }

}
















