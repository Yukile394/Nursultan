package minecraft;

public class class04940 extends class01209 {
   private final boolean i;

   public class04940(class01224 var1, class01894 var2, class07209 var3, class06993 var4, boolean var5) {
      super(class04878.Ny, 0, var1, var2, var2.toString(), N(var4), var3);
      this.i = var5;
   }

   public class04940(class01224 var1, class07001 var2) {
      super(class04878.Ny, var2, var1, var1x -> N(var2.<class06993>N_15("Rot", class06993.field_56670).orElseThrow()));
      this.i = var2.y("isBeached", false);
   }

   public boolean y() {
      class00753 class00753 = this.y.N();
      return class00753.method_10263() > 32 || class00753.method_10264() > 32;
   }

   public int N(int var1, class06069 var2) {
      return var1 - this.y.N().method_10264() / 2 - var2.y(3);
   }

   public void N(int var1) {
      this.u = new class07209(this.u.method_10263(), var1, this.u.method_10260());
   }

   @Override
   protected void N(class03298 var1, class07001 var2) {
      super.N(var1, var2);
      var2.N("isBeached", this.i);
      var2.N("Rot", class06993.field_56670, this.L.u());
   }

   private static class01233 N(class06993 var0) {
      return new class01233().N(var0).N(class07111.field_11302).N(class04914.N).N(class05282.u);
   }

   @Override
   protected void N(String var1, class07209 var2, class01001 var3, class06069 var4, class05163 var5) {
      class05946<class05074> class05946 = class04914.y.get(var1);
      if (class05946 != null) {
         class03136.N(var3, var4, var2.method_10074(), class05946);
      }
   }

   @Override
   public void N(class05974 var1, class05324 var2, class08088 var3, class06069 var4, class05163 var5, class07321 var6, class07209 var7) {
      if (this.y()) {
         super.N(var1, var2, var3, var4, var5, var6, var7);
      } else {
         int ix = var1.method_31600() + 1;
         int j = 0;
         class00753 class00753 = this.y.N();
         class07830 class07830 = this.i ? class07830.field_13194 : class07830.field_13195;
         int k = class00753.method_10263() * class00753.method_10260();
         if (k == 0) {
            j = var1.method_8624(class07830, this.u.method_10263(), this.u.method_10260());
         } else {
            class07209 class07209x = this.u.method_10069(class00753.method_10263() - 1, 0, class00753.method_10260() - 1);

            for (class07209 class07209x : class07209.method_10097(this.u, class07209x)) {
               int l = var1.method_8624(class07830, class07209x.method_10263(), class07209x.method_10260());
               j += l;
               ix = Math.min(ix, l);
            }

            j /= k;
         }

         this.N(this.i ? this.N(ix, var4) : j);
         super.N(var1, var2, var3, var4, var5, var6, var7);
      }
   }
}
