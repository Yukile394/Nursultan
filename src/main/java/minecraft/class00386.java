package minecraft;

import java.util.Locale;

public class class00386 extends IllegalArgumentException {
   public class00386(class00388 var1, String var2) {
      super(String.format(Locale.ROOT, "Error parsing: %s: %s", var1, var2));
   }

   public class00386(class00388 var1, int var2) {
      super(String.format(Locale.ROOT, "Invalid index %d requested for %s", var2, var1));
   }

   public class00386(class00388 var1, Throwable var2) {
      super(String.format(Locale.ROOT, "Error while parsing: %s", var1), var2);
   }
}
