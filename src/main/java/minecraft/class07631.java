package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum class07631 implements class05033 {
   field_18109("red", 0, class00869.LT.W()),
   field_18110("brown", 1, class00869.Ls.W());

   public static final class07631 field_57612 = field_18109;
   public static final Codec<class07631> field_41549 = class05033.N(class07631::values);
   private static final IntFunction<class07631> field_55963 = class02121.N(class07631::y, values(), class02126.field_41666);
   public static final class02362<ByteBuf, class07631> field_55962 = class02389.N(field_55963, class07631::y);
   private final String field_18111;
   final int field_55964;
   private final class00500 field_18112;

   private class07631(String var3, int var4, class00500 var5) {
      this.field_18111 = var3;
      this.field_55964 = var4;
      this.field_18112 = var5;
   }

   private int y() {
      return this.field_55964;
   }

   static class07631 N(int var0) {
      return field_55963.apply(var0);
   }

   public class00500 N() {
      return this.field_18112;
   }

   @Override
   public String method_15434() {
      return this.field_18111;
   }
}
