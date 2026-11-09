package minecraft;

import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.doubles.Double2DoubleFunction;

public enum class03873 implements class05033 {
   field_37066("type_1", class03911::y, 2.0),
   field_37067("type_2", class03911::N, 3.0);

   public static final Codec<class03873> field_37068 = class05033.N(class03873::values);
   private final String field_37070;
   final Double2DoubleFunction field_37071;
   final double field_37072;

   private class03873(String var3, Double2DoubleFunction var4, double var5) {
      this.field_37070 = var3;
      this.field_37071 = var4;
      this.field_37072 = var5;
   }

   @Override
   public String method_15434() {
      return this.field_37070;
   }
}
