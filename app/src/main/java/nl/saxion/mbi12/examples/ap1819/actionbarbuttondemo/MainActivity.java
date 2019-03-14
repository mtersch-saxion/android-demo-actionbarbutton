package nl.saxion.mbi12.examples.ap1819.actionbarbuttondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

// A little demo of putting a button in the action bar at the top of the screen.
// By request of my students in the Thursday afternoon class; credits to my students in the Thursday morning class. :-P

// Using Android Studio (3.2.1) to create this demo

// Bits to check out: the menu resource file (in the 'Android' tree on the left: right-click 'res',
// add a new Android resource file of resource type 'Menu', and invent a nice name),
// and code in this file (MainActivity.java).

// In the menu item resource file (menu_test.xml) on the menu-item 'miIconItem' I've set the 'icon' property
// to the ic_launcher_foreground drawable (the icon to use), and set the 'showAsAction' property to 'always'
// (show as icon in the action bar, and don't hide, even if you run out of space).

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Setup the menu we defined:
     * - get a MenuInflater object, and call inflate() to add this menu at 'menu'
     * - call super.onCreateOptionsMenu() (as suggested in https://developer.android.com/reference/android/app/Activity.html#onCreateOptionsMenu(android.view.Menu))
     * @param menu Menu to add menu items to
     * @return True if menu should be shown, or false if it should not be shown
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_test, menu);
        return super.onCreateOptionsMenu(menu);
    }

    /**
     * Handle clicks on the menu items (including items pushed into the action bar as icons)
     * @param item Menu item that was clicked
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Check: did we click our action bar icon menu item?
        // How? By asking for the item's ID, and checking it against our action bar icon menu item's ID
        if (item.getItemId() == R.id.miIconItem) {
            // Now do something useful... like showing a Toast message :-P
            Toast.makeText(this, "Clicked the icon!", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }
}
