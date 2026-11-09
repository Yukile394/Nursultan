package minecraft;

import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Either;
import java.util.UUID;
import org.jspecify.annotations.Nullable;

public abstract class class02073<R extends class02065> {
   protected final R N;
   protected final AbuseReportLimits y;

   @Nullable
   public class02043 L() {
      return !this.i().M ? class02043.i : null;
   }

   public String M() {
      return this.N.i;
   }

   protected class02073(R var1, AbuseReportLimits var2) {
      super();
      this.N = (R)var1;
      this.y = var2;
   }

   public boolean B() {
      return this.i().M;
   }

   @Nullable
   public class03380 Z() {
      return this.N.R;
   }

   public R i() {
      return this.N;
   }

   public abstract boolean y();

   public void N(boolean var1) {
      this.N.M = var1;
   }

   public abstract Either<class02044, class02043> N(class03409 var1);

   public void N(class03380 var1) {
      this.N.R = var1;
   }

   public void N(String var1) {
      this.N.i = var1;
   }

   public UUID R() {
      return this.N.u;
   }
}
