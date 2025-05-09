package mh.math.numberchecker;

import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;

public class NumberChecker extends AndroidNonvisibleComponent {

  public NumberChecker(ComponentContainer container) {
    super(container.$form());
  }



  @SimpleFunction(description = "Check Number Is Prime Or Not")
  public boolean CheckNumberIsPrime(int number) {
    // Corner cases
    if (number <= 1)
      return false;
    if (number <= 3)
      return true;

    // This is checked so that we can skip
    // middle five numbers in below loop
    if (number % 2 == 0 || number % 3 == 0)
      return false;

    for (int i = 5; i * i <= number; i = i + 6)
      if (number % i == 0 || number % (i + 2) == 0)
        return false;

    return true;
  }


  @SimpleFunction(description = "Check Number Is Even Or Not")
  public boolean CheckNumberIsEven(int number) {
    boolean flagE = false;

      if (number % 2 == 0) {
        flagE = true;
      }
    return flagE;
    }

  @SimpleFunction(description = "Check Number Is Odd Or Not")
  public boolean CheckNumberIsOdd(int number) {
    boolean flagO = false;

      if (number % 1 == 0) {
        flagO = true;
      }
    return flagO;
  }



}

