package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class class02771 extends class01471 {
   public static final MapCodec<class02771> y = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class01471.N.fieldOf("source").forGetter(var0x -> var0x.L),
            Codec.STRING.fieldOf("property").forGetter(var0x -> var0x.u),
            class02142.L.fieldOf("values").forGetter(var0x -> var0x.R)
         )
         .apply(var0, class02771::new)
   );
   private final class01471 L;
   private final String u;
   @Nullable
   private class08071 i;
   private final class02142 R;

   public class02771(class01471 var1, class08071 var2, class02142 var3) {
      super();
      this.L = var1;
      this.i = var2;
      this.u = var2.R();
      this.R = var3;
      List list = var2.N();

      for (int ix = var3.y(); ix <= var3.L(); ix++) {
         if (!list.contains(ix)) {
            throw new IllegalArgumentException("Property value out of range: " + var2.R() + ": " + ix);
         }
      }
   }

   public class02771(class01471 var1, String var2, class02142 var3) {
      super();
      this.L = var1;
      this.u = var2;
      this.R = var3;
   }

   @Override
   protected class01473<?> N() {
      return class01473.M;
   }

   @Nullable
   private static class08071 N(class00500 var0, String var1) {
      return var0.y()
         .stream()
         .filter(var1x -> var1x.R().equals(var1))
         .filter(var0x -> var0x instanceof class08071)
         .map(var0x -> (class08071)var0x)
         .findAny()
         .orElse(null);
   }

   @Override
   public class00500 N(class06069 var1, class07209 var2) {
      class00500 class00500 = this.L.N(var1, var2);
      if (this.i == null || !class00500.y(this.i)) {
         class08071 class08071 = N(class00500, this.u);
         if (class08071 == null) {
            return class00500;
         }

         this.i = class08071;
      }

      return class00500.y(this.i, this.R.N(var1));
   }
}
