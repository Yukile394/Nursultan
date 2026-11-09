package minecraft;

final class class03501 {
   final class07739 N;
   final class07739 y;
   final class01296 L;

   class03501(class05795 var1, class01296 var2, int var3, class00772 var4) {
      super();
      int i = var3 * 2 + 1;
      this.N = new class06890(i, i, i);
      this.y = new class06890(i, i, i);

      for (int j = 0; j < i; j++) {
         for (int k = 0; k < i; k++) {
            for (int l = 0; l < i; l++) {
               class01296 class01296 = class01296.N(var2.N() + l - var3, var2.y() + k - var3, var2.L() + j - var3);
               class04993 class04993 = var1.y(var4, class01296);
               if (class04993 == class04993.field_44726) {
                  this.N.method_1049(l, k, j);
                  this.y.method_1049(l, k, j);
               } else if (class04993 == class04993.field_44725) {
                  this.y.method_1049(l, k, j);
               }
            }
         }
      }

      this.L = class01296.N(var2.N() - var3, var2.y() - var3, var2.L() - var3);
   }
}
