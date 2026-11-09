package minecraft;

import com.mojang.logging.LogUtils;
import java.util.concurrent.TimeUnit;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class05384 implements class08773 {
   static final Logger N = LogUtils.getLogger();
   private static final long L = TimeUnit.SECONDS.toMillis(30L);
   public static final long y = 500L;
   private final class08761 u = new class08761(true);
   @Nullable
   private class08771 i;
   @Nullable
   private volatile class08753 R;
   @Nullable
   private class05283 M;
   private final long B;

   public void L() {
      if (this.M != null) {
         this.M = this.M.L();
      }
   }

   public class05384() {
      this(0L);
   }

   public class05384(long var1) {
      super();
      this.B = var1;
   }

   public float i() {
      return this.u.N();
   }

   @Nullable
   public class08771 u() {
      return this.i;
   }

   public boolean y() {
      if (this.M instanceof class01331 class01331) {
         long j;
         try {
            j = class01331.N();
         } catch (Throwable throwable) {
            throw new MatchException(throwable.toString(), throwable);
         }

         long ix = j;
         if (class07536.L() >= ix + this.B) {
            return true;
         }
      }

      return false;
   }

   @Override
   public void N(class08753 var1) {
      this.u.N(var1);
   }

   @Override
   public void N(class05946<class07299> var1, class07321 var2) {
      if (this.i != null) {
         this.i.N(var1, var2);
      }
   }

   @Override
   public void N(class08753 var1, int var2) {
      this.u.N(var1, var2);
      this.R = var1;
   }

   public void N() {
      if (this.M != null) {
         this.M = this.M.y();
      }
   }

   public void N(class04453 var1, class03448 var2, class03063 var3) {
      this.M = new class05187(var1, var2, var3, class07536.L() + L);
   }

   public void N(class08771 var1) {
      this.i = var1;
   }

   @Override
   public void N(class08753 var1, int var2, int var3) {
      this.u.N(var1, var2, var3);
   }

   public boolean R() {
      return this.R != null;
   }
}
