package minecraft;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.IntUnaryOperator;
import org.slf4j.Logger;

public record class03266(List<class01894> textures, class01894 paletteKey, Map<String, class01894> permutations, String separator) implements class04233 {
   static final Logger y = LogUtils.getLogger();
   public static final String L = "_";
   public static final MapCodec<class03266> u = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            Codec.list(class01894.N).fieldOf("textures").forGetter(class03266::y),
            class01894.N.fieldOf("palette_key").forGetter(class03266::L),
            Codec.unboundedMap(Codec.STRING, class01894.N).fieldOf("permutations").forGetter(class03266::u),
            Codec.STRING.optionalFieldOf("separator", "_").forGetter(class03266::i)
         )
         .apply(var0, class03266::new)
   );

   public class01894 L() {
      return this.paletteKey;
   }

   public class03266(List<class01894> var1, class01894 var2, Map<String, class01894> var3) {
      this(var1, var2, var3, "_");
   }

   public class03266(List<class01894> textures, class01894 paletteKey, Map<String, class01894> permutations, String separator) {
      super();
      this.textures = textures;
      this.paletteKey = paletteKey;
      this.permutations = permutations;
      this.separator = separator;
   }

   public String i() {
      return this.separator;
   }

   public Map<String, class01894> u() {
      return this.permutations;
   }

   public List<class01894> y() {
      return this.textures;
   }

   private static int[] N(class01089 var0, class01894 var1) {
      Optional optional = var0.method_14486(N.N(var1));
      if (optional.isEmpty()) {
         y.error("Failed to load palette image {}", var1);
         throw new IllegalArgumentException();
      } else {
         try {
            int[] aint;
            try (
               InputStream inputstream = ((class01079)optional.get()).method_14482();
               class08280 class08280 = class08280.N(inputstream);
            ) {
               aint = class08280.i();
            }

            return aint;
         } catch (Exception exception) {
            y.error("Couldn't load texture {}", var1, exception);
            throw new IllegalArgumentException();
         }
      }
   }

   @Override
   public void N(class01089 var1, class04205 var2) {
      Supplier supplier = Suppliers.memoize(() -> N(var1, this.paletteKey));
      HashMap hashmap = new HashMap();
      this.permutations.forEach((var3x, var4x) -> hashmap.put(var3x, Suppliers.memoize(() -> N((int[])supplier.get(), N(var1, var4x)))));

      for (class01894 class01894xx : this.textures) {
         class01894 class01894x = N.N(class01894xx);
         Optional optional = var1.method_14486(class01894x);
         if (optional.isEmpty()) {
            y.warn("Unable to find texture {}", class01894x);
         } else {
            class04224 class04224 = new class04224(class01894x, (class01079)optional.get(), hashmap.size());

            for (Entry entry : hashmap.entrySet()) {
               class01894 class01894xx = class01894xx.M(this.separator + (String)entry.getKey());
               var2.N(class01894xx, new class03261(class04224, (java.util.function.Supplier<IntUnaryOperator>)entry.getValue(), class01894xx));
            }
         }
      }
   }

   private static IntUnaryOperator N(int[] var0, int[] var1) {
      if (var1.length != var0.length) {
         y.warn("Palette mapping has different sizes: {} and {}", var0.length, var1.length);
         throw new IllegalArgumentException();
      } else {
         Int2IntOpenHashMap int2intopenhashmap = new Int2IntOpenHashMap(var1.length);

         for (int i = 0; i < var0.length; i++) {
            int j = var0[i];
            if (class02566.y(j) != 0) {
               int2intopenhashmap.put(class02566.B(j), var1[i]);
            }
         }

         return var1x -> {
            int k = class02566.y(var1x);
            if (k == 0) {
               return var1x;
            } else {
               int l = class02566.B(var1x);
               int i1 = int2intopenhashmap.getOrDefault(l, class02566.M(l));
               int j1 = class02566.y(i1);
               return class02566.R(k * j1 / 255, i1);
            }
         };
      }
   }

   @Override
   public MapCodec<class03266> N() {
      return u;
   }
}
