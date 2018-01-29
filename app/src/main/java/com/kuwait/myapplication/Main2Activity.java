package com.kuwait.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
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
        final TextView res = findViewById(R.id.result);
        final StringBuilder inside = new StringBuilder(res.getText());
        for(Button b : buttons) {
            switch (b.getId()) {
                case R.id.button0 :
                    b.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            inside.append(getString(R.string.button0));
                            res.setText(inside);
                        }
                    });
                    break;

                case R.id.button1 :
                    b.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            inside.append(getString(R.string.button1));
                            res.setText(inside);
                        }
                    });
                    break;

                case R.id.button2 :
                    b.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            inside.append(getString(R.string.button2));
                            res.setText(inside);
                        }
                    });
                    break;

                case R.id.button3 :
                    b.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            inside.append(getString(R.string.button3));
                            res.setText(inside);
                        }
                    });
                    break;

                case R.id.button4 :
                    b.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            inside.append(getString(R.string.button4));
                            res.setText(inside);
                        }
                    });
                    break;

                case R.id.button5 :
                    b.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            inside.append(getString(R.string.button5));
                            res.setText(inside);
                        }
                    });
                    break;

                case R.id.button6 :
                    b.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            inside.append(getString(R.string.button6));
                            res.setText(inside);
                        }
                    });
                    break;

                case R.id.button7 :
                    b.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            inside.append(getString(R.string.button7));
                            res.setText(inside);
                        }
                    });
                    break;

                case R.id.button8 :
                    b.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            inside.append(getString(R.string.button8));
                            res.setText(inside);
                        }
                    });
                    break;

                case R.id.button9 :
                    b.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            inside.append(getString(R.string.button9));
                            res.setText(inside);
                        }
                    });
                    break;

                case R.id.buttonDot :
                    b.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            inside.append(getString(R.string.buttonDot));
                            res.setText(inside);
                        }
                    });
                    break;

                case R.id.buttonAdd :
                    b.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            inside.append(getString(R.string.buttonAdd));
                            res.setText(inside);
                        }
                    });
                    break;

                case R.id.buttonMin :
                    b.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            inside.append(getString(R.string.buttonMin));
                            res.setText(inside);
                        }
                    });
                    break;

                case R.id.buttonMult :
                    b.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            inside.append(getString(R.string.buttonMult));
                            res.setText(inside);
                        }
                    });
                    break;

                case R.id.buttonDiv :
                    b.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            inside.append(getString(R.string.buttonDiv));
                            res.setText(inside);
                        }
                    });
                    break;

                case R.id.buttonClear :
                    b.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            res.setText("");
                        }
                    });
                    break;

                case R.id.buttonEquals :
                    b.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                           String hasil =  calculate((String)res.getText());
                           res.setText(hasil);
                        }
                    });
                default:
                    res.setText(R.string.syntaxError);
            }
        }
    }

    //TODO: IMPLEMENT JIKA ADA KOMA
    public String calculate(String all) {
        if(!Character.isDigit(all.charAt(all.length()-1))){
            return "SYNTAX ERROR";
        }
        String[] numbers = all.split("[\\*||\\:||\\+||\\-]");
        if(numbers.length < 2) {
            return all;
        }
        else {
            String[] operators = all.replaceAll("\\d", "").split("");
            ArrayList<String> nums = new ArrayList<>(Arrays.asList(numbers));
            ArrayList<String> ops = new ArrayList<>(Arrays.asList(operators));
            int indexMult = ops.indexOf("*");
            int indexDiv = ops.indexOf(":");
            int indexAdd = ops.indexOf("+");
            int indexSub = ops.indexOf("-");
            if(indexMult != -1) {
                int resMult = Integer.parseInt(nums.get(indexMult)) * Integer.parseInt(nums.get(indexMult+1));
                String inserted = Integer.toString(resMult);
                String replaced = nums.get(indexMult) + "*" + nums.get(indexMult+1);
                all = all.replace(replaced, inserted);
                nums.remove(indexMult);nums.remove(indexMult+1);ops.remove(indexMult);
                return calculate(all);
            }
            if(indexDiv != -1) {
                double resDiv = Integer.parseInt(nums.get(indexDiv)) / Integer.parseInt(nums.get(indexDiv+1));
                String inserted = Double.toString(resDiv);
                String replaced = nums.get(indexDiv) + "*" + nums.get(indexDiv+1);
                all = all.replace(replaced, inserted);
                nums.remove(indexDiv);nums.remove(indexDiv+1);ops.remove(indexDiv);
                return calculate(all);
            }
            if(indexAdd != -1) {
                int resAdd = Integer.parseInt(nums.get(indexAdd)) + Integer.parseInt(nums.get(indexAdd+1));
                String inserted = Integer.toString(resAdd);
                String replaced = nums.get(indexAdd) + "+" + nums.get(indexAdd+1);
                all = all.replace(replaced, inserted);
                nums.remove(indexAdd);nums.remove(indexAdd+1);ops.remove(indexAdd);
                return calculate(all);
            }
            if(indexSub != -1) {
                int resSub = Integer.parseInt(nums.get(indexSub)) + Integer.parseInt(nums.get(indexSub+1));
                String inserted = Integer.toString(resSub);
                String replaced = nums.get(indexSub) + "-" + nums.get(indexSub+1);
                all = all.replace(replaced, inserted);
                nums.remove(indexSub);nums.remove(indexSub+1);ops.remove(indexSub);
                return calculate(all);
            }
            return "";
        }
    }

}
