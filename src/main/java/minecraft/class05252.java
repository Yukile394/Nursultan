package minecraft;

public class class05252 extends class04890 {
   public class05252(class07209 var1) {
      super(class04878.NN, 0, new class05163(var1));
   }

   public class05252(class07001 var1) {
      super(class04878.NN, var1);
   }

   private boolean y(class00500 var1) {
      return var1 == class00869.K.W() || var1 == class00869.V.W();
   }

   @Override
   public void N(class05974 var1, class05324 var2, class08088 var3, class06069 var4, class05163 var5, class07321 var6, class07209 var7) {
      int i = var1.method_8624(class07830.field_13195, this.k.B(), this.k.z());
      class07218 class07218 = new class07218(this.k.B(), i, this.k.z());

      while (class07218.method_10264() > var1.method_31607()) {
         class00500 class00500xxxx = var1.method_8320(class07218);
         class00500 class00500x = var1.method_8320(class07218.method_10074());
         if (class00500x == class00869.yL.W()
            || class00500x == class00869.y.W()
            || class00500x == class00869.M.W()
            || class00500x == class00869.L.W()
            || class00500x == class00869.i.W()) {
            class00500 class00500xx = !class00500xxxx.P() && !this.y(class00500xxxx) ? class00500xxxx : class00869.e.W();

            for (class07211 class07211 : class07211.values()) {
               class07209 class07209x = class07218.method_10093(class07211);
               class00500 class00500xxx = var1.method_8320(class07209x);
               if (class00500xxx.P() || this.y(class00500xxx)) {
                  class07209 class07209x = class07209x.method_10074();
                  class00500 class00500xxxx = var1.method_8320(class07209x);
                  if ((class00500xxxx.P() || this.y(class00500xxxx)) && class07211 != class07211.field_11036) {
                     var1.method_8652(class07209x, class00500x, 3);
                  } else {
                     var1.method_8652(class07209x, class00500xx, 3);
                  }
               }
            }

            this.k = new class05163(class07218);
            this.N(var1, var5, var4, class07218, class06273.I, null);
            return;
         }

         class07218.y(0, -1, 0);
      }
   }

   @Override
   protected void N(class03298 var1, class07001 var2) {
   }
}
