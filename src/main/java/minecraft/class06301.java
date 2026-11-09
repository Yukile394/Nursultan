package minecraft;

public class class06301 {
   private static final int N = 300;

   public class06301() {
      super();
   }

   public static class04142<class07438> N(int var0, int var1) {
      int i = var0 * 20;
      return class04137.N_42(var3 -> var3.group(var3.y(class05378.O), var3.y(class05378.g)).apply(var3, (var4, var5) -> (var6, var7, var8) -> {
         boolean flag = var3.<Long>y(var5) + 300L <= var8;
         if (var0x.intValue() <= i && !flag) {
            if (var3.<class06289>y(var4).y().method_19771(var7.method_24515(), var1)) {
               var0x.increment();
            }

            return true;
         } else {
            var5.y();
            var4.y();
            var7.method_18868().N(var6.method_75728(), var6.N(), var7.method_73189());
            var0x.setValue(0);
            return true;
         }
      }));
   }
}
