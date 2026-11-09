package minecraft;

public enum class06090 {
   field_2230(class01894.y("toast/movement_keys")),
   field_2237(class01894.y("toast/mouse")),
   field_2235(class01894.y("toast/tree")),
   field_2233(class01894.y("toast/recipe_book")),
   field_2236(class01894.y("toast/wooden_planks")),
   field_26848(class01894.y("toast/social_interactions")),
   field_28782(class01894.y("toast/right_click"));

   private final class01894 field_45398;

   private class06090(class01894 var3) {
      this.field_45398 = var3;
   }

   public void N(class01054 var1, int var2, int var3) {
      var1.N(class08394.Na, this.field_45398, var2, var3, 20, 20);
   }
}
