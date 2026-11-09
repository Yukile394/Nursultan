package minecraft;

import com.mojang.serialization.Codec;

public enum class00591 implements class00619<Boolean, Boolean> {
   field_63788,
   field_63789,
   field_63790,
   field_63791,
   field_63792,
   field_63793;

   private class00591() {
   }

   public Boolean apply(Boolean var1, Boolean var2) {
      return switch (this) {
         case field_63788 -> var2 && var1;
         case field_63789 -> !var2 || !var1;
         case field_63790 -> var2 || var1;
         case field_63791 -> !var2 && !var1;
         case field_63792 -> var2 ^ var1;
         case field_63793 -> var2 == var1;
      };
   }

   @Override
   public Codec<Boolean> argumentCodec(class00607<Boolean> var1) {
      return Codec.BOOL;
   }

   @Override
   public class00610<Boolean> argumentKeyframeLerp(class00607<Boolean> var1) {
      return class00610.y();
   }
}
