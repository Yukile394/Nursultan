package minecraft;

import java.util.List;

public class class06060 {
   private int N;
   private int y;

   public class06060() {
      super();
   }

   public int y() {
      return this.y;
   }

   public int y(int var1) {
      return Math.max(1, class04995.u(this.N * var1 / 100.0F));
   }

   public boolean N(List<class04770> var1) {
      int i = this.N;
      int j = this.y;
      this.N = 0;
      this.y = 0;

      for (class04770 class04770 : var1) {
         if (!class04770.method_7325()) {
            this.N++;
            if (class04770.method_6113()) {
               this.y++;
            }
         }
      }

      return (j > 0 || this.y > 0) && (i != this.N || j != this.y);
   }

   public boolean N(int var1) {
      return this.y >= this.y(var1);
   }

   public void N() {
      this.y = 0;
   }

   public boolean N(int var1, List<class04770> var2) {
      return (int)var2.stream().filter(class08036::method_7276).count() >= this.y(var1);
   }
}
