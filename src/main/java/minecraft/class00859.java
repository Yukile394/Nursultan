package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;
import java.util.Set;

public record class00859(Optional<class00817> predicate, class07209 offset) implements class05957 {
   private static final MapCodec<class07209> M = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            Codec.INT.optionalFieldOf("offsetX", 0).forGetter(class00753::method_10263),
            Codec.INT.optionalFieldOf("offsetY", 0).forGetter(class00753::method_10264),
            Codec.INT.optionalFieldOf("offsetZ", 0).forGetter(class00753::method_10260)
         )
         .apply(var0, class07209::new)
   );
   public static final MapCodec<class00859> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class00817.N.optionalFieldOf("predicate").forGetter(class00859::L), M.forGetter(class00859::u)).apply(var0, class00859::new)
   );

   public Optional<class00817> L() {
      return this.predicate;
   }

   public class00859(Optional<class00817> predicate, class07209 offset) {
      this.predicate = predicate;
      this.offset = offset;
   }

   public class07209 u() {
      return this.offset;
   }

   @Override
   public Set<class07491<?>> y() {
      return Set.of(class06551.B);
   }

   public boolean test(class05908 var1) {
      class06889 class06889 = var1.L(class06551.B);
      return class06889 != null
         && (
            this.predicate.isEmpty()
               || this.predicate
                  .get()
                  .N(
                     var1.u(),
                     class06889.N() + this.offset.method_10263(),
                     class06889.y() + this.offset.method_10264(),
                     class06889.L() + this.offset.method_10260()
                  )
         );
   }

   @Override
   public class05955 N() {
      return class07693.m;
   }

   public static class05952 N(class00818 var0, class07209 var1) {
      return () -> new class00859(Optional.of(var0.y()), var1);
   }

   public static class05952 N(class00818 var0) {
      return () -> new class00859(Optional.of(var0.y()), class07209.field_10980);
   }
}
