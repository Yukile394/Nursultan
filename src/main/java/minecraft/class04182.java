package minecraft;

import com.google.common.hash.Hashing;
import org.jspecify.annotations.Nullable;

public class class04182 implements AutoCloseable {
   public static final class01894 N = class01894.y("textures/misc/unknown_server.png");
   private static final int y = 64;
   private static final int L = 64;
   private final class08627 u;
   private final class01894 i;
   @Nullable
   private class08829 R;
   private boolean M;

   public boolean L() {
      return this.M;
   }

   private class04182(class08627 var1, class01894 var2) {
      super();
      this.u = var1;
      this.i = var2;
   }

   @Override
   public void close() {
      this.N();
      this.M = true;
   }

   private void u() {
      if (this.M) {
         throw new IllegalStateException("Icon already closed");
      }
   }

   public static class04182 y(class08627 var0, String var1) {
      return new class04182(var0, class01894.y("servers/" + Hashing.sha1().hashUnencodedChars(var1) + "/icon"));
   }

   public class01894 y() {
      return this.R != null ? this.i : N;
   }

   public void N(class08280 var1) {
      if (var1.N() == 64 && var1.y() == 64) {
         try {
            this.u();
            if (this.R == null) {
               this.R = new class08829(() -> "Favicon " + this.i, var1);
            } else {
               this.R.method_4526(var1);
               this.R.method_4524();
            }

            this.u.N(this.i, this.R);
         } catch (Throwable throwable) {
            var1.close();
            this.N();
            throw throwable;
         }
      } else {
         var1.close();
         throw new IllegalArgumentException("Icon must be 64x64, but was " + var1.N() + "x" + var1.y());
      }
   }

   public static class04182 N(class08627 var0, String var1) {
      return new class04182(var0, class01894.y("worlds/" + class07536.N_75(var1, class01894::y) + "/" + Hashing.sha1().hashUnencodedChars(var1) + "/icon"));
   }

   public void N() {
      this.u();
      if (this.R != null) {
         this.u.L(this.i);
         this.R.close();
         this.R = null;
      }
   }
}
