package minecraft;

import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public class class07938<Params, Result> {
   private String N = "";
   @Nullable
   private class07920<Params> y;
   @Nullable
   private class07941<Result> L;
   private boolean u = true;
   private boolean i = true;
   @Nullable
   private class07936<Result> R;
   @Nullable
   private class07929<Params, Result> M;

   public class07945<Params, Result> L() {
      if (this.L == null) {
         throw new IllegalStateException("No response defined");
      } else {
         class07946 class07946 = new class07946(this.i, this.u);
         class07931 class07931 = new class07931<>(this.N, this.y, this.L);
         if (this.R != null) {
            return new class07909<>(class07931, class07946, this.R);
         } else if (this.M != null) {
            if (this.y == null) {
               throw new IllegalStateException("No param schema defined");
            } else {
               return new class07943<>(class07931, class07946, this.M);
            }
         } else {
            throw new IllegalStateException("No method defined");
         }
      }
   }

   public class07938(class07936<Result> var1) {
      super();
      this.R = var1;
   }

   public class07938(Function<class07393, Result> var1) {
      super();
      this.R = (var1x, var2) -> var1.apply(var1x);
   }

   public class07938(class07929<Params, Result> var1) {
      super();
      this.M = var1;
   }

   public class07938<Params, Result> y() {
      this.i = false;
      return this;
   }

   public class07938<Params, Result> y(String var1, class07389<Params> var2) {
      this.y = new class07920<>(var1, var2.y());
      return this;
   }

   private class07945<?, ?> N(class00751<class07945<?, ?>> var1, class01894 var2) {
      return class00751.N(var1, var2, this.L());
   }

   public class07945<?, ?> N(class00751<class07945<?, ?>> var1, String var2) {
      return this.N(var1, class01894.y(var2));
   }

   public class07938<Params, Result> N() {
      this.u = false;
      return this;
   }

   public class07938<Params, Result> N(String var1, class07389<Result> var2) {
      this.L = new class07941<>(var1, var2.y());
      return this;
   }

   public class07938<Params, Result> N(String var1) {
      this.N = var1;
      return this;
   }
}
