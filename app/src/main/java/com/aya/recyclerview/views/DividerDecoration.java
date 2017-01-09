package com.aya.recyclerview.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.aya.recyclerview.R;

public class DividerDecoration extends RecyclerView.ItemDecoration {

    private final Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private final int dividerHeight;

    public DividerDecoration(Context context, Resources res) {
        paint.setColor(ContextCompat.getColor(context, R.color.colorAccent));
        dividerHeight = (int) (2 * res.getDisplayMetrics().density);
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        final int position = ((RecyclerView.LayoutParams) view.getLayoutParams()).getViewLayoutPosition();

        int top = position == 0 ? 0 : dividerHeight;
        outRect.set(0, top, 0, 0);
    }

    @Override
    public void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.State state) {
        super.onDrawOver(c, parent, state);

        final RecyclerView.LayoutManager manager = parent.getLayoutManager();
        final int left = parent.getPaddingLeft();
        final int right = parent.getWidth() - parent.getPaddingRight();
        final int childCount = parent.getChildCount();

        for (int i = 0; i < childCount; i++) {
            final View child = parent.getChildAt(i);
            final RecyclerView.LayoutParams params = (RecyclerView.LayoutParams) child.getLayoutParams();

            if (params.getViewLayoutPosition() == 0) {
                continue;
            }

            final int top = manager.getDecoratedTop(child) - params.topMargin + Math.round(ViewCompat.getTranslationY(child));
            final int bottom = top + dividerHeight;

            c.drawRect(left, top, right, bottom, paint);
        }
    }

}
