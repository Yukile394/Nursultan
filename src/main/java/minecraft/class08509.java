package minecraft;

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Predicate;

public enum class08509 implements class05033 {
   field_22850("AND", 0, "AND"),
   field_22851("OR", 1, "OR");

   public static final Codec<class08509> field_56941 = class05033.N(class08509::values);
   private final String field_22852;

   class08509(String var3) {
      this.field_22852 = var3;
   }

   public abstract <V> Predicate<V> N(List<Predicate<V>> var1);

   @Override
   public String method_15434() {
      return this.field_22852;
   }
}
