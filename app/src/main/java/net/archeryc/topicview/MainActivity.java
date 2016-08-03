package net.archeryc.topicview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TopicView topicView;
    private List<String> topics;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        topicView = (TopicView) findViewById(R.id.topicView);
        topics = new ArrayList<>();
        topics.add("#今天天气不错哦#");
        topics.add("#哈哈哈哈#");
        topics.add("#日常赛高哦#");
        topics.add("#saber咖喱帮#");
        topics.add("#黑丝凛棒棒哒#");
        topics.add("#今天天气不错哦#");
        topics.add("#哈哈哈哈#");
        topics.add("#日常赛高哦#");
        topics.add("#saber咖喱帮#");
        topics.add("#黑丝凛棒棒哒#"); topics.add("#今天天气不错哦#");
        topics.add("#哈哈哈哈#");
        topics.add("#日常赛高哦#");
        topics.add("#saber咖喱帮#");
        topics.add("#黑丝凛棒棒哒#");
        topicView.addTopic(topics);
    }
}
