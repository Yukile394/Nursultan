package minecraft;

import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import org.slf4j.Logger;

public class class05819 extends DataFix {
   private static final int y = 128;
   private static final int L = 64;
   private static final int u = 32;
   private static final int i = 16;
   private static final int R = 8;
   private static final int M = 4;
   private static final int B = 2;
   private static final int Z = 1;
   static final Logger N = LogUtils.getLogger();
   private static final int z = 4096;

   public class05819(Schema var1, boolean var2) {
      super(var1, var2);
   }

   private Dynamic<?> y(Dynamic<?> var1) {
      Optional optional = var1.get("Level").result();
      return optional.isPresent() && ((Dynamic)optional.get()).get("Sections").asStreamOpt().result().isPresent()
         ? var1.set("Level", new class05813((Dynamic<?>)optional.get()).N())
         : var1;
   }

   public static int N(boolean var0, boolean var1, boolean var2, boolean var3) {
      short short1 = 0;
      if (var2) {
         if (var1) {
            short1 |= 2;
         } else if (var0) {
            short1 |= 128;
         } else {
            short1 |= 1;
         }
      } else if (var3) {
         if (var0) {
            short1 |= 32;
         } else if (var1) {
            short1 |= 8;
         } else {
            short1 |= 16;
         }
      } else if (var1) {
         short1 |= 4;
      } else if (var0) {
         short1 |= 64;
      }

      return short1;
   }

   public static String N(Dynamic<?> var0, String var1) {
      return var0.get("Properties").get(var1).asString("");
   }

   public static String N(Dynamic<?> var0) {
      return var0.get("Name").asString("");
   }

   public static int N(class01199<Dynamic<?>> var0, Dynamic<?> var1) {
      int ix = var0.N(var1);
      if (ix == -1) {
         ix = var0.u(var1);
      }

      return ix;
   }

   public TypeRewriteRule makeRule() {
      Type type = this.getInputSchema().getType(class06962.u);
      Type type1 = this.getOutputSchema().getType(class06962.u);
      return this.writeFixAndRead("ChunkPalettedStorageFix", type, type1, this::y);
   }
}
