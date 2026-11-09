package minecraft;

import Nursultan.class10568;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class class06238 implements class06270 {
   public static final MapCodec<class06238> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class01894.N.fieldOf("hex_file").forGetter(var0x -> var0x.L),
            class06233.u.listOf().optionalFieldOf("size_overrides", List.of()).forGetter(var0x -> var0x.u)
         )
         .apply(var0, class06238::new)
   );
   private final class01894 L;
   private final List<class06233> u;

   private class06238(class01894 var1, List<class06233> var2) {
      super();
      this.L = var1;
      this.u = var2;
   }

   @Override
   public Either<class06246, class06254> y() {
      return Either.left(this::N);
   }

   private class06262 N(class01089 var1) throws IOException {
      class06268 class06268;
      try (InputStream inputstream = var1.u(this.L)) {
         class06268 = this.N(inputstream);
      }

      return class06268;
   }

   private class06268 N(InputStream var1) throws IOException {
      class03475 class03475x = new class03475<>(class06267[]::new, class06267[][]::new);
      class10568 class10568 = class03475x::N;

      class06268 class06268;
      try (ZipInputStream zipinputstream = new ZipInputStream(var1)) {
         ZipEntry zipentry;
         while ((zipentry = zipinputstream.getNextEntry()) != null) {
            String s = zipentry.getName();
            if (s.endsWith(".hex")) {
               class06268.N.info("Found {}, loading", s);
               class06268.N(new class03172(zipinputstream), class10568);
            }
         }

         class03475 class03475x = new class03475<>(class06248[]::new, class06248[][]::new);

         for (class06233 class06233 : this.u) {
            int i = class06233.N();
            int j = class06233.y();
            class06250 class06250 = class06233.L();

            for (int k = i; k <= j; k++) {
               class06267 class06267 = (class06267)class03475x.y(k);
               if (class06267 != null) {
                  class03475x.N(k, new class06248(class06267, class06250.y(), class06250.L()));
               }
            }
         }

         class03475x.N((var1x, var2x) -> {
            int l = var2x.u();
            int i1 = class06250.N(l);
            int j1 = class06250.y(l);
            class03475.N(var1x, new class06248(var2x, i1, j1));
         });
         class06268 = new class06268(class03475x);
      }

      return class06268;
   }

   @Override
   public class05855 N() {
      return class05855.field_2313;
   }
}
