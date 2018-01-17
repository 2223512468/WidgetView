package com.jaja.widgetview.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/**
 * Created by ${Terry} on 2018/1/16.
 */
public class MyViewGroup extends FrameLayout {

    public MyViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
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
                Log.i("print", "MyViewGroup事件分发ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.i("print", "MyViewGroup事件分发ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.i("print", "MyViewGroup事件分发ACTION_UP");
                break;
        }
        return super.dispatchTouchEvent(ev);
    }

    /**
     * @param ev
     * @return true 拦截 不往下传递 并且直接执行事件消费， false or super:不拦截，往下一层分发
     */
    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.i("print", "MyViewGroup事件拦截ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.i("print", "MyViewGroup事件拦截ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.i("print", "MyViewGroup事件拦截ACTION_UP");
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
                Log.i("print", "MyViewGroup事件消费ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.i("print", "MyViewGroup事件消费ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.i("print", "MyViewGroup事件消费ACTION_UP");
                break;
        }
        return super.onTouchEvent(ev);
    }

}
