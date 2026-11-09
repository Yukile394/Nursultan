package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum class01312 implements class05033 {
   field_18076(0, "standing"),
   field_18077(1, "fall_flying"),
   field_18078(2, "sleeping"),
   field_18079(3, "swimming"),
   field_18080(4, "spin_attack"),
   field_18081(5, "crouching"),
   field_30095(6, "long_jumping"),
   field_18082(7, "dying"),
   field_37422(8, "croaking"),
   field_37423(9, "using_tongue"),
   field_40118(10, "sitting"),
   field_38097(11, "roaring"),
   field_38098(12, "sniffing"),
   field_38099(13, "emerging"),
   field_38100(14, "digging"),
   field_47246(15, "sliding"),
   field_47247(16, "shooting"),
   field_47248(17, "inhaling");

   public static final IntFunction<class01312> field_48322 = class02121.N(class01312::N, values(), class02126.field_41664);
   public static final Codec<class01312> field_63012 = class05033.N(class01312::values);
   public static final class02362<ByteBuf, class01312> field_48323 = class02389.N(field_48322, class01312::N);
   private final int field_48324;
   private final String field_63013;

   private class01312(int var3, String var4) {
      this.field_48324 = var3;
      this.field_63013 = var4;
   }

   public int N() {
      return this.field_48324;
   }

   @Override
   public String method_15434() {
      return this.field_63013;
   }
}
