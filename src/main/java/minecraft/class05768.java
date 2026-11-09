package minecraft;

import com.google.common.collect.ImmutableMap;

public class class05768 extends class05765<class08041> {
   public static boolean L(class07438 var0) {
      return var0.method_18868().N(class05378.d);
   }

   protected void L(class04782 var1, class08041 var2, long var3) {
      if (var3 % 100L == 0L) {
         var2.N(var1, var3, 3);
      }
   }

   public class05768() {
      super(ImmutableMap.of());
   }

   public static boolean y(class07438 var0) {
      return var0.method_18868().N(class05378.Y);
   }

   protected void u(class04782 var1, class08041 var2, long var3) {
      if (L(var2) || y(var2)) {
         class01289<class08041> class01289 = var2.method_18868();
         if (!class01289.L(class05359.M)) {
            class01289.y(class05378.n);
            class01289.y(class05378.m);
            class01289.y(class05378.P);
            class01289.y(class05378.j);
            class01289.y(class05378.b);
         }

         class01289.N(class05359.M);
      }
   }

   protected boolean N(class04782 var1, class08041 var2, long var3) {
      return L(var2) || y(var2);
   }
}
