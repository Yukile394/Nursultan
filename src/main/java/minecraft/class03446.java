package minecraft;

import java.util.function.Consumer;

class class03446 implements Consumer<String> {
   private boolean y;

   class03446(class03425 var1, StringBuilder var2) {
      super();
      this.N = var2;
      this.y = true;
   }

   public void accept(String var1) {
      if (!this.y) {
         this.N.append(". ");
      }

      this.y = false;
      this.N.append(var1);
   }
}
