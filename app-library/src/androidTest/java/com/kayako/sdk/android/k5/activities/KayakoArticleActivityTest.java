package com.kayako.sdk.android.k5.activities;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.kayako.sdk.android.k5.R;
import com.kayako.sdk.android.k5.core.KayakoHC;

import org.junit.Before;
import org.junit.Rule;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

/**
 * @author Neil Mathew <neil.mathew@kayako.com>
 */
public class KayakoArticleActivityTest {

    @Rule
    public ActivityTestRule<KayakoArticleActivity> mActivityRule = new ActivityTestRule<>(KayakoArticleActivity.class);

    @Before
    public void setUp() throws Exception {
        KayakoHC.initialize(mActivityRule.getActivity().getApplicationContext());
    }


    public static void checkIfArticlePageDisplayed() {
        onView(withId(R.id.ko__article_title)).check(matches(isDisplayed()));
    }
}