package minecraft;

public class class08416 {
   private static final class08414 N = new class08414(
      N(
         N()
            .N(y(class06563.field_7963), 5)
            .N(y(class06563.field_7944), 5)
            .N(y(class06563.field_7967), 5)
            .N(y(class06563.field_7957), 3)
            .N(N(class06563.field_7952), 82)
            .N()
      )
   );
   private static final class08414 y = new class08414(
      N(
         N()
            .N(y(class06563.field_7944), 5)
            .N(y(class06563.field_7967), 5)
            .N(y(class06563.field_7952), 5)
            .N(y(class06563.field_7963), 3)
            .N(N(class06563.field_7957), 82)
            .N()
      )
   );
   private static final class08414 L = new class08414(
      N(
         N()
            .N(y(class06563.field_7967), 5)
            .N(y(class06563.field_7944), 5)
            .N(y(class06563.field_7952), 5)
            .N(y(class06563.field_7957), 3)
            .N(N(class06563.field_7963), 82)
            .N()
      )
   );

   public class08416() {
      super();
   }

   private static class08411 y(class06563 var0) {
      return var1 -> var0;
   }

   private static class02136<class08411> N() {
      return class04540.y();
   }

   public static class06563 N(class03556<class00780> var0, class06069 var1) {
      return N(var0).N().get(var1);
   }

   private static class08411 N(class06563 var0) {
      return N(N().N(y(var0), 499).N(y(class06563.field_7954), 1).N());
   }

   private static class08411 N(class04540<class08411> var0) {
      if (var0.L()) {
         throw new IllegalArgumentException("List must be non-empty");
      } else {
         return var1 -> ((class08411)var0.y(var1)).get(var1);
      }
   }

   private static class08414 N(class03556<class00780> var0) {
      if (var0.N(class03557.NM)) {
         return y;
      } else {
         return var0.N(class03557.NR) ? L : N;
      }
   }
}
