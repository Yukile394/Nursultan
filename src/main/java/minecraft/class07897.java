package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum class07897 implements class05033 {
   field_41561(0, "brown"),
   field_41562(1, "white"),
   field_41563(2, "black"),
   field_41564(3, "white_splotched"),
   field_41565(4, "gold"),
   field_41566(5, "salt"),
   field_41567(99, "evil");

   public static final class07897 field_57617 = field_41561;
   private static final IntFunction<class07897> field_41569 = class02121.N(class07897::N, values(), field_57617);
   public static final Codec<class07897> field_41568 = class05033.N(class07897::values);
   @Deprecated
   public static final Codec<class07897> field_56654 = Codec.INT.xmap(field_41569::apply, class07897::N);
   public static final class02362<ByteBuf, class07897> field_55966 = class02389.N(field_41569, class07897::N);
   final int field_41570;
   private final String field_41571;

   private class07897(int var3, String var4) {
      this.field_41570 = var3;
      this.field_41571 = var4;
   }

   public int N() {
      return this.field_41570;
   }

   public static class07897 N(int var0) {
      return field_41569.apply(var0);
   }

   @Override
   public String method_15434() {
      return this.field_41571;
   }
}
