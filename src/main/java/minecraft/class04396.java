package minecraft;

import java.util.function.Consumer;

public class class04396 {
   private static final int N = Integer.MIN_VALUE;
   private int y = Integer.MIN_VALUE;

   public class04396() {
      super();
   }

   public boolean y() {
      return this.y != Integer.MIN_VALUE;
   }

   public void y(int var1) {
      if (!this.y()) {
         this.N(var1);
      }
   }

   public void N(class04396 var1) {
      this.y = var1.y;
   }

   public long N(float var1) {
      return (long)((var1 - this.y) * 50.0F);
   }

   public void N(int var1, float var2) {
      if (this.y()) {
         this.y -= (int)(var1 * var2);
      }
   }

   public void N(int var1) {
      this.y = var1;
   }

   public void N(boolean var1, int var2) {
      if (var1) {
         this.y(var2);
      } else {
         this.N();
      }
   }

   public void N() {
      this.y = Integer.MIN_VALUE;
   }

   public void N(Consumer<class04396> var1) {
      if (this.y()) {
         var1.accept(this);
      }
   }
}
