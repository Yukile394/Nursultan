package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Map;

record class08267(Map<class05946<? extends class00751<?>>, class08269> registries, Map<String, class08249> others) {
   public static final Codec<class08267> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            Codec.unboundedMap(class08271.N, class08269.y).fieldOf("registries").forGetter(class08267::N),
            Codec.unboundedMap(Codec.STRING, class08249.N).fieldOf("others").forGetter(class08267::y)
         )
         .apply(var0, class08267::new)
   );

   class08267(Map<class05946<? extends class00751<?>>, class08269> registries, Map<String, class08249> others) {
      this.registries = registries;
      this.others = others;
   }

   public Map<String, class08249> y() {
      return this.others;
   }

   public Map<class05946<? extends class00751<?>>, class08269> N() {
      return this.registries;
   }
}
