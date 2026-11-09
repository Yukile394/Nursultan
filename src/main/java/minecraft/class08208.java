package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class08208(float seconds, Optional<class01894> cooldownGroup) {
   public static final Codec<class08208> N = RecordCodecBuilder.create(
      var0 -> var0.group(class06338.t.fieldOf("seconds").forGetter(class08208::y), class01894.N.optionalFieldOf("cooldown_group").forGetter(class08208::L))
         .apply(var0, class08208::new)
   );
   public static final class02362<class04247, class08208> y = class02362.N(
      class02389.E, class08208::y, class01894.y.N_33(class02389::N), class08208::L, class08208::new
   );

   public Optional<class01894> L() {
      return this.cooldownGroup;
   }

   public class08208(float var1) {
      this(var1, Optional.empty());
   }

   public class08208(float seconds, Optional<class01894> cooldownGroup) {
      super();
      this.seconds = seconds;
      this.cooldownGroup = cooldownGroup;
   }

   public float y() {
      return this.seconds;
   }

   public void N(class06584 var1, class07438 var2) {
      if (var2 instanceof class08036) {
         ((class08036)var2).method_7357().N(var1, this.N());
      }
   }

   public int N() {
      return (int)(this.seconds * 20.0F);
   }
}
