package minecraft;

import org.jspecify.annotations.Nullable;

public class class05373 {
   private final class00392 N;
   private final class05361 y;
   @Nullable
   private class04141 L;
   private int u;
   private int i;
   private int R = 150;
   private int M = 20;
   private class05341 B = class05362.field_40754;

   public class05373(class00392 var1, class05361 var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   public class05373 y(int var1, int var2) {
      this.R = var1;
      this.M = var2;
      return this;
   }

   public class05373 N(@Nullable class04141 var1) {
      this.L = var1;
      return this;
   }

   public class05373 N(class05341 var1) {
      this.B = var1;
      return this;
   }

   public class05362 N() {
      class05358 class05358 = new class05358(this.u, this.i, this.R, this.M, this.N, this.y, this.B);
      class05358.method_47400(this.L);
      return class05358;
   }

   public class05373 N(int var1, int var2, int var3, int var4) {
      return this.N(var1, var2).y(var3, var4);
   }

   public class05373 N(int var1) {
      this.R = var1;
      return this;
   }

   public class05373 N(int var1, int var2) {
      this.u = var1;
      this.i = var2;
      return this;
   }
}
