package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;

public class class04829 extends class00471<class04829> {
   private final Builder<class03556<class07304>, class06378> N = ImmutableMap.builder();
   private final boolean y;

   public class04829() {
      this(false);
   }

   public class04829(boolean var1) {
      super();
      this.y = var1;
   }

   @Override
   public class08122 y() {
      return new class04815(this.R(), this.N.build(), this.y);
   }

   public class04829 N(class03556<class07304> var1, class06378 var2) {
      this.N.put(var1, var2);
      return this;
   }

   protected class04829 L() {
      return this;
   }
}
