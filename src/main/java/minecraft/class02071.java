package minecraft;

public class class02071 extends class03660 {
   private static final int N = 2;
   private int y = 0;
   private int L = 0;
   private boolean u = true;
   private class02050 i = class02050.field_62126;

   public class02071(int var1, int var2, int var3, int var4, class00392 var5, class01590 var6) {
      super(var1, var2, var3, var4, var5, var6);
      this.field_22763 = false;
   }

   public class02071(int var1, int var2, class00392 var3, class01590 var4) {
      this(0, 0, var1, var2, var3, var4);
   }

   public class02071(class00392 var1, class01590 var2) {
      this(0, 0, var2.N(var1.method_30937()), 9, var1, var2);
   }

   public class02071 N(int var1, class02050 var2) {
      this.y = var1;
      this.i = var2;
      return this;
   }

   @Override
   public void N(class00580 var1) {
      class00392 class00392 = this.method_25369();
      class01590 class01590 = this.Z();
      int ix = this.y > 0 ? this.y : this.method_25368();
      int j = class01590.N(class00392);
      int k = this.method_46426();
      int l = this.method_46427() + (this.method_25364() - 9) / 2;
      if (j > ix) {
         switch (this.i) {
            case field_62126:
               var1.N(k, l, N(class00392, class01590, ix));
               break;
            case field_62127:
               this.method_75799(var1, class00392, 2);
         }
      } else {
         var1.N(k, l, class00392.method_30937());
      }
   }

   public static class01028 N(class00392 var0, class01590 var1, int var2) {
      class05936 class05936 = var1.N(var0, var2 - var1.N(class05220.G));
      return class07018.y().N(class05936.N(class05936, class05220.G));
   }

   public class02071 N(int var1) {
      return this.N(var1, class02050.field_62126);
   }

   @Override
   public int method_25368() {
      if (this.y > 0) {
         if (this.u) {
            this.L = Math.min(this.y, this.Z().N(this.method_25369().method_30937()));
            this.u = false;
         }

         return this.L;
      } else {
         return super.method_25368();
      }
   }

   @Override
   public void method_25355(class00392 var1) {
      super.method_25355(var1);
      this.u = true;
   }
}
