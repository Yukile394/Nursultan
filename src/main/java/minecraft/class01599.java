package minecraft;

import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import net.fabricmc.fabric.api.networking.v1.EntityTrackingEvents;
import net.fabricmc.fabric.api.networking.v1.EntityTrackingEvents.StartTracking;
import net.fabricmc.fabric.api.networking.v1.EntityTrackingEvents.StopTracking;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class01599 {
   private static final Logger y = LogUtils.getLogger();
   private static final int L = 1;
   private static final double u = 7.6293945E-6F;
   public static final int N = 60;
   private static final int i = 400;
   private final class04782 R;
   private final class07049 M;
   private final int B;
   private final boolean Z;
   private final class01595 z;
   private final class04465 U = new class04465();
   private byte E;
   private byte W;
   private byte m;
   private class06889 P;
   private int s;
   private int T;
   private List<class07049> b = Collections.emptyList();
   private boolean j;
   private boolean v;
   @Nullable
   private List<class02998<?>> n;

   public class06889 L() {
      return this.P;
   }

   private void M() {
      class03289 class03289 = this.M.method_5841();
      List<class02998<?>> list = class03289.y();
      if (list != null) {
         this.n = class03289.L();
         this.z.y(new class06660(this.M.method_5628(), list));
      }

      if (this.M instanceof class07438) {
         Set<class07469> set = ((class07438)this.M).method_6127().N();
         if (!set.isEmpty()) {
            this.z.y(new class08056(this.M.method_5628(), set));
         }

         set.clear();
      }
   }

   public class01599(class04782 var1, class07049 var2, int var3, boolean var4, class01595 var5) {
      super();
      this.R = var1;
      this.z = var5;
      this.M = var2;
      this.B = var3;
      this.Z = var4;
      this.U.i(var2.method_43390());
      this.P = var2.method_18798();
      this.E = class04995.i(var2.method_36454());
      this.W = class04995.i(var2.method_36455());
      this.m = class04995.i(var2.method_5791());
      this.v = var2.method_24828();
      this.n = var2.method_5841().L();
   }

   public float i() {
      return class04995.N(this.E);
   }

   public float u() {
      return class04995.N(this.W);
   }

   private void y(class04770 var1, CallbackInfo var2) {
      ((StopTracking)EntityTrackingEvents.STOP_TRACKING.invoker()).onStopTracking(this.M, var1);
   }

   public void y(class04770 var1) {
      ArrayList arraylist = new ArrayList();
      this.N(var1, arraylist::add);
      var1.field_13987.method_14364(new class03284(arraylist));
      this.M.method_5837(var1);
      this.N(var1, null);
   }

   public class06889 y() {
      return this.U.N();
   }

   public void N() {
      this.M.method_75725();
      List<class07049> list = this.M.method_5685();
      if (!list.equals(this.b)) {
         this.z.N(new class08079(this.M), var2x -> list.contains(var2x) == this.b.contains(var2x));
         this.b = list;
      }

      if (this.M instanceof class00679 class00679 && this.s % 10 == 0) {
         class06584 class06584 = class00679.Z();
         if (class06584.B() instanceof class06548) {
            class02265 class02265 = class06584.method_58694(class02484.f);
            class07769 class07769 = class06548.N(class02265, this.R);
            if (class07769 != null) {
               for (class04770 class04770 : this.R.method_18456()) {
                  class07769.N(class04770, class06584);
                  class00381<?> class00381 = class07769.N(class02265, class04770);
                  if (class00381 != null) {
                     class04770.field_13987.method_14364(class00381);
                  }
               }
            }
         }

         this.M();
      }

      if (this.s % this.B == 0 || this.M.field_64356 || this.M.method_5841().N()) {
         byte b0 = class04995.i(this.M.method_36454());
         byte b1 = class04995.i(this.M.method_36455());
         boolean flag4 = Math.abs(b0 - this.E) >= 1 || Math.abs(b1 - this.W) >= 1;
         if (this.M.method_5765()) {
            if (flag4) {
               this.z.N(new class00492(this.M.method_5628(), b0, b1, this.M.method_24828()));
               this.E = b0;
               this.W = b1;
            }

            this.U.i(this.M.method_43390());
            this.M();
            this.j = true;
         } else if (this.M instanceof class07504 class07504 && class07504.N() instanceof class02726 class02726) {
            this.N(class02726, b0, b1, flag4);
         } else {
            this.T++;
            class06889 class06889 = this.M.method_43390();
            boolean flag5 = this.U.u(class06889).B() >= 7.6293945E-6F;
            Object object = null;
            boolean flag = flag5 || this.s % 60 == 0;
            boolean flag1 = false;
            boolean flag2 = false;
            long ix = this.U.N(class06889);
            long jx = this.U.y(class06889);
            long k = this.U.L(class06889);
            boolean flag3 = ix < -32768L || ix > 32767L || jx < -32768L || jx > 32767L || k < -32768L || k > 32767L;
            if (this.M.method_70667() || flag3 || this.T > 400 || this.j || this.v != this.M.method_24828()) {
               this.v = this.M.method_24828();
               this.T = 0;
               object = class00269.N(this.M);
               flag1 = true;
               flag2 = true;
            } else if ((!flag || !flag4) && !(this.M instanceof class08007)) {
               if (flag) {
                  object = new class00505(this.M.method_5628(), (short)ix, (short)jx, (short)k, this.M.method_24828());
                  flag1 = true;
               } else if (flag4) {
                  object = new class00492(this.M.method_5628(), b0, b1, this.M.method_24828());
                  flag2 = true;
               }
            } else {
               object = new class00477(this.M.method_5628(), (short)ix, (short)jx, (short)k, b0, b1, this.M.method_24828());
               flag1 = true;
               flag2 = true;
            }

            if (this.M.field_64356 || this.Z || this.M instanceof class07438 && ((class07438)this.M).method_6128()) {
               class06889 class06889x = this.M.method_18798();
               double d0 = class06889x.M(this.P);
               if (d0 > 1.0E-7 || d0 > 0.0 && class06889x.B() == 0.0) {
                  this.P = class06889x;
                  if (this.M instanceof class08039 class08039) {
                     this.z.N(new class03284(List.of(new class06652(this.M.method_5628(), this.P), new class02655(class08039.method_5628(), class08039.L))));
                  } else {
                     this.z.N(new class06652(this.M.method_5628(), this.P));
                  }
               }
            }

            if (object != null) {
               this.z.N((class00381<? super class07280>)object);
            }

            this.M();
            if (flag1) {
               this.U.i(class06889);
            }

            if (flag2) {
               this.E = b0;
               this.W = b1;
            }

            this.j = false;
         }

         byte b2 = class04995.i(this.M.method_5791());
         if (Math.abs(b2 - this.m) >= 1) {
            this.z.N(new class06644(this.M, b2));
            this.m = b2;
         }

         this.M.field_64356 = false;
      }

      this.s++;
      if (this.M.field_6037) {
         this.M.field_6037 = false;
         this.z.y(new class06652(this.M));
      }
   }

   private void N(class04770 var1, CallbackInfo var2) {
      ((StartTracking)EntityTrackingEvents.START_TRACKING.invoker()).onStartTracking(this.M, var1);
   }

   private void N(class02726 var1, byte var2, byte var3, boolean var4) {
      this.M();
      if (var1.i.isEmpty()) {
         double d0 = this.M.method_18798().M(this.P);
         class06889 class06889 = this.M.method_43390();
         if (this.U.u(class06889).B() >= 7.6293945E-6F || this.s % 60 == 0 || var4 || d0 > 1.0E-7) {
            this.z
               .N(
                  new class02582(
                     this.M.method_5628(),
                     List.of(new class02769(this.M.method_73189(), this.M.method_18798(), this.M.method_36454(), this.M.method_36455(), 1.0F))
                  )
               );
         }
      } else {
         this.z.N(new class02582(this.M.method_5628(), List.copyOf(var1.i)));
         var1.i.clear();
      }

      this.E = var2;
      this.W = var3;
      this.U.i(this.M.method_73189());
   }

   public void N(class04770 var1) {
      this.y(var1, null);
      this.M.method_5742(var1);
      var1.field_13987.method_14364(new class06658(this.M.method_5628()));
   }

   public void N(class04770 var1, Consumer<class00381<class07280>> var2) {
      this.M.method_75725();
      if (this.M.method_31481()) {
         y.warn("Fetching packet for removed entity {}", this.M);
      }

      class00381<class07280> class00381 = this.M.method_18002(this);
      var2.accept(class00381);
      if (this.n != null) {
         var2.accept(new class06660(this.M.method_5628(), this.n));
      }

      if (this.M instanceof class07438 class07438x) {
         Collection<class07469> collection = class07438x.method_6127().L();
         if (!collection.isEmpty()) {
            var2.accept(new class08056(this.M.method_5628(), collection));
         }
      }

      if (this.M instanceof class07438 class07438x) {
         ArrayList arraylist = Lists.newArrayList();

         for (class07085 class07085 : class07085.field_54086) {
            class06584 class06584 = class07438x.method_6118(class07085);
            if (!class06584.R()) {
               arraylist.add(Pair.of(class07085, class06584.t()));
            }
         }

         if (!arraylist.isEmpty()) {
            var2.accept(new class06682(this.M.method_5628(), arraylist));
         }
      }

      if (!this.M.method_5685().isEmpty()) {
         var2.accept(new class08079(this.M));
      }

      if (this.M.method_5765()) {
         var2.accept(new class08079(this.M.method_5854()));
      }

      if (this.M instanceof class02607 class02607 && class02607.g_()) {
         var2.accept(new class06635(this.M, class02607.yW()));
      }
   }

   public float R() {
      return class04995.N(this.m);
   }
}
