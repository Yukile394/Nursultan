package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum class02491 implements class05033 {
   field_49856("replace_all", class02507.L),
   field_49857("replace_section", class02463.y),
   field_49858("insert", class02478.y),
   field_49859("append", class02462.L);

   public static final Codec<class02491> field_49860 = class05033.N(class02491::values);
   private final String field_49862;
   final MapCodec<? extends class02489> field_49863;

   private class02491(String var3, MapCodec<? extends class02489> var4) {
      this.field_49862 = var3;
      this.field_49863 = var4;
   }

   public MapCodec<? extends class02489> N() {
      return this.field_49863;
   }

   @Override
   public String method_15434() {
      return this.field_49862;
   }
}
