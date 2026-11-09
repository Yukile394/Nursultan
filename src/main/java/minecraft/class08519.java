package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class08519(
   class03556<class04891> ambientSound,
   class03556<class04891> deathSound,
   class03556<class04891> growlSound,
   class03556<class04891> hurtSound,
   class03556<class04891> pantSound,
   class03556<class04891> whineSound
) {
   public static final Codec<class08519> N = M();
   public static final Codec<class08519> y = M();
   public static final Codec<class03556<class08519>> L = class03539.N(class04227.yQ);
   public static final class02362<class04247, class03556<class08519>> u = class02389.y(class04227.yQ);

   public class03556<class04891> L() {
      return this.growlSound;
   }

   private static Codec<class08519> M() {
      return RecordCodecBuilder.create(
         var0 -> var0.group(
               class04891.y.fieldOf("ambient_sound").forGetter(class08519::N),
               class04891.y.fieldOf("death_sound").forGetter(class08519::y),
               class04891.y.fieldOf("growl_sound").forGetter(class08519::L),
               class04891.y.fieldOf("hurt_sound").forGetter(class08519::u),
               class04891.y.fieldOf("pant_sound").forGetter(class08519::i),
               class04891.y.fieldOf("whine_sound").forGetter(class08519::R)
            )
            .apply(var0, class08519::new)
      );
   }

   public class08519(
      class03556<class04891> ambientSound,
      class03556<class04891> deathSound,
      class03556<class04891> growlSound,
      class03556<class04891> hurtSound,
      class03556<class04891> pantSound,
      class03556<class04891> whineSound
   ) {
      this.ambientSound = ambientSound;
      this.deathSound = deathSound;
      this.growlSound = growlSound;
      this.hurtSound = hurtSound;
      this.pantSound = pantSound;
      this.whineSound = whineSound;
   }

   public class03556<class04891> i() {
      return this.pantSound;
   }

   public class03556<class04891> u() {
      return this.hurtSound;
   }

   public class03556<class04891> y() {
      return this.deathSound;
   }

   public class03556<class04891> N() {
      return this.ambientSound;
   }

   public class03556<class04891> R() {
      return this.whineSound;
   }
}
