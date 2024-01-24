package com.example.pizzadelivery;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final int ORDER_REQUEST_CODE = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openOrderScreen(View view) {
        Intent intent = new Intent(MainActivity.this, Secondactivity.class);
        startActivity(intent);
    }

    public void viewOrderHistory(View view) {
        Intent intent = new Intent(MainActivity.this, OrderHistoryActivity.class);
        startActivity(intent);
    }

    public void contactCustomerSupport(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:7396149624"));
        startActivity(intent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == ORDER_REQUEST_CODE && resultCode == RESULT_OK) {
            String confirmationMessage = data.getStringExtra("confirmation_message");
            Toast.makeText(this, confirmationMessage, Toast.LENGTH_LONG).show();
        }
    }
}