package minecraft;

public class class06676 extends class06555 {
   public static final class08413<class06676> N = new class08413<>(
      "scoreboard", class06676::new, class06645.y.xmap(class06676::new, class06676::N), class05715.field_45083
   );
   private class06645 y;

   private class06676() {
      this(class06645.N);
   }

   public class06676(class06645 var1) {
      super();
      this.y = var1;
   }

   public void N(class06645 var1) {
      if (!var1.equals(this.y)) {
         this.y = var1;
         this.method_80();
      }
   }

   public class06645 N() {
      return this.y;
   }
}
