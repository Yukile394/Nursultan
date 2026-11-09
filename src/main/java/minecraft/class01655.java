package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum class01655 implements class05033 {
   field_45656("stretch", class01670.L),
   field_45657("tile", class01647.L),
   field_45658("nine_slice", class01664.L);

   public static final Codec<class01655> field_45659 = class05033.N(class01655::values);
   private final String field_45660;
   private final MapCodec<? extends class01650> field_45661;

   private class01655(String var3, MapCodec<? extends class01650> var4) {
      this.field_45660 = var3;
      this.field_45661 = var4;
   }

   public MapCodec<? extends class01650> N() {
      return this.field_45661;
   }

   @Override
   public String method_15434() {
      return this.field_45660;
   }
}
