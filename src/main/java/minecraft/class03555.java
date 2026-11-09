package minecraft;

import com.mojang.serialization.Codec;

public enum class03555 implements class05033 {
   field_37782("default", class03532::N),
   field_37783("legacy_type_1", class03532::u),
   field_37784("legacy_type_2", class03532::L),
   field_37785("legacy_type_3", class03532::y);

   public static final Codec<class03555> field_37786 = class05033.N(class03555::values);
   private final String field_37787;
   private final class03546 field_37788;

   private class03555(String var3, class03546 var4) {
      this.field_37787 = var3;
      this.field_37788 = var4;
   }

   public boolean N(long var1, int var3, int var4, int var5, float var6) {
      return this.field_37788.shouldGenerate(var1, var3, var4, var5, var6);
   }

   @Override
   public String method_15434() {
      return this.field_37787;
   }
}
