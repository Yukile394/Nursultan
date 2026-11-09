package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class05987(
   int waterColor,
   Optional<Integer> foliageColorOverride,
   Optional<Integer> dryFoliageColorOverride,
   Optional<Integer> grassColorOverride,
   class06009 grassColorModifier
) {
   public static final Codec<class05987> R = RecordCodecBuilder.create(
      var0 -> var0.group(
            class06338.m.fieldOf("water_color").forGetter(class05987::N),
            class06338.m.optionalFieldOf("foliage_color").forGetter(class05987::y),
            class06338.m.optionalFieldOf("dry_foliage_color").forGetter(class05987::L),
            class06338.m.optionalFieldOf("grass_color").forGetter(class05987::u),
            class06009.field_26429.optionalFieldOf("grass_color_modifier", class06009.field_26426).forGetter(class05987::i)
         )
         .apply(var0, class05987::new)
   );

   public Optional<Integer> L() {
      return this.dryFoliageColorOverride;
   }

   public class05987(
      int waterColor,
      Optional<Integer> foliageColorOverride,
      Optional<Integer> dryFoliageColorOverride,
      Optional<Integer> grassColorOverride,
      class06009 grassColorModifier
   ) {
      this.waterColor = waterColor;
      this.foliageColorOverride = foliageColorOverride;
      this.dryFoliageColorOverride = dryFoliageColorOverride;
      this.grassColorOverride = grassColorOverride;
      this.grassColorModifier = grassColorModifier;
   }

   public class06009 i() {
      return this.grassColorModifier;
   }

   public Optional<Integer> u() {
      return this.grassColorOverride;
   }

   public Optional<Integer> y() {
      return this.foliageColorOverride;
   }

   public int N() {
      return this.waterColor;
   }
}
