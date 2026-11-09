package minecraft;

public enum class05288 implements class05033 {
   field_23381("down_east", class07211.field_11033, class07211.field_11034),
   field_23382("down_north", class07211.field_11033, class07211.field_11043),
   field_23383("down_south", class07211.field_11033, class07211.field_11035),
   field_23384("down_west", class07211.field_11033, class07211.field_11039),
   field_23385("up_east", class07211.field_11036, class07211.field_11034),
   field_23386("up_north", class07211.field_11036, class07211.field_11043),
   field_23387("up_south", class07211.field_11036, class07211.field_11035),
   field_23388("up_west", class07211.field_11036, class07211.field_11039),
   field_23389("west_up", class07211.field_11039, class07211.field_11036),
   field_23390("east_up", class07211.field_11034, class07211.field_11036),
   field_23391("north_up", class07211.field_11043, class07211.field_11036),
   field_23392("south_up", class07211.field_11035, class07211.field_11036);

   private static final int field_54867 = class07211.values().length;
   private static final class05288[] field_54868 = class07536.N(new class05288[field_54867 * field_54867], var0 -> {
      for (class05288 class05288 : values()) {
         var0[y(class05288.field_23396, class05288.field_23395)] = class05288;
      }
   });
   private final String field_23394;
   private final class07211 field_23395;
   private final class07211 field_23396;

   private class05288(String var3, class07211 var4, class07211 var5) {
      this.field_23394 = var3;
      this.field_23396 = var4;
      this.field_23395 = var5;
   }

   public class07211 y() {
      return this.field_23395;
   }

   private static int y(class07211 var0, class07211 var1) {
      return var0.ordinal() * field_54867 + var1.ordinal();
   }

   public static class05288 N(class07211 var0, class07211 var1) {
      return field_54868[y(var0, var1)];
   }

   public class07211 N() {
      return this.field_23396;
   }

   @Override
   public String method_15434() {
      return this.field_23394;
   }
}
