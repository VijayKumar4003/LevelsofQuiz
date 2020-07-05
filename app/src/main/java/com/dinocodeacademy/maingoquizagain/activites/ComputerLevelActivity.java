package com.dinocodeacademy.maingoquizagain.activites;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.dinocodeacademy.maingoquizagain.constants.Constant;
import com.dinocodeacademy.maingoquizagain.model.Questions;
import com.dinocodeacademy.maingoquizagain.R;

public class ComputerLevelActivity extends AppCompatActivity implements View.OnClickListener {

    Button btLevel1,btLevel2,btLevel3;
    String CategoryValue = "";

    int CL1, CL2, CL3;

    TextView txtLevel1,txtLevel2,txtLevel3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computers_levels);

        btLevel1 = findViewById(R.id.btLevel1);
        btLevel2 = findViewById(R.id.btLevel2);
        btLevel3 = findViewById(R.id.btLevel3);

        txtLevel1 = findViewById(R.id.textView);
        txtLevel2 = findViewById(R.id.textView2);
        txtLevel3 = findViewById(R.id.textView3);


//        btLevel1.setOnClickListener(this);
//        btLevel2.setOnClickListener(this);
//        btLevel3.setOnClickListener(this);



        lockandUnlockLevels();



        Intent intentCategory = getIntent();
        CategoryValue = intentCategory.getStringExtra("Category");


    }



    @Override
    public void onClick(View v) {

        if (CategoryValue.equals("Computers")) {

            switch (v.getId()) {

                case R.id.btLevel1:

                    Intent intentCompLevel1 = new Intent(ComputerLevelActivity.this, QuizActivity.class);
                    intentCompLevel1.putExtra("Category", Questions.CATEGORY_COMPUTERS);
                    intentCompLevel1.putExtra("Level", Questions.LEVEL1);
                    startActivity(intentCompLevel1);
                    break;


                case R.id.btLevel2:

                    Intent intentCompLevel2 = new Intent(ComputerLevelActivity.this, QuizActivity.class);
                    intentCompLevel2.putExtra("Category", Questions.CATEGORY_COMPUTERS);
                    intentCompLevel2.putExtra("Level", Questions.LEVEL2);
                    startActivity(intentCompLevel2);

                    break;



                case R.id.btLevel3:

                    Intent intentCompLevel3 = new Intent(ComputerLevelActivity.this, QuizActivity.class);
                    intentCompLevel3.putExtra("Category",Questions.CATEGORY_COMPUTERS);
                    intentCompLevel3.putExtra("Level", Questions.LEVEL3);
                    startActivity(intentCompLevel3);

                    break;



            }
        }


    }


    public void LoadData(View view) {

        txtLevel1.setText(String.valueOf(CL1));
        txtLevel2.setText(String.valueOf(CL2));
        txtLevel3.setText(String.valueOf(CL3));

    }


    private void lockandUnlockLevels() {

        SharedPreferences sharedPreferences =
                getSharedPreferences(getPackageName() + Constant.MY_LEVEL_PREFFILE,
                        Context.MODE_PRIVATE);
        CL1 = sharedPreferences.getInt(Constant.KEY_COMP_LEVEL_1,0);
        CL2 = sharedPreferences.getInt(Constant.KEY_COMP_LEVEL_2,0);
        CL3 = sharedPreferences.getInt(Constant.KEY_COMP_LEVEL_3,0);


             if (CL1 == 1){

                btLevel1.setClickable(true);
                btLevel1.setBackground(ContextCompat.getDrawable(this, R.drawable.level_unlock));
                btLevel1.setOnClickListener(this);

            }else if (CL1 == 0){

                btLevel1.setClickable(false);
                btLevel1.setBackground(ContextCompat.getDrawable(this, R.drawable.lock_bg));
            }

            if (CL2 == 1){

                btLevel2.setClickable(true);
                btLevel2.setBackground(ContextCompat.getDrawable(this, R.drawable.level_unlock));
                btLevel2.setOnClickListener(this);

            }else if (CL2 == 0){

                btLevel2.setClickable(false);
                btLevel2.setBackground(ContextCompat.getDrawable(this, R.drawable.lock_bg));
            }

            if (CL3 == 1){

                btLevel3.setClickable(true);
                btLevel3.setBackground(ContextCompat.getDrawable(this, R.drawable.level_unlock));
                btLevel3.setOnClickListener(this);

            }else if (CL3 == 0){

                btLevel3.setClickable(false);
                btLevel3.setBackground(ContextCompat.getDrawable(this, R.drawable.lock_bg));
            }

    }






}
