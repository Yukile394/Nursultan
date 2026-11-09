package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;

public class class00159 {
   private class02471 N = class02471.L;
   private final Builder<class02487<?>, class02500> y = ImmutableMap.builder();

   private class00159() {
      super();
   }

   public class00142 y() {
      return new class00142(this.N, this.y.buildOrThrow());
   }

   public <T extends class02500> class00159 N(class02487<T> var1, T var2) {
      this.y.put(var1, var2);
      return this;
   }

   public class00159 N(class02471 var1) {
      this.N = var1;
      return this;
   }

   public static class00159 N() {
      return new class00159();
   }

   public <T extends class02477<?>> class00159 N(class02477<?> var1) {
      class02481 class02481 = class02481.N(var1);
      this.y.put(class02481, class02481.N());
      return this;
   }
}
