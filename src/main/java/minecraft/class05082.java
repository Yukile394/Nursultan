package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class05082(
   class05085 placement,
   float airPocketProbability,
   float mossiness,
   boolean overgrown,
   boolean vines,
   boolean canBeCold,
   boolean replaceWithBlackstone,
   float weight
) {
   public static final Codec<class05082> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class05085.field_37811.fieldOf("placement").forGetter(class05082::N),
            Codec.floatRange(0.0F, 1.0F).fieldOf("air_pocket_probability").forGetter(class05082::y),
            Codec.floatRange(0.0F, 1.0F).fieldOf("mossiness").forGetter(class05082::L),
            Codec.BOOL.fieldOf("overgrown").forGetter(class05082::u),
            Codec.BOOL.fieldOf("vines").forGetter(class05082::i),
            Codec.BOOL.fieldOf("can_be_cold").forGetter(class05082::R),
            Codec.BOOL.fieldOf("replace_with_blackstone").forGetter(class05082::M),
            class06338.t.fieldOf("weight").forGetter(class05082::B)
         )
         .apply(var0, class05082::new)
   );

   public float L() {
      return this.mossiness;
   }

   public boolean M() {
      return this.replaceWithBlackstone;
   }

   public class05082(
      class05085 placement,
      float airPocketProbability,
      float mossiness,
      boolean overgrown,
      boolean vines,
      boolean canBeCold,
      boolean replaceWithBlackstone,
      float weight
   ) {
      super();
      this.placement = placement;
      this.airPocketProbability = airPocketProbability;
      this.mossiness = mossiness;
      this.overgrown = overgrown;
      this.vines = vines;
      this.canBeCold = canBeCold;
      this.replaceWithBlackstone = replaceWithBlackstone;
      this.weight = weight;
   }

   public float B() {
      return this.weight;
   }

   public boolean i() {
      return this.vines;
   }

   public boolean u() {
      return this.overgrown;
   }

   public float y() {
      return this.airPocketProbability;
   }

   public class05085 N() {
      return this.placement;
   }

   public boolean R() {
      return this.canBeCold;
   }
}
