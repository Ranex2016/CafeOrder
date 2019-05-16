package com.demo.cafeorder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class OrderDetailActivity extends AppCompatActivity {

    private TextView textViewOrder; //Объявляем переменную с типом "текстовое поле"

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_detail);
        textViewOrder = findViewById(R.id.textViewOrder); //Даем ссылку на текстовое поле

        Intent intent = getIntent();//Получение интента(намерения)
        if (intent.hasExtra("order")) {
            String order = intent.getStringExtra("order"); //Получение строки по ключу
            textViewOrder.setText(order); //Присваеваем полю содержимое интента.
        }
        else {
            //...перебрасываем на активность с регистрацией
            Intent backToLogin = new Intent(this,LoginActivity.class);
            startActivity(backToLogin); //запускаем активность
        }

    }
}
