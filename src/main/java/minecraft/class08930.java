package minecraft;

import com.google.common.base.Suppliers;
import java.util.HashSet;
import java.util.function.Supplier;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

public class class08930<T> implements class08910 {
   private final class00368<T> N;
   private final class08517 y;
   private final Supplier<Vector3fc[]> L;

   public class08930(class00368<T> var1, class08517 var2) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = Suppliers.memoize(() -> {
         HashSet hashset = new HashSet();
         var1.N(hashset::add);
         return hashset.toArray(new Vector3fc[0]);
      });
   }

   @Override
   public void method_65584(class08898 var1, class06584 var2, class08943 var3, class03662 var4, @Nullable class03448 var5, @Nullable class08961 var6, int var7) {
      var1.N(this);
      class08931 class08931 = var1.N();
      if (var2.Q()) {
         class08915 class08915 = class08915.field_55342;
         class08931.N(class08915);
         var1.L();
         var1.N(class08915);
      }

      Object object = this.N.y(var2);
      class08931.N(this.L);
      class08931.N(this.N, (T)object);
      if (object != null) {
         var1.N(object);
      }

      this.y.N(class08931, var4);
   }
}
