package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum class00051 implements class05033 {
   field_60135("int", class00079.y),
   field_60136("ivec3", class00087.y),
   field_60137("float", class00076.y),
   field_60138("vec2", class00078.y),
   field_60139("vec3", class00071.y),
   field_60140("vec4", class00088.y),
   field_60141("matrix4x4", class00085.y);

   public static final class05031<class00051> field_60142 = class05033.N(class00051::values);
   private final String field_60143;
   final MapCodec<? extends class00069> field_60144;

   private class00051(String var3, Codec<? extends class00069> var4) {
      this.field_60143 = var3;
      this.field_60144 = var4.fieldOf("value");
   }

   @Override
   public String method_15434() {
      return this.field_60143;
   }
}
