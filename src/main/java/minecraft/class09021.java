package minecraft;

import com.mojang.serialization.Codec;
import org.jspecify.annotations.Nullable;

public enum class09021 implements class05033 {
   field_60797("DEFAULT", "options.music_frequency.default", 20),
   field_60798("FREQUENT", "options.music_frequency.frequent", 10),
   field_60799("CONSTANT", "options.music_frequency.constant", 0);

   public static final Codec<class09021> field_60800 = class05033.N(class09021::values);
   private final String field_64471;
   private final int field_60803;
   private final class00392 field_64472;

   private class09021(String var3, String var4, int var5) {
      this.field_64471 = var3;
      this.field_60803 = var5 * 1200;
      this.field_64472 = class00392.L(var4);
   }

   public class00392 N() {
      return this.field_64472;
   }

   int N(@Nullable class05075 var1, class06069 var2) {
      if (var1 == null) {
         return this.field_60803;
      } else if (this == field_60799) {
         return 100;
      } else {
         int i = Math.min(var1.y(), this.field_60803);
         int j = Math.min(var1.L(), this.field_60803);
         return class04995.N(var2, i, j);
      }
   }

   @Override
   public String method_15434() {
      return this.field_64471;
   }
}
