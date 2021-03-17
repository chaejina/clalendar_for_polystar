package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    int startDay = 0;

    public String year = "";
    public String month = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText inputYears = (EditText) findViewById(R.id.years);
        EditText inputMonths = (EditText) findViewById(R.id.months);
        TextView outputDate = (TextView) findViewById(R.id.dates);

        Button day1 = (Button) findViewById(R.id.day1);

        inputYears.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                boolean handled = false;
                if (actionId == EditorInfo.IME_ACTION_SEND) {
                    year = inputYears.getText().toString();
                    handled = true;
                    v.setFocusable(false);
                    v.setFocusableInTouchMode(true);
                    v.setFocusable(true);
                }

                return handled;
            }
        });

        inputMonths.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                boolean handled = false;
                if (actionId == EditorInfo.IME_ACTION_SEND) {
                    year = inputYears.getText().toString();
                    month = inputMonths.getText().toString();

                    String date = year + "-" + month + "-" + 1;

                    try {
                        startDay = getDateDay2(date, "yyyy-mm-dd");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    if (startDay != 0) {
                        day1.setText(" " + startDay);
                        //outputDate.setText(" "+startDay);
                        changeDay(startDay);
                    }

                    handled = true;
                    hideKeyboard(inputMonths);
                    v.setFocusable(false);
                    v.setFocusableInTouchMode(true);
                    v.setFocusable(true);
                }
                return handled;
            }
        });

    }

    private void hideKeyboard(EditText et) {
        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(et.getWindowToken(), 0);
    }

    public static int getDateDay2(String date, String dateType) throws Exception {

        String day = "";

        SimpleDateFormat dateFormat = new SimpleDateFormat(dateType);
        Date nDate = dateFormat.parse(date);

        Calendar cal = Calendar.getInstance();
        cal.setTime(nDate);

        int dayNum = cal.get(Calendar.DAY_OF_WEEK);

        return dayNum;
    }


    //// 날짜가 바뀌도록 실행하는 것 호출
    Button day1 = (Button) findViewById(R.id.day1);
    Button day2 = (Button) findViewById(R.id.day2);
    Button day3 = (Button) findViewById(R.id.day3);
    Button day4 = (Button) findViewById(R.id.day4);
    Button day5 = (Button) findViewById(R.id.day5);
    Button day6 = (Button) findViewById(R.id.day6);
    Button day7 = (Button) findViewById(R.id.day7);
    Button day8 = (Button) findViewById(R.id.day8);
    Button day9 = (Button) findViewById(R.id.day9);
    Button day10 = (Button) findViewById(R.id.day10);
    Button day11 = (Button) findViewById(R.id.day11);
    Button day12 = (Button) findViewById(R.id.day12);
    Button day13 = (Button) findViewById(R.id.day13);
    Button day14 = (Button) findViewById(R.id.day14);
    Button day15 = (Button) findViewById(R.id.day15);
    Button day16 = (Button) findViewById(R.id.day16);
    Button day17 = (Button) findViewById(R.id.day17);
    Button day18 = (Button) findViewById(R.id.day18);
    Button day19 = (Button) findViewById(R.id.day19);
    Button day20 = (Button) findViewById(R.id.day20);
    Button day21 = (Button) findViewById(R.id.day21);
    Button day22 = (Button) findViewById(R.id.day22);
    Button day23 = (Button) findViewById(R.id.day23);
    Button day24 = (Button) findViewById(R.id.day24);
    Button day25 = (Button) findViewById(R.id.day25);
    Button day26 = (Button) findViewById(R.id.day26);
    Button day27 = (Button) findViewById(R.id.day27);
    Button day28 = (Button) findViewById(R.id.day28);
    Button day29 = (Button) findViewById(R.id.day29);
    Button day30 = (Button) findViewById(R.id.day30);
    Button day31 = (Button) findViewById(R.id.day31);
    Button day32 = (Button) findViewById(R.id.day32);
    Button day33 = (Button) findViewById(R.id.day33);
    Button day34 = (Button) findViewById(R.id.day34);
    Button day35 = (Button) findViewById(R.id.day35);
    Button day36 = (Button) findViewById(R.id.day36);
    Button day37 = (Button) findViewById(R.id.day37);
    Button day38 = (Button) findViewById(R.id.day38);
    Button day39 = (Button) findViewById(R.id.day39);
    Button day40 = (Button) findViewById(R.id.day40);
    Button day41 = (Button) findViewById(R.id.day41);
    Button day42 = (Button) findViewById(R.id.day42);

    public void changeDay(int today) {
        int maxDay, isItUnYear, whatMonth, thisIsChangeDay = today;
        int dayChange = 1;

        isItUnYear = Integer.parseInt(month);
        whatMonth = Integer.parseInt(year);

        if (whatMonth == 2 && ((isItUnYear % 400 == 0) || ((isItUnYear % 4 == 0) && (isItUnYear % 100 != 0))))
            maxDay = 29;
        else if (whatMonth == 2)
            maxDay = 28;
        else if (whatMonth == 4 || whatMonth == 6 || whatMonth == 9 || whatMonth == 11)
            maxDay = 30;
        else if (whatMonth == 1 || whatMonth == 3 || whatMonth == 7 || whatMonth == 8 || whatMonth == 10 || whatMonth == 12)
            maxDay = 31;
        else
            maxDay = 0;

        if (maxDay != 0) {
            switch (thisIsChangeDay) {
                case 1:
                    day1.setText(dayChange);
                    dayChange++;
                case 2:
                    day2.setText(dayChange);
                    dayChange++;
                case 3:
                    day3.setText(dayChange);
                    dayChange++;
                case 4:
                    day4.setText(dayChange);
                    dayChange++;
                case 5:
                    day5.setText(dayChange);
                    dayChange++;
                case 6:
                    day6.setText(dayChange);
                    dayChange++;
                case 7:
                    day7.setText(dayChange);
                    dayChange++;
                    break;
            }

            day8.setText(dayChange);
            dayChange++;
            day9.setText(dayChange);
            dayChange++;
            day10.setText(dayChange);
            dayChange++;
            day11.setText(dayChange);
            dayChange++;
            day12.setText(dayChange);
            dayChange++;
            day13.setText(dayChange);
            dayChange++;
            day14.setText(dayChange);
            dayChange++;
            day15.setText(dayChange);
            dayChange++;
            day16.setText(dayChange);
            dayChange++;
            day17.setText(dayChange);
            dayChange++;
            day18.setText(dayChange);
            dayChange++;
            day19.setText(dayChange);
            dayChange++;
            day20.setText(dayChange);
            dayChange++;
            day21.setText(dayChange);
            dayChange++;
            day22.setText(dayChange);
            dayChange++;
            day23.setText(dayChange);
            dayChange++;
            day24.setText(dayChange);
            dayChange++;
            day25.setText(dayChange);
            dayChange++;
            day26.setText(dayChange);
            dayChange++;
            day27.setText(dayChange);
            dayChange++;
            day28.setText(dayChange);
            dayChange++;

            if (dayChange <= maxDay) {
                day29.setText(dayChange);
                dayChange++;
            }
            if (dayChange <= maxDay) {
                day30.setText(dayChange);
                dayChange++;
            }
            if (dayChange <= maxDay) {
                day31.setText(dayChange);
                dayChange++;
            }
            if (dayChange <= maxDay) {
                day32.setText(dayChange);
                dayChange++;
            }
            if (dayChange <= maxDay) {
                day33.setText(dayChange);
                dayChange++;
            }
            if (dayChange <= maxDay) {
                day34.setText(dayChange);
                dayChange++;
            }
            if (dayChange <= maxDay) {
                day35.setText(dayChange);
                dayChange++;
            }
            if (dayChange <= maxDay) {
                day36.setText(dayChange);
                dayChange++;
            }
            if (dayChange <= maxDay) {
                day37.setText(dayChange);
                dayChange++;
            }
            if (dayChange <= maxDay) {
                day38.setText(dayChange);
                dayChange++;
            }
            if (dayChange <= maxDay) {
                day39.setText(dayChange);
                dayChange++;
            }
            if (dayChange <= maxDay) {
                day40.setText(dayChange);
                dayChange++;
            }
            if (dayChange <= maxDay) {
                day41.setText(dayChange);
                dayChange++;
            }
            if (dayChange <= maxDay) {
                day42.setText(dayChange);
                dayChange++;
            }

        } else {
            dayChange = 0;

            day1.setText(dayChange);
            day2.setText(dayChange);
            day3.setText(dayChange);
            day4.setText(dayChange);
            day5.setText(dayChange);
            day6.setText(dayChange);
            day7.setText(dayChange);
            day8.setText(dayChange);
            day9.setText(dayChange);
            day10.setText(dayChange);
            day11.setText(dayChange);
            day12.setText(dayChange);
            day13.setText(dayChange);
            day14.setText(dayChange);
            day15.setText(dayChange);
            day16.setText(dayChange);
            day17.setText(dayChange);
            day18.setText(dayChange);
            day19.setText(dayChange);
            day20.setText(dayChange);
            day21.setText(dayChange);
            day22.setText(dayChange);
            day23.setText(dayChange);
            day24.setText(dayChange);
            day25.setText(dayChange);
            day26.setText(dayChange);
            day27.setText(dayChange);
            day28.setText(dayChange);
            day29.setText(dayChange);
            day30.setText(dayChange);
            day31.setText(dayChange);
            day32.setText(dayChange);
            day33.setText(dayChange);
            day34.setText(dayChange);
            day35.setText(dayChange);
            day36.setText(dayChange);
            day37.setText(dayChange);
            day38.setText(dayChange);
            day39.setText(dayChange);
            day40.setText(dayChange);
            day41.setText(dayChange);
            day42.setText(dayChange);
        }


    }

}