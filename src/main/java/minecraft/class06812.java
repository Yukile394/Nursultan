package minecraft;

import com.google.common.base.Suppliers;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

public class class06812 {
   private final RenderPipeline N;
   private boolean y = false;
   private boolean L = false;
   private class06833 u = class06833.N;
   private class06856 i = class06856.N;
   private class06835 R = class06835.y;
   private boolean M = false;
   private boolean B = false;
   private int Z = 1536;
   private class06823 z = class06823.field_21853;
   private final Map<String, class06845> U = new HashMap<>();

   public class06812 L() {
      this.M = true;
      return this;
   }

   class06812(RenderPipeline var1) {
      super();
      this.N = var1;
   }

   public class06828 i() {
      return new class06828(this.N, this.U, this.y, this.L, this.u, this.i, this.R, this.z, this.M, this.B, this.Z);
   }

   public class06812 u() {
      this.B = true;
      return this;
   }

   public class06812 y() {
      this.L = true;
      return this;
   }

   public class06812 N(class06856 var1) {
      this.i = var1;
      return this;
   }

   public class06812 N(class06835 var1) {
      this.R = var1;
      return this;
   }

   public class06812 N(class06823 var1) {
      this.z = var1;
      return this;
   }

   public class06812 N(String var1, class01894 var2) {
      this.U.put(var1, new class06845(var2, () -> null));
      return this;
   }

   public class06812 N(String var1, class01894 var2, @Nullable Supplier<class08188> var3) {
      this.U.put(var1, new class06845(var2, Suppliers.memoize(() -> var3 == null ? null : (class08188)var3.get())));
      return this;
   }

   public class06812 N() {
      this.y = true;
      return this;
   }

   public class06812 N(int var1) {
      this.Z = var1;
      return this;
   }

   public class06812 N(class06833 var1) {
      this.u = var1;
      return this;
   }
}
