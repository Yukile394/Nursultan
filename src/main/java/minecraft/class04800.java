package minecraft;

import java.util.Set;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

public final class class04800 {
   @Nullable
   private final String N;
   private final Vector3fc y;
   private final Vector3fc L;
   private final class04834 u;
   private final boolean i;
   private final class04809 R;
   private final class04809 M;
   private final Set<class07211> B;

   public class04800(
      @Nullable String var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      class04834 var10,
      boolean var11,
      float var12,
      float var13,
      Set<class07211> var14
   ) {
      super();
      this.N = var1;
      this.R = new class04809(var2, var3);
      this.y = new Vector3f(var4, var5, var6);
      this.L = new Vector3f(var7, var8, var9);
      this.u = var10;
      this.i = var11;
      this.M = new class04809(var12, var13);
      this.B = var14;
   }

   public class01687 N(int var1, int var2) {
      return new class01687(
         (int)this.R.N(),
         (int)this.R.y(),
         this.y.x(),
         this.y.y(),
         this.y.z(),
         this.L.x(),
         this.L.y(),
         this.L.z(),
         this.u.y,
         this.u.L,
         this.u.u,
         this.i,
         var1 * this.M.N(),
         var2 * this.M.y(),
         this.B
      );
   }
}
