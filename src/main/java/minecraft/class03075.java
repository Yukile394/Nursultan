package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public enum class03075 implements class05033 {
   field_40804("player", () -> class03412.N),
   field_40805("system", () -> class03391.N);

   private final String field_40806;
   private final Supplier<MapCodec<? extends class03047>> field_40807;

   private class03075(String var3, Supplier<MapCodec<? extends class03047>> var4) {
      this.field_40806 = var3;
      this.field_40807 = var4;
   }

   public MapCodec<? extends class03047> N() {
      return this.field_40807.get();
   }

   @Override
   public String method_15434() {
      return this.field_40806;
   }
}
