//package com.example.mirimiter;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.Menu;
//import android.view.MenuItem;
//import android.view.MotionEvent;
//import android.view.View;
//import android.widget.ImageButton;
//
//import androidx.appcompat.app.ActionBar;
//import androidx.appcompat.widget.Toolbar;
//
//import androidx.annotation.NonNull;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.drawerlayout.widget.DrawerLayout;
//
//public class CommunityActivity extends AppCompatActivity {
//    private DrawerLayout drawerLayout;
//    private View drawerView;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        Toolbar main_toolbar = (Toolbar) findViewById(R.id.main_toolbar);
//        setSupportActionBar(main_toolbar);
//
//        ActionBar actionBar = getSupportActionBar();
//
//
//
//        drawerLayout = (DrawerLayout)findViewById(R.id.draw_layout);
//        drawerView = (View)findViewById(R.id.drawer);
//
//        ImageButton open = (ImageButton)findViewById(R.id.menu_open);
//        open.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                drawerLayout.openDrawer(drawerView);
//            }
//        });
//
//        ImageButton close = (ImageButton)findViewById(R.id.close);
//        close.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                drawerLayout.closeDrawers();
//            }
//        });
//        drawerLayout.setDrawerListener(listener);
//        drawerView.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                return true;
//            }
//        });
//    }
//    DrawerLayout.DrawerListener listener = new DrawerLayout.DrawerListener() {
//        @Override
//        public void onDrawerSlide(@NonNull View drawerView, float slideOffset) {
//
//        }
//
//        @Override
//        public void onDrawerOpened(@NonNull View drawerView) {
//
//        }
//
//        @Override
//        public void onDrawerClosed(@NonNull  View drawerView) {
//
//        }
//
//        @Override
//        public void onDrawerStateChanged(int newState) {
//
//        }
//    };
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.menu_plus) {
//
//            return true;
//        } else if(id == R.id.menu_search){
//            Intent intent2 = new Intent(this, SearchActivity.class);
//            startActivity(intent2);
//            return true;
//        }
//        return super.onOptionsItemSelected(item);
//    };
//}
