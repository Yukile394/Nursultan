package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record class02687(Optional<class06289> target, boolean tracked) {
   public static final Codec<class02687> N = RecordCodecBuilder.create(
      var0 -> var0.group(class06289.y.optionalFieldOf("target").forGetter(class02687::N), Codec.BOOL.optionalFieldOf("tracked", true).forGetter(class02687::y))
         .apply(var0, class02687::new)
   );
   public static final class02362<ByteBuf, class02687> y = class02362.N(
      class06289.L.N_33(class02389::N), class02687::N, class02389.y, class02687::y, class02687::new
   );

   public class02687(Optional<class06289> target, boolean tracked) {
      super();
      this.target = target;
      this.tracked = tracked;
   }

   public boolean y() {
      return this.tracked;
   }

   public Optional<class06289> N() {
      return this.target;
   }

   public class02687 N(class04782 var1) {
      if (this.tracked && !this.target.isEmpty()) {
         if (this.target.get().N() != var1.method_27983()) {
            return this;
         } else {
            class07209 class07209 = this.target.get().y();
            return var1.method_24794(class07209) && var1.method_19494().N(class03927.j, class07209) ? this : new class02687(Optional.empty(), true);
         }
      } else {
         return this;
      }
   }
}
