package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import org.jspecify.annotations.Nullable;

public enum class07086 implements class05033 {
   field_5801(0, "peaceful"),
   field_5805(1, "easy"),
   field_5802(2, "normal"),
   field_5807(3, "hard");

   public static final class05031<class07086> field_41668 = class05033.N(class07086::values);
   private static final IntFunction<class07086> field_5800 = class02121.N(class07086::N, values(), class02126.field_41665);
   public static final class02362<ByteBuf, class07086> field_60664 = class02389.N(field_5800, class07086::N);
   private final int field_5803;
   private final String field_5806;

   public class00392 L() {
      return class00392.L("options.difficulty." + this.field_5806 + ".info");
   }

   private class07086(int var3, String var4) {
      this.field_5803 = var3;
      this.field_5806 = var4;
   }

   public String u() {
      return this.field_5806;
   }

   public class00392 y() {
      return class00392.L("options.difficulty." + this.field_5806);
   }

   @Deprecated
   public static class07086 N(int var0) {
      return field_5800.apply(var0);
   }

   public int N() {
      return this.field_5803;
   }

   @Nullable
   public static class07086 N(String var0) {
      return field_41668.N(var0);
   }

   @Override
   public String method_15434() {
      return this.field_5806;
   }
}
