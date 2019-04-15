package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    final int FIRST_STORY_NUMBER = 1;
    final int SECOND_STORY_NUMBER = 2;
    final int THIRD_STORY_NUMBER = 3;
    final int FOURTH_STORY_NUMBER = 4;
    final int FIFTH_STORY_NUMBER = 5;
    final int SIXTH_STORY_NUMBER = 6;

    private TextView storyTextView;
    private Button topButton;
    private Button bottomButton;
    private int currentStory = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        storyTextView = (TextView) findViewById(R.id.storyTextView);
        topButton = (Button) findViewById(R.id.buttonTop);
        bottomButton = (Button) findViewById(R.id.buttonBottom);




        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                continueStory(v);
            }
        });




        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        bottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                continueStory(v);
            }
        });

    }

    public void continueStory(View pressedButton)
    {
        int pressedButtonID = pressedButton.getId();

        switch (currentStory)
        {
            case FIRST_STORY_NUMBER:
                if(pressedButtonID == topButton.getId())
                {
                    currentStory = THIRD_STORY_NUMBER;
                    changeInterfaceStory(currentStory);
                }
                else
                {
                    currentStory = SECOND_STORY_NUMBER;
                    changeInterfaceStory(currentStory);
                }
                break;
            case SECOND_STORY_NUMBER:
                if(pressedButtonID == topButton.getId())
                {
                    currentStory = THIRD_STORY_NUMBER;
                    changeInterfaceStory(currentStory);
                }
                else
                {
                    currentStory = FOURTH_STORY_NUMBER;
                    changeInterfaceStory(currentStory);
                }
                break;
            case THIRD_STORY_NUMBER:
                if(pressedButtonID == topButton.getId())
                {
                    currentStory = SIXTH_STORY_NUMBER;
                    changeInterfaceStory(currentStory);
                }
                else
                {
                    currentStory = FIFTH_STORY_NUMBER;
                    changeInterfaceStory(currentStory);
                }
                break;
            case FOURTH_STORY_NUMBER:
                break;
            case FIFTH_STORY_NUMBER:
                break;
            case SIXTH_STORY_NUMBER:
                break;
        }
    }

    private void changeInterfaceStory(int story)
    {
        switch(story)
        {
            case FIRST_STORY_NUMBER:
                storyTextView.setText(R.string.T1_Story);
                topButton.setText(R.string.T1_Ans1);
                bottomButton.setText(R.string.T1_Ans2);
                break;
            case SECOND_STORY_NUMBER:
                storyTextView.setText(R.string.T2_Story);
                topButton.setText(R.string.T2_Ans1);
                bottomButton.setText(R.string.T1_Ans2);
                break;
            case THIRD_STORY_NUMBER:
                storyTextView.setText(R.string.T3_Story);
                topButton.setText(R.string.T3_Ans1);
                bottomButton.setText(R.string.T3_Ans2);
                break;
            case FOURTH_STORY_NUMBER:
                storyTextView.setText(R.string.T4_End);
                topButton.setVisibility(View.INVISIBLE);
                bottomButton.setVisibility(View.INVISIBLE);
                break;
            case FIFTH_STORY_NUMBER:
                storyTextView.setText(R.string.T5_End);
                topButton.setVisibility(View.INVISIBLE);
                bottomButton.setVisibility(View.INVISIBLE);
                break;
            case SIXTH_STORY_NUMBER:
                storyTextView.setText(R.string.T6_End);
                topButton.setVisibility(View.INVISIBLE);
                bottomButton.setVisibility(View.INVISIBLE);
                break;

        }
    }
}
