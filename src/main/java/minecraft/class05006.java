package minecraft;

import Nursultan.class11300;
import Nursultan.class11938;
import com.mojang.authlib.GameProfile;
import com.viaversion.viafabricplus.visuals.injection.access.r1_7_tab_list_tyle.IPlayerTabOverlay;
import com.viaversion.viafabricplus.visuals.settings.VisualSettings;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import org.joml.Matrix3x2fStack;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class05006 implements IPlayerTabOverlay {
   private static final class01894 L = class01894.y("icon/ping_unknown");
   private static final class01894 u = class01894.y("icon/ping_1");
   private static final class01894 i = class01894.y("icon/ping_2");
   private static final class01894 R = class01894.y("icon/ping_3");
   private static final class01894 M = class01894.y("icon/ping_4");
   private static final class01894 B = class01894.y("icon/ping_5");
   private static final class01894 Z = class01894.y("hud/heart/container_blinking");
   private static final class01894 z = class01894.y("hud/heart/container");
   private static final class01894 U = class01894.y("hud/heart/full_blinking");
   private static final class01894 E = class01894.y("hud/heart/half_blinking");
   private static final class01894 W = class01894.y("hud/heart/absorbing_full_blinking");
   private static final class01894 m = class01894.y("hud/heart/full");
   private static final class01894 P = class01894.y("hud/heart/absorbing_half_blinking");
   private static final class01894 s = class01894.y("hud/heart/half");
   private static final Comparator<class03458> T = Comparator.<class03458>comparingInt(var0 -> -var0.U())
      .thenComparingInt(var0 -> var0.i() == class07282.field_9219 ? 1 : 0)
      .thenComparing(var0 -> class01962.N(var0.B(), class00502::L, ""))
      .thenComparing(var0 -> var0.N().name(), String::compareToIgnoreCase);
   public static final int N = 20;
   private final class06202 b;
   private final class01056 j;
   @Nullable
   public class00392 y;
   @Nullable
   private class00392 v;
   private boolean n;
   private final Map<UUID, class05004> t;
   private int G;
   private static final Comparator l;
   private int d;
   private boolean w = true;

   private boolean M(class03458 var1) {
      class07282 class07282 = var1.i();
      return class07282 == class07282.field_9220 || class07282 == class07282.field_9219;
   }

   public class05006(class06202 var1, class01056 var2) {
      super();
      this.t = new Object2ObjectOpenHashMap();
      this.b = var1;
      this.j = var2;
   }

   private boolean y(boolean var1) {
      return var1 && !this.w;
   }

   private void y(CallbackInfoReturnable var1) {
      if (VisualSettings.INSTANCE.enableLegacyTablist.isEnabled()) {
         var1.setReturnValue(
            ((class01683)((class04453)this.b.T_4).y_0).B().stream().sorted(l).limit(this.d).collect(Collectors.collectingAndThen(Collectors.toList(), this::N))
         );
      } else {
         this.w = false;
      }
   }

   private List<class03458> y() {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.y(callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return (List<class03458>)callbackinforeturnable.getReturnValue();
      } else {
         List<class03458> list;
         List list1 = list = ((class01683)((class04453)this.b.T_4).y_0).B().stream().sorted(T).limit(80L).toList();
         CallbackInfoReturnable callbackinforeturnable1 = new CallbackInfoReturnable("", true, list);
         this.N(callbackinforeturnable1);
         return callbackinforeturnable1.isCancelled() ? (List)callbackinforeturnable1.getReturnValue() : list1;
      }
   }

   public void y(@Nullable class00392 var1) {
      this.v = var1;
   }

   public void N(boolean var1) {
      if (this.n != var1) {
         this.t.clear();
         this.n = var1;
         if (var1) {
            class05216 class05216 = class00390.N(this.y(), class00392.y(", "), this::N);
            this.b.NT().u(class00392.N("multiplayer.player.list.narration", class05216));
         }
      }
   }

   private void N(int var1, int var2, int var3, UUID var4, class01054 var5, int var6) {
      class05004 class05004 = this.t.computeIfAbsent(var4, var1x -> new class05004(var6));
      class05004.N(var6, this.j.R());
      int ix = class04995.R(Math.max(var6, class05004.N()), 2);
      int jx = Math.max(var6, Math.max(class05004.N(), 20)) / 2;
      boolean flag = class05004.N(this.j.R());
      if (ix > 0) {
         int k = class04995.y(Math.min((float)(var3 - var2 - 4) / jx, 9.0F));
         if (k <= 3) {
            float f1 = class04995.N(var6 / 20.0F, 0.0F, 1.0F);
            int j1 = (int)((1.0F - f1) * 255.0F) << 16 | (int)(f1 * 255.0F) << 8;
            float f = var6 / 2.0F;
            class05216 class05216x = class00392.N("multiplayer.player.list.hp", f);
            class05216 class05216x;
            if (var3 - ((class01590)this.b.i_3).N(class05216x) >= var2) {
               class05216x = class05216x;
            } else {
               class05216x = class00392.y(Float.toString(f));
            }

            var5.y((class01590)this.b.i_3, class05216x, (var3 + var2 - ((class01590)this.b.i_3).N(class05216x)) / 2, var1, class02566.M(j1));
         } else {
            class01894 class01894 = flag ? Z : z;

            for (int lx = ix; lx < jx; lx++) {
               var5.N(class08394.Na, class01894, var2 + lx * k, var1, 9, 9);
            }

            for (int i1 = 0; i1 < ix; i1++) {
               var5.N(class08394.Na, class01894, var2 + i1 * k, var1, 9, 9);
               if (flag) {
                  if (i1 * 2 + 1 < class05004.N()) {
                     var5.N(class08394.Na, U, var2 + i1 * k, var1, 9, 9);
                  }

                  if (i1 * 2 + 1 == class05004.N()) {
                     var5.N(class08394.Na, E, var2 + i1 * k, var1, 9, 9);
                  }
               }

               if (i1 * 2 + 1 < var6) {
                  var5.N(class08394.Na, i1 >= 10 ? W : m, var2 + i1 * k, var1, 9, 9);
               }

               if (i1 * 2 + 1 == var6) {
                  var5.N(class08394.Na, i1 >= 10 ? P : s, var2 + i1 * k, var1, 9, 9);
               }
            }
         }
      }
   }

   private void N(class01054 var1, int var2, class06683 var3, class00518 var4, CallbackInfo var5) {
      this.G = 0;
   }

   private int N(int var1, List var2) {
      int ix = this.G++;
      if (ix >= 0 && ix < var2.size()) {
         class03458 class03458 = (class03458)var2.get(ix);
         class04453 class04453 = (class04453)class06202.Nq().T_4;
         if (class04453 != null && class03458.N().id().equals(class04453.method_7334().id())) {
            return class11300.N(2725887, 130);
         } else {
            String sx = class03458.N().name();
            if (class11938.t().L(sx) || class11938.N().N(sx)) {
               return class11300.N(4259648, 130);
            } else {
               return this.M(class03458) ? class11300.N(16728128, 130) : var1;
            }
         }
      } else {
         return var1;
      }
   }

   private List N(List var1) {
      if (var1.size() != this.d) {
         this.w = var1.stream().noneMatch(var0 -> var0.N().properties().containsKey("textures"));
         return var1;
      } else {
         ArrayList arraylist = new ArrayList(var1.size());
         int ix = this.d / 20;
         boolean flag = false;

         for (int jx = 0; jx < this.d; jx++) {
            int k = jx % 20;
            int lx = jx / 20;
            class03458 class03458 = var1.get(k * ix + lx);
            arraylist.add(class03458);
            flag = flag || class03458.N().properties().containsKey("textures");
         }

         this.w = !flag;
         return arraylist;
      }
   }

   public class00392 N(class03458 var1) {
      return var1.Z() != null ? this.N(var1, var1.Z().L()) : this.N(var1, class00502.N(var1.B(), class00392.y(var1.N().name())));
   }

   private class00392 N(class03458 var1, class05216 var2) {
      return var1.i() == class07282.field_9219 ? var2.N(class06541.field_1056) : var2;
   }

   private void N(class01054 var1, int var2, int var3, int var4, class03458 var5, CallbackInfo var6) {
      int ix = var5.R();
      String sx = ix <= 0 ? "?" : ix + "ms";
      float f = (1.0F - Math.min(1.0F, Math.max(0, ix) / 200.0F)) * 0.33333334F;
      int jx = 0xFF000000 | class04995.M(f, 1.0F, 1.0F);
      float f1 = 0.5F;
      class01590 class01590 = (class01590)class06202.Nq().i_3;
      int k = Math.round((var3 + var2 - 1 - class01590.y(sx) * f1) / f1);
      int lx = Math.round((var4 + (8.0F - 9.0F * f1) / 2.0F) / f1);
      Matrix3x2fStack matrix3x2fstack = var1.i();
      matrix3x2fstack.pushMatrix();
      matrix3x2fstack.scale(f1, f1);
      var1.y(class01590, sx, k, lx, jx);
      matrix3x2fstack.popMatrix();
      var6.cancel();
   }

   private void N(class00518 var1, int var2, class05019 var3, int var4, int var5, UUID var6, class01054 var7) {
      if (var1.Z() == class06640.field_1471) {
         this.N(var2, var4, var5, var6, var7, var3.y());
      } else if (var3.L() != null) {
         var7.y((class01590)this.b.i_3, var3.L(), var5 - var3.u(), var2, -1);
      }
   }

   public void N() {
      this.v = null;
      this.y = null;
   }

   public void N(@Nullable class00392 var1) {
      this.y = var1;
   }

   private void N(CallbackInfoReturnable var1) {
      List list = (List)var1.getReturnValue();
      if (list.size() >= 2) {
         ArrayList arraylist = new ArrayList(list);
         arraylist.sort(Comparator.comparingInt(var1x -> this.M(var1x) ? 0 : 1));
         var1.setReturnValue(arraylist);
      }
   }

   public void N(class01054 var1, int var2, class06683 var3, @Nullable class00518 var4) {
      this.N(var1, var2, var3, var4, null);
      List<class03458> list = this.y();
      ArrayList arraylist = new ArrayList(list.size());
      int ix = ((class01590)this.b.i_3).y(" ");
      int jx = 0;
      int k = 0;

      for (class03458 class03458x : list) {
         class00392 class00392 = this.N(class03458x);
         jx = Math.max(jx, ((class01590)this.b.i_3).N(class00392));
         int lx = 0;
         class05216 class05216 = null;
         int i1 = 0;
         if (var4 != null) {
            class01766 class01766 = class01766.N(class03458x.N());
            class01788 class01788 = var3.y(class01766, var4);
            if (class01788 != null) {
               lx = class01788.y();
            }

            if (var4.Z() != class06640.field_1471) {
               class01762 class01762 = var4.N(class01759.u);
               class05216 = class01788.N(class01788, class01762);
               i1 = ((class01590)this.b.i_3).N(class05216);
               k = Math.max(k, i1 > 0 ? ix + i1 : 0);
            }
         }

         arraylist.add(new class05019(class00392, lx, class05216, i1));
      }

      if (!this.t.isEmpty()) {
         Set set = list.stream().map(var0 -> var0.N().id()).collect(Collectors.toSet());
         this.t.keySet().removeIf(var1x -> !set.contains(var1x));
      }

      int j2 = list.size();
      int k2 = j2;

      int l2;
      for (l2 = 1; k2 > 20; k2 = (j2 + l2 - 1) / l2) {
         l2++;
      }

      boolean flag1 = this.b.q() || this.y(this.b.NE().M().method_10771());
      int i3;
      if (var4 != null) {
         if (var4.Z() == class06640.field_1471) {
            i3 = 90;
         } else {
            i3 = k;
         }
      } else {
         i3 = 0;
      }

      int j3 = Math.min(l2 * ((flag1 ? 9 : 0) + jx + i3 + 13), var2 - 50) / l2;
      int k3 = var2 / 2 - (j3 * l2 + (l2 - 1) * 5) / 2;
      int l3 = 10;
      int i4 = j3 * l2 + (l2 - 1) * 5;
      List<class01028> list1 = null;
      if (this.v != null) {
         list1 = ((class01590)this.b.i_3).L(this.v, var2 - 50);

         for (class01028 var21 : list1) {
            i4 = Math.max(i4, ((class01590)this.b.i_3).N(var21));
         }
      }

      List<class01028> list2 = null;
      if (this.y != null) {
         list2 = ((class01590)this.b.i_3).L(this.y, var2 - 50);

         for (class01028 class01028x : list2) {
            i4 = Math.max(i4, ((class01590)this.b.i_3).N(class01028x));
         }
      }

      if (list1 != null) {
         var1.N(var2 / 2 - i4 / 2 - 1, l3 - 1, var2 / 2 + i4 / 2 + 1, l3 + list1.size() * 9, Integer.MIN_VALUE);

         for (class01028 class01028xxx : list1) {
            int j1 = ((class01590)this.b.i_3).N(class01028xxx);
            var1.y((class01590)this.b.i_3, class01028xxx, var2 / 2 - j1 / 2, l3, -1);
            l3 += 9;
         }

         l3++;
      }

      var1.N(var2 / 2 - i4 / 2 - 1, l3 - 1, var2 / 2 + i4 / 2 + 1, l3 + k2 * 9, Integer.MIN_VALUE);
      int j4 = ((class05630)this.b.i_7).N(553648127);

      for (int k4 = 0; k4 < j2; k4++) {
         int l4 = k4 / k2;
         int k1 = k4 % k2;
         int l1 = k3 + l4 * j3 + l4 * 5;
         int i2 = l3 + k1 * 9;
         var1.N(l1, i2, l1 + j3, i2 + 8, this.N(j4, list));
         if (k4 < list.size()) {
            class03458 class03458 = list.get(k4);
            class05019 class05019 = (class05019)arraylist.get(k4);
            GameProfile gameprofile = class03458.N();
            if (flag1) {
               class08036 class08036 = ((class03448)this.b.T_3).N(gameprofile.id());
               boolean flag = class08036 != null && class08287.N(class08036);
               class03933.N(var1, class03458.M().N().y(), l1, i2, 8, class03458.z(), flag, -1);
               l1 += 9;
            }

            var1.y((class01590)this.b.i_3, class05019.N(), l1, i2, class03458.i() == class07282.field_9219 ? -1862270977 : -1);
            if (var4 != null && class03458.i() != class07282.field_9219) {
               int j5 = l1 + jx + 1;
               int k5 = j5 + i3;
               if (k5 - j5 > 5) {
                  this.N(var4, i2, class05019, j5, k5, gameprofile.id(), var1);
               }
            }

            this.N(var1, j3, l1 - (flag1 ? 9 : 0), i2, class03458);
         }
      }

      if (list2 != null) {
         l3 += k2 * 9 + 1;
         var1.N(var2 / 2 - i4 / 2 - 1, l3 - 1, var2 / 2 + i4 / 2 + 1, l3 + list2.size() * 9, Integer.MIN_VALUE);

         for (class01028 class01028xx : list2) {
            int i5 = ((class01590)this.b.i_3).N(class01028xx);
            var1.y((class01590)this.b.i_3, class01028xx, var2 / 2 - i5 / 2, l3, -1);
            l3 += 9;
         }
      }
   }

   protected void N(class01054 var1, int var2, int var3, int var4, class03458 var5) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, var2, var3, var4, var5, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         class01894 class01894;
         if (var5.R() < 0) {
            class01894 = L;
         } else if (var5.R() < 150) {
            class01894 = B;
         } else if (var5.R() < 300) {
            class01894 = M;
         } else if (var5.R() < 600) {
            class01894 = R;
         } else if (var5.R() < 1000) {
            class01894 = i;
         } else {
            class01894 = u;
         }

         var1.N(class08394.Na, class01894, var3 + var2 - 11, var4, 10, 8);
      }
   }

   public void viaFabricPlusVisuals$setMaxPlayers(int var1) {
      this.d = Math.min(200, Math.max(20, (var1 + 20 - 1) / 20 * 20));
   }
}
