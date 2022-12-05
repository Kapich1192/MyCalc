package com.example.mycalc;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    boolean action = false;
    double a = 0, b = 0, c = 0;
    private TextView result, history;
    private Button num_1,num_2,num_3,num_4,num_5,num_6,num_7,num_8,num_9,num_0,
            plus,minus,evenly, sign,multiplier, division, factorial, pow, sqrt, fmod, log, ex,
            sin, cos, tan, pi, floor, ceil,
            AC, dote, back, percent
            ;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calc calc = new Calc();
        initializeViews();
        result.setText(calc.getResult());

        if (getScreenOrientation().equals("Land"))
            listenActionLand(calc);
        else
            listenActionPort(calc);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }

    /*++++++++++++++++++++++++++++++++++++++++++++++++++++*/
    public void initializeViews() {
        result = findViewById(R.id.result);
        history = findViewById(R.id.history);

        num_0 = findViewById(R.id.num_0);
        num_1 = findViewById(R.id.num_1);
        num_2 = findViewById(R.id.num_2);
        num_3 = findViewById(R.id.num_3);
        num_4 = findViewById(R.id.num_4);
        num_5 = findViewById(R.id.num_5);
        num_6 = findViewById(R.id.num_6);
        num_7 = findViewById(R.id.num_7);
        num_8 = findViewById(R.id.num_8);
        num_9 = findViewById(R.id.num_9);

        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        division = findViewById(R.id.division);
        multiplier = findViewById(R.id.multiplier);
        evenly = findViewById(R.id.evenly);

        fmod = findViewById(R.id.fmod);
        floor= findViewById(R.id.floor);
        ceil = findViewById(R.id.ceil);
        factorial = findViewById(R.id.factorial);
        pow = findViewById(R.id.pow);
        sqrt = findViewById(R.id.sqrt);
        log = findViewById(R.id.log);
        ex = findViewById(R.id.ex);
        sin = findViewById(R.id.sin);
        cos = findViewById(R.id.cos);
        tan = findViewById(R.id.tan);
        pi = findViewById(R.id.pi);

        sign = findViewById(R.id.sign);
        AC = findViewById(R.id.AC);
        dote = findViewById(R.id.dote);
        back = findViewById(R.id.back);
        percent = findViewById(R.id.percent);
    }

    public void listenActionLand(Calc calc) {
        clickNumber(calc);
        clickStdAction(calc);
        clickMathAction(calc);
        clickTrigAction(calc);
    }

    public void listenActionPort(Calc calc) {
        portClickNumber(calc);
        portClickStdAction(calc);
        portClickMathAction(calc);
    }
