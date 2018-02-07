package com.example.patel.androidlabs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class StartActivity extends Activity {

    protected static final String ACTIVITY_NAME = "StartActivity";
    int requestCode, resultCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        Log.i(ACTIVITY_NAME, "In onCreate()");

        Button button2 = (Button) findViewById(R.id.button);


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final Intent intent = new Intent(StartActivity.this, LoginActivity.class);
                startActivity(intent);
                startActivityForResult(intent, 50);

//                onActivityResult(int requestCode, int resultCode, Intent data){
//                    if (requestCode == 50) {
//                        Log.i(ACTIVITY_NAME, "Returned to StartActivity.onActivityResult");
//                    }
//
//                    if (resultCode = ListItemActivity.RESULT_OK) {
//                        String messagePassed = data.getStringExtra("Response");
//                    }
//                }

            }
        });


    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i(ACTIVITY_NAME, "In onResume()");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i(ACTIVITY_NAME, "In onStart()");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i(ACTIVITY_NAME, "In onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i(ACTIVITY_NAME, "In onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i(ACTIVITY_NAME, "In onDestroy()");
    }
}
