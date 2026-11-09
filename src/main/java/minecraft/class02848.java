package minecraft;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record class02848(List<class00392> lines, List<class00392> styledLines) implements class02694 {
   public static final class02848 N = new class02848(List.of());
   public static final int y = 256;
   private static final class00405 M = class00405.N.N(class06541.field_1064).y(true);
   public static final Codec<class02848> L = class03748.N.sizeLimitedListOf(256).xmap(class02848::new, class02848::N);
   public static final class02362<class04247, class02848> u = class03748.y.N_33(class02389.L(256)).N_10(class02848::new, class02848::N);

   public class02848(List<class00392> var1) {
      this((List<class00392>)var1, Lists.transform(var1, var0 -> class00390.N(var0, M)));
   }

   public class02848(List<class00392> lines, List<class00392> styledLines) {
      super();
      if (lines.size() > 256) {
         throw new IllegalArgumentException("Got " + lines.size() + " lines, but maximum is 256");
      } else {
         this.lines = lines;
         this.styledLines = styledLines;
      }
   }

   public List<class00392> y() {
      return this.styledLines;
   }

   @Override
   public void N(class06591 var1, Consumer<class00392> var2, class06497 var3, class02666 var4) {
      this.styledLines.forEach(var2);
   }

   public List<class00392> N() {
      return this.lines;
   }

   public class02848 N(class00392 var1) {
      return new class02848(class07536.N(this.lines, var1));
   }
}
