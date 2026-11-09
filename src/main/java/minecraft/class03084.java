package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

enum class03084 implements class05033 {
   field_39947("pass_through", () -> class03055.i),
   field_39948("fully_filtered", () -> class03055.R),
   field_39949("partially_filtered", () -> class03055.M);

   private final String field_40841;
   private final Supplier<MapCodec<class03055>> field_40842;

   private class03084(String var3, Supplier<MapCodec<class03055>> var4) {
      this.field_40841 = var3;
      this.field_40842 = var4;
   }

   public MapCodec<class03055> N() {
      return this.field_40842.get();
   }

   @Override
   public String method_15434() {
      return this.field_40841;
   }
}
