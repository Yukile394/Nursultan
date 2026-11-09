package minecraft;

import com.mojang.serialization.Codec;
import org.jspecify.annotations.Nullable;

public enum class08934 implements class05033 {
   field_55555("NONE", 0, "none"),
   field_55390("LODESTONE", 1, "lodestone"),
   field_55391("SPAWN", 2, "spawn"),
   field_55392("RECOVERY", 3, "recovery");

   public static final Codec<class08934> field_55393 = class05033.N(class08934::values);
   private final String field_55394;

   class08934(String var3) {
      this.field_55394 = var3;
   }

   @Nullable
   abstract class06289 N(class03448 var1, class06584 var2, @Nullable class08961 var3);

   @Override
   public String method_15434() {
      return this.field_55394;
   }
}
