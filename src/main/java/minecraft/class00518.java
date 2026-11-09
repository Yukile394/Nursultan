package minecraft;

import java.util.Objects;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class class00518 {
   private final class06683 N;
   private final String y;
   private final class06675 L;
   private class00392 u;
   private class00392 i;
   private class06640 R;
   private boolean M;
   @Nullable
   private class01762 B;

   public String L() {
      return this.y;
   }

   @Nullable
   public class01762 M() {
      return this.B;
   }

   public class00518(class06683 var1, String var2, class06675 var3, class00392 var4, class06640 var5, boolean var6, @Nullable class01762 var7) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
      this.i = this.z();
      this.R = var5;
      this.M = var6;
      this.B = var7;
   }

   public class00392 B() {
      return this.i;
   }

   public class06640 Z() {
      return this.R;
   }

   public class00392 i() {
      return this.u;
   }

   private class00392 z() {
      return class00390.N((class00392)this.u.L().N(var1 -> var1.N(new class00401(class00392.y(this.y)))));
   }

   public class06675 u() {
      return this.L;
   }

   public void y(@Nullable class01762 var1) {
      this.B = var1;
      this.N.u(this);
   }

   public class06683 y() {
      return this.N;
   }

   public void N(class06640 var1) {
      this.R = var1;
      this.N.u(this);
   }

   public void N(boolean var1) {
      this.M = var1;
      this.N.u(this);
   }

   public class00493 N() {
      return new class00493(this.y, this.L, this.u, this.R, this.M, Optional.ofNullable(this.B));
   }

   public class01762 N(class01762 var1) {
      return Objects.requireNonNullElse(this.B, var1);
   }

   public void N(class00392 var1) {
      this.u = var1;
      this.i = this.z();
      this.N.u(this);
   }

   public boolean R() {
      return this.M;
   }
}
