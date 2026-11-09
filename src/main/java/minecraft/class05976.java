package minecraft;

import com.mojang.serialization.Dynamic;
import com.mojang.serialization.OptionalDynamic;

public class class05976 {
   private final int N;
   private final long y;
   private final String L;
   private final class01829 u;
   private final boolean i;

   public String L() {
      return this.L;
   }

   private class05976(int var1, long var2, String var4, int var5, String var6, boolean var7) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var4;
      this.u = new class01829(var5, var6);
      this.i = var7;
   }

   public boolean i() {
      return this.i;
   }

   public class01829 u() {
      return this.u;
   }

   public long y() {
      return this.y;
   }

   public static class05976 N(Dynamic<?> var0) {
      int ix = var0.get("version").asInt(0);
      long j = var0.get("LastPlayed").asLong(0L);
      OptionalDynamic optionaldynamic = var0.get("Version");
      return optionaldynamic.result().isPresent()
         ? new class05976(
            ix,
            j,
            optionaldynamic.get("Name").asString(class07529.y().comp_4025()),
            optionaldynamic.get("Id").asInt(class07529.y().comp_4026().y()),
            optionaldynamic.get("Series").asString("main"),
            optionaldynamic.get("Snapshot").asBoolean(!class07529.y().comp_4031())
         )
         : new class05976(ix, j, "", 0, "main", false);
   }

   public int N() {
      return this.N;
   }
}
