package com.example.mobile4;//package com.example.mobile4;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.graphics.Color;
//import android.os.Bundle;
//import android.view.Gravity;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.Button;
//import android.widget.FrameLayout;
//import android.widget.GridLayout;
//import android.widget.LinearLayout;
//import android.widget.RelativeLayout;
//import android.widget.TableLayout;
//import android.widget.TableRow;
//import android.widget.TextView;
//import android.widget.GridLayout;
//
//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        //LINEARLAYOUT
////        // Создаем LinearLayout
////        LinearLayout linearLayout = new LinearLayout(this);
////        linearLayout.setOrientation(LinearLayout.HORIZONTAL);
////        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(
////                LinearLayout.LayoutParams.MATCH_PARENT,
////                LinearLayout.LayoutParams.MATCH_PARENT));
////
////        // Создаем кнопки
////        Button button1 = new Button(this);
////        button1.setText("Кнопка 1");
////        LinearLayout.LayoutParams params1 = new LinearLayout.LayoutParams(
////                LinearLayout.LayoutParams.WRAP_CONTENT,
////                LinearLayout.LayoutParams.WRAP_CONTENT);
////        params1.weight = 1;
////        button1.setLayoutParams(params1);
////
////        Button button2 = new Button(this);
////        button2.setText("Кнопка 2");
////        LinearLayout.LayoutParams params2 = new LinearLayout.LayoutParams(
////                LinearLayout.LayoutParams.WRAP_CONTENT,
////                LinearLayout.LayoutParams.WRAP_CONTENT);
////        params2.weight = 4;
////        button2.setLayoutParams(params2);
////
////        // Добавляем кнопки в LinearLayout
////        linearLayout.addView(button1);
////        linearLayout.addView(button2);
////
////        // Устанавливаем LinearLayout в качестве корневого элемента
////        ///////setContentView(linearLayout);
////
////
////
////
////
//
//
//
//
//
//
//
//
//
//
//
//
////
////
////        // Создаем RelativeLayout
////        RelativeLayout relativeLayout = new RelativeLayout(this);
////
////// Задаем параметры RelativeLayout
////        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
////                RelativeLayout.LayoutParams.MATCH_PARENT,
////                RelativeLayout.LayoutParams.MATCH_PARENT);
////        relativeLayout.setLayoutParams(params);
////
////// Создаем TextView и задаем его параметры
////        TextView textView = new TextView(this);
////        textView.setText("Hello, RELATIVELAYOUT !");
////        textView.setId(View.generateViewId());
////        RelativeLayout.LayoutParams textViewParams = new RelativeLayout.LayoutParams(
////                RelativeLayout.LayoutParams.WRAP_CONTENT,
////                RelativeLayout.LayoutParams.WRAP_CONTENT);
////        textViewParams.addRule(RelativeLayout.CENTER_IN_PARENT);
////        textView.setLayoutParams(textViewParams);
////
////// Добавляем TextView в RelativeLayout
////        relativeLayout.addView(textView);
////
////// Устанавливаем RelativeLayout в качестве корневого элемента
////        ////////////////setContentView(relativeLayout);
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//        // Создаем экземпляр TableLayout с помощью конструктора TableLayout(Context)
//        TableLayout tableLayout = new TableLayout(this);
//
//// Задаем параметры макета для TableLayout с помощью TableLayout.LayoutParams
//// Параметры MATCH_PARENT означают, что TableLayout будет занимать все доступное пространство
//        tableLayout.setLayoutParams(new TableLayout.LayoutParams(
//                TableLayout.LayoutParams.MATCH_PARENT,
//                TableLayout.LayoutParams.MATCH_PARENT));
//
//// Создаем первый TableRow с помощью конструктора TableRow(Context)
//        TableRow tableRow1 = new TableRow(this);
//
//// Создаем первый TextView с помощью конструктора TextView(Context)
//        TextView textView1 = new TextView(this);
//
//// Задаем текст для TextView
//        textView1.setText("Column 1");
//
//// Задаем отступ для TextView
//        textView1.setPadding(16, 16, 16, 16);
//
//// Задаем фон для TextView
//        textView1.setBackgroundColor(Color.parseColor("#f0f0f0"));
//
//// Добавляем TextView в TableRow с помощью метода addView(View)
//        tableRow1.addView(textView1);
//
//// Создаем второй TextView и задаем ему текст, отступ и фон
//        TextView textView2 = new TextView(this);
//        textView2.setText("Column 2");
//        textView2.setPadding(16, 16, 16, 16);
//        textView2.setBackgroundColor(Color.parseColor("#f0f0f0"));
//
//// Добавляем второй TextView в TableRow
//        tableRow1.addView(textView2);
//
//// Создаем третий TextView и задаем ему текст, отступ и фон
//        TextView textView3 = new TextView(this);
//        textView3.setText("Column 3");
//        textView3.setPadding(16, 16, 16, 16);
//        textView3.setBackgroundColor(Color.parseColor("#f0f0f0"));
//
//// Добавляем третий TextView в TableRow
//        tableRow1.addView(textView3);
//
//// Добавляем TableRow в TableLayout
//        tableLayout.addView(tableRow1);
//
//// Создаем второй TableRow и добавляем в него три TextView
//        TableRow tableRow2 = new TableRow(this);
//        TextView textView4 = new TextView(this);
//        textView4.setText("Row 1, Column 1");
//        textView4.setPadding(16, 16, 16, 16);
//        tableRow2.addView(textView4);
//
//        TextView textView5 = new TextView(this);
//        textView5.setText("Row 1, Column 2");
//        textView5.setPadding(16, 16, 16, 16);
//        tableRow2.addView(textView5);
//
//        TextView textView6 = new TextView(this);
//        textView6.setText("Row 1, Column 3");
//        textView6.setPadding(16, 16, 16, 16);
//        tableRow2.addView(textView6);
//
//        tableLayout.addView(tableRow2);
//
//// Добавляем TableLayout в качестве корневого элемента макета с помощью метода setContentView(View)
//        //////////////setContentView(tableLayout);
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////
////
////        // Создаем экземпляр FrameLayout
////        FrameLayout frameLayout = new FrameLayout(this);
////
////// Задаем размеры FrameLayout
////        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(
////                FrameLayout.LayoutParams.MATCH_PARENT,
////                FrameLayout.LayoutParams.MATCH_PARENT
////        );
////        frameLayout.setLayoutParams(layoutParams);
////
////// Задаем цвет фона FrameLayout
////        frameLayout.setBackgroundColor(Color.RED);
////
////// Создаем экземпляр кнопки
////        Button button = new Button(this);
////
////// Задаем размеры кнопки
////        FrameLayout.LayoutParams buttonLayoutParams = new FrameLayout.LayoutParams(
////                FrameLayout.LayoutParams.WRAP_CONTENT,
////                FrameLayout.LayoutParams.WRAP_CONTENT
////        );
////        button.setLayoutParams(buttonLayoutParams);
////
////// Задаем текст кнопки
////        button.setText("Кнопка");
////
////// Задаем цвет фона кнопки
////        button.setBackgroundColor(Color.GREEN);
////
////// Задаем выравнивание кнопки по центру FrameLayout
////        buttonLayoutParams.gravity = Gravity.CENTER;
////
////// Добавляем кнопку в FrameLayout
////        frameLayout.addView(button);
////
////// Добавляем FrameLayout в основной контейнер приложения
////        /////////////////////setContentView(frameLayout);
////
////
//
//
//
//
//
//
//
//
//
//
//
//
//
//// Создаем GridLayout
//    GridLayout gridLayout = new GridLayout(this);
//    gridLayout.setLayoutParams(new GridLayout.LayoutParams());
//
//    // Задаем количество строк и столбцов
//    gridLayout.setRowCount(1);
//    gridLayout.setColumnCount(2);
//
//    // Создаем кнопки и устанавливаем их свойства через GridLayout.LayoutParams
//    Button button1 = new Button(this);
//    button1.setText("Button 1");
//
//    GridLayout.LayoutParams params1 = new GridLayout.LayoutParams();
//    params1.rowSpec = GridLayout.spec(0, GridLayout.CENTER, 1f);
//    params1.columnSpec = GridLayout.spec(0, GridLayout.CENTER, 1f);
//    params1.setGravity(Gravity.FILL);
//
//    // Применяем параметры макета к кнопке
//    button1.setLayoutParams(params1);
//
//    Button button2 = new Button(this);
//    button2.setText("Button 2");
//
//    GridLayout.LayoutParams params2 = new GridLayout.LayoutParams();
//    params2.rowSpec = GridLayout.spec(0, GridLayout.CENTER, 1f);
//    params2.columnSpec = GridLayout.spec(1, GridLayout.CENTER, 1f);
//    params2.setGravity(Gravity.FILL);
//
//    // Применяем параметры макета ко второй кнопке
//    button2.setLayoutParams(params2);
//
//    // Добавляем кнопки в GridLayout
//    gridLayout.addView(button1);
//    gridLayout.addView(button2);
//
//    // Устанавливаем GridLayout в качестве содержимого активности
//    setContentView(gridLayout);
//    }
//}

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Создаем GridLayout
        GridLayout gridLayout = new GridLayout(this);
        gridLayout.setLayoutParams(new GridLayout.LayoutParams());

        // Задаем количество строк и столбцов
        gridLayout.setRowCount(1);
        gridLayout.setColumnCount(2);

        // Создаем кнопки и устанавливаем их свойства через GridLayout.LayoutParams
        Button button1 = new Button(this);
        button1.setText("Button 1");

        GridLayout.LayoutParams params1 = new GridLayout.LayoutParams();
        params1.rowSpec = GridLayout.spec(0, GridLayout.CENTER, 1f);
        params1.columnSpec = GridLayout.spec(0, GridLayout.CENTER, 1f);
        params1.setGravity(Gravity.FILL);

        // Применяем параметры макета к кнопке
        button1.setLayoutParams(params1);

        Button button2 = new Button(this);
        button2.setText("Button 2");

        GridLayout.LayoutParams params2 = new GridLayout.LayoutParams();
        params2.rowSpec = GridLayout.spec(0, GridLayout.CENTER, 1f);
        params2.columnSpec = GridLayout.spec(1, GridLayout.CENTER, 1f);
        params2.setGravity(Gravity.FILL);

        // Применяем параметры макета ко второй кнопке
        button2.setLayoutParams(params2);

        // Добавляем кнопки в GridLayout
        gridLayout.addView(button1);
        gridLayout.addView(button2);

        // Устанавливаем GridLayout в качестве содержимого активности
        //////////////setContentView(gridLayout);












