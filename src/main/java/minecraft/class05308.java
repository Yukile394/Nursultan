package minecraft;

import java.util.Map;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public class class05308 {
   private final Map<class03556<class07468>, class07469> N;

   public boolean L(class03556<class07468> var1) {
      return this.N.containsKey(var1);
   }

   class05308(Map<class03556<class07468>, class07469> var1) {
      super();
      this.N = var1;
   }

   private class07469 u(class03556<class07468> var1) {
      class07469 class07469 = this.N.get(var1);
      if (class07469 == null) {
         throw new IllegalArgumentException("Can't find attribute " + var1.M());
      } else {
         return class07469;
      }
   }

   public boolean y(class03556<class07468> var1, class01894 var2) {
      class07469 class07469 = this.N.get(var1);
      return class07469 != null && class07469.N(var2) != null;
   }

   public double y(class03556<class07468> var1) {
      return this.u(var1).y();
   }

   public double N(class03556<class07468> var1, class01894 var2) {
      class07471 class07471 = this.u(var1).N(var2);
      if (class07471 == null) {
         throw new IllegalArgumentException("Can't find modifier " + var2 + " on attribute " + var1.M());
      } else {
         return class07471.y();
      }
   }

   public double N(class03556<class07468> var1) {
      return this.u(var1).M();
   }

   public static class05300 N() {
      return new class05300();
   }

   @Nullable
   public class07469 N(Consumer<class07469> var1, class03556<class07468> var2) {
      class07469 class07469x = this.N.get(var2);
      if (class07469x == null) {
         return null;
      } else {
         class07469 class07469x = new class07469(var2, var1);
         class07469x.N(class07469x);
         return class07469x;
      }
   }
}
