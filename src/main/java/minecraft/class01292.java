package minecraft;

public class class01292 extends class05096 {
   private static final class00392 i = class00392.L("selectWorld.backupJoinSkipButton");
   public static final class00392 N = class00392.L("selectWorld.backupJoinConfirmButton");
   private final Runnable R;
   protected final class01318 y;
   private final class00392 M;
   private final boolean B;
   private class05482 Z = class05482.N;
   final class00392 L;
   protected int u;
   private class05725 z;

   public class01292(Runnable var1, class01318 var2, class00392 var3, class00392 var4, boolean var5) {
      this(var1, var2, var3, var4, N, var5);
   }

   public class01292(Runnable var1, class01318 var2, class00392 var3, class00392 var4, class00392 var5, boolean var6) {
      super(var3);
      this.R = var1;
      this.y = var2;
      this.M = var4;
      this.B = var6;
      this.L = var5;
   }

   @Override
   public void method_25426() {
      super.method_25426();
      this.Z = class05482.N(this.field_22793, this.M, this.field_22789 - 50);
      int ix = (this.Z.N() + 1) * 9;
      this.z = class05725.y(class00392.L("selectWorld.backupEraseCache").y(-2039584), this.field_22793).N(this.field_22789 / 2 - 155 + 80, 76 + ix).N();
      if (this.B) {
         this.method_37063(this.z);
      }

      this.method_37063(class05362.method_46430(this.L, var1x -> this.y.proceed(true, this.z.y())).N(this.field_22789 / 2 - 155, 100 + ix, 150, 20).N());
      this.method_37063(class05362.method_46430(i, var1x -> this.y.proceed(false, this.z.y())).N(this.field_22789 / 2 - 155 + 160, 100 + ix, 150, 20).N());
      this.method_37063(class05362.method_46430(class05220.i, var1x -> this.R.run()).N(this.field_22789 / 2 - 155 + 80, 124 + ix, 150, 20).N());
   }

   @Override
   public boolean method_25422() {
      return false;
   }

   @Override
   public boolean method_25404(class06601 var1) {
      if (var1.v() == 256) {
         this.R.run();
         return true;
      } else {
         return super.method_25404(var1);
      }
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      super.method_25394(var1, var2, var3, var4);
      class00580 class00580 = var1.B();
      var1.N(this.field_22793, this.field_22785, this.field_22789 / 2, 50, -1);
      this.Z.N(class00937.field_62010, this.field_22789 / 2, 70, 9, class00580);
   }
}
