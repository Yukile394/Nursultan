package minecraft;

import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Stream;

public record class00805(Map<String, class05338> scores, class05919 entityTarget) implements class05957 {
   public static final MapCodec<class00805> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            Codec.unboundedMap(Codec.STRING, class05338.N).fieldOf("scores").forGetter(class00805::L),
            class05919.field_45792.fieldOf("entity").forGetter(class00805::u)
         )
         .apply(var0, class00805::new)
   );

   public Map<String, class05338> L() {
      return this.scores;
   }

   public class00805(Map<String, class05338> scores, class05919 entityTarget) {
      this.scores = scores;
      this.entityTarget = entityTarget;
   }

   public class05919 u() {
      return this.entityTarget;
   }

   @Override
   public Set<class07491<?>> y() {
      return Stream.concat(Stream.of(this.entityTarget.N()), this.scores.values().stream().flatMap(var0 -> var0.N().stream()))
         .collect(ImmutableSet.toImmutableSet());
   }

   public boolean test(class05908 var1) {
      class07049 class07049 = var1.L(this.entityTarget.N());
      if (class07049 == null) {
         return false;
      } else {
         class06394 class06394 = var1.u().method_14170();

         for (Entry entry : this.scores.entrySet()) {
            if (!this.N(var1, class07049, class06394, (String)entry.getKey(), (class05338)entry.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   @Override
   public class05955 N() {
      return class07693.B;
   }

   public static class00794 N(class05919 var0) {
      return new class00794(var0);
   }

   protected boolean N(class05908 var1, class07049 var2, class06683 var3, String var4, class05338 var5) {
      class00518 class00518 = var3.N(var4);
      if (class00518 == null) {
         return false;
      } else {
         class01788 class01788 = var3.y(var2, class00518);
         return class01788 == null ? false : var5.y(var1, class01788.y());
      }
   }
}
