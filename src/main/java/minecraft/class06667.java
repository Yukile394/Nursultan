package minecraft;

import java.util.List;
import java.util.Optional;

public final class class06667 extends class08092<Boolean> {
   private static final List<Boolean> N = List.of(true, false);
   private static final int y = 0;
   private static final int L = 1;

   private class06667(String var1) {
      super(var1, Boolean.class);
   }

   @Override
   public Optional<Boolean> y(String var1) {
      return switch (var1) {
         case "true" -> Optional.of(true);
         case "false" -> Optional.of(false);
         default -> Optional.empty();
      };
   }

   public int y(Boolean var1) {
      return var1 ? 0 : 1;
   }

   public String N(Boolean var1) {
      return var1.toString();
   }

   public static class06667 N(String var0) {
      return new class06667(var0);
   }

   @Override
   public List<Boolean> N() {
      return N;
   }
}
