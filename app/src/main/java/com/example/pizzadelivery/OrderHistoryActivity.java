package com.example.pizzadelivery;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class OrderHistoryActivity extends AppCompatActivity {

    private TextView orderIdTextView;
    private TextView orderItemsTextView;
    private TextView orderTotalTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_history);

        // Find the views in the layout
        orderIdTextView = findViewById(R.id.order_id_textview);
        orderItemsTextView = findViewById(R.id.order_items_textview);
        orderTotalTextView = findViewById(R.id.order_total_textview);

        // Get the order details from the intent
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String orderId = extras.getString("order_id");
            String orderItems = extras.getString("order_items");
            String orderTotal = extras.getString("order_total");

            // Set the text for the order details TextViews
            orderIdTextView.setText("Order ID: " + orderId);
            orderItemsTextView.setText("Order Items: " + orderItems);
            orderTotalTextView.setText("Order Total: " + orderTotal);
        }
    }
}
