package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

class class01410 extends class06555 {
   public static final Codec<class01410> N = RecordCodecBuilder.create(
      var0 -> var0.group(Codec.unboundedMap(class06338.X, class07001.N).fieldOf("contents").forGetter(var0x -> var0x.y)).apply(var0, class01410::new)
   );
   private final Map<String, class07001> y;

   public Stream<class01894> L(String var1) {
      return this.y.keySet().stream().map(var1x -> class01894.N(var1, var1x));
   }

   private class01410(Map<String, class07001> var1) {
      super();
      this.y = new HashMap<>(var1);
   }

   private class01410() {
      this(new HashMap<>());
   }

   public class07001 y(String var1) {
      class07001 class07001 = this.y.get(var1);
      return class07001 != null ? class07001 : new class07001();
   }

   public static class08413<class01410> N(String var0) {
      return new class08413<>(class01418.N(var0), class01410::new, N, class05715.field_45077);
   }

   public void N(String var1, class07001 var2) {
      if (var2.z()) {
         this.y.remove(var1);
      } else {
         this.y.put(var1, var2);
      }

      this.method_80();
   }
}
