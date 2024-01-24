package com.example.pizzadelivery;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Secondactivity extends AppCompatActivity {
    private CheckBox pepperoniCheckbox;
    private CheckBox mushroomsCheckbox;
    private CheckBox onionsCheckbox;
    private CheckBox greenPeppersCheckbox;
    private CheckBox olivesCheckbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        // Find the checkboxes in the layout
        pepperoniCheckbox = findViewById(R.id.pepperoni_checkbox);
        mushroomsCheckbox = findViewById(R.id.mushrooms_checkbox);
        onionsCheckbox = findViewById(R.id.onions_checkbox);
        greenPeppersCheckbox = findViewById(R.id.green_peppers_checkbox);
        olivesCheckbox = findViewById(R.id.olives_checkbox);
    }

    public void placeOrder(View view) {
        // Build the order summary string
        StringBuilder orderSummary = new StringBuilder("You ordered a pizza with:");

        if (pepperoniCheckbox.isChecked()) {
            orderSummary.append("\n - Pepperoni");
        }
        if (mushroomsCheckbox.isChecked()) {
            orderSummary.append("\n - Mushrooms");
        }
        if (onionsCheckbox.isChecked()) {
            orderSummary.append("\n - Onions");
        }
        if (greenPeppersCheckbox.isChecked()) {
            orderSummary.append("\n - Green peppers");
        }
        if (olivesCheckbox.isChecked()) {
            orderSummary.append("\n - Olives");
        }

        Intent intent = new Intent(Secondactivity.this, billingactivity.class);
        startActivity(intent);
        // Show a toast message with the order summary
        Toast.makeText(this, orderSummary.toString(), Toast.LENGTH_LONG).show();
    }
}