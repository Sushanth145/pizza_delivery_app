package com.example.pizzadelivery;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.support.v7.app.AppCompatActivity;

public class billingactivity extends AppCompatActivity {

    private EditText nameEditText;
    private EditText emailEditText;
    private EditText phoneEditText;
    private Button submitButton;

    private Button goBack;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.billing_activity);

        // Find the views in the layout
        nameEditText = findViewById(R.id.name_edittext);
        emailEditText = findViewById(R.id.email_edittext);
        phoneEditText = findViewById(R.id.phone_edittext);
        submitButton = findViewById(R.id.submit_button);
        goBack = findViewById(R.id.button6);

        // Set up the click listener for the submit button
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the user's input
                String name = nameEditText.getText().toString().trim();
                String email = emailEditText.getText().toString().trim();
                String phone = phoneEditText.getText().toString().trim();

                // Validate the user's input
                if (name.isEmpty() || email.isEmpty() || phone.isEmpty()) {
                    Toast.makeText(billingactivity.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
                } else {
                    // Display a message to the user indicating that their order has been placed
                    Toast.makeText(billingactivity.this, "Thank you for your order!", Toast.LENGTH_SHORT).show();

                    // Reset the input fields
                    nameEditText.setText("");
                    emailEditText.setText("");
                    phoneEditText.setText("");
                }
            }
        });
        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(billingactivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}