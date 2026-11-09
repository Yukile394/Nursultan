package minecraft;

enum class03891 implements class05033 {
   field_36555("abs"),
   field_36556("square"),
   field_36557("cube"),
   field_36558("half_negative"),
   field_36559("quarter_negative"),
   field_61470("invert"),
   field_36560("squeeze");

   private final String field_37086;
   final class03979<class03883> field_37087 = class03865.N(var1x -> class03883.N(this, var1x), class03883::az_);

   private class03891(String var3) {
      this.field_37086 = var3;
   }

   @Override
   public String method_15434() {
      return this.field_37086;
   }
}
