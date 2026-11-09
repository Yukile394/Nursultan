package minecraft;

public class class07490 extends class07482 {
   private final class06695 N;
   private final int y;

   public static class07490 L(int var0, class08044 var1) {
      return new class07490(class05851.field_17326, var0, var1, 3);
   }

   public class07490(class05851<?> var1, int var2, class08044 var3, class06695 var4, int var5) {
      super(var1, var2);
      N(var4, var5 * 9);
      this.N = var4;
      this.y = var5;
      var4.method_5435(var3.z);
      byte b0 = 18;
      this.u(var4, 8, 18);
      int i = 18 + this.y * 18 + 13;
      this.L(var3, 8, i);
   }

   public class07490(class05851<?> var1, int var2, class08044 var3, int var4) {
      this(var1, var2, var3, new class07075(9 * var4), var4);
   }

   public static class07490 i(int var0, class08044 var1) {
      return new class07490(class05851.field_18667, var0, var1, 5);
   }

   public static class07490 u(int var0, class08044 var1) {
      return new class07490(class05851.field_18666, var0, var1, 4);
   }

   private void u(class06695 var1, int var2, int var3) {
      for (int i = 0; i < this.y; i++) {
         for (int j = 0; j < 9; j++) {
            this.N(new class06937(var1, j + i * 9, var2 + j * 18, var3 + i * 18));
         }
      }
   }

   @Override
   public void y(class08036 var1) {
      super.y(var1);
      this.N.method_5432(var1);
   }

   public static class07490 y(int var0, class08044 var1, class06695 var2) {
      return new class07490(class05851.field_17327, var0, var1, var2, 6);
   }

   public static class07490 y(int var0, class08044 var1) {
      return new class07490(class05851.field_18665, var0, var1, 2);
   }

   public class06695 E() {
      return this.N;
   }

   public static class07490 N(int var0, class08044 var1) {
      return new class07490(class05851.field_18664, var0, var1, 1);
   }

   @Override
   public class06584 N(class08036 var1, int var2) {
      class06584 class06584x = class06584.E;
      class06937 class06937 = this.T.get(var2);
      if (class06937 != null && class06937.R()) {
         class06584 class06584x = class06937.i();
         class06584x = class06584x.t();
         if (var2 < this.y * 9) {
            if (!this.N(class06584x, this.y * 9, this.T.size(), true)) {
               return class06584.E;
            }
         } else if (!this.N(class06584x, 0, this.y * 9, false)) {
            return class06584.E;
         }

         if (class06584x.R()) {
            class06937.u(class06584.E);
         } else {
            class06937.M();
         }
      }

      return class06584x;
   }

   public static class07490 N(int var0, class08044 var1, class06695 var2) {
      return new class07490(class05851.field_17326, var0, var1, var2, 3);
   }

   @Override
   public boolean N(class08036 var1) {
      return this.N.method_5443(var1);
   }

   public int W() {
      return this.y;
   }

   public static class07490 R(int var0, class08044 var1) {
      return new class07490(class05851.field_17327, var0, var1, 6);
   }
}
