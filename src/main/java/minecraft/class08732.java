package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.Map;

public record class08732(Map<class08719, List<class08706>> layers) {
   private static final Codec<List<class08706>> L = class06338.y(class08706.N.listOf());
   public static final Codec<class08732> N = RecordCodecBuilder.create(
      var0 -> var0.group(class06338.u(Codec.unboundedMap(class08719.field_54131, L)).fieldOf("layers").forGetter(class08732::y)).apply(var0, class08732::new)
   );

   public class08732(Map<class08719, List<class08706>> layers) {
      this.layers = layers;
   }

   public Map<class08719, List<class08706>> y() {
      return this.layers;
   }

   public List<class08706> N(class08719 var1) {
      return this.layers.getOrDefault(var1, List.of());
   }

   public static class08704 N() {
      return new class08704();
   }
}
