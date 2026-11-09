package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Arrays;
import java.util.function.IntFunction;

public enum class05541 implements class05033 {
   field_28341(0, "lucy", true),
   field_28342(1, "wild", true),
   field_28343(2, "gold", true),
   field_28344(3, "cyan", true),
   field_28345(4, "blue", false);

   public static final class05541 field_57623 = field_28341;
   private static final IntFunction<class05541> field_28346 = class02121.N(class05541::N, values(), class02126.field_41664);
   public static final class02362<ByteBuf, class05541> field_55970 = class02389.N(field_28346, class05541::N);
   public static final Codec<class05541> field_41585 = class05033.N(class05541::values);
   @Deprecated
   public static final Codec<class05541> field_56659 = Codec.INT.xmap(field_28346::apply, class05541::N);
   private final int field_28347;
   private final String field_28348;
   private final boolean field_28349;

   private class05541(int var3, String var4, boolean var5) {
      this.field_28347 = var3;
      this.field_28348 = var4;
      this.field_28349 = var5;
   }

   public static class05541 y(class06069 var0) {
      return N(var0, false);
   }

   public String y() {
      return this.field_28348;
   }

   public static class05541 N(class06069 var0) {
      return N(var0, true);
   }

   public static class05541 N(int var0) {
      return field_28346.apply(var0);
   }

   public int N() {
      return this.field_28347;
   }

   private static class05541 N(class06069 var0, boolean var1) {
      return class07536.N((class05541[])Arrays.stream(values()).filter(var1x -> var1x.field_28349 == var1).toArray(class05541[]::new), var0);
   }

   @Override
   public String method_15434() {
      return this.field_28348;
   }
}
