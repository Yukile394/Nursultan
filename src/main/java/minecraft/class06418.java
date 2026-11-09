package minecraft;

import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import java.nio.file.Path;
import org.slf4j.Logger;

public class class06418 {
   private static final Logger y = LogUtils.getLogger();
   public static final int N = 9;
   private final Path L;
   private final DataFixer u;
   private final class03916[] i = new class03916[9];
   private boolean R;

   public class06418(Path var1, DataFixer var2) {
      super();
      this.L = var1.resolve("hotbar.nbt");
      this.u = var2;

      for (int ix = 0; ix < 9; ix++) {
         this.i[ix] = new class03916();
      }
   }

   private void y() {
      try {
         class07001 class07001 = class07742.N(this.L);
         if (class07001 == null) {
            return;
         }

         int ix = class07717.y(class07001, 1343);
         class07001 = class05715.field_19215.N(this.u, class07001, ix);

         for (int j = 0; j < 9; j++) {
            this.i[j] = class03916.N
               .parse(class07713.N, class07001.N(String.valueOf(j)))
               .resultOrPartial(var0 -> y.warn("Failed to parse hotbar: {}", var0))
               .orElseGet(class03916::new);
         }
      } catch (Exception exception) {
         y.error("Failed to load creative mode options", exception);
      }
   }

   public class03916 N(int var1) {
      if (!this.R) {
         this.y();
         this.R = true;
      }

      return this.i[var1];
   }

   public void N() {
      try {
         class07001 class07001 = class07717.i(new class07001());

         for (int ix = 0; ix < 9; ix++) {
            class03916 class03916 = this.N(ix);
            DataResult dataresult = class03916.N.encodeStart(class07713.N, class03916);
            class07001.N(String.valueOf(ix), (class07709)dataresult.getOrThrow());
         }

         class07742.y(class07001, this.L);
      } catch (Exception exception) {
         y.error("Failed to save creative mode options", exception);
      }
   }
}
