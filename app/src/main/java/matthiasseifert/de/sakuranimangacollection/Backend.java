package matthiasseifert.de.sakuranimangacollection;

import android.app.Application;
import android.content.Context;

import matthiasseifert.de.sakuranimangacollection.model.Book;
import matthiasseifert.de.sakuranimangacollection.model.DaoMaster;
import matthiasseifert.de.sakuranimangacollection.model.DaoSession;

public class Backend {

    private Context _context;
    private static Backend _instance;

    private Backend(Context context) {
        _context = context;
    }

    public static Backend get_instance(Context context) {
        if(_instance == null) {
            _instance = new Backend(context.getApplicationContext());
            _instance.init_();
        }

        return _instance;
    }

    private void init_() {
//        DaoMaster _daoMaster = new DaoMaster(db);
//        DaoSession _daoSession = _daoMaster.newSession();
    }


    public void createBook(Book book) {
        // _daoSession.getBookDao().insert(book);
    }
}
