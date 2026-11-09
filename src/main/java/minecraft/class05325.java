package minecraft;

import java.util.function.IntFunction;

public enum class05325 {
   field_23808(0),
   field_23809(1),
   field_23810(2),
   field_23811(3),
   field_23812(4);

   private static final IntFunction<class05325> field_23813 = class02121.N(class05325::N, values(), class02126.field_41665);
   private final int field_23814;

   private class05325(int var3) {
      this.field_23814 = var3;
   }

   public static class05325 N(int var0) {
      return field_23813.apply(var0);
   }

   public int N() {
      return this.field_23814;
   }
}
