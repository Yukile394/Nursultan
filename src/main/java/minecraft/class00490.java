package minecraft;

import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class class00490 implements class01788 {
   private int N;
   private boolean y = true;
   @Nullable
   private class00392 L;
   @Nullable
   private class01762 u;

   @Override
   public boolean L() {
      return this.y;
   }

   public class00490() {
      super();
   }

   public class00490(class00488 var1) {
      super();
      this.N = var1.N();
      this.y = var1.y();
      this.L = var1.L().orElse(null);
      this.u = var1.u().orElse(null);
   }

   @Nullable
   @Override
   public class01762 i() {
      return this.u;
   }

   @Nullable
   public class00392 u() {
      return this.L;
   }

   @Override
   public int y() {
      return this.N;
   }

   public void N(@Nullable class00392 var1) {
      this.L = var1;
   }

   public void N(@Nullable class01762 var1) {
      this.u = var1;
   }

   public void N(boolean var1) {
      this.y = var1;
   }

   public void N(int var1) {
      this.N = var1;
   }

   public class00488 N() {
      return new class00488(this.N, this.y, Optional.ofNullable(this.L), Optional.ofNullable(this.u));
   }
}
