package minecraft;

public enum class07032 implements class07030 {
   field_11512("skeleton"),
   field_11513("wither_skeleton"),
   field_11510("player"),
   field_11508("zombie"),
   field_11507("creeper"),
   field_41313("piglin"),
   field_11511("dragon");

   private final String field_46444;

   private class07032(String var3) {
      this.field_46444 = var3;
      N.put(var3, this);
   }

   @Override
   public String method_15434() {
      return this.field_46444;
   }
}
