package minecraft;

import java.util.Optional;

public class class02247 extends class01284 {
   private final boolean N;
   private final boolean y;
   private final Optional<Float> L;
   private final Optional<class03543<class00891>> u;

   public class02247(boolean var1, boolean var2, Optional<Float> var3, Optional<class03543<class00891>> var4) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
   }

   @Override
   public boolean N(class07307 var1, class07049 var2) {
      return this.y;
   }

   @Override
   public float N(class07049 var1) {
      return var1 instanceof class08036 && ((class08036)var1).method_31549().y ? 0.0F : this.L.orElseGet(() -> super.N(var1));
   }

   @Override
   public Optional<Float> N(class07307 var1, class07290 var2, class07209 var3, class00500 var4, class04688 var5) {
      if (this.u.isPresent()) {
         return var4.N(this.u.get()) ? Optional.of(3600000.0F) : Optional.empty();
      } else {
         return super.N(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public boolean N(class07307 var1, class07290 var2, class07209 var3, class00500 var4, float var5) {
      return this.N;
   }
}
