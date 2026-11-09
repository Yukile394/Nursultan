package minecraft;

import com.mojang.serialization.Codec;

public enum class06702 implements class05033 {
   field_5795("progress"),
   field_5796("notched_6"),
   field_5791("notched_10"),
   field_5793("notched_12"),
   field_5790("notched_20");

   public static final Codec<class06702> field_56629 = class05033.N(class06702::values);
   private final String field_5794;

   private class06702(String var3) {
      this.field_5794 = var3;
   }

   public String N() {
      return this.field_5794;
   }

   @Override
   public String method_15434() {
      return this.field_5794;
   }
}
