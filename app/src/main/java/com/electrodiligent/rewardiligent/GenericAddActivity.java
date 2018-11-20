package com.electrodiligent.rewardiligent;

import android.app.Fragment;
import android.app.FragmentManager;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.electrodiligent.rewardiligent.database.DataSource;
import com.electrodiligent.rewardiligent.database.DbHelper;
import com.electrodiligent.rewardiligent.model.TodoItem;

public class GenericAddActivity extends AppCompatActivity {

    DataSource mDataSource;
    EditText noteTitleEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        mDataSource = new DataSource(this);


        setContentView(R.layout.activity_generic_add);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        noteTitleEditText = (EditText) findViewById(R.id.task_title);

        setSupportActionBar(toolbar);
        toolbar.showOverflowMenu();


//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        mDataSource.close();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mDataSource.open();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_generic_add, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_add: {
                String title = String.valueOf(noteTitleEditText.getText());
                TodoItem todoItem = new TodoItem(null, title, null, null);
                mDataSource.createToDoItem(todoItem);
                Toast.makeText(this, "Item added", Toast.LENGTH_LONG).show();
                noteTitleEditText.setText("");
                break;
            }
            // case blocks for other MenuItems (if any)
        }
        return false;
    }

}
