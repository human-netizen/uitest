package com.example.uitesting;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;
import org.junit.Test;

public class MainActivityTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testButtonClick_Red() {
        // Click the button
        Espresso.onView(ViewMatchers.withId(R.id.button))
                .perform(ViewActions.click());

        // Check if the text view displays "Red!"
        Espresso.onView(ViewMatchers.withId(R.id.textView))
                .check(ViewAssertions.matches(ViewMatchers.withText("Red!")));
    }

    @Test
    public void testButtonClick_Green() {
        // Click the button twice
        Espresso.onView(ViewMatchers.withId(R.id.button))
                .perform(ViewActions.click())
                .perform(ViewActions.click());

        // Check if the text view displays "Green!"
        Espresso.onView(ViewMatchers.withId(R.id.textView))
                .check(ViewAssertions.matches(ViewMatchers.withText("Green!")));
    }

    @Test
    public void testButtonClick_Alternate() {
        // Click the button three times
        Espresso.onView(ViewMatchers.withId(R.id.button))
                .perform(ViewActions.click())
                .perform(ViewActions.click())
                .perform(ViewActions.click());

        // Check if the text view alternates between "Red!" and "Green!"
        Espresso.onView(ViewMatchers.withId(R.id.textView))
                .check(ViewAssertions.matches(ViewMatchers.withText("Red!")));

    }
}
