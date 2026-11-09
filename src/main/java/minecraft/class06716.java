package minecraft;

import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.Objects;
import org.jspecify.annotations.Nullable;

public final class class06716 extends class06599 {
   @Nullable
   private IntSet B;

   public class06716(Typed<?> var1, Schema var2) {
      super(var1, var2);
   }

   @Override
   protected boolean N() {
      this.B = new IntOpenHashSet();

      for (int i = 0; i < this.i.size(); i++) {
         if (Objects.equals(this.i.get(i).get("Name").asString(""), "minecraft:trapped_chest")) {
            this.B.add(i);
         }
      }

      return this.B.isEmpty();
   }

   public boolean N(int var1) {
      return this.B.contains(var1);
   }
}
