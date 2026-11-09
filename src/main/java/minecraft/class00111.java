package minecraft;

import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum class00111 {
   field_60687(25, class06563.values(), 0.75F),
   field_60688(30, class00095.N, 1.25F);

   final int field_60689;
   private final Map<class06563, Integer> field_60690;
   final class06563[] field_60691;

   private class00111(int var3, class06563[] var4, float var5) {
      this.field_60689 = var3;
      this.field_60690 = Maps.newHashMap(Arrays.stream(var4).collect(Collectors.toMap(var0 -> (class06563)var0, var1x -> class00095.N(var1x, var5))));
      this.field_60691 = var4;
   }

   public final int N(class06563 var1) {
      return this.field_60690.get(var1);
   }
}
