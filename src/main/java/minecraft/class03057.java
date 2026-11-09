package minecraft;

import java.util.List;

public record class03057(class03043 action, List<String> entries) implements class00381<class07280> {
   public static final class02362<class00667, class03057> N = class00381.N(class03057::N, class03057::new);

   private class03057(class00667 var1) {
      this(var1.y(class03043.class), var1.N_16(class00667::s));
   }

   public class03057(class03043 action, List<String> entries) {
      super();
      this.action = action;
      this.entries = entries;
   }

   public List<String> y() {
      return this.entries;
   }

   private void N(class00667 var1) {
      var1.N((Enum<?>)this.action);
      var1.N_12(this.entries, class00667::N);
   }

   public class03043 N() {
      return this.action;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   @Override
   public class02897<class03057> method_65080() {
      return class04248.l;
   }
}
