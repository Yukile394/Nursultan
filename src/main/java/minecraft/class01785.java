package minecraft;

import org.jspecify.annotations.Nullable;

public record class01785(String owner, String objectiveName) implements class00381<class07280> {
   public static final class02362<class00667, class01785> N = class00381.N(class01785::N, class01785::new);

   private class01785(class00667 var1) {
      this(var1.s(), var1.L(class00667::s));
   }

   public class01785(String owner, @Nullable String objectiveName) {
      this.owner = owner;
      this.objectiveName = objectiveName;
   }

   @Nullable
   public String y() {
      return this.objectiveName;
   }

   private void N(class00667 var1) {
      var1.N(this.owner);
      var1.N(this.objectiveName, class00667::N);
   }

   public String N() {
      return this.owner;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   @Override
   public class02897<class01785> method_65080() {
      return class04248.LG;
   }
}
