package minecraft;

import java.util.function.Function;

public enum class08966 {
   field_5650("movement", class00130::new),
   field_5648("find_tree", class08757::new),
   field_5649("punch_tree", class08776::new),
   field_5652("open_inventory", class08746::new),
   field_5655("craft_planks", class00092::new),
   field_5653("none", class00107::new);

   private final String field_5651;
   private final Function<class08764, ? extends class08762> field_5647;

   private <T extends class08762> class08966(String var3, Function<class08764, T> var4) {
      this.field_5651 = var3;
      this.field_5647 = var4;
   }

   public String N() {
      return this.field_5651;
   }

   public static class08966 N(String var0) {
      for (class08966 class08966 : values()) {
         if (class08966.field_5651.equals(var0)) {
            return class08966;
         }
      }

      return field_5653;
   }

   public class08762 N(class08764 var1) {
      return this.field_5647.apply(var1);
   }
}
