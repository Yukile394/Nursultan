package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum class01319 implements class05033 {
   field_17996(0, "red"),
   field_17997(1, "snow");

   public static final class01319 field_57610 = field_17996;
   public static final class05031<class01319> field_41548 = class05033.N(class01319::values);
   private static final IntFunction<class01319> field_17998 = class02121.N(class01319::N, values(), class02126.field_41664);
   public static final class02362<ByteBuf, class01319> field_55960 = class02389.N(field_17998, class01319::N);
   private final int field_18000;
   private final String field_18001;

   private class01319(int var3, String var4) {
      this.field_18000 = var3;
      this.field_18001 = var4;
   }

   public int N() {
      return this.field_18000;
   }

   public static class01319 N(int var0) {
      return field_17998.apply(var0);
   }

   public static class01319 N(class03556<class00780> var0) {
      return var0.N(class03557.NP) ? field_17997 : field_17996;
   }

   @Override
   public String method_15434() {
      return this.field_18001;
   }
}
