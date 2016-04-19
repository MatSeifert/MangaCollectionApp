package matthiasseifert.de.sakuranimangacollection;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import matthiasseifert.de.sakuranimangacollection.model.Book;

public class AddNewItemActivity extends AppCompatActivity {
    Book _book;

    // Textviews
    TextView _headline;

    // Buttons
    Button _button_back;
    Button _button_save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addnewitem);

        // Instantiate Stuff
        _headline = (TextView) findViewById(R.id.headline);
        _button_back = (Button) findViewById(R.id.toolbar_ButtonBack);
        _button_save = (Button) findViewById(R.id.toolbar_ButtonSave);

        assert _headline != null;
        _headline.setText(R.string.addNewItem_Title);

        // Enable Toolbar Buttons
        _button_back.setVisibility(View.VISIBLE);
        _button_save.setVisibility(View.VISIBLE);

        // Initialize Objects
        _book = new Book();

        // Set Listeners
        _button_back.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
