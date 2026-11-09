package minecraft;

import com.mojang.serialization.Codec;

public enum class00617 implements class05033 {
   field_63706("always"),
   field_63707("when_dark"),
   field_63708("never");

   public static final Codec<class00617> field_63709 = class05033.N(class00617::values);
   private final String field_63710;

   private class00617(String var3) {
      this.field_63710 = var3;
   }

   public boolean N(class07299 var1) {
      return switch (this) {
         case field_63706 -> true;
         case field_63707 -> var1.method_23886();
         case field_63708 -> false;
      };
   }

   @Override
   public String method_15434() {
      return this.field_63710;
   }
}
