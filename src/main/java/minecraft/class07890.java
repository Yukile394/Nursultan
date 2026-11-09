package minecraft;

import com.mojang.serialization.Codec;

public record class07890(class07892 pattern, class06563 baseColor, class06563 patternColor) {
   public static final Codec<class07890> N = Codec.INT.xmap(class07890::new, class07890::N);

   public class06563 L() {
      return this.baseColor;
   }

   public class07890(int var1) {
      this(class07899.u(var1), class07899.y(var1), class07899.L(var1));
   }

   public class07890(class07892 pattern, class06563 baseColor, class06563 patternColor) {
      this.pattern = pattern;
      this.baseColor = baseColor;
      this.patternColor = patternColor;
   }

   public class06563 u() {
      return this.patternColor;
   }

   public class07892 y() {
      return this.pattern;
   }

   public int N() {
      return class07899.N(this.pattern, this.baseColor, this.patternColor);
   }
}
