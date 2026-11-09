package minecraft;

import java.util.List;
import org.jspecify.annotations.Nullable;

public final class class07063 {
   public static boolean L(class07438 var0) {
      return var0.method_6059(class07047.W) || var0.method_6059(class07047.Q) || var0.method_6059(class07047.c);
   }

   public class07063() {
      super();
   }

   public static boolean u(class07438 var0) {
      return !var0.method_6059(class07047.c) || var0.method_6059(class07047.W) || var0.method_6059(class07047.Q);
   }

   public static int y(class07438 var0) {
      int i = 0;
      int j = 0;
      if (var0.method_6059(class07047.L)) {
         i = var0.method_6112(class07047.L).i();
      }

      if (var0.method_6059(class07047.Q)) {
         j = var0.method_6112(class07047.Q).i();
      }

      return Math.max(i, j);
   }

   public static List<class04770> N(class04782 var0, @Nullable class07049 var1, class06889 var2, double var3, class07055 var5, int var6) {
      class03556<class07084> class03556 = var5.L();
      List<class04770> list = var0.method_18766(
         var7x -> var7x.field_13974.u()
            && (var1 == null || !var1.method_5722(var7x))
            && var2.N((class00737)var7x.method_73189(), var3)
            && (!var7x.method_6059(class03556) || var7x.method_6112(class03556).i() < var5.i() || var7x.method_6112(class03556).N(var6 - 1))
      );
      list.forEach(var2x -> var2x.method_37222(new class07055(var5), var1));
      return list;
   }

   public static boolean N(class07438 var0) {
      return var0.method_6059(class07047.L) || var0.method_6059(class07047.Q);
   }

   public static class00392 N(class07055 var0, float var1, float var2) {
      return var0.y() ? class00392.L("effect.duration.infinite") : class00392.y(class05018.N(class04995.y(var0.u() * var1), var2));
   }
}
