package streamtransformations;

import java.util.stream.Collectors;

/**
 * DefangingIPAddress_1108
 */
public class DefangingIPAddress_1108 {
  public String defangIPaddr(String address) {
    // Convert the IP address into a stream and replace '.' with "[.]"
    return address.chars()
        .mapToObj(c -> c == '.' ? "[.]" : String.valueOf((char) c))
        .collect(Collectors.joining()); // Join everything into a single string
  }
}
