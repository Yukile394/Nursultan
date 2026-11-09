package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;

public record class02197(List<class02191> rules, float defaultMiningSpeed, int damagePerBlock, boolean canDestroyBlocksInCreative) {
   public static final Codec<class02197> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class02191.u.listOf().fieldOf("rules").forGetter(class02197::N),
            Codec.FLOAT.optionalFieldOf("default_mining_speed", 1.0F).forGetter(class02197::y),
            class06338.T.optionalFieldOf("damage_per_block", 1).forGetter(class02197::L),
            Codec.BOOL.optionalFieldOf("can_destroy_blocks_in_creative", true).forGetter(class02197::u)
         )
         .apply(var0, class02197::new)
   );
   public static final class02362<class04247, class02197> y = class02362.N(
      class02191.i.N_33(class02389.N()), class02197::N, class02389.E, class02197::y, class02389.B, class02197::L, class02389.y, class02197::u, class02197::new
   );

   public int L() {
      return this.damagePerBlock;
   }

   public class02197(List<class02191> rules, float defaultMiningSpeed, int damagePerBlock, boolean canDestroyBlocksInCreative) {
      super();
      this.rules = rules;
      this.defaultMiningSpeed = defaultMiningSpeed;
      this.damagePerBlock = damagePerBlock;
      this.canDestroyBlocksInCreative = canDestroyBlocksInCreative;
   }

   public boolean u() {
      return this.canDestroyBlocksInCreative;
   }

   public float y() {
      return this.defaultMiningSpeed;
   }

   public boolean y(class00500 var1) {
      for (class02191 class02191 : this.rules) {
         if (class02191.L().isPresent() && var1.N(class02191.N())) {
            return class02191.L().get();
         }
      }

      return false;
   }

   public List<class02191> N() {
      return this.rules;
   }

   public float N(class00500 var1) {
      for (class02191 class02191 : this.rules) {
         if (class02191.y().isPresent() && var1.N(class02191.N())) {
            return class02191.y().get();
         }
      }

      return this.defaultMiningSpeed;
   }
}
