package edu.uclm.tritype;

import android.app.Activity;
import android.support.test.espresso.NoMatchingViewException;
import android.support.test.espresso.ViewAssertion;
import android.support.test.espresso.ViewInteraction;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.lifecycle.ActivityLifecycleMonitorRegistry;
import android.support.test.runner.lifecycle.Stage;
import android.test.suitebuilder.annotation.LargeTest;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.assertThat;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

import android.support.test.InstrumentationRegistry;

import org.hamcrest.Matcher;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.w3c.dom.Text;

import android.support.test.runner.AndroidJUnit4;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.lang.reflect.Field;
import java.util.Collection;


/**
 * Created by macario.polo on 28/9/16.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class TriTypeTest {
    @Rule
    public ActivityTestRule<MainMenuActivity> sut=new ActivityTestRule<MainMenuActivity>(MainMenuActivity.class);

    @Before
    public void setUp() {
    }


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
        // No es un triángulo
        onView(withId(R.id.buttonWriting)).perform(click());
        onView(withId(R.id.editTextMoving1)).perform(typeText("-100"));
        onView(withId(R.id.editText2)).perform(typeText("-100"));
        onView(withId(R.id.editText3)).perform(typeText("100"));
        onView(withId(R.id.buttongetType)).perform(click());

        onView(withId(R.id.textViewResult)).check(matches(withText("Not a triangle")));
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }




    @Test
    public void test2() {
        // No es un triángulo
        onView(withId(R.id.buttonWriting)).perform(click());
        onView(withId(R.id.editTextMoving1)).perform(typeText("-100"));
        onView(withId(R.id.editText2)).perform(typeText("-100"));
        onView(withId(R.id.editText3)).perform(typeText("50"));
        onView(withId(R.id.buttongetType)).perform(click());

        onView(withId(R.id.textViewResult)).check(matches(withText("Not a triangle")));
    }




    @Test
    public void test3() {
        // No es un triángulo
        onView(withId(R.id.buttonWriting)).perform(click());
        onView(withId(R.id.editTextMoving1)).perform(typeText("-100"));
        onView(withId(R.id.editText2)).perform(typeText("0"));
        onView(withId(R.id.editText3)).perform(typeText("-100"));
        onView(withId(R.id.buttongetType)).perform(click());

        onView(withId(R.id.textViewResult)).check(matches(withText("Not a triangle")));
    }




    @Test
    public void test4() {
        // No es un triángulo
        onView(withId(R.id.buttonWriting)).perform(click());
        onView(withId(R.id.editTextMoving1)).perform(typeText("-100"));
        onView(withId(R.id.editText2)).perform(typeText("0"));
        onView(withId(R.id.editText3)).perform(typeText("50"));
        onView(withId(R.id.buttongetType)).perform(click());

        onView(withId(R.id.textViewResult)).check(matches(withText("Not a triangle")));
    }




    @Test
    public void test5() {
        // No es un triángulo
        onView(withId(R.id.buttonWriting)).perform(click());
        onView(withId(R.id.editTextMoving1)).perform(typeText("-100"));
        onView(withId(R.id.editText2)).perform(typeText("50"));
        onView(withId(R.id.editText3)).perform(typeText("-100"));
        onView(withId(R.id.buttongetType)).perform(click());

        onView(withId(R.id.textViewResult)).check(matches(withText("Not a triangle")));
    }




    @Test
    public void test6() {
        // No es un triángulo
        onView(withId(R.id.buttonWriting)).perform(click());
        onView(withId(R.id.editTextMoving1)).perform(typeText("-100"));
        onView(withId(R.id.editText2)).perform(typeText("50"));
        onView(withId(R.id.editText3)).perform(typeText("50"));
        onView(withId(R.id.buttongetType)).perform(click());

        onView(withId(R.id.textViewResult)).check(matches(withText("Not a triangle")));
    }




    @Test
    public void test7() {
        // No es un triángulo
        onView(withId(R.id.buttonWriting)).perform(click());
        onView(withId(R.id.editTextMoving1)).perform(typeText("0"));
        onView(withId(R.id.editText2)).perform(typeText("-100"));
        onView(withId(R.id.editText3)).perform(typeText("-100"));
        onView(withId(R.id.buttongetType)).perform(click());

        onView(withId(R.id.textViewResult)).check(matches(withText("Not a triangle")));
    }




    @Test
    public void test8() {
        // No es un triángulo
        onView(withId(R.id.buttonWriting)).perform(click());
        onView(withId(R.id.editTextMoving1)).perform(typeText("0"));
        onView(withId(R.id.editText2)).perform(typeText("-100"));
        onView(withId(R.id.editText3)).perform(typeText("50"));
        onView(withId(R.id.buttongetType)).perform(click());

        onView(withId(R.id.textViewResult)).check(matches(withText("Not a triangle")));
    }




    @Test
    public void test9() {
        // No es un triángulo
        onView(withId(R.id.buttonWriting)).perform(click());
        onView(withId(R.id.editTextMoving1)).perform(typeText("0"));
        onView(withId(R.id.editText2)).perform(typeText("0"));
        onView(withId(R.id.editText3)).perform(typeText("-100"));
        onView(withId(R.id.buttongetType)).perform(click());

        onView(withId(R.id.textViewResult)).check(matches(withText("Not a triangle")));
    }




    @Test
    public void test10() {
        // No es un triángulo
        onView(withId(R.id.buttonWriting)).perform(click());
        onView(withId(R.id.editTextMoving1)).perform(typeText("0"));
        onView(withId(R.id.editText2)).perform(typeText("0"));
        onView(withId(R.id.editText3)).perform(typeText("50"));
        onView(withId(R.id.buttongetType)).perform(click());

        onView(withId(R.id.textViewResult)).check(matches(withText("Not a triangle")));
    }




    @Test
    public void test11() {
        // No es un triángulo
        onView(withId(R.id.buttonWriting)).perform(click());
        onView(withId(R.id.editTextMoving1)).perform(typeText("0"));
        onView(withId(R.id.editText2)).perform(typeText("50"));
        onView(withId(R.id.editText3)).perform(typeText("-100"));
        onView(withId(R.id.buttongetType)).perform(click());

        onView(withId(R.id.textViewResult)).check(matches(withText("Not a triangle")));
    }




    @Test
    public void test12() {
        // No es un triángulo
        onView(withId(R.id.buttonWriting)).perform(click());
        onView(withId(R.id.editTextMoving1)).perform(typeText("0"));
        onView(withId(R.id.editText2)).perform(typeText("50"));
        onView(withId(R.id.editText3)).perform(typeText("50"));
        onView(withId(R.id.buttongetType)).perform(click());

        onView(withId(R.id.textViewResult)).check(matches(withText("Not a triangle")));
    }




    @Test
    public void test13() {
        // No es un triángulo
        onView(withId(R.id.buttonWriting)).perform(click());
        onView(withId(R.id.editTextMoving1)).perform(typeText("50"));
        onView(withId(R.id.editText2)).perform(typeText("-100"));
        onView(withId(R.id.editText3)).perform(typeText("-100"));
        onView(withId(R.id.buttongetType)).perform(click());

        onView(withId(R.id.textViewResult)).check(matches(withText("Not a triangle")));
    }




    @Test
    public void test14() {
        // No es un triángulo
        onView(withId(R.id.buttonWriting)).perform(click());
        onView(withId(R.id.editTextMoving1)).perform(typeText("50"));
        onView(withId(R.id.editText2)).perform(typeText("-100"));
        onView(withId(R.id.editText3)).perform(typeText("50"));
        onView(withId(R.id.buttongetType)).perform(click());

        onView(withId(R.id.textViewResult)).check(matches(withText("Not a triangle")));
    }




    @Test
    public void test15() {
        // No es un triángulo
        onView(withId(R.id.buttonWriting)).perform(click());
        onView(withId(R.id.editTextMoving1)).perform(typeText("50"));
        onView(withId(R.id.editText2)).perform(typeText("0"));
        onView(withId(R.id.editText3)).perform(typeText("-100"));
        onView(withId(R.id.buttongetType)).perform(click());

        onView(withId(R.id.textViewResult)).check(matches(withText("Not a triangle")));
    }




    @Test
    public void test16() {
        // No es un triángulo
        onView(withId(R.id.buttonWriting)).perform(click());
        onView(withId(R.id.editTextMoving1)).perform(typeText("50"));
        onView(withId(R.id.editText2)).perform(typeText("0"));
        onView(withId(R.id.editText3)).perform(typeText("50"));
        onView(withId(R.id.buttongetType)).perform(click());

        onView(withId(R.id.textViewResult)).check(matches(withText("Not a triangle")));
    }




    @Test
    public void test17() {
        // No es un triángulo
        onView(withId(R.id.buttonWriting)).perform(click());
        onView(withId(R.id.editTextMoving1)).perform(typeText("50"));
        onView(withId(R.id.editText2)).perform(typeText("50"));
        onView(withId(R.id.editText3)).perform(typeText("-100"));
        onView(withId(R.id.buttongetType)).perform(click());

        onView(withId(R.id.textViewResult)).check(matches(withText("Not a triangle")));
    }




    @Test
    public void test18() {
        // Equilátero
        onView(withId(R.id.buttonWriting)).perform(click());
        onView(withId(R.id.editTextMoving1)).perform(typeText("50"));
        onView(withId(R.id.editText2)).perform(typeText("50"));
        onView(withId(R.id.editText3)).perform(typeText("50"));
        onView(withId(R.id.buttongetType)).perform(click());

        onView(withId(R.id.textViewResult)).check(matches(withText("Equilateral")));
    }





    @Test
    public void test19() {
        // No es un triángulo
        onView(withId(R.id.buttonWriting)).perform(click());
        onView(withId(R.id.editTextMoving1)).perform(typeText("1000"));
        onView(withId(R.id.editText2)).perform(typeText("-100"));
        onView(withId(R.id.editText3)).perform(typeText("-100"));
        onView(withId(R.id.buttongetType)).perform(click());

        onView(withId(R.id.textViewResult)).check(matches(withText("Not a triangle")));
    }




    @Test
    public void test20() {
        // No es un triángulo
        onView(withId(R.id.buttonWriting)).perform(click());
        onView(withId(R.id.editTextMoving1)).perform(typeText("1000"));
        onView(withId(R.id.editText2)).perform(typeText("-100"));
        onView(withId(R.id.editText3)).perform(typeText("50"));
        onView(withId(R.id.buttongetType)).perform(click());

        onView(withId(R.id.textViewResult)).check(matches(withText("Not a triangle")));
    }




    @Test
    public void test21() {
        // No es un triángulo
        onView(withId(R.id.buttonWriting)).perform(click());
        onView(withId(R.id.editTextMoving1)).perform(typeText("1000"));
        onView(withId(R.id.editText2)).perform(typeText("0"));
        onView(withId(R.id.editText3)).perform(typeText("-100"));
        onView(withId(R.id.buttongetType)).perform(click());

        onView(withId(R.id.textViewResult)).check(matches(withText("Not a triangle")));
    }




    @Test
    public void test22() {
        // No es un triángulo
        onView(withId(R.id.buttonWriting)).perform(click());
        onView(withId(R.id.editTextMoving1)).perform(typeText("1000"));
        onView(withId(R.id.editText2)).perform(typeText("0"));
        onView(withId(R.id.editText3)).perform(typeText("50"));
        onView(withId(R.id.buttongetType)).perform(click());

        onView(withId(R.id.textViewResult)).check(matches(withText("Not a triangle")));
    }




    @Test
    public void test23() {
        // No es un triángulo
        onView(withId(R.id.buttonWriting)).perform(click());
        onView(withId(R.id.editTextMoving1)).perform(typeText("1000"));
        onView(withId(R.id.editText2)).perform(typeText("50"));
        onView(withId(R.id.editText3)).perform(typeText("-100"));
        onView(withId(R.id.buttongetType)).perform(click());

        onView(withId(R.id.textViewResult)).check(matches(withText("Not a triangle")));
    }




    @Test
    public void test24() {
        // No es un triángulo
        onView(withId(R.id.buttonWriting)).perform(click());
        onView(withId(R.id.editTextMoving1)).perform(typeText("1000"));
        onView(withId(R.id.editText2)).perform(typeText("50"));
        onView(withId(R.id.editText3)).perform(typeText("50"));
        onView(withId(R.id.buttongetType)).perform(click());

        onView(withId(R.id.textViewResult)).check(matches(withText("Not a triangle")));
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
