package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum class02835 implements class05033 {
   field_7976(0, "small_ball"),
   field_7977(1, "large_ball"),
   field_7973(2, "star"),
   field_7974(3, "creeper"),
   field_7970(4, "burst");

   private static final IntFunction<class02835> field_7975 = class02121.N(class02835::y, values(), class02126.field_41664);
   public static final class02362<ByteBuf, class02835> field_49321 = class02389.N(field_7975, class02835::y);
   public static final Codec<class02835> field_49322 = class05033.y(class02835::values);
   private final int field_7972;
   private final String field_7971;

   private class02835(int var3, String var4) {
      this.field_7972 = var3;
      this.field_7971 = var4;
   }

   public int y() {
      return this.field_7972;
   }

   public class05216 N() {
      return class00392.L("item.minecraft.firework_star.shape." + this.field_7971);
   }

   public static class02835 N(int var0) {
      return field_7975.apply(var0);
   }

   @Override
   public String method_15434() {
      return this.field_7971;
   }
}
