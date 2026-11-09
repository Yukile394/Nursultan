package minecraft;

import com.mojang.serialization.Codec;
import java.util.function.IntFunction;

public enum class08195 implements class05033 {
   field_63196("all", 0),
   field_63197("moderators", 1),
   field_63198("gamemasters", 2),
   field_63199("admins", 3),
   field_63200("owners", 4);

   public static final Codec<class08195> field_63201 = class05033.N(class08195::values);
   private static final IntFunction<class08195> field_63203 = class02121.N(var0 -> var0.field_63205, values(), class02126.field_41666);
   public static final Codec<class08195> field_63202 = Codec.INT.xmap(field_63203::apply, var0 -> var0.field_63205);
   private final String field_63204;
   private final int field_63205;

   private class08195(String var3, int var4) {
      this.field_63204 = var3;
      this.field_63205 = var4;
   }

   public int N() {
      return this.field_63205;
   }

   public static class08195 N(int var0) {
      return field_63203.apply(var0);
   }

   public boolean N(class08195 var1) {
      return this.field_63205 >= var1.field_63205;
   }

   @Override
   public String method_15434() {
      return this.field_63204;
   }
}
