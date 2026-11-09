package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;

public class class05300 {
   private final Builder<class03556<class07468>, class07469> N = ImmutableMap.builder();
   private boolean y;

   public class05300() {
      super();
   }

   private class07469 y(class03556<class07468> var1) {
      class07469 class07469 = new class07469(var1, var2x -> {
         if (this.y) {
            throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + var1.M());
         }
      });
      this.N.put(var1, class07469);
      return class07469;
   }

   public class05308 N() {
      this.y = true;
      return new class05308(this.N.buildKeepingLast());
   }

   public class05300 N(class03556<class07468> var1, double var2) {
      this.y(var1).N(var2);
      return this;
   }

   public class05300 N(class03556<class07468> var1) {
      this.y(var1);
      return this;
   }
}
