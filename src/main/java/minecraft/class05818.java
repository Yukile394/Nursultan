package minecraft;

import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public final class class05818 extends class05017<class05818> {
   int y;
   final Long2IntOpenHashMap L;

   public class05818(Long2ObjectOpenHashMap<class00536> var1, Long2IntOpenHashMap var2, int var3) {
      super(var1);
      this.L = var2;
      var2.defaultReturnValue(var3);
      this.y = var3;
   }

   public class05818 y() {
      return new class05818(this.N.clone(), this.L.clone(), this.y);
   }
}
