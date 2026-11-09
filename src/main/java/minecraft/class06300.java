package minecraft;

import org.apache.commons.lang3.mutable.MutableLong;

public class class06300 {
   public class06300() {
      super();
   }

   public static class04142<class07475> N(class05378<class06289> var0, float var1, int var2, int var3) {
      MutableLong mutablelong = new MutableLong(0L);
      return class04137.N_42(var5 -> var5.group(var5.N(class05378.m), var5.y(var0)).apply(var5, (var5x, var6) -> (var7, var8, var9) -> {
         class06289 class06289 = var5.y(var6);
         if (var7.method_27983() != class06289.N() || !class06289.y().method_19769(var8.method_73189(), var3)) {
            return false;
         } else if (var9 <= mutablelong.longValue()) {
            return true;
         } else {
            var5x.N(new class05352(class06289.y(), var1, var2));
            mutablelong.setValue(var9 + 80L);
            return true;
         }
      }));
   }
}
