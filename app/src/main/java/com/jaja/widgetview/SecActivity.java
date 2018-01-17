package com.jaja.widgetview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;

public class SecActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);
    }

    /**
     * 事件分发
     *
     * @param ev
     * @return super 继续往下分发， true 终止整件事件链的分发,false,表示停止当前链路的分发，但是不停止事件事件链的分发
     */
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.i("print", "activity事件分发ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.i("print", "activity事件分发ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.i("print", "activity事件分发ACTION_UP");
                break;
        }
        return super.dispatchTouchEvent(ev);
    }


    /**
     * 事件消费
     *
     * @param ev
     * @return
     */
    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.i("print", "activity事件消费ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.i("print", "activity事件消费ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.i("print", "activity事件消费ACTION_UP");
                break;
        }
        return super.onTouchEvent(ev);
    }

}
