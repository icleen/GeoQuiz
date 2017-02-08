package com.bignerdranch.android.geoquiz;

/**
 * Created by iainlee on 2/7/17.
 */

public class Question {

    private int mTextResId;
    private boolean mAnserTrue;

    public Question(int textRedId, boolean answerTrue) {
        mTextResId = textRedId;
        mAnserTrue = answerTrue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnserTrue() {
        return mAnserTrue;
    }

    public void setAnserTrue(boolean anserTrue) {
        mAnserTrue = anserTrue;
    }

}
