package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class class04822 {
   private static final Set<class07211> N = EnumSet.allOf(class07211.class);
   private final List<class04800> y = Lists.newArrayList();
   private int L;
   private int u;
   private boolean i;

   public static class04822 L() {
      return new class04822();
   }

   public class04822() {
      super();
   }

   public List<class04800> y() {
      return ImmutableList.copyOf(this.y);
   }

   public class04822 N(float var1, float var2, float var3, float var4, float var5, float var6, class04834 var7, float var8, float var9) {
      this.y.add(new class04800(null, this.L, this.u, var1, var2, var3, var4, var5, var6, var7, this.i, var8, var9, N));
      return this;
   }

   public class04822 N(String var1, float var2, float var3, float var4, float var5, float var6, float var7, class04834 var8) {
      this.y.add(new class04800(var1, this.L, this.u, var2, var3, var4, var5, var6, var7, var8, this.i, 1.0F, 1.0F, N));
      return this;
   }

   public class04822 N(float var1, float var2, float var3, float var4, float var5, float var6, boolean var7) {
      this.y.add(new class04800(null, this.L, this.u, var1, var2, var3, var4, var5, var6, class04834.N, var7, 1.0F, 1.0F, N));
      return this;
   }

   public class04822 N(float var1, float var2, float var3, float var4, float var5, float var6, class04834 var7) {
      this.y.add(new class04800(null, this.L, this.u, var1, var2, var3, var4, var5, var6, var7, this.i, 1.0F, 1.0F, N));
      return this;
   }

   public class04822 N(int var1, int var2) {
      this.L = var1;
      this.u = var2;
      return this;
   }

   public class04822 N(String var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.y.add(new class04800(var1, this.L, this.u, var2, var3, var4, var5, var6, var7, class04834.N, this.i, 1.0F, 1.0F, N));
      return this;
   }

   public class04822 N(boolean var1) {
      this.i = var1;
      return this;
   }

   public class04822 N(String var1, float var2, float var3, float var4, int var5, int var6, int var7, class04834 var8, int var9, int var10) {
      this.N(var9, var10);
      this.y.add(new class04800(var1, this.L, this.u, var2, var3, var4, var5, var6, var7, var8, this.i, 1.0F, 1.0F, N));
      return this;
   }

   public class04822 N(String var1, float var2, float var3, float var4, int var5, int var6, int var7, int var8, int var9) {
      this.N(var8, var9);
      this.y.add(new class04800(var1, this.L, this.u, var2, var3, var4, var5, var6, var7, class04834.N, this.i, 1.0F, 1.0F, N));
      return this;
   }

   public class04822 N(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.y.add(new class04800(null, this.L, this.u, var1, var2, var3, var4, var5, var6, class04834.N, this.i, 1.0F, 1.0F, N));
      return this;
   }

   public class04822 N(float var1, float var2, float var3, float var4, float var5, float var6, Set<class07211> var7) {
      this.y.add(new class04800(null, this.L, this.u, var1, var2, var3, var4, var5, var6, class04834.N, this.i, 1.0F, 1.0F, var7));
      return this;
   }

   public class04822 N() {
      return this.N(true);
   }
}
