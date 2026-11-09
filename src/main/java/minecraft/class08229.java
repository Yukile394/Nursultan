package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class08229(class03556<class04891> sound) implements class08200 {
   public static final MapCodec<class08229> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class04891.y.fieldOf("sound").forGetter(class08229::y)).apply(var0, class08229::new)
   );
   public static final class02362<class04247, class08229> y = class02362.N(class04891.u, class08229::y, class08229::new);

   public class08229(class03556<class04891> sound) {
      super();
      this.sound = sound;
   }

   public class03556<class04891> y() {
      return this.sound;
   }

   @Override
   public boolean N(class07299 var1, class06584 var2, class07438 var3) {
      var1.method_8396(null, var3.method_24515(), this.sound.N(), var3.method_5634(), 1.0F, 1.0F);
      return true;
   }

   @Override
   public class08217<class08229> N() {
      return class08217.i;
   }
}
