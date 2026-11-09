package minecraft;

import java.util.Optional;

public class class01004 {
   public class01004() {
      super();
   }

   public static class04142<class07438> N(int var0, int var1) {
      return class04137.N_42(
         var2 -> var2.group(var2.y(class05378.NP), var2.y(class05378.H), var2.N(class05378.Ns), var2.N(class05378.NT))
            .apply(var2, (var3, var4, var5, var6) -> (var6x, var7, var8) -> {
               if (!var7.method_6079().R()) {
                  return false;
               } else {
                  Optional optional = var2.N(var5);
                  if (optional.isEmpty()) {
                     var5.N(0);
                  } else {
                     int i = (Integer)optional.get();
                     if (i > var0) {
                        var3.y();
                        var5.y();
                        var6.N(true, var1);
                     } else {
                        var5.N(i + 1);
                     }
                  }

                  return true;
               }
            })
      );
   }
}
