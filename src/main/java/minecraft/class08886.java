package minecraft;

import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JavaOps;
import java.util.List;
import java.util.Set;
import org.jspecify.annotations.Nullable;

enum class08886 {
   field_58002("BYTE", 0, class00157.field_58022),
   field_58003("INT", 1, class00157.field_58024, class00157.field_58022, class00157.field_58023),
   field_58004("LONG", 2, class00157.field_58025, class00157.field_58022, class00157.field_58023, class00157.field_58024);

   private final class00157 field_58005;
   private final Set<class00157> field_58006;

   class08886(class00157 var3, class00157... var4) {
      this.field_58006 = Set.of(var4);
      this.field_58005 = var3;
   }

   @Nullable
   private class00157 N(class00154 var1) {
      class00157 class00157 = var1.y();
      if (class00157 == null) {
         return this.field_58005;
      } else {
         return !this.N(class00157) ? null : class00157;
      }
   }

   @Nullable
   public abstract <T> T N(DynamicOps<T> var1, List<class00170> var2, class02325<?> var3);

   @Nullable
   protected Number N(class00170 var1, class02325<?> var2) {
      class00157 class00157 = this.N(var1.u());
      if (class00157 == null) {
         var2.y().N(var2.M(), class08876.u);
         return null;
      } else {
         return var1.N(JavaOps.INSTANCE, class00157, var2);
      }
   }

   public abstract <T> T N(DynamicOps<T> var1);

   public boolean N(class00157 var1) {
      return var1 == this.field_58005 || this.field_58006.contains(var1);
   }
}
