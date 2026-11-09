package minecraft;

import com.mojang.serialization.Codec;
import java.util.HexFormat;

public record class03728(int rgba) {
   public static final Codec<class03728> N = class06338.P.xmap(class03728::new, class03728::N);

   public class03728(int rgba) {
      this.rgba = rgba;
   }

   @Override
   public String toString() {
      return HexFormat.of().toHexDigits(this.rgba, 8);
   }

   public int N() {
      return this.rgba;
   }
}
