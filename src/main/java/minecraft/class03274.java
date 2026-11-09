package minecraft;

import com.mojang.serialization.Codec;

public enum class03274 implements class05033 {
   field_41934(class07085.field_6169, 11, "helmet"),
   field_41935(class07085.field_6174, 16, "chestplate"),
   field_41936(class07085.field_6172, 15, "leggings"),
   field_41937(class07085.field_6166, 13, "boots"),
   field_48838(class07085.field_48824, 16, "body");

   public static final Codec<class03274> field_48839 = class05033.y(class03274::values);
   private final class07085 field_41938;
   private final String field_41939;
   private final int field_49257;

   private class03274(class07085 var3, int var4, String var5) {
      this.field_41938 = var3;
      this.field_41939 = var5;
      this.field_49257 = var4;
   }

   public String y() {
      return this.field_41939;
   }

   public class07085 N() {
      return this.field_41938;
   }

   public int N(int var1) {
      return this.field_49257 * var1;
   }

   @Override
   public String method_15434() {
      return this.field_41939;
   }
}
