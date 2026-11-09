package minecraft;

public enum class03909 implements class05033 {
   field_36562("interpolated"),
   field_36563("flat_cache"),
   field_36564("cache_2d"),
   field_36565("cache_once"),
   field_36566("cache_all_in_cell");

   private final String field_37088;
   final class03979<class03894> field_37089 = class03865.N(var1x -> new class03897(this, var1x), class03894::u);

   private class03909(String var3) {
      this.field_37088 = var3;
   }

   @Override
   public String method_15434() {
      return this.field_37088;
   }
}
