package minecraft;

import com.mojang.authlib.GameProfile;
import com.mojang.blaze3d.textures.GpuTextureView;
import org.jspecify.annotations.Nullable;

public final class class07923 {
   private final GameProfile y;
   private final class01631 L;
   @Nullable
   private class07311 u;
   @Nullable
   private GpuTextureView i;
   @Nullable
   private class03504 R;

   public class07311 L() {
      if (this.u == null) {
         this.u = class07949.N(this.L);
      }

      return this.u;
   }

   public class07923(class07949 var1, GameProfile var2, class01631 var3, class01653 var4) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3.N(var4);
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 || var1 instanceof class07923 class07923 && this.y.equals(class07923.y) && this.L.equals(class07923.L);
   }

   @Override
   public int hashCode() {
      int ix = 1;
      ix = 31 * ix + this.y.hashCode();
      return 31 * ix + this.L.hashCode();
   }

   public class03504 i() {
      if (this.R == null) {
         this.R = class03504.y(this.L.N().y());
      }

      return this.R;
   }

   public GpuTextureView u() {
      if (this.i == null) {
         this.i = this.N.L.y(this.L.N().y()).method_71659();
      }

      return this.i;
   }

   public class01631 y() {
      return this.L;
   }

   public GameProfile N() {
      return this.y;
   }
}
