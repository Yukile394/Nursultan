package minecraft;

import java.util.List;
import org.jspecify.annotations.Nullable;

public class class02741 {
   private final class08034<class03556<class06581>> N = new class08034<>();

   public class02741() {
      super();
   }

   public int y(class06521<?> var1, @Nullable class08012<class03556<class06581>> var2) {
      return this.y(var1, Integer.MAX_VALUE, var2);
   }

   public int y(class06521<?> var1, int var2, @Nullable class08012<class03556<class06581>> var3) {
      return this.N.y(var1.method_61671().y(), var2, var3);
   }

   public void y(class06584 var1) {
      this.N(var1, var1.U());
   }

   public boolean N(List<? extends class08022<class03556<class06581>>> var1, @Nullable class08012<class03556<class06581>> var2) {
      return this.N(var1, 1, var2);
   }

   private boolean N(List<? extends class08022<class03556<class06581>>> var1, int var2, @Nullable class08012<class03556<class06581>> var3) {
      return this.N.N(var1, var2, var3);
   }

   public void N() {
      this.N.N();
   }

   public void N(class06584 var1) {
      if (class08044.i(var1)) {
         this.y(var1);
      }
   }

   public void N(class06584 var1, int var2) {
      if (!var1.R()) {
         int i = Math.min(var2, var1.c());
         this.N.u(var1.Z(), i);
      }
   }

   public boolean N(class06521<?> var1, @Nullable class08012<class03556<class06581>> var2) {
      return this.N(var1, 1, var2);
   }

   public boolean N(class06521<?> var1, int var2, @Nullable class08012<class03556<class06581>> var3) {
      class02754 class02754 = var1.method_61671();
      return class02754.L() ? false : this.N(class02754.y(), var2, var3);
   }
}
