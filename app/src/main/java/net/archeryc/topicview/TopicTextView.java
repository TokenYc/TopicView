package net.archeryc.topicview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by .cc on 2016/8/2.
 */
public class TopicTextView extends TextView{
    public TopicTextView(Context context) {
        this(context,null);
    }

    public TopicTextView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public TopicTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setBackgroundResource(R.drawable.topic_bg);
        setPadding(10,10,10,10);
    }

}
