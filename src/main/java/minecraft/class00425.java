package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;

public enum class00425 implements class05033 {
   field_24342("show_text", true, class00401.y),
   field_24343("show_item", true, class00380.y),
   field_24344("show_entity", true, class00391.y);

   public static final Codec<class00425> field_46603 = class05033.y(class00425::values);
   public static final Codec<class00425> field_46604 = field_46603.validate(class00425::N);
   private final String field_24346;
   private final boolean field_24347;
   final MapCodec<? extends class00395> field_46605;

   private class00425(String var3, boolean var4, MapCodec<? extends class00395> var5) {
      this.field_24346 = var3;
      this.field_24347 = var4;
      this.field_46605 = var5;
   }

   @Override
   public String toString() {
      return "<action " + this.field_24346 + ">";
   }

   public boolean N() {
      return this.field_24347;
   }

   private static DataResult<class00425> N(class00425 var0) {
      return !var0.N() ? DataResult.error(() -> "Action not allowed: " + var0) : DataResult.success(var0, Lifecycle.stable());
   }

   @Override
   public String method_15434() {
      return this.field_24346;
   }
}
