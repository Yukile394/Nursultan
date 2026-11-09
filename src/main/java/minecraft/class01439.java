package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public class class01439 {
   public final class01471 N;
   private final class05291 L;
   public final class01471 y;
   private final class01479 u;
   private final Optional<class03647> i;
   private class01471 R;
   private final class05054 M;
   private List<class01474> B = ImmutableList.of();
   private boolean Z;
   private boolean z;

   public class01476 L() {
      return new class01476(this.N, this.L, this.y, this.u, this.i, this.R, this.M, this.B, this.Z, this.z);
   }

   public class01439(class01471 var1, class05291 var2, class01471 var3, class01479 var4, Optional<class03647> var5, class05054 var6) {
      super();
      this.N = var1;
      this.L = var2;
      this.y = var3;
      this.R = class01471.N(class00869.z);
      this.u = var4;
      this.i = var5;
      this.M = var6;
   }

   public class01439(class01471 var1, class05291 var2, class01471 var3, class01479 var4, class05054 var5) {
      this(var1, var2, var3, var4, Optional.empty(), var5);
   }

   public class01439 y() {
      this.z = true;
      return this;
   }

   public class01439 N(List<class01474> var1) {
      this.B = var1;
      return this;
   }

   public class01439 N() {
      this.Z = true;
      return this;
   }

   public class01439 N(class01471 var1) {
      this.R = var1;
      return this;
   }
}
