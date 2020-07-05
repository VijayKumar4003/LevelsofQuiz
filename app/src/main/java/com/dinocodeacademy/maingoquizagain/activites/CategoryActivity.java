package com.dinocodeacademy.maingoquizagain.activites;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.dinocodeacademy.maingoquizagain.constants.CategoryConstants;
import com.dinocodeacademy.maingoquizagain.constants.Constant;
import com.dinocodeacademy.maingoquizagain.R;

public class CategoryActivity extends AppCompatActivity implements View.OnClickListener{



    Button btHistory,btComputers,btEnglish,btMaths,btGraphics;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        btHistory = findViewById(R.id.button2);
        btEnglish = findViewById(R.id.button3);
        btComputers = findViewById(R.id.button5);
        btMaths = findViewById(R.id.button4);
        btGraphics = findViewById(R.id.button6);


        btGraphics.setOnClickListener(this);
        btMaths.setOnClickListener(this);
        btComputers.setOnClickListener(this);
        btEnglish.setOnClickListener(this);
        btHistory.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.button2:  // history
                createLevelsForHistory();
                Intent intentHistory = new Intent(CategoryActivity.this, HistoryLevelActivity.class);
                intentHistory.putExtra("Category", CategoryConstants.HISTORY);
                startActivity(intentHistory);
                break;
            case R.id.button3:  // English

                Intent intentEnglish = new Intent(CategoryActivity.this, ComputerLevelActivity.class);
                intentEnglish.putExtra("Category", CategoryConstants.ENGLISH);
                startActivity(intentEnglish);
                break;

            case R.id.button4:  // Maths

                Intent intentMaths = new Intent(CategoryActivity.this, ComputerLevelActivity.class);
                intentMaths.putExtra("Category", CategoryConstants.MATHS);
                startActivity(intentMaths);
                break;

            case R.id.button5:  // Computers

                createLevelsForComp();

                Intent intentComputers = new Intent(CategoryActivity.this, ComputerLevelActivity.class);
                intentComputers.putExtra("Category", CategoryConstants.COMPUTERS);
                startActivity(intentComputers );
                break;

            case R.id.button6:  // Graphics

                Intent intentGraphics = new Intent(CategoryActivity.this, ComputerLevelActivity.class);
                intentGraphics.putExtra("Category", CategoryConstants.GRAPHICS);
                startActivity(intentGraphics );
                break;


        }

    }

    private void createLevelsForHistory() {



        SharedPreferences sharedPreferences =
                getSharedPreferences(getPackageName() + Constant.MY_LEVEL_PREFFILE,
                        Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(Constant.KEY_HIS_LEVEL_1,1);
        editor.putString(Constant.KEY_CAT_HIS_LEVEL_1,"Unlock");
        editor.apply();

        if(sharedPreferences.getString(Constant.KEY_CAT_HIS_LEVEL_1, "N/A").equals("Unlock")) {
            editor.putInt(Constant.KEY_HIS_LEVEL_1,1);
            editor.putInt(Constant.KEY_HIS_LEVEL_2,1);
            editor.putInt(Constant.KEY_HIS_LEVEL_3,0);

        }else if (sharedPreferences.getString(Constant.KEY_CAT_HIS_LEVEL_2, "N/A").equals("Unlock")){
            editor.putInt(Constant.KEY_HIS_LEVEL_1,1);
            editor.putInt(Constant.KEY_HIS_LEVEL_2,1);
            editor.putInt(Constant.KEY_HIS_LEVEL_3,0);
        }else if (sharedPreferences.getString(Constant.KEY_CAT_HIS_LEVEL_3, "N/A").equals("Unlock")){
            editor.putInt(Constant.KEY_HIS_LEVEL_1,1);
            editor.putInt(Constant.KEY_HIS_LEVEL_2,1);
            editor.putInt(Constant.KEY_HIS_LEVEL_3,1);
        }


    }


    ////         1 = unlocked    and   0 = locked
    public void createLevelsForComp(){

        SharedPreferences sharedPreferences =
                getSharedPreferences(getPackageName() + Constant.MY_LEVEL_PREFFILE,
                        Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(Constant.KEY_COMP_LEVEL_1,1);
        editor.putString(Constant.KEY_CAT_COMP_LEVEL_1,"Unlock");
        editor.apply();

        if(sharedPreferences.getString(Constant.KEY_CAT_COMP_LEVEL_1, "N/A").equals("Unlock")) {
            editor.putInt(Constant.KEY_COMP_LEVEL_1,1);
            editor.putInt(Constant.KEY_COMP_LEVEL_2,1);
            editor.putInt(Constant.KEY_COMP_LEVEL_3,0);

        }else if (sharedPreferences.getString(Constant.KEY_CAT_COMP_LEVEL_2, "N/A").equals("Unlock")){
            editor.putInt(Constant.KEY_COMP_LEVEL_1,1);
            editor.putInt(Constant.KEY_COMP_LEVEL_2,1);
            editor.putInt(Constant.KEY_COMP_LEVEL_3,0);
        }else if (sharedPreferences.getString(Constant.KEY_CAT_COMP_LEVEL_3, "N/A").equals("Unlock")){
            editor.putInt(Constant.KEY_COMP_LEVEL_1,1);
            editor.putInt(Constant.KEY_COMP_LEVEL_2,1);
            editor.putInt(Constant.KEY_COMP_LEVEL_3,1);
        }

    }

}
