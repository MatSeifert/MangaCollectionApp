package matthiasseifert.de.sakuranimangacollection;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import matthiasseifert.de.sakuranimangacollection.model.Book;

public class AddNewItemActivity extends AppCompatActivity {
    Book _book;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addnewitem);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        assert toolbar != null;
        toolbar.setSubtitle(R.string.addNewItem_Title);

        _book = new Book();
    }
}
