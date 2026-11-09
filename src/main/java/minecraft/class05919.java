package minecraft;

public enum class05919 implements class05033, class07611<class07049> {
   field_935("this", class06551.N),
   field_936("attacker", class06551.R),
   field_939("direct_attacker", class06551.M),
   field_937("attacking_player", class06551.u),
   field_61495("target_entity", class06551.L),
   field_61496("interacting_entity", class06551.y);

   public static final class05031<class05919> field_45792 = class05033.N(class05919::values);
   private final String field_941;
   private final class07491<? extends class07049> field_938;

   private class05919(String var3, class07491<? extends class07049> var4) {
      this.field_941 = var3;
      this.field_938 = var4;
   }

   public static class05919 N(String var0) {
      class05919 class05919 = field_45792.N(var0);
      if (class05919 != null) {
         return class05919;
      } else {
         throw new IllegalArgumentException("Invalid entity target " + var0);
      }
   }

   @Override
   public class07491<? extends class07049> N() {
      return this.field_938;
   }

   @Override
   public String method_15434() {
      return this.field_941;
   }
}
