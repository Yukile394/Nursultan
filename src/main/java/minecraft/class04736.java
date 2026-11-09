package minecraft;

import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class04736 extends class05407 {
   static final Logger N = LogUtils.getLogger();
   private static final class00392 B = class00392.L("mco.selectServer.create");
   private static final class00392 Z = class00392.L("mco.selectServer.create.subtitle").y(-6250336);
   private static final class00392 z = class00392.L("mco.configure.world.switch.slot");
   private static final class00392 U = class00392.L("mco.configure.world.switch.slot.subtitle").y(-6250336);
   private static final class00392 E = class00392.L("mco.reset.world.generate");
   private static final class00392 W = class00392.L("mco.reset.world.title");
   private static final class00392 m = class00392.L("mco.reset.world.warning").y(-65536);
   public static final class00392 y = class00392.L("mco.create.world.reset.title");
   private static final class00392 P = class00392.L("mco.reset.world.resetting.screen.title");
   private static final class00392 s = class00392.L("mco.reset.world.template");
   private static final class00392 T = class00392.L("mco.reset.world.adventure");
   private static final class00392 b = class00392.L("mco.reset.world.experience");
   private static final class00392 j = class00392.L("mco.reset.world.inspiration");
   private final class05096 v;
   private final class04981 n;
   private final class00392 t;
   private final class00392 e;
   private static final class01894 H = class01894.y("textures/gui/realms/upload.png");
   private static final class01894 c = class01894.y("textures/gui/realms/adventure.png");
   private static final class01894 X = class01894.y("textures/gui/realms/survival_spawn.png");
   private static final class01894 a = class01894.y("textures/gui/realms/new_world.png");
   private static final class01894 p = class01894.y("textures/gui/realms/experience.png");
   private static final class01894 F = class01894.y("textures/gui/realms/inspiration.png");
   class05434 L;
   class05434 u;
   class05434 i;
   class05434 R;
   public final int M;
   @Nullable
   private final class04734 A;
   private final Runnable f;
   private final class03686 C = new class03686(this);

   private class04736(class05096 var1, class04981 var2, int var3, class00392 var4, class00392 var5, class00392 var6, Runnable var7) {
      this(var1, var2, var3, var4, var5, var6, null, var7);
   }

   public class04736(class05096 var1, class04981 var2, int var3, class00392 var4, class00392 var5, class00392 var6, @Nullable class04734 var7, Runnable var8) {
      super(var4);
      this.v = var1;
      this.n = var2;
      this.M = var3;
      this.t = var5;
      this.e = var6;
      this.A = var7;
      this.f = var8;
   }

   public static class04736 N(class05096 var0, int var1, class04981 var2, Runnable var3) {
      return new class04736(var0, var2, var1, z, U, y, var3);
   }

   public static class04736 N(class05096 var0, class04981 var1, class04734 var2, Runnable var3) {
      return new class04736(var0, var1, var1.T, B, Z, y, var2, var3);
   }

   private void N(@Nullable class04982 var1) {
      this.field_22787.N(this);
      if (var1 != null) {
         this.N(new class06350(var1, this.n.y, this.e, this.f));
      }

      class05685.u();
   }

   private void N(class05129 var1) {
      ArrayList arraylist = new ArrayList();
      if (this.A != null) {
         arraylist.add(this.A);
      }

      if (this.M != this.n.T) {
         arraylist.add(new class04724(this.n.y, this.M, () -> {}));
      }

      arraylist.add(var1);
      this.field_22787.N(new class04708(this.v, arraylist.toArray(new class05129[0])));
   }

   public static class04736 N(class05096 var0, class04981 var1, Runnable var2) {
      return new class04736(var0, var1, var1.T, W, m, P, var2);
   }

   @Override
   public void method_25426() {
      class01885 class01885 = this.C.N(class01885.u());
      class01885.L().N(3);
      class01885.N(new class02071(this.field_22785, this.field_22793), class02072::y);
      class01885.N(new class02071(this.t, this.field_22793), class02072::y);
      new class04697(this, "Realms-reset-world-fetcher").start();
      class02080 class02080 = this.C.L(new class02060()).u(3);
      class02080.L().R(16);
      class02080.N(new class04728(this, (class01590)this.field_22787.i_3, E, a, var1x -> class08702.N(this.field_22787, this.v, this, this.M, this.n, this.A)));
      class02080.N(
         new class04728(this, (class01590)this.field_22787.i_3, class04720.N, H, var1x -> this.field_22787.N(new class04720(this.A, this.n.y, this.M, this)))
      );
      class02080.N(
         new class04728(this, (class01590)this.field_22787.i_3, s, X, var1x -> this.field_22787.N(new class04739(s, this::N, class04969.field_19437, this.L)))
      );
      class02080.N(class02057.y(16), 3);
      class02080.N(
         new class04728(this, (class01590)this.field_22787.i_3, T, c, var1x -> this.field_22787.N(new class04739(T, this::N, class04969.field_19439, this.u)))
      );
      class02080.N(
         new class04728(this, (class01590)this.field_22787.i_3, b, p, var1x -> this.field_22787.N(new class04739(b, this::N, class04969.field_19440, this.i)))
      );
      class02080.N(
         new class04728(this, (class01590)this.field_22787.i_3, j, F, var1x -> this.field_22787.N(new class04739(j, this::N, class04969.field_19441, this.R)))
      );
      this.C.y(class05362.method_46430(class05220.U, var1x -> this.method_25419()).N());
      this.C.method_48206(var1x -> {
         class06478 class06478 = this.method_37063(var1x);
      });
      this.method_48640();
   }

   @Override
   public void method_48640() {
      this.C.N();
   }

   @Override
   public void method_25419() {
      this.field_22787.N(this.v);
   }

   @Override
   public class00392 method_25435() {
      return class05220.N(this.method_25440(), this.t);
   }
}
