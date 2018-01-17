package com.jaja.widgetview.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/**
 * Created by ${Terry} on 2018/1/16.
 */
public class MyViewGroup1 extends FrameLayout {

    public MyViewGroup1(Context context, AttributeSet attrs) {
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
                Log.i("print", "MyViewGroup1事件分发ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.i("print", "MyViewGroup1事件分发ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.i("print", "MyViewGroup1事件分发ACTION_UP");
                break;
        }
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.i("print", "MyViewGroup1事件拦截ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.i("print", "MyViewGroup1事件拦截ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.i("print", "MyViewGroup1事件拦截ACTION_UP");
                break;
        }
        return super.onInterceptTouchEvent(ev);
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
                Log.i("print", "MyViewGroup1事件消费ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.i("print", "MyViewGroup1事件消费ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.i("print", "MyViewGroup1事件消费ACTION_UP");
                break;
        }
        return super.onTouchEvent(ev);
    }


}
