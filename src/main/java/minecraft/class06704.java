package minecraft;

public class class06704 {
   public class06704() {
      super();
   }

   public static void N(class07299 var0, class07209 var1, class00743<class06584> var2) {
      var2.forEach(var2x -> N(var0, (double)var1.method_10263(), (double)var1.method_10264(), (double)var1.method_10260(), var2x));
   }

   public static void N(class07299 var0, double var1, double var3, double var5, class06584 var7) {
      double d0 = class07078.Nt.z();
      double d1 = 1.0 - d0;
      double d2 = d0 / 2.0;
      double d3 = Math.floor(var1) + var0.field_9229.U() * d1 + d2;
      double d4 = Math.floor(var3) + var0.field_9229.U() * d1;
      double d5 = Math.floor(var5) + var0.field_9229.U() * d1 + d2;

      while (!var7.R()) {
         class00717 class00717 = new class00717(var0, d3, d4, d5, var7.N(var0.field_9229.y(21) + 10));
         float f = 0.05F;
         class00717.method_18800(
            var0.field_9229.N(0.0, 0.11485000171139836), var0.field_9229.N(0.2, 0.11485000171139836), var0.field_9229.N(0.0, 0.11485000171139836)
         );
         var0.method_8649(class00717);
      }
   }

   public static void N(class00500 var0, class07299 var1, class07209 var2) {
      var1.method_8455(var2, var0.i());
   }

   private static void N(class07299 var0, double var1, double var3, double var5, class06695 var7) {
      for (int i = 0; i < var7.method_5439(); i++) {
         N(var0, var1, var3, var5, var7.method_5438(i));
      }
   }

   public static void N(class07299 var0, class07049 var1, class06695 var2) {
      N(var0, var1.method_23317(), var1.method_23318(), var1.method_23321(), var2);
   }

   public static void N(class07299 var0, class07209 var1, class06695 var2) {
      N(var0, (double)var1.method_10263(), (double)var1.method_10264(), (double)var1.method_10260(), var2);
   }
}
