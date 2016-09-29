package edu.uclm.tritype;

import android.app.Activity;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.runner.lifecycle.ActivityLifecycleMonitorRegistry;
import android.support.test.runner.lifecycle.Stage;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Collection;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


/**
 * Created by macario.polo on 28/9/16.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class TriTypeTest2 {
    @Rule
    public ActivityTestRule<MainMenuActivity> sut=new ActivityTestRule<MainMenuActivity>(MainMenuActivity.class);

    @Before
    public void setUp() {
    }

    @Test
    public void mainMenu() throws InterruptedException {
        onView(withId(R.id.buttonWriting)).perform(click());
        onView(withId(R.id.editTextMoving1)).perform(typeText("5"));
        onView(withId(R.id.editText2)).perform(typeText("5"));
        onView(withId(R.id.editText3)).perform(typeText("5"));
        onView(withId(R.id.buttongetType)).perform(click());

        onView(withId(R.id.textViewResult)).check(matches(withText("EQUILATERAL")));

        /*getActivityInstance().finish();
        Activity act = getActivityInstance();
        onView(withId(R.id.buttonDrawing)).perform(click());*/
    }









    @Test
    public void test1() {
        // Falta un valor
        onView(withId(R.id.buttonWriting)).perform(click());
        onView(withId(R.id.editTextMoving1)).perform(typeText("-100"));
        onView(withId(R.id.editText2)).perform(typeText("-100"));
        onView(withId(R.id.buttongetType)).perform(click());

        onView(withId(R.id.textViewResult)).check(matches(withText("Number expected")));
    }





    @Test
    public void test2() {
        // Falta un valor
        onView(withId(R.id.buttonWriting)).perform(click());
        onView(withId(R.id.editTextMoving1)).perform(typeText("-100"));
        onView(withId(R.id.editText2)).perform(typeText("0"));
        onView(withId(R.id.buttongetType)).perform(click());

        onView(withId(R.id.textViewResult)).check(matches(withText("Number expected")));
    }





    @Test
    public void test3() {
        // Falta un valor
        onView(withId(R.id.buttonWriting)).perform(click());
        onView(withId(R.id.editTextMoving1)).perform(typeText("-100"));
        onView(withId(R.id.editText2)).perform(typeText("50"));
        onView(withId(R.id.buttongetType)).perform(click());

        onView(withId(R.id.textViewResult)).check(matches(withText("Number expected")));
    }





    @Test
    public void test4() {
        // Falta un valor
        onView(withId(R.id.buttonWriting)).perform(click());
        onView(withId(R.id.editTextMoving1)).perform(typeText("0"));
        onView(withId(R.id.editText2)).perform(typeText("-100"));
        onView(withId(R.id.buttongetType)).perform(click());

        onView(withId(R.id.textViewResult)).check(matches(withText("Number expected")));
    }





    @Test
    public void test5() {
        // Falta un valor
        onView(withId(R.id.buttonWriting)).perform(click());
        onView(withId(R.id.editTextMoving1)).perform(typeText("0"));
        onView(withId(R.id.editText2)).perform(typeText("0"));
        onView(withId(R.id.buttongetType)).perform(click());

        onView(withId(R.id.textViewResult)).check(matches(withText("Number expected")));
    }





    @Test
    public void test6() {
        // Falta un valor
        onView(withId(R.id.buttonWriting)).perform(click());
        onView(withId(R.id.editTextMoving1)).perform(typeText("0"));
        onView(withId(R.id.editText2)).perform(typeText("50"));
        onView(withId(R.id.buttongetType)).perform(click());

        onView(withId(R.id.textViewResult)).check(matches(withText("Number expected")));
    }





    @Test
    public void test7() {
        // Falta un valor
        onView(withId(R.id.buttonWriting)).perform(click());
        onView(withId(R.id.editTextMoving1)).perform(typeText("50"));
        onView(withId(R.id.editText2)).perform(typeText("-100"));
        onView(withId(R.id.buttongetType)).perform(click());

        onView(withId(R.id.textViewResult)).check(matches(withText("Number expected")));
    }





    @Test
    public void test8() {
        // Falta un valor
        onView(withId(R.id.buttonWriting)).perform(click());
        onView(withId(R.id.editTextMoving1)).perform(typeText("50"));
        onView(withId(R.id.editText2)).perform(typeText("0"));
        onView(withId(R.id.buttongetType)).perform(click());

        onView(withId(R.id.textViewResult)).check(matches(withText("Number expected")));
    }





    @Test
    public void test9() {
        // Falta un valor
        onView(withId(R.id.buttonWriting)).perform(click());
        onView(withId(R.id.editTextMoving1)).perform(typeText("50"));
        onView(withId(R.id.editText2)).perform(typeText("50"));
        onView(withId(R.id.buttongetType)).perform(click());

        onView(withId(R.id.textViewResult)).check(matches(withText("Number expected")));
    }





    @Test
    public void test10() {
        // Falta un valor
        onView(withId(R.id.buttonWriting)).perform(click());
        onView(withId(R.id.editTextMoving1)).perform(typeText("1000"));
        onView(withId(R.id.editText2)).perform(typeText("-100"));
        onView(withId(R.id.buttongetType)).perform(click());

        onView(withId(R.id.textViewResult)).check(matches(withText("Number expected")));
    }





    @Test
    public void test11() {
        // Falta un valor
        onView(withId(R.id.buttonWriting)).perform(click());
        onView(withId(R.id.editTextMoving1)).perform(typeText("1000"));
        onView(withId(R.id.editText2)).perform(typeText("0"));
        onView(withId(R.id.buttongetType)).perform(click());

        onView(withId(R.id.textViewResult)).check(matches(withText("Number expected")));
    }





    @Test
    public void test12() {
        // Falta un valor
        onView(withId(R.id.buttonWriting)).perform(click());
        onView(withId(R.id.editTextMoving1)).perform(typeText("1000"));
        onView(withId(R.id.editText2)).perform(typeText("50"));
        onView(withId(R.id.buttongetType)).perform(click());

        onView(withId(R.id.textViewResult)).check(matches(withText("Number expected")));
    }





    @Test
    public void test13() {
        // Falta un valor
        onView(withId(R.id.buttonWriting)).perform(click());
        onView(withId(R.id.editTextMoving1)).perform(typeText("-100"));
        onView(withId(R.id.editText3)).perform(typeText("-100"));
        onView(withId(R.id.buttongetType)).perform(click());

        onView(withId(R.id.textViewResult)).check(matches(withText("Number expected")));
    }





    @Test
    public void test14() {
        // Falta un valor
        onView(withId(R.id.buttonWriting)).perform(click());
        onView(withId(R.id.editTextMoving1)).perform(typeText("-100"));
        onView(withId(R.id.editText3)).perform(typeText("50"));
        onView(withId(R.id.buttongetType)).perform(click());

        onView(withId(R.id.textViewResult)).check(matches(withText("Number expected")));
    }





    @Test
    public void test15() {
        // Falta un valor
        onView(withId(R.id.buttonWriting)).perform(click());
        onView(withId(R.id.editTextMoving1)).perform(typeText("0"));
        onView(withId(R.id.editText3)).perform(typeText("-100"));
        onView(withId(R.id.buttongetType)).perform(click());

        onView(withId(R.id.textViewResult)).check(matches(withText("Number expected")));
    }





    @Test
    public void test16() {
        // Falta un valor
        onView(withId(R.id.buttonWriting)).perform(click());
        onView(withId(R.id.editTextMoving1)).perform(typeText("0"));
        onView(withId(R.id.editText3)).perform(typeText("50"));
        onView(withId(R.id.buttongetType)).perform(click());

        onView(withId(R.id.textViewResult)).check(matches(withText("Number expected")));
    }





    @Test
    public void test17() {
        // Falta un valor
        onView(withId(R.id.buttonWriting)).perform(click());
        onView(withId(R.id.editTextMoving1)).perform(typeText("50"));
        onView(withId(R.id.editText3)).perform(typeText("-100"));
        onView(withId(R.id.buttongetType)).perform(click());

        onView(withId(R.id.textViewResult)).check(matches(withText("Number expected")));
    }





    @Test
    public void test18() {
        // Falta un valor
        onView(withId(R.id.buttonWriting)).perform(click());
        onView(withId(R.id.editTextMoving1)).perform(typeText("50"));
        onView(withId(R.id.editText3)).perform(typeText("50"));
        onView(withId(R.id.buttongetType)).perform(click());

        onView(withId(R.id.textViewResult)).check(matches(withText("Number expected")));
    }





    @Test
    public void test19() {
        // Falta un valor
        onView(withId(R.id.buttonWriting)).perform(click());
        onView(withId(R.id.editTextMoving1)).perform(typeText("1000"));
        onView(withId(R.id.editText3)).perform(typeText("-100"));
        onView(withId(R.id.buttongetType)).perform(click());

        onView(withId(R.id.textViewResult)).check(matches(withText("Number expected")));
    }





    @Test
    public void test20() {
        // Falta un valor
        onView(withId(R.id.buttonWriting)).perform(click());
        onView(withId(R.id.editTextMoving1)).perform(typeText("1000"));
        onView(withId(R.id.editText3)).perform(typeText("50"));
        onView(withId(R.id.buttongetType)).perform(click());

        onView(withId(R.id.textViewResult)).check(matches(withText("Number expected")));
    }





    @Test
    public void test21() {
        // Falta un valor
        onView(withId(R.id.buttonWriting)).perform(click());
        onView(withId(R.id.editText2)).perform(typeText("-100"));
        onView(withId(R.id.editText3)).perform(typeText("-100"));
        onView(withId(R.id.buttongetType)).perform(click());

        onView(withId(R.id.textViewResult)).check(matches(withText("Number expected")));
    }





    @Test
    public void test22() {
        // Falta un valor
        onView(withId(R.id.buttonWriting)).perform(click());
        onView(withId(R.id.editText2)).perform(typeText("-100"));
        onView(withId(R.id.editText3)).perform(typeText("50"));
        onView(withId(R.id.buttongetType)).perform(click());

        onView(withId(R.id.textViewResult)).check(matches(withText("Number expected")));
    }





    @Test
    public void test23() {
        // Falta un valor
        onView(withId(R.id.buttonWriting)).perform(click());
        onView(withId(R.id.editText2)).perform(typeText("0"));
        onView(withId(R.id.editText3)).perform(typeText("-100"));
        onView(withId(R.id.buttongetType)).perform(click());

        onView(withId(R.id.textViewResult)).check(matches(withText("Number expected")));
    }





    @Test
    public void test24() {
        // Falta un valor
        onView(withId(R.id.buttonWriting)).perform(click());
        onView(withId(R.id.editText2)).perform(typeText("0"));
        onView(withId(R.id.editText3)).perform(typeText("50"));
        onView(withId(R.id.buttongetType)).perform(click());

        onView(withId(R.id.textViewResult)).check(matches(withText("Number expected")));
    }





    @Test
    public void test25() {
        // Falta un valor
        onView(withId(R.id.buttonWriting)).perform(click());
        onView(withId(R.id.editText2)).perform(typeText("50"));
        onView(withId(R.id.editText3)).perform(typeText("-100"));
        onView(withId(R.id.buttongetType)).perform(click());

        onView(withId(R.id.textViewResult)).check(matches(withText("Number expected")));
    }





    @Test
    public void test26() {
        // Falta un valor
        onView(withId(R.id.buttonWriting)).perform(click());
        onView(withId(R.id.editText2)).perform(typeText("50"));
        onView(withId(R.id.editText3)).perform(typeText("50"));
        onView(withId(R.id.buttongetType)).perform(click());

        onView(withId(R.id.textViewResult)).check(matches(withText("Number expected")));
    }







    public Activity getActivityInstance(){
        final Activity[] currentActivity=new Activity[1];
        InstrumentationRegistry.getInstrumentation().runOnMainSync(new Runnable() {
            public void run() {
                Collection<Activity> resumedActivities = ActivityLifecycleMonitorRegistry.getInstance().getActivitiesInStage(Stage.RESUMED);
                if (resumedActivities.iterator().hasNext()){
                    currentActivity[0] = resumedActivities.iterator().next();
                }
            }
        });

        return currentActivity[0];
    }
}
