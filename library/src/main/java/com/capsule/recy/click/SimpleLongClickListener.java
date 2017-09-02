//package com.capsule.recy.click;
//
//import android.support.v4.view.GestureDetectorCompat;
//import android.support.v7.widget.RecyclerView;
//import android.view.GestureDetector;
//import android.view.MotionEvent;
//import android.view.View;
//
///**
// * 描 述：
// * 作 者：Vegeta Yu
// * 时 间：2017/8/29 17:24
// */
//public abstract class SimpleLongClickListener implements RecyclerView.OnItemTouchListener {
//
//  protected RecyclerView          mRecyclerView;
//  private   GestureDetectorCompat mGestureDetector;
//
//  public SimpleLongClickListener(RecyclerView recyclerView) {
//    mRecyclerView = recyclerView;
//    mGestureDetector =
//        new GestureDetectorCompat(mRecyclerView.getContext(), new LongClickListener());
//  }
//
//  @Override public void onTouchEvent(RecyclerView rv, MotionEvent e) {
//    mGestureDetector.onTouchEvent(e);
//  }
//
//  @Override public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
//    mGestureDetector.onTouchEvent(e);
//    return false;
//  }
//
//  @Override public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {
//
//  }
//
//  public abstract void onItemLongClick(RecyclerView.ViewHolder vh, int position);
//
//  private class LongClickListener extends GestureDetector.SimpleOnGestureListener {
//
//    @Override public void onLongPress(MotionEvent e) {
//      View child = mRecyclerView.findChildViewUnder(e.getX(), e.getY());
//      int position = mRecyclerView.getChildLayoutPosition(child);
//      if (child != null) {
//        RecyclerView.ViewHolder holder = mRecyclerView.getChildViewHolder(child);
//        onItemLongClick(holder, position);
//      }
//    }
//  }
//}
