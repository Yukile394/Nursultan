package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class08211(class03543<class07084> effects) implements class08200 {
   public static final MapCodec<class08211> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class03541.N(class04227.Ni).fieldOf("effects").forGetter(class08211::y)).apply(var0, class08211::new)
   );
   public static final class02362<class04247, class08211> y = class02362.N(class02389.L(class04227.Ni), class08211::y, class08211::new);

   public class08211(class03556<class07084> var1) {
      this(class03543.N(var1));
   }

   public class08211(class03543<class07084> effects) {
      this.effects = effects;
   }

   public class03543<class07084> y() {
      return this.effects;
   }

   @Override
   public boolean N(class07299 var1, class06584 var2, class07438 var3) {
      boolean flag = false;

      for (class03556 class03556 : this.effects) {
         if (var3.method_6016(class03556)) {
            flag = true;
         }
      }

      return flag;
   }

   @Override
   public class08217<class08211> N() {
      return class08217.y;
   }
}
