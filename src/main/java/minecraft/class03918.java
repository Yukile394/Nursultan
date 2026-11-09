package minecraft;

import org.jspecify.annotations.Nullable;

public class class03918 extends class05096 {
   private static final int N = 80;
   private static final int y = 120;
   private static final int L = 360;
   @Nullable
   private final class00392 u;
   private final class00392 i;
   private final Runnable R;
   @Nullable
   private class05482 M;
   private class05362 B;
   private int Z;

   protected class03918(class00392 var1, @Nullable class00392 var2, class00392 var3, Runnable var4, int var5) {
      super(var1);
      this.u = var2;
      this.i = var3;
      this.R = var4;
      this.Z = var5;
   }

   public static class03918 N(class00392 var0, class00392 var1, Runnable var2) {
      return new class03918(var0, null, var1, var2, 0);
   }

   public static class03918 N(class00392 var0, class00392 var1, class00392 var2, Runnable var3) {
      return new class03918(var0, var1, var2, var3, 20);
   }

   @Override
   public void method_25426() {
      super.method_25426();
      if (this.u != null) {
         this.M = class05482.N(this.field_22793, this.u, 360);
      }

      short short1 = 150;
      byte b0 = 20;
      int ix = Math.max(this.M != null ? this.M.N() : 1, 5) * 9;
      int j = Math.min(120 + ix, this.field_22790 - 40);
      this.B = this.method_37063(class05362.method_46430(this.i, var1x -> this.method_25419()).N((this.field_22789 - 150) / 2, j, 150, 20).N());
   }

   @Override
   public boolean method_25422() {
      return this.M != null && this.B.field_22763;
   }

   @Override
   public void method_25393() {
      if (this.Z > 0) {
         this.Z--;
      }

      this.B.field_22763 = this.Z == 0;
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      super.method_25394(var1, var2, var3, var4);
      class00580 class00580 = var1.B();
      var1.N(this.field_22793, this.field_22785, this.field_22789 / 2, 80, -1);
      if (this.M == null) {
         String s = class04452.N(class07536.L());
         var1.N(this.field_22793, s, this.field_22789 / 2, 120, -6250336);
      } else {
         this.M.N(class00937.field_62010, this.field_22789 / 2, 120, 9, class00580);
      }
   }

   @Override
   public void method_25419() {
      this.R.run();
   }

   @Override
   public class00392 method_25435() {
      return class05220.N(this.field_22785, this.u != null ? this.u : class05220.N);
   }
}
