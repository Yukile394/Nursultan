package minecraft;

import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.util.Map;

public record class06750<Value>(
   Codec<Value> valueCodec,
   Map<class00609, class00619<Value, ?>> modifierLibrary,
   Codec<class00619<Value, ?>> modifierCodec,
   class00610<Value> keyframeLerp,
   class00610<Value> stateChangeLerp,
   class00610<Value> spatialLerp,
   class00610<Value> partialTickLerp
) {
   public Codec<class00619<Value, ?>> L() {
      return this.modifierCodec;
   }

   public class00610<Value> M() {
      return this.partialTickLerp;
   }

   public class06750(
      Codec<Value> valueCodec,
      Map<class00609, class00619<Value, ?>> modifierLibrary,
      Codec<class00619<Value, ?>> modifierCodec,
      class00610<Value> keyframeLerp,
      class00610<Value> stateChangeLerp,
      class00610<Value> spatialLerp,
      class00610<Value> partialTickLerp
   ) {
      this.valueCodec = valueCodec;
      this.modifierLibrary = modifierLibrary;
      this.modifierCodec = modifierCodec;
      this.keyframeLerp = keyframeLerp;
      this.stateChangeLerp = stateChangeLerp;
      this.spatialLerp = spatialLerp;
      this.partialTickLerp = partialTickLerp;
   }

   @Override
   public String toString() {
      return class07536.N(class04206.NX, this);
   }

   public class00610<Value> i() {
      return this.stateChangeLerp;
   }

   public class00610<Value> u() {
      return this.keyframeLerp;
   }

   public Map<class00609, class00619<Value, ?>> y() {
      return this.modifierLibrary;
   }

   public static <Value> class06750<Value> N(Codec<Value> var0, Map<class00609, class00619<Value, ?>> var1) {
      return new class06750<>(var0, var1, N(var1), class00610.y(1.0F), class00610.y(0.0F), class00610.y(0.5F), class00610.y(0.0F));
   }

   public static <Value> class06750<Value> N(Codec<Value> var0, Map<class00609, class00619<Value, ?>> var1, class00610<Value> var2) {
      return N(var0, var1, var2, var2);
   }

   public static <Value> class06750<Value> N(Codec<Value> var0) {
      return N(var0, Map.of());
   }

   private static <Value> Codec<class00619<Value, ?>> N(Map<class00609, class00619<Value, ?>> var0) {
      ImmutableBiMap immutablebimap = ImmutableBiMap.builder().put(class00609.field_63771, class00619.N()).putAll(var0).buildOrThrow();
      return class06338.N(class00609.field_63784, immutablebimap::get, immutablebimap.inverse()::get);
   }

   public void N(class00619<Value, ?> var1) {
      if (var1 != class00619.N() && !this.modifierLibrary.containsValue(var1)) {
         throw new IllegalArgumentException("Modifier " + var1 + " is not valid for " + this);
      }
   }

   public static <Value> class06750<Value> N(Codec<Value> var0, Map<class00609, class00619<Value, ?>> var1, class00610<Value> var2, class00610<Value> var3) {
      return new class06750<>(var0, var1, N(var1), var2, var2, var2, var3);
   }

   public Codec<Value> N() {
      return this.valueCodec;
   }

   public class00610<Value> R() {
      return this.spatialLerp;
   }
}
