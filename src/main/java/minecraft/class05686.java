package minecraft;

import org.jspecify.annotations.Nullable;

public class class05686 {
   private final class00392 N;
   private final class01590 y;
   private int L;
   private int u = 0;
   private int i = 0;
   private class05717 R = class05717.N;
   private boolean M = false;
   @Nullable
   private class04370<Boolean> B = null;
   @Nullable
   private class04141 Z = null;

   class05686(class00392 var1, class01590 var2) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = class05725.N(var1, var2);
   }

   public class05686 N(class04141 var1) {
      this.Z = var1;
      return this;
   }

   public class05686 N(int var1) {
      this.L = var1;
      return this;
   }

   public class05725 N() {
      class05717 class05717 = this.B == null ? this.R : (var1x, var2x) -> {
         this.B.method_41748(var2x);
         this.R.onValueChange(var1x, var2x);
      };
      class05725 class05725 = new class05725(this.u, this.i, this.L, this.N, this.y, this.M, class05717);
      class05725.method_47400(this.Z);
      return class05725;
   }

   public class05686 N(int var1, int var2) {
      this.u = var1;
      this.i = var2;
      return this;
   }

   public class05686 N(class05717 var1) {
      this.R = var1;
      return this;
   }

   public class05686 N(boolean var1) {
      this.M = var1;
      this.B = null;
      return this;
   }

   public class05686 N(class04370<Boolean> var1) {
      this.B = var1;
      this.M = (Boolean)var1.method_41753();
      return this;
   }
}
