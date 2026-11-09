package minecraft;

import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.Const.PrimitiveType;
import com.mojang.serialization.codecs.PrimitiveCodec;

public class class00622 extends Schema {
   public static final PrimitiveCodec<String> N = new class00595();
   private static final Type<String> y = new PrimitiveType(N);

   public class00622(int var1, Schema var2) {
      super(var1, var2);
   }

   public static String N(String var0) {
      class01894 class01894 = class01894.L(var0);
      return class01894 != null ? class01894.toString() : var0;
   }

   public static Type<String> N() {
      return y;
   }

   public Type<?> getChoiceType(TypeReference var1, String var2) {
      return super.getChoiceType(var1, N(var2));
   }
}
