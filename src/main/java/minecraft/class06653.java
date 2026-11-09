package minecraft;

import com.google.common.base.MoreObjects;
import com.google.common.cache.LoadingCache;

public class class06653 {
   private final class07209 N;
   private final class07211 y;
   private final class07211 L;
   private final LoadingCache<class07209, class06646> u;
   private final int i;
   private final int R;
   private final int M;

   public class07211 L() {
      return this.L;
   }

   public class06653(class07209 var1, class07211 var2, class07211 var3, LoadingCache<class07209, class06646> var4, int var5, int var6, int var7) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
      this.i = var5;
      this.R = var6;
      this.M = var7;
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this).add("up", this.L).add("forwards", this.y).add("frontTopLeft", this.N).toString();
   }

   public int i() {
      return this.R;
   }

   public int u() {
      return this.i;
   }

   public class07211 y() {
      return this.y;
   }

   public class07209 N() {
      return this.N;
   }

   public class06646 N(int var1, int var2, int var3) {
      return (class06646)this.u.getUnchecked(class06649.N(this.N, this.y(), this.L(), var1, var2, var3));
   }

   public int R() {
      return this.M;
   }
}
