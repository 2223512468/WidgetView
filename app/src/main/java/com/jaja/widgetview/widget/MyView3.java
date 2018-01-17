package com.jaja.widgetview.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by ${Terry} on 2018/1/16.
 */
public class MyView3 extends View {

    public MyView3(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /**
     * 事件分发
     *
     * @param ev
     * @return
     */
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.i("print", "MyView3事件分发ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.i("print", "MyView3事件分发ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.i("print", "MyView3事件分发ACTION_UP");
                break;
        }
        return super.dispatchTouchEvent(ev);
    }

    /**
     * 事件消费
     *
     * @param ev
     * @return true表示 已消费此事件，不再往上传递 ，false.super对事件不感兴趣，如果View3设置了监听，则super表示对此事件感兴趣，且消费
     */
    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.i("print", "MyView3事件消费ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.i("print", "MyView3事件消费ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.i("print", "MyView3事件消费ACTION_UP");
                break;
        }
        return super.onTouchEvent(ev);
    }

}
