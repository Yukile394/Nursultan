package minecraft;

import java.util.Optional;
import org.apache.commons.lang3.mutable.MutableLong;

public class class05767 {
   private static final int N = 180;
   private static final int y = 8;
   private static final int L = 6;

   public class05767() {
      super();
   }

   public static class04119<class07475> N(class05378<class06289> var0, float var1, int var2) {
      MutableLong mutablelong = new MutableLong(0L);
      return class04137.N_42(var4 -> var4.group(var4.N(class05378.m), var4.y(var0)).apply(var4, (var4x, var5) -> (var6, var7, var8) -> {
         class06289 class06289 = var4.y(var5);
         if (var6.method_27983() != class06289.N() || !class06289.y().method_19769(var7.method_73189(), var2)) {
            return false;
         } else if (var8 <= mutablelong.longValue()) {
            return true;
         } else {
            Optional optional = Optional.ofNullable(class05456.N(var7, 8, 6));
            var4x.N(optional.map(var1xxxx -> new class05352(var1xxxx, var1, 1)));
            mutablelong.setValue(var8 + 180L);
            return true;
         }
      }));
   }
}
