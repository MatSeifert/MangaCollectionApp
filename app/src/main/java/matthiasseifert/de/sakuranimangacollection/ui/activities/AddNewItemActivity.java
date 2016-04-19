package matthiasseifert.de.sakuranimangacollection.ui.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import matthiasseifert.de.sakuranimangacollection.Backend;
import matthiasseifert.de.sakuranimangacollection.R;
import matthiasseifert.de.sakuranimangacollection.model.Book;
import matthiasseifert.de.sakuranimangacollection.util.NumberUtils;

public class AddNewItemActivity extends AppCompatActivity {
    Book _book;

    // get Backend
    Backend _backend = new Backend();

    // Textviews
    TextView _headline;

    // Buttons
    Button _button_back;
    Button _button_save;

    // EditTexts
    EditText _bookName;
    EditText _bookAuthor;
    EditText _bookPainter;
    EditText _bookPrice;
    EditText _bookYear;
    EditText _bookIsbn;
    EditText _bookPublisher;
    EditText _bookEdition;

    // Spinner
    Spinner _bookLanguage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addnewitem);

        // Instantiate Stuff
        _headline = (TextView) findViewById(R.id.headline);
        _button_back = (Button) findViewById(R.id.toolbar_ButtonBack);
        _button_save = (Button) findViewById(R.id.toolbar_ButtonSave);
        _bookName = (EditText) findViewById(R.id.addnewitem_input_name);
        _bookAuthor = (EditText) findViewById(R.id.addnewitem_input_author);
        _bookPainter = (EditText) findViewById(R.id.addnewitem_input_painter);
        _bookPrice = (EditText) findViewById(R.id.addnewitem_input_price);
        _bookYear = (EditText) findViewById(R.id.addnewitem_input_year);
        _bookIsbn = (EditText) findViewById(R.id.addnewitem_input_isbn);
        _bookPublisher = (EditText) findViewById(R.id.addnewitem_input_publisher);
        _bookEdition = (EditText) findViewById(R.id.addnewitem_input_edition);

        assert _headline != null;
        _headline.setText(R.string.addNewItem_Title);

        // Enable Toolbar Buttons
        _button_back.setVisibility(View.VISIBLE);
        _button_save.setVisibility(View.VISIBLE);

        // Initialize Objects
        _book = new Book();

        // Set Listeners
        _button_back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();
            }
        });

        _button_save.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                saveData();
            }
        });
    }

    private void saveData() {
        _book.setTitle(_bookName.getText().toString());
        _book.setValue(NumberUtils.StringToDouble(_bookPrice.getText().toString()));

        _backend.createBook(_book);

        Toast.makeText(this, R.string.addnewitem_success, Toast.LENGTH_LONG).show();
        this.finish();
    }
}
