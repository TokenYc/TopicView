package net.archeryc.topicview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private TopicView topicView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        topicView = (TopicView) findViewById(R.id.topicView);
        topicView.addTopic("#今天天气不错哦#");
    }
}
