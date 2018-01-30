package com.kuwait.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Stack;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final View home = findViewById(R.id.navigation_home);
        final View notes = findViewById( R.id.navigation_notes );
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });
        onClicks();
    }

    public void onClicks() {
        ArrayList<Button> buttons = new ArrayList<>();
        buttons.add((Button)findViewById(R.id.button0));
        buttons.add((Button)findViewById(R.id.button1));
        buttons.add((Button)findViewById(R.id.button2));
        buttons.add((Button)findViewById(R.id.button3));
        buttons.add((Button)findViewById(R.id.button4));
        buttons.add((Button)findViewById(R.id.button5));
        buttons.add((Button)findViewById(R.id.button6));
        buttons.add((Button)findViewById(R.id.button7));
        buttons.add((Button)findViewById(R.id.button8));
        buttons.add((Button)findViewById(R.id.button9));
        buttons.add((Button)findViewById(R.id.buttonClear));
        buttons.add((Button)findViewById(R.id.buttonAdd));
        buttons.add((Button)findViewById(R.id.buttonMin));
        buttons.add((Button)findViewById(R.id.buttonMult));
        buttons.add((Button)findViewById(R.id.buttonDiv));
        buttons.add((Button)findViewById(R.id.buttonEquals));
        buttons.add((Button)findViewById(R.id.buttonDel));
        buttons.add((Button)findViewById(R.id.buttonDot));
        final TextView res = findViewById(R.id.result);
        final StringBuilder inside = new StringBuilder(res.getText());
        final Stack<Integer> states = new Stack<>();
        states.push(Integer.MIN_VALUE);
        for(Button b : buttons) {
            switch (b.getId()) {
                case R.id.buttonDel :
                    b.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if(states.peek() == R.id.buttonEquals) {
                                inside.setLength(0);
                            }
                            else {
                                if (inside.length() != 0) inside.deleteCharAt(inside.length() - 1);
                            }
                            states.push(R.id.buttonDel);
                            res.setText(inside);
                        }
                    });
                    break;

                case R.id.button0 :
                    b.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(states.peek() == R.id.buttonEquals) {
                                inside.setLength(0);
                            }
                            inside.append(getString(R.string.button0));
                            states.push(R.id.button0);
                            res.setText(inside);
                        }
                    });
                    break;

                case R.id.button1 :
                    b.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(states.peek() == R.id.buttonEquals) inside.setLength(0);
                            inside.append(getString(R.string.button1));
                            states.push(R.id.button1);
                            res.setText(inside);
                        }
                    });
                    break;

                case R.id.button2 :
                    b.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(states.peek() == R.id.buttonEquals) inside.setLength(0);
                            inside.append(getString(R.string.button2));
                            states.push(R.id.button2);
                            res.setText(inside);
                        }
                    });
                    break;

                case R.id.button3 :
                    b.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(states.peek() == R.id.buttonEquals) inside.setLength(0);
                            inside.append(getString(R.string.button3));
                            states.push(R.id.button3);
                            res.setText(inside);
                        }
                    });
                    break;

                case R.id.button4 :
                    b.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(states.peek() == R.id.buttonEquals) inside.setLength(0);
                            inside.append(getString(R.string.button4));
                            states.push(R.id.button4);
                            res.setText(inside);
                        }
                    });
                    break;

                case R.id.button5 :
                    b.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(states.peek() == R.id.buttonEquals) inside.setLength(0);
                            inside.append(getString(R.string.button5));
                            states.push(R.id.button5);
                            res.setText(inside);
                        }
                    });
                    break;

                case R.id.button6 :
                    b.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(states.peek() == R.id.buttonEquals) inside.setLength(0);
                            inside.append(getString(R.string.button6));
                            states.push(R.id.button6);
                            res.setText(inside);
                        }
                    });
                    break;

                case R.id.button7 :
                    b.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(states.peek() == R.id.buttonEquals) inside.setLength(0);
                            inside.append(getString(R.string.button7));
                            states.push(R.id.button7);
                            res.setText(inside);
                        }
                    });
                    break;

                case R.id.button8 :
                    b.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(states.peek() == R.id.buttonEquals) inside.setLength(0);
                            inside.append(getString(R.string.button8));
                            states.push(R.id.button8);
                            res.setText(inside);
                        }
                    });
                    break;

                case R.id.button9 :
                    b.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(states.peek() == R.id.buttonEquals) inside.setLength(0);
                            inside.append(getString(R.string.button9));
                            states.push(R.id.button9);
                            res.setText(inside);
                        }
                    });
                    break;

                case R.id.buttonDot :
                    b.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(states.peek() == R.id.buttonDot) inside.setLength(0);
                            inside.append(getString(R.string.buttonDot));
                            states.push(R.id.buttonDot);
                            res.setText(inside);
                        }
                    });
                    break;

                case R.id.buttonAdd :
                    b.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            inside.append(getString(R.string.buttonAdd));
                            states.add(R.id.buttonAdd);
                            res.setText(inside);
                        }
                    });
                    break;

                case R.id.buttonMin :
                    b.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            inside.append(getString(R.string.buttonMin));
                            states.add(R.id.buttonMin);
                            res.setText(inside);
                        }
                    });
                    break;

                case R.id.buttonMult :
                    b.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            inside.append(getString(R.string.buttonMult));
                            states.add(R.id.buttonMult);
                            res.setText(inside);
                        }
                    });
                    break;

                case R.id.buttonDiv :
                    b.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            inside.append(getString(R.string.buttonDiv));
                            states.add(R.id.buttonDiv);
                            res.setText(inside);
                        }
                    });
                    break;

                case R.id.buttonClear :
                    b.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            inside.setLength(0);
                            states.add(R.id.buttonClear);
                            res.setText(inside);
                        }
                    });
                    break;

                case R.id.buttonEquals :
                    b.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                           String hasil =  calculate((String)res.getText());
                           inside.setLength(0);
                           inside.append(hasil);
                           states.add(R.id.buttonEquals);
                           res.setText(hasil);
                        }
                    });
                    break;
            }
        }
    }

    //TODO: IMPLEMENT JIKA ADA KOMA
    public String calculate(String all) {
        if(!Character.isDigit(all.charAt(all.length()-1))){
            return "SYNTAX ERROR";
        }
        String[] numbers = all.split("[*/+-]");
        if(numbers.length < 2) {
            return all;
        }
        else {
            String[] operators = all.replaceAll( "\\d", "").split("");
            ArrayList<String> nums = new ArrayList<>(Arrays.asList(numbers));
            ArrayList<String> ops = new ArrayList<>(Arrays.asList(operators));
            ops.remove("."); ops.remove("");
            int indexMult = ops.indexOf("*");
            int indexDiv = ops.indexOf("/");
            int indexAdd = ops.indexOf("+");
            int indexSub = ops.indexOf("-");

            if(indexMult != -1 && (indexMult < indexDiv || indexDiv == -1)) {
                Log.d("ops", ops+"");
                String first = nums.get(indexMult);
                String second = nums.get(indexMult+1);
                double resMult;
                if(first.contains(".")) {
                    if(second.contains(".")) {
                        resMult = Double.parseDouble(nums.get(indexMult)) * Double.parseDouble(nums.get(indexMult+1));
                    }
                    else {
                        resMult = Double.parseDouble(nums.get(indexMult)) * Integer.parseInt(nums.get(indexMult+1));
                    }
                }
                else {
                    if(second.contains(".")) {
                        resMult = Integer.parseInt(nums.get(indexMult)) * Double.parseDouble(nums.get(indexMult+1));
                    }
                    else {
                        int resMultInt = Integer.parseInt(nums.get(indexMult)) * Integer.parseInt(nums.get(indexMult+1));
                        String inserted = Integer.toString(resMultInt);
                        String replaced = nums.get(indexMult) + "*" + nums.get(indexMult+1);
                        all = all.replace(replaced, inserted);
                        return calculate(all);
                    }
                }
                String inserted = Double.toString(resMult);
                String replaced = nums.get(indexMult) + "*" + nums.get(indexMult+1);
                all = all.replace(replaced, inserted);
                return calculate(all);
            }

            if(indexDiv != -1 && (indexDiv < indexMult || indexMult == -1)) {
                String first = nums.get(indexDiv);
                String second = nums.get(indexDiv+1);
                double resDiv;
                if(first.contains(".")) {
                    if(second.contains(".")) {
                        resDiv = Double.parseDouble(nums.get(indexDiv)) / Double.parseDouble(nums.get(indexDiv + 1));
                    }
                    else {
                        resDiv = Double.parseDouble(nums.get(indexDiv)) / Integer.parseInt(nums.get(indexDiv + 1));
                    }
                }
                else {
                    if(second.contains(".")) {
                        resDiv = Integer.parseInt(nums.get(indexDiv)) / Double.parseDouble(nums.get(indexDiv+1));
                    }
                    else {
                        if(Integer.parseInt(nums.get(indexDiv)) % Integer.parseInt(nums.get(indexDiv+1)) == 0){
                            int resDivInt = Integer.parseInt(nums.get(indexDiv)) / Integer.parseInt(nums.get(indexDiv+1));
                            String inserted = Integer.toString(resDivInt);
                            String replaced = nums.get(indexDiv) + "/" + nums.get(indexDiv+1);
                            Log.d("div", replaced);
                            all = all.replace(replaced, inserted);
                            return calculate(all);
                        }
                        else {
                            resDiv = Double.parseDouble(nums.get(indexDiv)) / Double.parseDouble(nums.get(indexDiv+1));
                        }
                    }
                }
                String inserted = Double.toString(resDiv);
                if(inserted.split("\\.")[1].length() > 8) inserted = String.format(Locale.ENGLISH,"%.8f", resDiv);
                String replaced = nums.get(indexDiv) + "/" + nums.get(indexDiv+1);
                all = all.replace(replaced, inserted);
                return calculate(all);
            }

            if(indexAdd != -1) {
                Log.d("List", nums+" "+ops);
                String first = nums.get(indexAdd);
                String second = nums.get(indexAdd+1);
                double resAdd;
                if(first.contains(".")) {
                    if(second.contains(".")) {
                        resAdd = Double.parseDouble(nums.get(indexAdd)) + Double.parseDouble(nums.get(indexAdd+1));
                    }
                    else {
                        resAdd = Double.parseDouble(nums.get(indexAdd)) + Integer.parseInt(nums.get(indexAdd+1));
                    }
                }
                else {
                    if(second.contains(".")) {
                        resAdd = Integer.parseInt(nums.get(indexAdd)) + Double.parseDouble(nums.get(indexAdd+1));
                    }
                    else {
                        int resAddInt = Integer.parseInt(nums.get(indexAdd)) + Integer.parseInt(nums.get(indexAdd+1));
                        String inserted = Integer.toString(resAddInt);
                        String replaced = nums.get(indexAdd) + "+" + nums.get(indexAdd+1);
                        all = all.replace(replaced, inserted);
                        return calculate(all);
                    }
                }
                String inserted = Double.toString(resAdd);
                String replaced = nums.get(indexAdd) + "+" + nums.get(indexAdd+1);
                all = all.replace(replaced, inserted);
                return calculate(all);
            }

            if(indexSub != -1) {
                String first = nums.get(indexSub);
                String second = nums.get(indexSub+1);
                double resSub;
                if(first.contains(".")) {
                    if(second.contains(".")) {
                        resSub= Double.parseDouble(nums.get(indexSub)) - Double.parseDouble(nums.get(indexSub+1));
                    }
                    else {
                        resSub = Double.parseDouble(nums.get(indexSub)) - Integer.parseInt(nums.get(indexSub+1));
                    }
                }
                else {
                    if(second.contains(".")) {
                        resSub = Integer.parseInt(nums.get(indexSub)) - Double.parseDouble(nums.get(indexSub+1));
                    }
                    else {
                        int resSubInt = Integer.parseInt(nums.get(indexSub)) - Integer.parseInt(nums.get(indexSub+1));
                        String inserted = Integer.toString(resSubInt);
                        String replaced = nums.get(indexSub) + "-" + nums.get(indexSub+1);
                        all = all.replace(replaced, inserted);
                        return calculate(all);
                    }
                }
                String inserted = Double.toString(resSub);
                String replaced = nums.get(indexSub) + "-" + nums.get(indexSub+1);
                all = all.replace(replaced, inserted);
                return calculate(all);
            }
            return "";
        }
    }

}
