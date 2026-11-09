package minecraft;

import java.util.Map;

public class class03830 extends class05765<class03811> {
   static final int N = 5 * class01517.i * 20;
   static final int y = 5;
   static final int L = 75;
   int u = 0;
   boolean i;

   protected void L(class04782 var1, class03811 var2, long var3) {
      var2.t();
   }

   public class03830() {
      super(Map.of(), N);
   }

   protected void u(class04782 var1, class03811 var2, long var3) {
      if (!var2.l()) {
         var2.G();
      }
   }

   protected boolean y(class04782 var1, class03811 var2, long var3) {
      return var2.n().N();
   }

   protected boolean N(class04782 var1, class03811 var2) {
      return var2.method_24828();
   }

   protected void N(class04782 var1, class03811 var2, long var3) {
      super.L(var1, var2, var3);
      if (this.u > 0) {
         this.u--;
      }

      if (var2.v()) {
         var2.N(class03829.field_47792);
         if (var2.method_24828()) {
            var2.method_43077(class04909.Nz);
         }
      } else {
         class03829 class03829 = var2.n();
         long ix = var2.method_18868().i(class05378.o);
         boolean flag = ix > 75L;
         if (flag != this.i) {
            this.u = this.N(var2);
         }

         this.i = flag;
         if (class03829 == class03829.field_47792) {
            if (this.u == 0 && var2.method_24828() && flag) {
               var1.method_8421(var2, (byte)64);
               this.u = this.N(var2);
            }

            if (ix < class03829.field_49084.y()) {
               var2.method_43077(class04909.Nm);
               var2.N(class03829.field_49084);
            }
         } else if (class03829 == class03829.field_49084 && ix > class03829.field_49084.y()) {
            var2.N(class03829.field_47792);
         }
      }
   }

   private int N(class03811 var1) {
      return class03829.field_47792.y() + var1.method_59922().N(100, 400);
   }
}
