package ClassListeners;

import org.testng.IClassListener;
import org.testng.ITestClass;

public class ClassName implements IClassListener {

    public void onBeforeClass(ITestClass testClass) {
        System.out.println(testClass.getRealClass().getName());
    }

}
