package minecraft;

import com.mojang.serialization.Codec;
import java.util.function.IntFunction;

public enum class01299 {
   field_18176(0, "options.narrator.off"),
   field_18177(1, "options.narrator.all"),
   field_18178(2, "options.narrator.chat"),
   field_18179(3, "options.narrator.system");

   private static final IntFunction<class01299> field_18180 = class02121.N(class01299::N, values(), class02126.field_41665);
   public static final Codec<class01299> field_64423 = Codec.INT.xmap(class01299::N, class01299::N);
   private final int field_18181;
   private final class00392 field_24212;

   public boolean L() {
      return this == field_18177 || this == field_18178;
   }

   private class01299(int var3, String var4) {
      this.field_18181 = var3;
      this.field_24212 = class00392.L(var4);
   }

   public boolean i() {
      return this == field_18177 || this == field_18179 || this == field_18178;
   }

   public boolean u() {
      return this == field_18177 || this == field_18179;
   }

   public class00392 y() {
      return this.field_24212;
   }

   public int N() {
      return this.field_18181;
   }

   public static class01299 N(int var0) {
      return field_18180.apply(var0);
   }
}
