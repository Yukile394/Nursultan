package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum class07648 implements class05033 {
   field_41550(0, "red_blue"),
   field_41551(1, "blue"),
   field_41552(2, "green"),
   field_41553(3, "yellow_blue"),
   field_41554(4, "gray");

   public static final class07648 field_57614 = field_41550;
   private static final IntFunction<class07648> field_41556 = class02121.N(class07648::N, values(), class02126.field_41666);
   public static final Codec<class07648> field_41555 = class05033.N(class07648::values);
   @Deprecated
   public static final Codec<class07648> field_56653 = Codec.INT.xmap(field_41556::apply, class07648::N);
   public static final class02362<ByteBuf, class07648> field_55965 = class02389.N(field_41556, class07648::N);
   final int field_41557;
   private final String field_41558;

   private class07648(int var3, String var4) {
      this.field_41557 = var3;
      this.field_41558 = var4;
   }

   public static class07648 N(int var0) {
      return field_41556.apply(var0);
   }

   public int N() {
      return this.field_41557;
   }

   @Override
   public String method_15434() {
      return this.field_41558;
   }
}
