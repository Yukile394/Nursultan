package minecraft;

import it.unimi.dsi.fastutil.doubles.DoubleList;

public class class07260 extends class00494 {
   private final class00494 N;
   private final class07185 y;
   private static final DoubleList L = new class06857(1);

   @Override
   public DoubleList method_1109(class07185 var1) {
      return var1 == this.y ? L : this.N.method_1109(var1);
   }

   public class07260(class00494 var1, class07185 var2, int var3) {
      super(N(var1.field_1401, var2, var3));
      this.N = var1;
      this.y = var2;
   }

   private static class07739 N(class07739 var0, class07185 var1, int var2) {
      return new class07257(
         var0,
         var1.N(var2, 0, 0),
         var1.N(0, var2, 0),
         var1.N(0, 0, var2),
         var1.N(var2 + 1, var0.field_1374, var0.field_1374),
         var1.N(var0.field_1373, var2 + 1, var0.field_1373),
         var1.N(var0.field_1372, var0.field_1372, var2 + 1)
      );
   }
}
