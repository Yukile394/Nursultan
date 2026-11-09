package minecraft;

import Nursultan.class09536;
import org.jspecify.annotations.Nullable;

public class class01875 {
   private final class00392 N;
   private final class05361 y;
   private final boolean L;
   private int u = 150;
   private int i = 20;
   @Nullable
   private class01883 R;
   private int M;
   private int B;
   @Nullable
   private class00392 Z;
   @Nullable
   private class05341 z;

   public class01875(class00392 var1, class05361 var2, boolean var3) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
   }

   public class01858 y() {
      if (this.R == null) {
         throw new IllegalStateException("Sprite not set");
      } else {
         return (class01858)(this.L
            ? new class01854(this.u, this.i, this.N, this.M, this.B, this.R, this.y, this.Z, this.z)
            : new class09536(this.u, this.i, this.N, this.M, this.B, this.R, this.y, this.Z, this.z));
      }
   }

   public class01875 N(class01883 var1, int var2, int var3) {
      this.R = var1;
      this.M = var2;
      this.B = var3;
      return this;
   }

   public class01875 N(class05341 var1) {
      this.z = var1;
      return this;
   }

   public class01875 N() {
      this.Z = this.N;
      return this;
   }

   public class01875 N(int var1) {
      this.u = var1;
      return this;
   }

   public class01875 N(class01894 var1, int var2, int var3) {
      this.R = new class01883(var1);
      this.M = var2;
      this.B = var3;
      return this;
   }

   public class01875 N(int var1, int var2) {
      this.u = var1;
      this.i = var2;
      return this;
   }
}
