package minecraft;

import com.mojang.serialization.Codec;
import java.util.function.IntFunction;

public enum class08973 implements class05033 {
   field_61414("standing"),
   field_61415("sitting"),
   field_61416("running"),
   field_61417("star");

   public static final IntFunction<class08973> field_61418 = class02121.N(Enum::ordinal, values(), class02126.field_41664);
   public static final Codec<class08973> field_61419 = class05033.N(class08973::values);
   private final String field_61420;

   private class08973(String var3) {
      this.field_61420 = var3;
   }

   public class08973 N() {
      return field_61418.apply(this.ordinal() + 1);
   }

   @Override
   public String method_15434() {
      return this.field_61420;
   }
}
