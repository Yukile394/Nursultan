package minecraft;

import Nursultan.class10578;
import Nursultan.class10579;
import com.google.common.collect.Lists;
import com.viaversion.viafabricplus.visuals.settings.VisualSettings;
import dev.caoimhe.compactchat.ext.IChatHudExt;
import dev.caoimhe.compactchat.message.MessageManager;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import org.joml.Matrix3x2f;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class06451 implements IChatHudExt {
   private static Logger R = LoggerFactory.getLogger("minecraft.class06451");
   private static final int M = 100;
   private static final int B = 4;
   private static final int Z = 40;
   private static final int z = 210;
   private static final int U = 60;
   private static final class00392 E = class00392.L("chat.deleted_marker").N(class06541.field_1080, class06541.field_1056);
   public static final int N = 8;
   public static final class01894 y = class01894.y("internal/expand_chat_queue");
   private static final class00405 W = class00405.N.N(new class00669(y, Optional.empty())).N(new class00401(class00392.L("chat.queue.tooltip")));
   public final class06202 L;
   public final class04189<String> u;
   public final List<class06390> i;
   private final List<class06419> m;
   private int P;
   private boolean s;
   @Nullable
   private class06450 T;
   @Nullable
   private class01311 b;
   private final List<class06437> j;
   private final MessageManager v = new MessageManager(this);

   public class04189<String> L() {
      return this.u;
   }

   private void L(class06390 var1) {
      String sx = var1.y().getString().replaceAll("\r", "\\\\r").replaceAll("\n", "\\\\n");
      String s1 = class01962.N(var1.u(), class03054::B);
      if (s1 != null) {
         R.info("[{}] [CHAT] {}", s1, sx);
      } else {
         R.info("[CHAT] {}", sx);
      }
   }

   public int M() {
      return this.s() / this.b();
   }

   private int P() {
      return N(((class05630)this.L.i_7).I().method_41753());
   }

   private double T() {
      return ((class05630)this.L.i_7).g().method_41753();
   }

   public class06451(class06202 var1) {
      super();
      this.u = new class04189<>(100);
      this.i = Lists.newArrayList();
      this.m = Lists.newArrayList();
      this.j = new ArrayList<>();
      this.L = var1;
      this.u.addAll(var1.NA().N());
   }

   public void B() {
      this.T = null;
   }

   public void Z() {
      class05096 class05096 = (class05096)this.L.v_3;
      if (class05096 instanceof class01311 class01311) {
         this.b = class01311;
      }
   }

   public boolean i() {
      return (class05096)this.L.v_3 instanceof class01311;
   }

   private int b() {
      return (int)(9.0 * (((class05630)this.L.i_7).t().method_41753() + 1.0));
   }

   private int s() {
      return y(this.i() ? ((class05630)this.L.i_7).o().method_41753() : ((class05630)this.L.i_7).J().method_41753());
   }

   private void m() {
      this.m.clear();

      for (class06390 class06390 : Lists.reverse(this.i)) {
         this.N(class06390);
      }
   }

   public class06467 U() {
      return new class06467(List.copyOf(this.i), List.copyOf(this.u), List.copyOf(this.j));
   }

   @Nullable
   public class01311 z() {
      class01311 class01311 = this.b;
      this.b = null;
      return class01311;
   }

   private class06390 u(class06390 var1) {
      return new class06390(var1.N(), E, null, class03054.N());
   }

   public void u() {
      this.P = 0;
      this.s = false;
   }

   public void y(String var1) {
      boolean flag = var1.startsWith("/");
      this.T = new class06450(var1, flag ? class06468.field_62005 : class06468.field_62004);
   }

   @Nullable
   private class06437 y(class04469 var1) {
      int ix = ((class01056)this.L.i_6).R();
      ListIterator listiterator = this.i.listIterator();

      while (listiterator.hasNext()) {
         class06390 class06390 = (class06390)listiterator.next();
         if (var1.equals(class06390.L())) {
            int jx = class06390.N() + 60;
            if (ix >= jx) {
               listiterator.set(this.u(class06390));
               this.m();
               return null;
            }

            return new class06437(var1, jx);
         }
      }

      return null;
   }

   public static int y(double var0) {
      short short1 = 180;
      byte b0 = 20;
      return class04995.N(var0 * 160.0 + 20.0);
   }

   public final void y(class06390 var1) {
      this.i.addFirst(var1);

      while (this.i.size() > 100) {
         this.i.removeLast();
      }
   }

   public void y(class06468 var1, class01309<?> var2) {
      this.L.N(this.N(var1, var2));
   }

   public class00392 y(class00392 var1) {
      return this.v.compactMessage(var1);
   }

   public void y() {
      this.u();
      this.m();
   }

   private boolean E() {
      return ((class05630)this.L.i_7).v().method_41753() == class08027.field_7536;
   }

   private class03054 N(class03054 var1) {
      return VisualSettings.INSTANCE.hideSignatureIndicator.isEnabled() ? null : var1;
   }

   public void N(boolean var1, CallbackInfo var2) {
      this.v.clear();
   }

   public void N(class06467 var1) {
      this.u.clear();
      this.u.addAll(var1.y);
      this.j.clear();
      this.j.addAll(var1.L);
      this.i.clear();
      this.i.addAll(var1.N);
      this.m();
   }

   public <T extends class01311> T N(class06468 var1, class01309<T> var2) {
      return (T)(this.T != null && var1.N(this.T) ? var2.create(this.T.N(), true) : var2.create(var1.N(), false));
   }

   private void N(class06465 var1, int var2, int var3, boolean var4) {
      if (!this.E()) {
         int ix = this.m.size();
         if (ix > 0) {
            class04643 class04643 = class08700.N();
            class04643.N("chat");
            float f = (float)this.T();
            int jx = class04995.u(this.P() / f);
            int k = class04995.y((var2 - 40) / f);
            float f1 = ((class05630)this.L.i_7).n().method_41753().floatValue() * 0.9F + 0.1F;
            float f2 = ((class05630)this.L.i_7).d().method_41753().floatValue();
            byte b0 = 9;
            byte b1 = 8;
            double d0 = ((class05630)this.L.i_7).t().method_41753();
            int l = (int)(b0 * (d0 + 1.0));
            int i1 = (int)Math.round(8.0 * (d0 + 1.0) - 4.0 * d0);
            long j1 = this.L.N().L();
            class06457 class06457 = var4 ? class06457.N : class06457.N(var3);
            var1.N(var1x -> {
               var1x.scale(f, f);
               var1x.translate(4.0F, 0.0F);
            });
            this.N(class06457, (var5x, var6x, var7x) -> {
               int ixx = k - var6x * l;
               int jxx = ixx - l;
               var1.N(-4, jxx, jx + 4 + 4, ixx, class02566.L(var7x * f2));
            });
            if (j1 > 0L) {
               var1.N(-2, k, jx + 4, k + b0, class02566.L(f2));
            }

            int k1 = this.N(class06457, new class10578(this, k, l, i1, var1, f1, b0));
            if (j1 > 0L) {
               int l1 = k + b0;
               class05216 class05216 = class00392.N("chat.queue", j1).y(W);
               var1.N(l1 - 8, 0.5F * f1, class05216.method_30937());
            }

            if (var4) {
               int j3 = ix * l;
               int k3 = k1 * l;
               int i2 = this.P * k3 / ix - k;
               int j2 = k3 * k3 / j3;
               if (j3 != k3) {
                  int k2 = i2 > 0 ? 170 : 96;
                  int l2 = this.s ? 13382451 : 3355562;
                  int i3 = jx + 4;
                  var1.N(i3, -i2, i3 + 2, -i2 - j2, class02566.R(k2, l2));
                  var1.N(i3 + 2, -i2, i3 + 1, -i2 - j2, class02566.R(k2, 13421772));
               }
            }

            class04643.L();
         }
      }
   }

   public final void N(class06390 var1) {
      int ix = class04995.N(this.P() / this.T());
      List list = var1.N((class01590)this.L.i_3, ix);
      boolean flag = this.i();

      for (int jx = 0; jx < list.size(); jx++) {
         class01028 class01028 = (class01028)list.get(jx);
         if (flag && this.P > 0) {
            this.s = true;
            this.N(1);
         }

         boolean flag1 = jx == list.size() - 1;
         this.m.addFirst(new class06419(var1.N(), class01028, var1.u(), flag1));
      }

      while (this.m.size() > 100) {
         this.m.removeLast();
      }
   }

   public void N(class04469 var1) {
      class06437 class06437 = this.y(var1);
      if (class06437 != null) {
         this.j.add(class06437);
      }
   }

   public void N(class00580 var1, int var2, int var3, boolean var4) {
      this.N(new class06477(var1), var2, var3, var4);
   }

   public void N(class00392 var1, @Nullable class04469 var2, @Nullable class03054 var3) {
      var3 = this.N(var3);
      var1 = this.y(var1);
      class06390 class06390 = new class06390(((class01056)this.L.i_6).R(), var1, var2, var3);
      this.L(class06390);
      this.N(class06390);
      this.y(class06390);
   }

   public void N(class00392 var1) {
      this.N(var1, null, this.L.NW() ? class03054.y() : class03054.N());
   }

   public void N(boolean var1) {
      this.N(var1, null);
      this.L.N().u();
      this.j.clear();
      this.m.clear();
      this.i.clear();
      if (var1) {
         this.u.clear();
         this.u.addAll(this.L.NA().N());
      }
   }

   public void N(class01054 var1, class01590 var2, int var3, int var4, int var5, boolean var6, boolean var7) {
      var1.i().pushMatrix();
      this.N((class06465)(var6 ? new class06469(var1, var2, var4, var5, var7) : new class06475(var1)), var1.y(), var3, var6);
      var1.i().popMatrix();
   }

   private int N(class06457 var1, class10579 var2) {
      int ix = this.M();
      int jx = 0;

      for (int k = Math.min(this.m.size() - this.P, ix) - 1; k >= 0; k--) {
         int l = k + this.P;
         class06419 class06419 = this.m.get(l);
         float f = var1.calculate(class06419);
         if (f > 1.0E-5F) {
            jx++;
            var2.accept(class06419, k, f);
         }
      }

      return jx;
   }

   public static int N(double var0) {
      short short1 = 320;
      byte b0 = 40;
      return class04995.N(var0 * 280.0 + 40.0);
   }

   public void N() {
      if (!this.j.isEmpty()) {
         this.W();
      }
   }

   public void N(String var1) {
      if (!var1.equals(this.u.peekLast())) {
         if (this.u.size() >= 100) {
            this.u.removeFirst();
         }

         this.u.addLast(var1);
      }

      if (var1.startsWith("/")) {
         this.L.NA().N(var1);
      }
   }

   public void N(int var1) {
      this.P += var1;
      int ix = this.m.size();
      if (this.P > ix - this.M()) {
         this.P = ix - this.M();
      }

      if (this.P <= 0) {
         this.P = 0;
         this.s = false;
      }
   }

   public void compactChat$refreshMessages() {
      this.m();
   }

   private void W() {
      int ix = ((class01056)this.L.i_6).R();
      this.j.removeIf(var2 -> ix >= var2.y() ? this.y(var2.N()) == null : false);
   }

   public static double R() {
      short short1 = 180;
      byte b0 = 20;
      return 70.0 / (y(1.0) - 20);
   }

   public List compactChat$getMessages() {
      return this.i;
   }
}
