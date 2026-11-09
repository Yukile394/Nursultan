package minecraft;

import com.mojang.logging.LogUtils;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class00417 {
   private static final Logger N = LogUtils.getLogger();

   public class00417() {
      super();
   }

   public static <T extends class00638> class07878 N(Exception var0, class00381<T> var1, T var2) {
      if (var0 instanceof class07878 class07878) {
         N(class07878.N(), var2, var1);
         return class07878;
      } else {
         class07080 class07080 = class07080.N(var0, "Main thread packet handler");
         N(class07080, var2, var1);
         return new class07878(class07080);
      }
   }

   public static <T extends class00638> void N(class00381<T> var0, T var1, class04782 var2) throws class03096 {
      N(var0, var1, var2.method_8503().yK());
   }

   public static <T extends class00638> void N(class07080 var0, T var1, @Nullable class00381<T> var2) {
      if (var2 != null) {
         class07074 class07074 = var0.N("Incoming Packet");
         class07074.N("Type", () -> var2.method_65080().toString());
         class07074.N("Is Terminal", () -> Boolean.toString(var2.R()));
         class07074.N("Is Skippable", () -> Boolean.toString(var2.i()));
      }

      var1.N(var0);
   }

   public static <T extends class00638> void N(class00381<T> var0, T var1, class00458 var2) throws class03096 {
      if (!var2.N()) {
         var2.N(var1, var0);
         throw class03096.N;
      }
   }
}
