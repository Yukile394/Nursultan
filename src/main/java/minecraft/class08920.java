package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public record class08920(class06572 property, float scale, List<class08912> entries, Optional<class08895> fallback) implements class08895 {
   public static final MapCodec<class08920> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class00362.y.forGetter(class08920::N),
            Codec.FLOAT.optionalFieldOf("scale", 1.0F).forGetter(class08920::y),
            class08912.L.listOf().fieldOf("entries").forGetter(class08920::L),
            class08913.y.optionalFieldOf("fallback").forGetter(class08920::u)
         )
         .apply(var0, class08920::new)
   );

   public List<class08912> L() {
      return this.entries;
   }

   public class08920(class06572 property, float scale, List<class08912> entries, Optional<class08895> fallback) {
      super();
      this.property = property;
      this.scale = scale;
      this.entries = entries;
      this.fallback = fallback;
   }

   public Optional<class08895> u() {
      return this.fallback;
   }

   public float y() {
      return this.scale;
   }

   public class06572 N() {
      return this.property;
   }

   @Override
   public void method_62326(class08350 var1) {
      this.fallback.ifPresent(var1x -> var1x.method_62326(var1));
      this.entries.forEach(var1x -> var1x.y().method_62326(var1));
   }

   @Override
   public MapCodec<class08920> method_65585() {
      return N;
   }

   @Override
   public class08910 method_65587(class08905 var1) {
      float[] afloat = new float[this.entries.size()];
      class08910[] aclass08910 = new class08910[this.entries.size()];
      ArrayList arraylist = new ArrayList<>(this.entries);
      arraylist.sort(class08912.u);

      for (int i = 0; i < arraylist.size(); i++) {
         class08912 class08912 = (class08912)arraylist.get(i);
         afloat[i] = class08912.N();
         aclass08910[i] = class08912.y().method_65587(var1);
      }

      class08910 class08910 = this.fallback.<class08910>map(var1x -> var1x.method_65587(var1)).orElse(var1.i());
      return new class08937(this.property, this.scale, afloat, aclass08910, class08910);
   }
}
