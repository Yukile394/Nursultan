package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum class05855 implements class05033 {
   field_2312("bitmap", class05638.N),
   field_2317("ttf", class03492.N),
   field_37904("space", class04360.N),
   field_2313("unihex", class06238.N),
   field_44761("reference", class03487.N);

   public static final Codec<class05855> field_44802 = class05033.N(class05855::values);
   private final String field_2314;
   private final MapCodec<? extends class06270> field_44803;

   private class05855(String var3, MapCodec<? extends class06270> var4) {
      this.field_2314 = var3;
      this.field_44803 = var4;
   }

   public MapCodec<? extends class06270> N() {
      return this.field_44803;
   }

   @Override
   public String method_15434() {
      return this.field_2314;
   }
}
