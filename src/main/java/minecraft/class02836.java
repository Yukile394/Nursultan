package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum class02836 implements class05033 {
   field_59739("default", 0, class02846.u, class02846.i),
   field_59740("hidden", 1, class02811.u, class02811.i),
   field_59741("override", 2, class02808.L, class02808.u);

   static final Codec<class02836> field_59742 = class05033.N(class02836::values);
   private static final IntFunction<class02836> field_59743 = class02121.N(class02836::N, values(), class02126.field_41664);
   static final class02362<ByteBuf, class02836> field_59744 = class02389.N(field_59743, class02836::N);
   private final String field_59745;
   private final int field_59746;
   final MapCodec<? extends class02831> field_59747;
   private final class02362<class04247, ? extends class02831> field_59748;

   private class02836(String var3, int var4, MapCodec<? extends class02831> var5, class02362<class04247, ? extends class02831> var6) {
      this.field_59745 = var3;
      this.field_59746 = var4;
      this.field_59747 = var5;
      this.field_59748 = var6;
   }

   private class02362<class04247, ? extends class02831> y() {
      return this.field_59748;
   }

   private int N() {
      return this.field_59746;
   }

   @Override
   public String method_15434() {
      return this.field_59745;
   }
}
