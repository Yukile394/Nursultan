package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;
import java.util.Set;

public record class07700(Optional<class00821> predicate, class05919 entityTarget) implements class05957 {
   public static final MapCodec<class07700> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class00821.N.optionalFieldOf("predicate").forGetter(class07700::L), class05919.field_45792.fieldOf("entity").forGetter(class07700::u))
         .apply(var0, class07700::new)
   );

   public Optional<class00821> L() {
      return this.predicate;
   }

   public class07700(Optional<class00821> predicate, class05919 entityTarget) {
      super();
      this.predicate = predicate;
      this.entityTarget = entityTarget;
   }

   public class05919 u() {
      return this.entityTarget;
   }

   @Override
   public Set<class07491<?>> y() {
      return Set.of(class06551.B, this.entityTarget.N());
   }

   public boolean test(class05908 var1) {
      class07049 class07049 = var1.L(this.entityTarget.N());
      class06889 class06889 = var1.L(class06551.B);
      return this.predicate.isEmpty() || this.predicate.get().N(var1.u(), class06889, class07049);
   }

   public static class05952 N(class05919 var0) {
      return N(var0, class00810.N());
   }

   public static class05952 N(class05919 var0, class00810 var1) {
      return () -> new class07700(Optional.of(var1.y()), var0);
   }

   public static class05952 N(class05919 var0, class00821 var1) {
      return () -> new class07700(Optional.of(var1), var0);
   }

   @Override
   public class05955 N() {
      return class07693.R;
   }
}