/*++++++++++++++++++++++++++++++++ Land +++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
    public void clickTrigAction(Calc calc) {

        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc.sin();
                result.setText(calc.getResult());
                history.setText(calc.getHistory());
            }
        });

        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc.cos();
                result.setText(calc.getResult());
                history.setText(calc.getHistory());
            }
        });

        tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc.tan();
                result.setText(calc.getResult());
                history.setText(calc.getHistory());
            }
        });

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc.log();
                result.setText(calc.getResult());
                history.setText(calc.getHistory());
            }
        });

        ex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc.exp();
                result.setText(calc.getResult());
                history.setText(calc.getHistory());
            }
        });
    }

    public void clickMathAction(Calc calc) {

        floor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc.floor();
                result.setText(calc.getResult());
                history.setText(calc.getHistory());
            }
        });

        ceil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc.ceil();
                result.setText(calc.getResult());
                history.setText(calc.getHistory());
            }
        });

        fmod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc.fmod();
                result.setText(calc.getResult());
                history.setText(calc.getHistory());
            }
        });

        sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc.sqrt();
                result.setText(calc.getResult());
                history.setText(calc.getHistory());
            }
        });

        pow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc.pow();
                result.setText(calc.getResult());
                history.setText(calc.getHistory());
            }
        });

        factorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc.factorial();
                result.setText(calc.getResult());
                history.setText(calc.getHistory());
            }
        });

        evenly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc.evenly();
                result.setText(calc.getResult());
                history.setText(calc.getHistory());
                calc.ac();
            }
        });

        multiplier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc.multiplier();
                result.setText(calc.getResult());
                history.setText(calc.getHistory());
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc.division();
                result.setText(calc.getResult());
                history.setText(calc.getHistory());
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc.plus();
                result.setText(calc.getResult());
                history.setText(calc.getHistory());
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc.minus();
                result.setText(calc.getResult());
                history.setText(calc.getHistory());
            }
        });

        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc.sign();
                result.setText(calc.getResult());
            }
        });

    }

    public void clickStdAction(Calc calc) {

        AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc.ac();
                result.setText(calc.getResult());
                history.setText(calc.getHistory());
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((result.getText() + "").length() == 1) {
                    if(!(result.getText() + "").equals("0")) {
                        calc.setResult("0");
                        result.setText(calc.getResult());
                    }
                } else if ((result.getText() + "").length() > 1){
                    calc.setResult(calc.getResult().substring(0,calc.getResult().length() - 1));
                    result.setText(calc.getResult());
                }
            }
        });

        percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc.percent();
                result.setText(calc.getResult());
                history.setText(calc.getHistory());
            }
        });

    }

    public void clickNumber(Calc calc) {

        pi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc.setResult("3.1415926535");
                result.setText(calc.getResult());
            }
        });

        dote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!calc.getSc()) {
                    if(!(result.getText() + "").contains(".")) {
                        calc.setResult("0.");
                        result.setText(calc.getResult());
                        calc.setSc(true);
                    }
                } else {
                    if(!(result.getText() + "").contains(".")) {
                        calc.setResult(calc.getResult() + ".");
                        result.setText(calc.getResult());
                        calc.setSc(true);
                    }
                }

            }
        });

        num_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //когда это первое число и действие не объявлено
                if(!calc.getSc()) {
                    calc.setResult("0");
                    result.setText(calc.getResult());
                    calc.setSc(true);
                //когда действие объявлено но нет результата
                } else {
                    calc.setResult(calc.getResult() + "0");
                    result.setText(calc.getResult());
                    calc.setSc(true);
                }
            }
        });

        num_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (!calc.getSc()) {
                    calc.setResult("1");
                    result.setText(calc.getResult());
                    calc.setSc(true);
                } else {
                    calc.setResult(calc.getResult() + "1");
                    result.setText(calc.getResult());
                    calc.setSc(true);
                }
            }
        });

        num_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!calc.getSc()) {
                    calc.setResult("2");
                    result.setText(calc.getResult());
                    calc.setSc(true);
                } else {
                    calc.setResult(calc.getResult() + "2");
                    result.setText(calc.getResult());
                    calc.setSc(true);
                }
            }
        });

        num_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!calc.getSc()) {
                    calc.setResult("3");
                    result.setText(calc.getResult());
                    calc.setSc(true);
                } else {
                    calc.setResult(calc.getResult() + "3");
                    result.setText(calc.getResult());
                    calc.setSc(true);
                }
            }
        });

        num_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!calc.getSc()) {
                    calc.setResult("4");
                    result.setText(calc.getResult());
                    calc.setSc(true);
                } else {
                    calc.setResult(calc.getResult() + "4");
                    result.setText(calc.getResult());
                    calc.setSc(true);
                }
            }
        });

        num_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!calc.getSc()) {
                    calc.setResult("5");
                    result.setText(calc.getResult());
                    calc.setSc(true);
                } else {
                    calc.setResult(calc.getResult() + "5");
                    result.setText(calc.getResult());
                    calc.setSc(true);
                }
            }
        });

        num_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!calc.getSc()) {
                    calc.setResult("6");
                    result.setText(calc.getResult());
                    calc.setSc(true);
                } else {
                    calc.setResult(calc.getResult() + "6");
                    result.setText(calc.getResult());
                    calc.setSc(true);
                }
            }
        });

        num_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!calc.getSc()) {
                    calc.setResult("7");
                    result.setText(calc.getResult());
                    calc.setSc(true);
                } else {
                    calc.setResult(calc.getResult() + "7");
                    result.setText(calc.getResult());
                    calc.setSc(true);
                }
            }
        });

        num_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!calc.getSc()) {
                    calc.setResult("8");
                    result.setText(calc.getResult());
                    calc.setSc(true);
                } else {
                    calc.setResult(calc.getResult() + "8");
                    result.setText(calc.getResult());
                    calc.setSc(true);
                }
            }
        });

        num_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!calc.getSc()) {
                    calc.setResult("9");
                    result.setText(calc.getResult());
                    calc.setSc(true);
                } else {
                    calc.setResult(calc.getResult() + "9");
                    result.setText(calc.getResult());
                    calc.setSc(true);
                }
            }
        });
    }
/*++++++++++++++++++++++++++++++++ Port +++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
    public void portClickNumber(Calc calc) {

    dote.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (!calc.getSc()) {
                if(!(result.getText() + "").contains(".")) {
                    calc.setResult("0.");
                    result.setText(calc.getResult());
                    calc.setSc(true);
                }
            } else {
                if(!(result.getText() + "").contains(".")) {
                    calc.setResult(calc.getResult() + ".");
                    result.setText(calc.getResult());
                    calc.setSc(true);
                }
            }

        }
    });

    num_0.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            //когда это первое число и действие не объявлено
            if(!calc.getSc()) {
                calc.setResult("0");
                result.setText(calc.getResult());
                calc.setSc(true);
                //когда действие объявлено но нет результата
            } else {
                calc.setResult(calc.getResult() + "0");
                result.setText(calc.getResult());
                calc.setSc(true);
            }
        }
    });

    num_1.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            if (!calc.getSc()) {
                calc.setResult("1");
                result.setText(calc.getResult());
                calc.setSc(true);
            } else {
                calc.setResult(calc.getResult() + "1");
                result.setText(calc.getResult());
                calc.setSc(true);
            }
        }
    });

    num_2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (!calc.getSc()) {
                calc.setResult("2");
                result.setText(calc.getResult());
                calc.setSc(true);
            } else {
                calc.setResult(calc.getResult() + "2");
                result.setText(calc.getResult());
                calc.setSc(true);
            }
        }
    });

    num_3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (!calc.getSc()) {
                calc.setResult("3");
                result.setText(calc.getResult());
                calc.setSc(true);
            } else {
                calc.setResult(calc.getResult() + "3");
                result.setText(calc.getResult());
                calc.setSc(true);
            }
        }
    });

    num_4.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (!calc.getSc()) {
                calc.setResult("4");
                result.setText(calc.getResult());
                calc.setSc(true);
            } else {
                calc.setResult(calc.getResult() + "4");
                result.setText(calc.getResult());
                calc.setSc(true);
            }
        }
    });

    num_5.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (!calc.getSc()) {
                calc.setResult("5");
                result.setText(calc.getResult());
                calc.setSc(true);
            } else {
                calc.setResult(calc.getResult() + "5");
                result.setText(calc.getResult());
                calc.setSc(true);
            }
        }
    });

    num_6.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (!calc.getSc()) {
                calc.setResult("6");
                result.setText(calc.getResult());
                calc.setSc(true);
            } else {
                calc.setResult(calc.getResult() + "6");
                result.setText(calc.getResult());
                calc.setSc(true);
            }
        }
    });

    num_7.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (!calc.getSc()) {
                calc.setResult("7");
                result.setText(calc.getResult());
                calc.setSc(true);
            } else {
                calc.setResult(calc.getResult() + "7");
                result.setText(calc.getResult());
                calc.setSc(true);
            }
        }
    });

    num_8.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (!calc.getSc()) {
                calc.setResult("8");
                result.setText(calc.getResult());
                calc.setSc(true);
            } else {
                calc.setResult(calc.getResult() + "8");
                result.setText(calc.getResult());
                calc.setSc(true);
            }
        }
    });

    num_9.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (!calc.getSc()) {
                calc.setResult("9");
                result.setText(calc.getResult());
                calc.setSc(true);
            } else {
                calc.setResult(calc.getResult() + "9");
                result.setText(calc.getResult());
                calc.setSc(true);
            }
        }
    });
}

    public void portClickStdAction(Calc calc) {

        AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc.ac();
                result.setText(calc.getResult());
                history.setText(calc.getHistory());
            }
        });

    }

    public void portClickMathAction(Calc calc) {

        evenly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc.evenly();
                result.setText(calc.getResult());
                history.setText(calc.getHistory());
                calc.ac();
            }
        });

        multiplier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc.multiplier();
                result.setText(calc.getResult());
                history.setText(calc.getHistory());
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc.division();
                result.setText(calc.getResult());
                history.setText(calc.getHistory());
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc.plus();
                result.setText(calc.getResult());
                history.setText(calc.getHistory());
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc.minus();
                result.setText(calc.getResult());
                history.setText(calc.getHistory());
            }
        });

        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc.sign();
                result.setText(calc.getResult());
            }
        });

    }
/*++++++++++++++++++++++++++++++++ private ++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
    private String getScreenOrientation(){
        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT)
            return "Port";
        else if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE)
            return "Land";
        else
            return "";
    }
}