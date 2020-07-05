package com.dinocodeacademy.maingoquizagain.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.dinocodeacademy.maingoquizagain.model.Questions;
import com.dinocodeacademy.maingoquizagain.db.QuizContract.*;

import java.util.ArrayList;

public class QuizDbHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "GoQuiz.db";
    private static final int DATBASE_VERSION = 4 ;

    private SQLiteDatabase db;



   public QuizDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATBASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

        this.db = db;


        final String SQL_CREATE_QUESTIONS_TABLE = "CREATE TABLE " +
                QuestionTable.TABLE_NAME + " ( " +
                QuestionTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuestionTable.COLUMN_QUESTION + " TEXT, " +
                QuestionTable.COLUMN_OPTION1 + " TEXT, " +
                QuestionTable.COLUMN_OPTION2 + " TEXT, " +
                QuestionTable.COLUMN_OPTION3 + " TEXT, " +
                QuestionTable.COLUMN_OPTION4 + " TEXT, " +
                QuestionTable.COLUMN_ANSWER_NR + " INTEGER, " +
                QuestionTable.COLUMN_CATEGORY + " TEXT, " +
                QuestionTable.COLUMN_LEVElS_ID + " INTEGER " +
                ")";


        db.execSQL(SQL_CREATE_QUESTIONS_TABLE);
        fillQuestionsTable();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + QuestionTable.TABLE_NAME);
        onCreate(db);

    }




    private void fillQuestionsTable() {

        Questions q1 = new Questions("Level 1,Computers L1 : Android is what ?", "OS", "Drivers", "Software", "Hardware", 1,
                Questions.CATEGORY_COMPUTERS,Questions.LEVEL1);
        addQuestions(q1);
        Questions q11 = new Questions("Level 1,Computers L1 : IOS is what ?", "Phone", "Drivers", "Software", "Hardware", 1,
                Questions.CATEGORY_COMPUTERS,Questions.LEVEL1);
        addQuestions(q11);
        Questions q12 = new Questions("Level 1,Computers L1 : Windows is what ?", "PC's OS", "Drivers", "Software", "Hardware", 1,
                Questions.CATEGORY_COMPUTERS,Questions.LEVEL1);
        addQuestions(q12);


        Questions q14 = new Questions("Level 2,Computers L2 : Android is what ?", "OS", "Drivers", "Software", "Hardware", 1,
                Questions.CATEGORY_COMPUTERS,Questions.LEVEL1);
        addQuestions(q14);

        Questions q15 = new Questions("Level 2,Computers L2 : IOS is what ?", "Phone", "Drivers", "Software", "Hardware", 1,
                Questions.CATEGORY_COMPUTERS,Questions.LEVEL2);
        addQuestions(q15);

        Questions q19 = new Questions("Level 2,Computers L2 : Android is what ?", "OS", "Drivers", "Software", "Hardware", 1,
                Questions.CATEGORY_COMPUTERS,Questions.LEVEL2);
        addQuestions(q19);

        Questions q35 = new Questions("Level 2,Computers L2 : IOS is what ?", "Phone", "Drivers", "Software", "Hardware", 1,
                Questions.CATEGORY_COMPUTERS,Questions.LEVEL2);
        addQuestions(q35);

        Questions q39 = new Questions("Level 2,Computers L2 : Android is what ?", "OS", "Drivers", "Software", "Hardware", 1,
                Questions.CATEGORY_COMPUTERS,Questions.LEVEL2);
        addQuestions(q39);


        Questions q65 = new Questions("Level 3,Computers L3 : IOS is what ?", "Phone", "Drivers", "Software", "Hardware", 1,
                Questions.CATEGORY_COMPUTERS,Questions.LEVEL3);
        addQuestions(q65);

        Questions q5 = new Questions("Level 3,Computers L3 : Full form of PC is ?", "Personal Computer", "PIPO", "TIPU", "XXXIV", 1,
                Questions.CATEGORY_COMPUTERS,Questions.LEVEL3);
        addQuestions(q5);

        Questions q25 = new Questions("Level 3,Computers L3 : Full form of PC is ?", "Personal Computer", "PIPO", "TIPU", "XXXIV", 1,
                Questions.CATEGORY_COMPUTERS,Questions.LEVEL3);
        addQuestions(q25);


        Questions q2 = new Questions("Level 1,History : What is History ?", "New History", "PIPO", "TIPU", "XXXIV", 4,
                Questions.CATEGORY_HISTORY,Questions.LEVEL1);
        addQuestions(q2);

        Questions q4 = new Questions("Level 1,History : Bank is a History", "TOO", "No", "Software", "Hardware", 2,
                Questions.CATEGORY_HISTORY,Questions.LEVEL1);
        addQuestions(q4);

        Questions q112 = new Questions("Level 1,History : What is History ?", "New History", "PIPO", "TIPU", "XXXIV", 4,
                Questions.CATEGORY_HISTORY,Questions.LEVEL1);
        addQuestions(q112);

        Questions q114 = new Questions("Level 1, History : Bank is a History", "TOO", "No", "Software", "Hardware", 2,
                Questions.CATEGORY_HISTORY,Questions.LEVEL1);
        addQuestions(q114);

        Questions q222 = new Questions("Level 2,History : What is History ?", "New History", "PIPO", "TIPU", "XXXIV", 4,
                Questions.CATEGORY_HISTORY,Questions.LEVEL2);
        addQuestions(q222);

        Questions q224 = new Questions("Level 2, History : Bank is a History", "TOO", "No", "Software", "Hardware", 2,
                Questions.CATEGORY_HISTORY,Questions.LEVEL2);
        addQuestions(q224);

        Questions q2222 = new Questions("Level 3, History : What is History ?", "New History", "PIPO", "TIPU", "XXXIV", 4,
                Questions.CATEGORY_HISTORY,Questions.LEVEL3);
        addQuestions(q2222);

        Questions q2224 = new Questions("Level 3,History : Bank is a History", "TOO", "No", "Software", "Hardware", 2,
                Questions.CATEGORY_HISTORY,Questions.LEVEL3);
        addQuestions(q2224);




        Questions q3 = new Questions("Level 1,English : Verbs are topic of English ?", "English", "Hindi", "Yes", "Science", 3,
                Questions.CATEGORY_ENGLISH,Questions.LEVEL1);
        addQuestions(q3);

        Questions q6 = new Questions("Level 1,English : Conjuction are topic of English ?", "Simple", "Drivers", "Yes", "No", 3,
                Questions.CATEGORY_ENGLISH,Questions.LEVEL1);
        addQuestions(q6);

        Questions q7 = new Questions("Level 1,English : 2 + 2 ?", "4", "FOUR of This", "9", "11", 1,
                Questions.CATEGORY_ENGLISH,Questions.LEVEL1);
        addQuestions(q7);

        Questions q56 = new Questions("Level 1,English : Conjuction are topic of English ?", "Simple", "Drivers", "Yes", "No", 3,
                Questions.CATEGORY_ENGLISH,Questions.LEVEL1);
        addQuestions(q56);

        Questions q57 = new Questions("Level 1,English : 2 + 2 ?", "4", "FOUR of This", "9", "11", 1,
                Questions.CATEGORY_ENGLISH,Questions.LEVEL1);
        addQuestions(q57);

        Questions q8 = new Questions("Level 2, English : 5 * 5  ?", "23", "Twenty Five", "Yes", "No", 2,
                Questions.CATEGORY_ENGLISH,Questions.LEVEL2);
        addQuestions(q8);

        Questions q9 = new Questions("Level 2,English : 8 * 8 in English ?", "Eight", "very Good", "9", "11", 1,
                Questions.CATEGORY_ENGLISH,Questions.LEVEL2);
        addQuestions(q9);

        Questions q10 = new Questions("Level 2,English : 50 * 5  ?", "23", "500", "Yes", "No", 2,
                Questions.CATEGORY_ENGLISH,Questions.LEVEL2);
        addQuestions(q10);

        Questions q99 = new Questions("Level 2,English : 8 * 8 in English ?", "Eight", "very Good", "9", "11", 1,
                Questions.CATEGORY_ENGLISH,Questions.LEVEL2);
        addQuestions(q99);

        Questions q710 = new Questions("Level 3,English : 50 * 5  ?", "23", "500", "Yes", "No", 2,
                Questions.CATEGORY_ENGLISH,Questions.LEVEL3);
        addQuestions(q710);

        Questions q70 = new Questions("Level 3,English : 50 * 5  ?", "23", "500", "Yes", "No", 2,
                Questions.CATEGORY_ENGLISH,Questions.LEVEL3);
        addQuestions(q70);

        Questions q80 = new Questions("Level 3,English : 50 * 5  ?", "23", "500", "Yes", "No", 2,
                Questions.CATEGORY_ENGLISH,Questions.LEVEL3);
        addQuestions(q80);

        Questions q81 = new Questions("Level 3,English : 50 * 5  ?", "23", "500", "Yes", "No", 2,
                Questions.CATEGORY_ENGLISH,Questions.LEVEL3);
        addQuestions(q81);
    }

    private void addQuestions(Questions question) {

        ContentValues cv = new ContentValues();
        cv.put(QuestionTable.COLUMN_QUESTION, question.getQuestion());
        cv.put(QuestionTable.COLUMN_OPTION1, question.getOption1());
        cv.put(QuestionTable.COLUMN_OPTION2, question.getOption2());
        cv.put(QuestionTable.COLUMN_OPTION3, question.getOption3());
        cv.put(QuestionTable.COLUMN_OPTION4, question.getOption4());
        cv.put(QuestionTable.COLUMN_ANSWER_NR, question.getAnswerNr());
        cv.put(QuestionTable.COLUMN_CATEGORY, question.getCategory());
        cv.put(QuestionTable.COLUMN_LEVElS_ID, question.getLevels());
        db.insert(QuestionTable.TABLE_NAME, null, cv);

    }

    public ArrayList<Questions> getAllQuestionsWithCategoryAndLevels(int levelsID,String category) {

        ArrayList<Questions> questionList = new ArrayList<>();
        db = getReadableDatabase();

        String projection[] = {

                QuestionTable._ID,
                QuestionTable.COLUMN_QUESTION,
                QuestionTable.COLUMN_OPTION1,
                QuestionTable.COLUMN_OPTION2,
                QuestionTable.COLUMN_OPTION3,
                QuestionTable.COLUMN_OPTION4,
                QuestionTable.COLUMN_ANSWER_NR,
                QuestionTable.COLUMN_CATEGORY,
                QuestionTable.COLUMN_LEVElS_ID
        };

        String selection = QuestionTable.COLUMN_LEVElS_ID + " = ? " +
                " AND " + QuestionTable.COLUMN_CATEGORY + " = ? ";


        String[] selectionArgs = new String[] {String.valueOf(levelsID),category};

        Cursor c = db.query(
             QuestionTable.TABLE_NAME,
             projection,
             selection,
             selectionArgs,
             null,
             null,
             null
        );


        if (c.moveToFirst()) {
            do {

                Questions question = new Questions();
                question.setId(c.getInt(c.getColumnIndex(QuestionTable._ID)));
                question.setQuestion(c.getString(c.getColumnIndex(QuestionTable.COLUMN_QUESTION)));
                question.setOption1(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION3)));
                question.setOption4(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION4)));
                question.setAnswerNr(c.getInt(c.getColumnIndex(QuestionTable.COLUMN_ANSWER_NR)));
                question.setCategory(c.getString(c.getColumnIndex(QuestionTable.COLUMN_CATEGORY)));
                question.setLevels(c.getInt(c.getColumnIndex(QuestionTable.COLUMN_LEVElS_ID)));
                questionList.add(question);

            } while (c.moveToNext());

        }
        c.close();
        return questionList;

    }



    public ArrayList<Questions> getAllQuestions() {

        ArrayList<Questions> questionList = new ArrayList<>();
        db = getReadableDatabase();


        String Projection[] = {

                QuestionTable._ID,
                QuestionTable.COLUMN_QUESTION,
                QuestionTable.COLUMN_OPTION1,
                QuestionTable.COLUMN_OPTION2,
                QuestionTable.COLUMN_OPTION3,
                QuestionTable.COLUMN_OPTION4,
                QuestionTable.COLUMN_ANSWER_NR
        };


        Cursor c = db.query(QuestionTable.TABLE_NAME,
                Projection,
                null,
                null,
                null,
                null,
                null);


        if (c.moveToFirst()) {
            do {

                Questions question = new Questions();
                question.setQuestion(c.getString(c.getColumnIndex(QuestionTable.COLUMN_QUESTION)));
                question.setOption1(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION3)));
                question.setOption4(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION4)));
                question.setAnswerNr(c.getInt(c.getColumnIndex(QuestionTable.COLUMN_ANSWER_NR)));

                questionList.add(question);

            } while (c.moveToNext());

        }
        c.close();
        return questionList;

    }


    public ArrayList<Questions> getQuestionsWithCategory(String Category) {

        ArrayList<Questions> questionList = new ArrayList<>();
        db = getReadableDatabase();

        String Projection[] = {

                QuestionTable._ID,
                QuestionTable.COLUMN_QUESTION,
                QuestionTable.COLUMN_OPTION1,
                QuestionTable.COLUMN_OPTION2,
                QuestionTable.COLUMN_OPTION3,
                QuestionTable.COLUMN_OPTION4,
                QuestionTable.COLUMN_ANSWER_NR,
                QuestionTable.COLUMN_CATEGORY
        };

        String selection = QuestionTable.COLUMN_CATEGORY + " = ? ";
        String selectionArgs[] = {Category};

        Cursor c = db.query(QuestionTable.TABLE_NAME,
                Projection,
                selection,   // this will filter the records on the basis of Category
                selectionArgs,  // the value of this column will help to replace it with the condition in the selection
                null,
                null,
                null);


        if (c.moveToFirst()) {
            do {

                Questions question = new Questions();
                question.setQuestion(c.getString(c.getColumnIndex(QuestionTable.COLUMN_QUESTION)));
                question.setOption1(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION3)));
                question.setOption4(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION4)));
                question.setAnswerNr(c.getInt(c.getColumnIndex(QuestionTable.COLUMN_ANSWER_NR)));
                question.setCategory(c.getString(c.getColumnIndex(QuestionTable.COLUMN_CATEGORY)));

                questionList.add(question);

            } while (c.moveToNext());

        }
        c.close();
        return questionList;

    }


}


