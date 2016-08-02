package net.archeryc.topicview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by .cc on 2016/8/2.
 */
public class TopicView extends LinearLayout{
    private List<TopicTextView> mTopicTextViews;
    private Context mContext;

    public TopicView(Context context) {
        this(context,null);
    }

    public TopicView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public TopicView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext=context;
        mTopicTextViews = new ArrayList<>();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(500,500);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
//        setMeasuredDimension(200,200);
        if (mTopicTextViews.size()>0){
            mTopicTextViews.get(0).layout(l,t,r,b);
        }
    }

    public void addTopic(String name){
        TopicTextView topicTextView = new TopicTextView(mContext);
        topicTextView.setText(name);
        mTopicTextViews.add(topicTextView);
        addView(mTopicTextViews.get(0),generateDefaultLayoutParams());
        requestLayout();
    }
}
