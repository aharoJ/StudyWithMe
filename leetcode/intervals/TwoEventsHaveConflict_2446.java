package intervals;

/**
 */
/**
 * TwoEventsHaveConflict_2446
 */
public class TwoEventsHaveConflict_2446 {
  public boolean haveConflict(String[] event1, String[] event2) {
    String startA = event1[0];
    String endA = event1[1];

    String startB = event2[0];
    String endB = event2[1];

    if (startA.compareTo(endB) <= 0 && startB.compareTo(endA) <= 0) {
      return true;
    }
    return false;
  }

}
