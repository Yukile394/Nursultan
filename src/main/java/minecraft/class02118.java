package minecraft;

import java.util.function.UnaryOperator;
import org.jspecify.annotations.Nullable;

public class class02118 {
   private static final class01894 R = class01894.y("tooltip/background");
   private static final class01894 M = class01894.y("tooltip/frame");
   public static final int N = 12;
   private static final int B = 3;
   public static final int y = 3;
   public static final int L = 3;
   public static final int u = 3;
   public static final int i = 3;
   private static final int Z = 9;

   public class02118() {
      super();
   }

   private static class01894 y(@Nullable class01894 var0) {
      return var0 == null ? M : var0.N((UnaryOperator<String>)(var0x -> "tooltip/" + var0x + "_frame"));
   }

   private static class01894 N(@Nullable class01894 var0) {
      return var0 == null ? R : var0.N((UnaryOperator<String>)(var0x -> "tooltip/" + var0x + "_background"));
   }

   public static void N(class01054 var0, int var1, int var2, int var3, int var4, @Nullable class01894 var5) {
      int ix = var1 - 3 - 9;
      int j = var2 - 3 - 9;
      int k = var3 + 3 + 3 + 18;
      int l = var4 + 3 + 3 + 18;
      var0.N(class08394.Na, N(var5), ix, j, k, l);
      var0.N(class08394.Na, y(var5), ix, j, k, l);
   }
}
