package com.example.activitylife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    //onCreate()方法:当Activity第一次被创建时调用
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("LifeActivity","onCreate");
    }

    //onDestroy()方法：当销毁Activity对象时调用
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("LifeActivity","onDestroy");
    }

    //onPause()方法:当系统调用其他Activity对象时调用，可以在这个方法中将当前Activity对象没有保存的
    //数据保存到持久化对象中，新的Activity对象必须等待onPause()方法执行完毕后再显示出来
    @Override
    protected void onPause(){
        super.onPause();
        Log.i("LifeActivity","onPause");
    }

    //onRestart()方法：当处于onStop()状态的Activity又变为可视时调用
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i("LifeActivity","onRestart");
    }

    //onResume()方法：Activity对象到达Activity栈的顶部即将成为前台进程时被调用
    @Override
    protected void onResume(){
        super.onResume();
        Log.i("LifeActivity","onResume");
    }

    //onStart()方法：当Activity变为用户可见之前调用
    @Override
    protected void onStart(){
        super.onStart();
        Log.i("LifeActivity","onStart");
    }

    //onStop()方法：当Activity不可视时调用
    @Override
    protected  void onStop(){
        super.onStop();
        Log.i("LifeActivity","onStop");
    }

    //当Activity窗口获得或失去焦点时被调用
    @Override
    public void onWindowFocusChanged(boolean hasFocus){
        super.onWindowFocusChanged(hasFocus);
        Log.i("LifeActivity","onWindowFocusChanged");
    }

    //在Activity被覆盖或退居后台之后，系统资源不足将其杀死，此方法会被调用
    @Override
    protected void onSaveInstanceState(Bundle outState){
        Log.i("LifeActivity","onSaveInstanceStste");
        super.onSaveInstanceState(outState);
    }

    //在Activity被覆盖或退居后台之后，系统资源不足将其杀死，然后用户又回到Activity时，此方法会被
    //调用
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState){
        Log.i("LifeActivity","onRestoreInstanceState");
        super.onRestoreInstanceState(savedInstanceState);
    }
}
