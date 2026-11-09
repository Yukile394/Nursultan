package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.List;
import java.util.Map;

public class class00106 {
   public static final Codec<class00106> N = Codec.STRING.comapFlatMap(class00106::N, var0 -> var0.L);
   public static final Codec<String> y = Codec.STRING
      .validate(var0 -> class01737.y(var0) ? DataResult.success(var0) : DataResult.error(() -> var0 + " is not a valid input name"));
   private final String L;
   private final class01737 u;

   private class00106(String var1, class01737 var2) {
      super();
      this.L = var1;
      this.u = var2;
   }

   private static DataResult<class00106> N(String var0) {
      class01737 class01737;
      try {
         class01737 = class01737.N(var0);
      } catch (Exception exception) {
         return DataResult.error(() -> "Failed to parse template " + var0 + ": " + exception.getMessage());
      }

      return DataResult.success(new class00106(var0, class01737));
   }

   public String N(Map<String, String> var1) {
      List list = this.u.y().stream().map(var1x -> var1.getOrDefault(var1x, "")).toList();
      return this.u.N(list);
   }
}
