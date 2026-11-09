package minecraft;

import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Unit;
import com.mojang.logging.LogUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import org.slf4j.Logger;

public abstract class class03709<B extends class02073<?>> extends class05096 {
   private static final class00392 m = class00392.L("gui.abuseReport.report_sent_msg");
   private static final class00392 P = class00392.L("gui.abuseReport.sending.title").N(class06541.field_1067);
   private static final class00392 s = class00392.L("gui.abuseReport.sent.title").N(class06541.field_1067);
   private static final class00392 T = class00392.L("gui.abuseReport.error.title").N(class06541.field_1067);
   private static final class00392 b = class00392.L("gui.abuseReport.send.generic_error");
   protected static final class00392 N = class00392.L("gui.abuseReport.send");
   protected static final class00392 y = class00392.L("gui.abuseReport.observed_what");
   protected static final class00392 L = class00392.L("gui.abuseReport.select_reason");
   private static final class00392 j = class00392.L("gui.abuseReport.describe");
   protected static final class00392 u = class00392.L("gui.abuseReport.more_comments");
   private static final class00392 v = class00392.L("gui.abuseReport.comments");
   private static final class00392 n = class00392.L("gui.abuseReport.attestation").y(-2039584);
   protected static final int i = 120;
   protected static final int R = 20;
   protected static final int M = 280;
   protected static final int B = 8;
   private static final Logger t = LogUtils.getLogger();
   protected final class05096 Z;
   protected final class03409 z;
   protected final class01885 U = class01885.u().N(8);
   protected B E;
   private class05725 G;
   protected class05362 W;

   protected void L() {
      this.U.N(new class02071(this.field_22785, this.field_22793));
   }

   protected class03709(class00392 var1, class05096 var2, class03409 var3, B var4) {
      super(var1);
      this.Z = var2;
      this.z = var3;
      this.E = (B)var4;
   }

   void Z() {
      this.z.N(null);
   }

   protected void i() {
      this.E.N(this.z).ifLeft(var1 -> {
         CompletableFuture<Unit> completablefuture = this.z.N().N(var1.N(), var1.y(), var1.L());
         this.field_22787.N(class03918.N(P, class05220.i, () -> {
            this.field_22787.N(this);
            completablefuture.cancel(true);
         }));
         completablefuture.handleAsync((var1x, var2x) -> {
            if (var2x == null) {
               this.z();
            } else {
               if (var2x instanceof CancellationException) {
                  return null;
               }

               this.N(var2x);
            }

            return null;
         }, this.field_22787);
      }).ifRight(var1 -> this.N(var1.y()));
   }

   private void z() {
      this.Z();
      this.field_22787.N(class03918.N(s, m, class05220.u, () -> this.field_22787.N(null)));
   }

   protected void u() {
      this.G = this.U.N(class05725.y(n, this.field_22793).N(this.E.B()).N(280).N((var1x, var2) -> {
         this.E.N(var2);
         this.y();
      }).N());
      class01885 class01885 = this.U.N(class01885.i().N(8));
      class01885.N(class05362.method_46430(class05220.U, var1x -> this.method_25419()).N(120).N());
      this.W = class01885.N(class05362.method_46430(N, var1x -> this.i()).N(120).N());
   }

   protected void y() {
      class02043 class02043 = this.E.L();
      this.W.field_22763 = class02043 == null && this.G.y();
      this.W.method_47400(class01962.N(class02043, class02043::N));
   }

   protected abstract void N();

   private void N(Throwable var1) {
      t.error("Encountered error while sending abuse report", var1);
      Throwable throwable = var1.getCause();
      class00392 class00392;
      if (throwable instanceof class04442) {
         class00392 = ((class04442)throwable).N();
      } else {
         class00392 = b;
      }

      this.N(class00392);
   }

   private void N(class00392 var1) {
      class05216 class05216 = var1.L().N(class06541.field_1061);
      this.field_22787.N(class03918.N(T, class05216, class05220.U, () -> this.field_22787.N(this)));
   }

   protected class03943 N(int var1, int var2, Consumer<String> var3) {
      AbuseReportLimits abusereportlimits = this.z.N().y();
      class03943 class03943 = class03943.L().N(j).N(this.field_22793, var1, var2, v);
      class03943.N(this.E.M());
      class03943.N(abusereportlimits.maxOpinionCommentsLength());
      class03943.N(var3);
      return class03943;
   }

   @Override
   public void method_25426() {
      this.U.L().y();
      this.L();
      this.N();
      this.u();
      this.y();
      this.U.method_48206(var1 -> {
         class06478 class06478 = this.method_37063(var1);
      });
      this.method_48640();
   }

   @Override
   public void method_48640() {
      this.U.N();
      class02077.N(this.U, this.method_48202());
   }

   @Override
   public void method_25432() {
      this.R();
      super.method_25432();
   }

   @Override
   public void method_25419() {
      if (this.E.y()) {
         this.field_22787.N(new class03727(this));
      } else {
         this.field_22787.N(this.Z);
      }
   }

   void R() {
      if (this.E.y()) {
         this.z.N(this.E.i().y());
      }
   }
}
