package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public record class08172(boolean dealsKnockback, boolean dismounts, Optional<class03556<class04891>> sound, Optional<class03556<class04891>> hitSound) {
   public static final Codec<class08172> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            Codec.BOOL.optionalFieldOf("deals_knockback", true).forGetter(class08172::N),
            Codec.BOOL.optionalFieldOf("dismounts", false).forGetter(class08172::y),
            class04891.y.optionalFieldOf("sound").forGetter(class08172::L),
            class04891.y.optionalFieldOf("hit_sound").forGetter(class08172::u)
         )
         .apply(var0, class08172::new)
   );
   public static final class02362<class04247, class08172> y = class02362.N(
      class02389.y,
      class08172::N,
      class02389.y,
      class08172::y,
      class04891.u.N_33(class02389::N),
      class08172::L,
      class04891.u.N_33(class02389::N),
      class08172::u,
      class08172::new
   );

   public Optional<class03556<class04891>> L() {
      return this.sound;
   }

   public class08172(boolean dealsKnockback, boolean dismounts, Optional<class03556<class04891>> sound, Optional<class03556<class04891>> hitSound) {
      this.dealsKnockback = dealsKnockback;
      this.dismounts = dismounts;
      this.sound = sound;
      this.hitSound = hitSound;
   }

   public Optional<class03556<class04891>> u() {
      return this.hitSound;
   }

   public boolean y() {
      return this.dismounts;
   }

   public void y(class07049 var1) {
      this.hitSound
         .ifPresent(
            var1x -> var1.method_73183()
               .method_60511(null, var1.method_23317(), var1.method_23318(), var1.method_23321(), (class03556<class04891>)var1x, var1.method_5634(), 1.0F, 1.0F)
         );
   }

   public void N(class07438 var1, class07085 var2) {
      float f = (float)var1.method_45325(class05298.u);
      class06543 class06543 = var1.method_76693();
      boolean flag = false;

      for (class06145 class06145 : (Collection)class08038.N(var1, class06543, var1x -> N((class07049)var1, var1x), class05849.field_17558)
         .map(var0 -> List.of(), var0 -> var0)) {
         flag |= var1.method_75123(var2, class06145.L(), f, true, this.dealsKnockback, this.dismounts);
      }

      var1.method_75124();
      var1.method_75125();
      if (flag) {
         this.y(var1);
      }

      this.N(var1);
      var1.method_23667(class07050.field_5808, false);
   }

   public static boolean N(class07049 var0, class07049 var1) {
      if (var1.method_5655() || !var1.method_5805()) {
         return false;
      } else if (var1 instanceof class01952) {
         return true;
      } else if (!var1.method_49108()) {
         return false;
      } else {
         return var1 instanceof class08036 class08036 && var0 instanceof class08036 && !((class08036)var0).method_7256(class08036)
            ? false
            : !var0.method_5794(var1);
      }
   }

   public void N(class07049 var1) {
      this.sound
         .ifPresent(
            var1x -> var1.method_73183()
               .method_60511(var1, var1.method_23317(), var1.method_23318(), var1.method_23321(), (class03556<class04891>)var1x, var1.method_5634(), 1.0F, 1.0F)
         );
   }

   public boolean N() {
      return this.dealsKnockback;
   }
}
