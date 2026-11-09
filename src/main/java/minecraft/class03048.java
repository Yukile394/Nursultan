package minecraft;

import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import java.security.SignatureException;
import java.util.List;

public record class03048(List<class04469> entries) {
   public static final Codec<class03048> N = ((Codec)class04469.y_0).listOf().xmap(class03048::new, class03048::y);
   public static class03048 y = new class03048(List.of());
   public static final int L = 20;

   public class03048(List<class04469> entries) {
      this.entries = entries;
   }

   public List<class04469> y() {
      return this.entries;
   }

   public class03066 N(class03397 var1) {
      return new class03066(this.entries.stream().map(var1x -> var1x.N(var1)).toList());
   }

   public void N(class03934 var1) throws SignatureException {
      var1.update(Ints.toByteArray(this.entries.size()));

      for (class04469 class04469 : this.entries) {
         var1.update(class04469.y());
      }
   }

   public byte N() {
      int i = 1;

      for (class04469 class04469 : this.entries) {
         i = 31 * i + class04469.N();
      }

      byte b0 = (byte)i;
      return b0 == 0 ? 1 : b0;
   }
}
