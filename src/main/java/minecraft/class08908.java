package minecraft;

import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

public class class08908 implements class08910 {
   private final List<class02022> N;
   private final Supplier<Vector3fc[]> y;
   private final class08517 L;

   public class08908(List<class02022> var1, class08517 var2) {
      super();
      this.N = var1;
      this.L = var2;
      this.y = Suppliers.memoize(() -> class08808.N(this.N));
   }

   @Override
   public void method_65584(class08898 var1, class06584 var2, class08943 var3, class03662 var4, @Nullable class03448 var5, @Nullable class08961 var6, int var7) {
      var1.N(this);
      class08931 class08931 = var1.N();
      class08931.N(class05911.Z());
      this.L.N(class08931, var4);
      class08931.N(this.y);
      class08931.y().addAll(this.N);
   }
}
