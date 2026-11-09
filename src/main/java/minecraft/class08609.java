package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class08609(int itemDamagePerAttack, float disableBlockingForSeconds) {
   public static final float N = 5.0F;
   public static final Codec<class08609> y = RecordCodecBuilder.create(
      var0 -> var0.group(
            class06338.T.optionalFieldOf("item_damage_per_attack", 1).forGetter(class08609::N),
            class06338.n.optionalFieldOf("disable_blocking_for_seconds", 0.0F).forGetter(class08609::y)
         )
         .apply(var0, class08609::new)
   );
   public static final class02362<class04247, class08609> L = class02362.N(class02389.B, class08609::N, class02389.E, class08609::y, class08609::new);

   public class08609(int var1) {
      this(var1, 0.0F);
   }

   public class08609(int itemDamagePerAttack, float disableBlockingForSeconds) {
      super();
      this.itemDamagePerAttack = itemDamagePerAttack;
      this.disableBlockingForSeconds = disableBlockingForSeconds;
   }

   public float y() {
      return this.disableBlockingForSeconds;
   }

   public int N() {
      return this.itemDamagePerAttack;
   }
}
