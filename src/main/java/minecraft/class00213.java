package minecraft;

import com.mojang.serialization.Codec;

public enum class00213 implements class05033 {
   field_56208("clear", 100000, 0, false, false),
   field_56209("rain", 0, 100000, true, false),
   field_56210("thunder", 0, 100000, true, true);

   public static final Codec<class00213> field_56211 = class05033.N(class00213::values);
   private final String field_56212;
   private final int field_56213;
   private final int field_56214;
   private final boolean field_56215;
   private final boolean field_56216;

   private class00213(String var3, int var4, int var5, boolean var6, boolean var7) {
      this.field_56212 = var3;
      this.field_56213 = var4;
      this.field_56214 = var5;
      this.field_56215 = var6;
      this.field_56216 = var7;
   }

   void N(class04782 var1) {
      var1.method_27910(this.field_56213, this.field_56214, this.field_56215, this.field_56216);
   }

   @Override
   public String method_15434() {
      return this.field_56212;
   }
}
