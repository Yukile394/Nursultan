package minecraft;

import com.mojang.serialization.Codec;

public enum class00763 {
   field_9315(-3),
   field_9313(-2),
   field_9310(-1),
   field_9314(0),
   field_9316(1),
   field_9309(2),
   field_9311(3);

   public static final Codec<class00763> field_56697 = Codec.INT.xmap(class00763::N, class00763::N);
   private final int field_9308;

   private class00763(int var3) {
      this.field_9308 = var3;
   }

   public int N() {
      return this.field_9308;
   }

   public static class00763 N(int var0) {
      for (class00763 class00763 : values()) {
         if (class00763.field_9308 == var0) {
            return class00763;
         }
      }

      return var0 < field_9315.field_9308 ? field_9315 : field_9311;
   }
}
