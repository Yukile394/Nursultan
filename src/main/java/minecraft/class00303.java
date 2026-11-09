package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class00303(class06889 target, int color, int duration) implements class07126 {
   public static final MapCodec<class00303> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class06889.N.fieldOf("target").forGetter(class00303::N),
            class06338.E.fieldOf("color").forGetter(class00303::y),
            class06338.b.fieldOf("duration").forGetter(class00303::L)
         )
         .apply(var0, class00303::new)
   );
   public static final class02362<class04247, class00303> y = class02362.N(
      class06889.y, class00303::N, class02389.M, class00303::y, class02389.B, class00303::L, class00303::new
   );

   public int L() {
      return this.duration;
   }

   public class00303(class06889 target, int color, int duration) {
      super();
      this.target = target;
      this.color = color;
      this.duration = duration;
   }

   public int y() {
      return this.color;
   }

   public class06889 N() {
      return this.target;
   }

   @Override
   public class07103<class00303> method_10295() {
      return class07107.D;
   }
}