//        // Создаем экземпляр ScrollView
//        ScrollView scrollView = new ScrollView(this);
//
//        // Создаем экземпляр LinearLayout
//        LinearLayout linearLayout = new LinearLayout(this);
//        linearLayout.setOrientation(LinearLayout.VERTICAL);
//
//        // Создаем экземпляр TextView и добавляем его в LinearLayout
//        TextView textView = new TextView(this);
//        textView.setText("Это простой текст для примера.");
//        linearLayout.addView(textView);
//
//        // Добавляем LinearLayout в ScrollView
//        scrollView.addView(linearLayout);
//
//        // Добавляем ScrollView в основной контейнер приложения
//        /////////setContentView(scrollView);




        // Создаем экземпляр ScrollView
        ScrollView scrollView = new ScrollView(this);

        // Создаем экземпляр LinearLayout
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);

        // Создаем экземпляры кнопок и добавляем их в LinearLayout
        for (int i = 0; i < 20; i++) {
            // Создаем экземпляр кнопки
            Button button = new Button(this);
            button.setText("Кнопка " + (i + 1));

            // Задаем параметры расположения кнопки
            LinearLayout.LayoutParams buttonLayoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            button.setLayoutParams(buttonLayoutParams);

            // Добавляем кнопку в LinearLayout
            linearLayout.addView(button);
        }

        // Добавляем LinearLayout в ScrollView
        scrollView.addView(linearLayout);

        // Добавляем ScrollView в основной контейнер приложения
        ////////setContentView(scrollView);
    }
}