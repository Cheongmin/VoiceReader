package com.cheongmin.voicereader.view

import android.content.Context
import android.support.v4.view.ViewPager
import android.util.AttributeSet
import android.view.MotionEvent

class StaticViewPager @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null) : ViewPager(context, attrs) {
  override fun onInterceptTouchEvent(ev: MotionEvent?): Boolean {
    return false
  }

  override fun onTouchEvent(ev: MotionEvent?): Boolean {
    return false
  }
}