package net.archeryc.topicview;

import android.content.Context;
import android.hardware.Camera;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 杨晨 on 2016/8/2.
 *
 */
public class TopicView extends ViewGroup {
    private static final int MARGIN_LINE=20;
    private static final int MARGIN_ROW=10;
    private List<TopicTextView> mTopicTextViews;
    private Context mContext;
    private int mTotalWidth = -1;

    public TopicView(Context context) {
        this(context, null);
    }

    public TopicView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TopicView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;
        mTopicTextViews = new ArrayList<>();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        measureChildren(widthMeasureSpec,heightMeasureSpec);
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        mTotalWidth=getMeasuredWidth();
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
//        setMeasuredDimension(200,200);
        Log.d("width", "layoutWidth:" + mTotalWidth);
        int mCurrentLeft=l;
        int mCurrentTop=t;
        if (mTopicTextViews!=null&&mTopicTextViews.size() > 0) {
            for (TopicTextView topicTextView:mTopicTextViews){
                if (mCurrentLeft+topicTextView.getMeasuredWidth()>mTotalWidth){
                    mCurrentLeft=l;
                    mCurrentTop=mCurrentTop+topicTextView.getMeasuredHeight()+MARGIN_LINE;
                }
                int left=mCurrentLeft;
                int top=mCurrentTop;
                int right=left+topicTextView.getMeasuredWidth();
                int bottom=top+topicTextView.getMeasuredHeight();
                Log.d("ltrb","left:"+left+" top:"+top+" right:"+right+" bottom:"+bottom);
                topicTextView.layout(left,top,right,bottom);
                mCurrentLeft=right+MARGIN_ROW;
            }
        }
    }

    public void addTopic(List<String> topics) {
        for (String name : topics) {
            TopicTextView topicTextView = new TopicTextView(mContext);
            topicTextView.setText(name);
            mTopicTextViews.add(topicTextView);
            addView(topicTextView, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        }
        requestLayout();
    }
}
