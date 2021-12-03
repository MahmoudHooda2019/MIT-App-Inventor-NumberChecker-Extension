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
    boolean flagP = true;

    if (number % 2 == 0 && number != 2 || number < 2) {
        flagP = false;
    } else {
        for (int i = 3 ; i <= number / 2; i = i + 2) {
            if (number % i == 0) {
                flagP = false;
                break;
            }
        }
    }
    return flagP;
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

