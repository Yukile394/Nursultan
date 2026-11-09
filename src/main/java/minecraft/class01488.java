package minecraft;

import Nursultan.class09473;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.viaversion.viafabricplus.visuals.features.classic.creative_menu.GridItemSelectionScreen;
import com.viaversion.viafabricplus.visuals.settings.VisualSettings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.function.Predicate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.itemgroup.v1.FabricCreativeInventoryScreen;
import net.fabricmc.fabric.impl.client.itemgroup.FabricCreativeGuiComponents;
import net.fabricmc.fabric.impl.client.itemgroup.FabricCreativeGuiComponents.ItemGroupButtonWidget;
import net.fabricmc.fabric.impl.client.itemgroup.FabricCreativeGuiComponents.Type;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
public class class01488 extends class01463<class01521> implements FabricCreativeInventoryScreen {
   private static final class01894 y = class01894.y("container/creative_inventory/scroller");
   private static final class01894 L = class01894.y("container/creative_inventory/scroller_disabled");
   private static final class01894[] u = new class01894[]{
      class01894.y("container/creative_inventory/tab_top_unselected_1"),
      class01894.y("container/creative_inventory/tab_top_unselected_2"),
      class01894.y("container/creative_inventory/tab_top_unselected_3"),
      class01894.y("container/creative_inventory/tab_top_unselected_4"),
      class01894.y("container/creative_inventory/tab_top_unselected_5"),
      class01894.y("container/creative_inventory/tab_top_unselected_6"),
      class01894.y("container/creative_inventory/tab_top_unselected_7")
   };
   private static final class01894[] n = new class01894[]{
      class01894.y("container/creative_inventory/tab_top_selected_1"),
      class01894.y("container/creative_inventory/tab_top_selected_2"),
      class01894.y("container/creative_inventory/tab_top_selected_3"),
      class01894.y("container/creative_inventory/tab_top_selected_4"),
      class01894.y("container/creative_inventory/tab_top_selected_5"),
      class01894.y("container/creative_inventory/tab_top_selected_6"),
      class01894.y("container/creative_inventory/tab_top_selected_7")
   };
   private static final class01894[] t = new class01894[]{
      class01894.y("container/creative_inventory/tab_bottom_unselected_1"),
      class01894.y("container/creative_inventory/tab_bottom_unselected_2"),
      class01894.y("container/creative_inventory/tab_bottom_unselected_3"),
      class01894.y("container/creative_inventory/tab_bottom_unselected_4"),
      class01894.y("container/creative_inventory/tab_bottom_unselected_5"),
      class01894.y("container/creative_inventory/tab_bottom_unselected_6"),
      class01894.y("container/creative_inventory/tab_bottom_unselected_7")
   };
   private static final class01894[] G = new class01894[]{
      class01894.y("container/creative_inventory/tab_bottom_selected_1"),
      class01894.y("container/creative_inventory/tab_bottom_selected_2"),
      class01894.y("container/creative_inventory/tab_bottom_selected_3"),
      class01894.y("container/creative_inventory/tab_bottom_selected_4"),
      class01894.y("container/creative_inventory/tab_bottom_selected_5"),
      class01894.y("container/creative_inventory/tab_bottom_selected_6"),
      class01894.y("container/creative_inventory/tab_bottom_selected_7")
   };
   private static final int l = 5;
   private static final int d = 9;
   private static final int w = 26;
   private static final int k = 32;
   private static final int Y = 12;
   private static final int Q = 15;
   static final class07075 N = new class07075(45);
   private static final class00392 O = class00392.L("inventory.binSlot");
   private static class06911 g = class03771.y();
   private float I;
   private boolean J;
   private class04927 o;
   @Nullable
   private List<class06937> q;
   @Nullable
   private class06937 K;
   private class06006 V;
   private boolean e;
   private boolean H;
   private final Set<class03530<class06581>> c = new HashSet<>();
   private final boolean X;
   private final class04973 a;
   private static int p = 0;

   private boolean L() {
      return g.i() && this.m.W();
   }

   private int L(class06911 var1) {
      int i = 0;
      if (var1.M() == class06909.field_41049) {
         i -= 32;
      } else {
         i += this.Z;
      }

      return i;
   }

   public class01488(class04453 var1, class03767 var2, boolean var3) {
      super(new class01521(var1), var1.method_31548(), class05220.N);
      var1.fields_07fa3311b0e9d3e9b883d09222919bf5a_3 = this.m;
      this.Z = 136;
      this.B = 195;
      this.X = var3;
      this.N(((class01683)var1.y_0).Y(), var2, this.N(var1), var1.method_73183().method_30349());
      this.a = new class04973(this);
   }

   private void i() {
      if (!this.u(g)) {
         class03771.u().stream().filter(this::u).min((var0, var1) -> Boolean.compare(var0.z(), var1.z())).ifPresent(this::N);
      }
   }

   @Override
   public void u() {
      super.u();
      class04453 class04453 = (class04453)this.field_22787.T_4;
      if (class04453 != null) {
         this.N(((class01683)class04453.y_0).G(), this.N(class04453), class04453.method_73183().method_30349());
         if (!class04453.method_56992()) {
            this.field_22787.N(new class05410(class04453));
         }
      }
   }

   private boolean u(class06911 var1) {
      return var1.Z() && p == this.getPage(var1);
   }

   @Override
   protected void u(class01054 var1, int var2, int var3) {
      if (g.u()) {
         var1.N(this.field_22793, g.N(), 8, 6, -12566464, false);
      }
   }

   protected boolean y(double var1, double var3) {
      int i = this.T;
      int j = this.b;
      int kx = i + 175;
      int lx = j + 18;
      int i1 = kx + 14;
      int j1 = lx + 112;
      return var1 >= kx && var3 >= lx && var1 < i1 && var3 < j1;
   }

   private void y() {
      this.m.N.clear();
      this.c.clear();
      String s = this.o.method_1882();
      if (s.isEmpty()) {
         this.m.N.addAll(g.E());
      } else {
         class01683 class01683 = this.field_22787.NE();
         if (class01683 != null) {
            class08666 class08666 = class01683.Y();
            class00077<class06584> class00077;
            if (s.startsWith("#")) {
               s = s.substring(1);
               class00077 = class08666.L();
               this.N(s);
            } else {
               class00077 = class08666.u();
            }

            this.m.N.addAll(class00077.method_4810(s.toLowerCase(Locale.ROOT)));
         }
      }

      this.I = 0.0F;
      this.m.y(0.0F);
   }

   private void y(CallbackInfo var1) {
      if (VisualSettings.INSTANCE.replaceCreativeInventory.isEnabled()) {
         class06202.Nq().N(GridItemSelectionScreen.INSTANCE);
      }
   }

   private int y(class06911 var1) {
      int i = var1.R();
      byte b0 = 27;
      int j = 27 * i;
      if (var1.z()) {
         j = this.B - 27 * (7 - i) + 1;
      }

      return j;
   }

   @Override
   protected void N(@Nullable class06937 var1, int var2, int var3, class07510 var4) {
      if (this.N(var1)) {
         this.o.method_1872(false);
         this.o.method_1884(0);
      }

      boolean flag = var4 == class07510.field_7794;
      var4 = var2 == -999 && var4 == class07510.field_7790 ? class07510.field_7795 : var4;
      if (var4 != class07510.field_7795 || ((class04453)this.field_22787.T_4).method_64271()) {
         this.N(var1, var4);
         if (var1 == null && g.U() != class06936.field_41053 && var4 != class07510.field_7789) {
            if (!this.m.M().R() && this.H) {
               if (!((class04453)this.field_22787.T_4).method_64271()) {
                  return;
               }

               if (var3 == 0) {
                  ((class04453)this.field_22787.T_4).method_7328(this.m.M(), true);
                  ((class03443)this.field_22787.T_2).N(this.m.M());
                  this.m.N(class06584.E);
               }

               if (var3 == 1) {
                  class06584 class06584xxx = this.m.M().N(1);
                  ((class04453)this.field_22787.T_4).method_7328(class06584xxx, true);
                  ((class03443)this.field_22787.T_2).N(class06584xxx);
               }
            }
         } else {
            if (var1 != null && !var1.N((class04453)this.field_22787.T_4)) {
               return;
            }

            if (var1 == this.K && flag) {
               for (int i = 0; i < ((class04453)this.field_22787.T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_2.L().size(); i++) {
                  ((class04453)this.field_22787.T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_2.L(i).i(class06584.E);
                  ((class03443)this.field_22787.T_2).N(class06584.E, i);
               }
            } else if (g.U() == class06936.field_41053) {
               if (var1 == this.K) {
                  this.m.N(class06584.E);
               } else if (var4 == class07510.field_7795 && var1 != null && var1.R()) {
                  class06584 class06584xxxxxxxx = var1.N(var3 == 0 ? 1 : var1.i().U());
                  class06584 class06584x = var1.i();
                  ((class04453)this.field_22787.T_4).method_7328(class06584xxxxxxxx, true);
                  ((class03443)this.field_22787.T_2).N(class06584xxxxxxxx);
                  ((class03443)this.field_22787.T_2).N(class06584x, ((class01499)var1).N.u);
               } else if (var4 == class07510.field_7795 && var2 == -999 && !this.m.M().R()) {
                  ((class04453)this.field_22787.T_4).method_7328(this.m.M(), true);
                  ((class03443)this.field_22787.T_2).N(this.m.M());
                  this.m.N(class06584.E);
               } else {
                  ((class04453)this.field_22787.T_4)
                     .fields_07fa3311b0e9d3e9b883d09222919bf5a_2
                     .N(var1 == null ? var2 : ((class01499)var1).N.u, var3, var4, (class04453)this.field_22787.T_4);
                  ((class04453)this.field_22787.T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_2.u();
               }
            } else if (var4 != class07510.field_7789 && var1.L == N) {
               class06584 class06584xxxx = this.m.M();
               class06584 class06584x = var1.i();
               if (var4 == class07510.field_7791) {
                  if (!class06584x.R()) {
                     ((class04453)this.field_22787.T_4).method_31548().method_5447(var3, class06584x.L(class06584x.U()));
                     ((class04453)this.field_22787.T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_2.u();
                  }

                  return;
               }

               if (var4 == class07510.field_7796) {
                  if (this.m.M().R() && var1.R()) {
                     class06584 class06584xx = var1.i();
                     this.m.N(class06584xx.L(class06584xx.U()));
                  }

                  return;
               }

               if (var4 == class07510.field_7795) {
                  if (!class06584x.R()) {
                     class06584 class06584xx = class06584x.L(var3 == 0 ? 1 : class06584x.U());
                     ((class04453)this.field_22787.T_4).method_7328(class06584xx, true);
                     ((class03443)this.field_22787.T_2).N(class06584xx);
                  }

                  return;
               }

               if (!class06584xxxx.R() && !class06584x.R() && class06584.L(class06584xxxx, class06584x)) {
                  if (var3 == 0) {
                     if (flag) {
                        class06584xxxx.i(class06584xxxx.U());
                     } else if (class06584xxxx.c() < class06584xxxx.U()) {
                        class06584xxxx.M(1);
                     }
                  } else {
                     class06584xxxx.B(1);
                  }
               } else if (!class06584x.R() && class06584xxxx.R()) {
                  int lx = flag ? class06584x.U() : class06584x.c();
                  this.m.N(class06584x.L(lx));
               } else if (var3 == 0) {
                  this.m.N(class06584.E);
               } else if (!this.m.M().R()) {
                  this.m.M().B(1);
               }
            } else if (this.m != null) {
               class06584 class06584xx = var1 == null ? class06584.E : this.m.L(var1.u).i();
               this.m.N(var1 == null ? var2 : var1.u, var3, var4, (class04453)this.field_22787.T_4);
               if (class07482.i(var3) == 2) {
                  for (int j = 0; j < 9; j++) {
                     ((class03443)this.field_22787.T_2).N(this.m.L(45 + j).i(), 36 + j);
                  }
               } else if (var1 != null && class08044.L(var1.B()) && g.U() != class06936.field_41053) {
                  if (var4 == class07510.field_7795 && !class06584xx.R() && !this.m.M().R()) {
                     int kx = var3 == 0 ? 1 : class06584xx.c();
                     class06584 class06584xxx = class06584xx.L(kx);
                     class06584xx.B(kx);
                     ((class04453)this.field_22787.T_4).method_7328(class06584xxx, true);
                     ((class03443)this.field_22787.T_2).N(class06584xxx);
                  }

                  ((class04453)this.field_22787.T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_2.u();
               }
            }
         }
      }
   }

   private void N(Collection<class06584> var1) {
      int i = this.m.N(this.I);
      this.m.N.clear();
      if (g.U() == class06936.field_41055) {
         this.y();
      } else {
         this.m.N.addAll(var1);
      }

      this.I = this.m.N(i);
      this.m.y(this.I);
   }

   private void N(CallbackInfo var1) {
      p = this.getPage(g);
      int i = this.T + 171;
      int j = this.b + 4;
      this.method_37063(new ItemGroupButtonWidget(i + 10, j, Type.NEXT, this));
      this.method_37063(new ItemGroupButtonWidget(i, j, Type.PREVIOUS, this));
   }

   private void N(class06911 var1, CallbackInfo var2) {
      if (!this.u(var1)) {
         var2.cancel();
      }
   }

   public boolean N() {
      return g.U() == class06936.field_41053;
   }

   public static void N(class06202 var0, int var1, boolean var2, boolean var3) {
      class04453 class04453 = (class04453)var0.T_4;
      class01042 class01042 = class04453.method_73183().method_30349();
      class06418 class06418 = var0.yB();
      class03916 class03916 = class06418.N(var1);
      if (var2) {
         List<class06584> list = class03916.N(class01042);

         for (int i = 0; i < class08044.L(); i++) {
            class06584 class06584 = list.get(i);
            class04453.method_31548().method_5447(i, class06584);
            ((class03443)var0.T_2).N(class06584, 36 + i);
         }

         class04453.fields_07fa3311b0e9d3e9b883d09222919bf5a_2.u();
      } else if (var3) {
         class03916.N(class04453.method_31548(), class01042);
         class00392 class00392x = ((class05630)var0.i_7).f[var1].m();
         class00392 class00392x = ((class05630)var0.i_7).S.m();
         class05216 class05216 = class00392.N("inventory.hotbarSaved", class00392x, class00392x);
         ((class01056)var0.i_6).N(class05216, false);
         var0.NT().u(class05216);
         class06418.N();
      }
   }

   protected boolean N(class06911 var1, double var2, double var4) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, var4, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return callbackinforeturnable.getReturnValueZ();
      } else {
         int i = this.y(var1);
         int j = this.L(var1);
         return var2 >= i && var2 <= i + 26 && var4 >= j && var4 <= j + 32;
      }
   }

   private boolean N(int var1) {
      return class03771.L().stream().anyMatch(var2 -> this.getPage(var2) == var1);
   }

   private void N(class03767 var1, boolean var2, class01929 var3) {
      class01683 class01683 = this.field_22787.NE();
      if (this.N(class01683 != null ? class01683.Y() : null, var1, var2, var3)) {
         for (class06911 class06911 : class03771.u()) {
            Collection<class06584> collection = class06911.E();
            if (class06911 == g) {
               if (class06911.U() == class06936.field_41052 && collection.isEmpty()) {
                  this.N(class03771.y());
               } else {
                  this.N(collection);
               }
            }
         }
      }
   }

   private boolean N(class08036 var1) {
      return var1.method_7338() && this.X;
   }

   private void N(class01054 var1, class06911 var2, int var3, int var4, CallbackInfoReturnable var5) {
      if (!this.u(var2)) {
         var5.setReturnValue(false);
      }
   }

   private void N(class06911 var1, double var2, double var4, CallbackInfoReturnable var6) {
      if (!this.u(var1)) {
         var6.setReturnValue(false);
      }
   }

   private void N(class01054 var1, int var2, int var3, class06911 var4, CallbackInfo var5) {
      if (!this.u(var4)) {
         var5.cancel();
      }
   }

   private void N(class06601 var1, CallbackInfoReturnable var2) {
      if (var1.v() == 266) {
         if (this.switchToPreviousPage()) {
            var2.setReturnValue(true);
         }
      } else if (var1.v() == 267 && this.switchToNextPage()) {
         var2.setReturnValue(true);
      }
   }

   private boolean N(@Nullable class08666 var1, class03767 var2, boolean var3, class01929 var4) {
      if (!class03771.N(var2, var3, var4)) {
         return false;
      } else {
         if (var1 != null) {
            List list = List.copyOf(class03771.i().E());
            var1.N(var4, list);
            var1.N(list);
         }

         return true;
      }
   }

   @Override
   protected void N(class01054 var1, float var2, int var3, int var4) {
      for (class06911 class06911 : class03771.L()) {
         if (class06911 != g) {
            this.N(var1, var3, var4, class06911);
         }
      }

      var1.N(class08394.Na, g.L(), this.T, this.b, 0.0F, 0.0F, this.B, this.Z, 256, 256);
      if (this.y(var3, var4) && this.L()) {
         var1.N(this.J ? class06608.i : class06608.u);
      }

      this.o.method_25394(var1, var3, var4, var2);
      int j = this.T + 175;
      int kx = this.b + 18;
      int i = kx + 112;
      if (g.i()) {
         class01894 class01894 = this.L() ? y : L;
         var1.N(class08394.Na, class01894, j, kx + (int)((i - kx - 17) * this.I), 12, 15);
      }

      this.N(var1, var3, var4, g);
      if (g.U() == class06936.field_41053) {
         class05410.N(var1, this.T + 73, this.b + 6, this.T + 105, this.b + 49, 20, 0.0625F, var3, var4, (class04453)this.field_22787.T_4);
      }
   }

   @Override
   public List<class00392> N(class06584 var1) {
      boolean flag = this.s != null && this.s instanceof class09473;
      boolean flag1 = g.U() == class06936.field_41052;
      boolean flag2 = g.U() == class06936.field_41055;
      class06524 class06524x = ((class05630)this.field_22787.i_7).W ? class06524.y : class06524.N;
      class06524 class06524x = flag ? class06524x.L() : class06524x;
      List<class00392> list = var1.N(class06591.N((class03448)this.field_22787.T_3), (class04453)this.field_22787.T_4, class06524x);
      if (list.isEmpty()) {
         return list;
      } else if (flag1 && flag) {
         return list;
      } else {
         ArrayList arraylist = Lists.newArrayList(list);
         if (flag2 && flag) {
            this.c.forEach(var2x -> {
               if (var1.N((class03530<class06581>)var2x)) {
                  arraylist.add(1, class00392.y("#" + var2x.y()).N(class06541.field_1064));
               }
            });
         }

         int i = 1;

         for (class06911 class06911 : class03771.L()) {
            if (class06911.U() != class06936.field_41055 && class06911.N(var1)) {
               arraylist.add(i++, class06911.N().L().N(class06541.field_1078));
            }
         }

         return arraylist;
      }
   }

   private void N(class06911 var1) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         class06911 class06911 = g;
         g = var1;
         this.j.clear();
         this.m.N.clear();
         this.Z();
         if (g.U() == class06936.field_41054) {
            class06418 class06418 = this.field_22787.yB();

            for (int i = 0; i < 9; i++) {
               class03916 class03916 = class06418.N(i);
               if (class03916.N()) {
                  for (int j = 0; j < 9; j++) {
                     if (j == i) {
                        class06584 class06584 = new class06584(class06570.jk);
                        class06584.N(class02484.t, class06244.field_17274);
                        class00392 class00392x = ((class05630)this.field_22787.i_7).f[i].m();
                        class00392 class00392x = ((class05630)this.field_22787.i_7).C.m();
                        class06584.N(class02484.U, class00392.N("inventory.hotbarInfo", class00392x, class00392x));
                        this.m.N.add(class06584);
                     } else {
                        this.m.N.add(class06584.E);
                     }
                  }
               } else {
                  this.m.N.addAll(class03916.N(((class03448)this.field_22787.T_3).method_30349()));
               }
            }
         } else if (g.U() == class06936.field_41052) {
            this.m.N.addAll(g.E());
         }

         if (g.U() == class06936.field_41053) {
            class07492 class07492 = ((class04453)this.field_22787.T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_2;
            if (this.q == null) {
               this.q = ImmutableList.copyOf(this.m.T);
            }

            this.m.T.clear();

            for (int kx = 0; kx < class07492.T.size(); kx++) {
               int lx;
               int i1;
               if (kx >= 5 && kx < 9) {
                  int k1 = kx - 5;
                  int i2 = k1 / 2;
                  int k2 = k1 % 2;
                  lx = 54 + i2 * 54;
                  i1 = 6 + k2 * 27;
               } else if (kx >= 0 && kx < 5) {
                  lx = -2000;
                  i1 = -2000;
               } else if (kx == 45) {
                  lx = 35;
                  i1 = 20;
               } else {
                  int j1 = kx - 9;
                  int l1 = j1 % 9;
                  int j2 = j1 / 9;
                  lx = 9 + l1 * 18;
                  if (kx >= 36) {
                     i1 = 112;
                  } else {
                     i1 = 54 + j2 * 18;
                  }
               }

               class01499 class01499 = new class01499(class07492.T.get(kx), kx, lx, i1);
               this.m.T.add(class01499);
            }

            this.K = new class06937(N, 0, 173, 112);
            this.m.T.add(this.K);
         } else if (class06911.U() == class06936.field_41053) {
            this.m.T.clear();
            this.m.T.addAll(this.q);
            this.q = null;
         }

         if (g.U() == class06936.field_41055) {
            this.o.method_1862(true);
            this.o.method_1856(false);
            this.o.method_25365(true);
            if (class06911 != var1) {
               this.o.method_1852("");
            }

            this.y();
         } else {
            this.o.method_1862(false);
            this.o.method_1856(true);
            this.o.method_25365(false);
            this.o.method_1852("");
         }

         this.I = 0.0F;
         this.m.y(0.0F);
      }
   }

   @Override
   protected boolean N(double var1, double var3, int var5, int var6) {
      boolean flag = var1 < var5 || var3 < var6 || var1 >= var5 + this.B || var3 >= var6 + this.Z;
      this.H = flag && !this.N(g, var1, var3);
      return this.H;
   }

   protected void N(class01054 var1, int var2, int var3, class06911 var4) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, var2, var3, var4, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         boolean flag = var4 == g;
         boolean flag1 = var4.M() == class06909.field_41049;
         int i = var4.R();
         int j = this.T + this.y(var4);
         int kx = this.b - (flag1 ? 28 : -(this.Z - 4));
         class01894[] aclass01894;
         if (flag1) {
            aclass01894 = flag ? n : u;
         } else {
            aclass01894 = flag ? G : t;
         }

         if (!flag && var2 > j && var3 > kx && var2 < j + 26 && var3 < kx + 32) {
            var1.N(class06608.u);
         }

         var1.N(class08394.Na, aclass01894[class04995.N(i, 0, aclass01894.length)], j, kx, 26, 32);
         int lx = j + 13 - 8;
         int i1 = kx + 16 - 8 + (flag1 ? 1 : -1);
         var1.N(var4.y(), lx, i1);
      }
   }

   protected boolean N(class01054 var1, class06911 var2, int var3, int var4) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, var3, var4, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return callbackinforeturnable.getReturnValueZ();
      } else {
         int i = this.y(var2);
         int j = this.L(var2);
         if (this.N(i + 3, j + 3, 21, 27, var3, var4)) {
            var1.N(this.field_22793, var2.N(), var3, var4);
            return true;
         } else {
            return false;
         }
      }
   }

   private boolean N(@Nullable class06937 var1) {
      return var1 != null && var1.L == N;
   }

   private void N(String var1) {
      int i = var1.indexOf(58);
      Predicate predicate;
      if (i == -1) {
         predicate = var1x -> var1x.N().contains(var1);
      } else {
         String s = var1.substring(0, i).trim();
         String s1 = var1.substring(i + 1).trim();
         predicate = var2x -> var2x.y().contains(s) && var2x.N().contains(s1);
      }

      class04206.B.U().map(class03552::B).filter(var1x -> predicate.test(var1x.y())).forEach(this.c::add);
   }

   @Override
   public void method_25426() {
      if (((class04453)this.field_22787.T_4).method_56992()) {
         super.method_25426();
         this.o = new class04927(this.field_22793, this.T + 82, this.b + 6, 80, 9, class00392.L("itemGroup.search"));
         this.o.method_1880(50);
         this.o.method_1858(false);
         this.o.method_1862(false);
         this.o.method_1868(-1);
         this.N(null);
         this.o.method_75351(false);
         this.method_25429(this.o);
         class06911 class06911 = g;
         g = class03771.y();
         this.N(class06911);
         ((class04453)this.field_22787.T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_2.y(this.V);
         this.V = new class06006(this.field_22787);
         ((class04453)this.field_22787.T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_2.N(this.V);
         if (!g.Z()) {
            this.N(class03771.y());
         }
      } else {
         this.field_22787.N(new class05410((class04453)this.field_22787.T_4));
      }

      this.y(null);
   }

   @Override
   public boolean method_25404(class06601 var1) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return callbackinforeturnable.getReturnValueZ();
      } else {
         this.e = false;
         if (g.U() != class06936.field_41055) {
            if (((class05630)this.field_22787.i_7).o.N(var1)) {
               this.e = true;
               this.N(class03771.i());
               return true;
            } else {
               return super.method_25404(var1);
            }
         } else {
            boolean flag = !this.N(this.s) || this.s.R();
            boolean flag1 = class04655.N(var1).i().isPresent();
            if (flag && flag1 && this.N(var1)) {
               this.e = true;
               return true;
            } else {
               String s = this.o.method_1882();
               if (this.o.method_25404(var1)) {
                  if (!Objects.equals(s, this.o.method_1882())) {
                     this.y();
                  }

                  return true;
               } else {
                  return this.o.method_25370() && this.o.method_1885() && !var1.i() ? true : super.method_25404(var1);
               }
            }
         }
      }
   }

   @Override
   public void method_25432() {
      super.method_25432();
      if ((class04453)this.field_22787.T_4 != null && ((class04453)this.field_22787.T_4).method_31548() != null) {
         ((class04453)this.field_22787.T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_2.y(this.V);
      }
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      this.a.N(var1, var2, var3);
      super.method_25394(var1, var2, var3, var4);

      for (class06911 class06911 : class03771.L()) {
         if (this.N(var1, class06911, var2, var3)) {
            break;
         }
      }

      if (this.K != null && g.U() == class06936.field_41053 && this.N(this.K.i, this.K.R, 16, 16, var2, var3)) {
         var1.N(this.field_22793, O, var2, var3);
      }

      this.a_(var1, var2, var3);
   }

   @Override
   public void method_25410(int var1, int var2) {
      int i = this.m.N(this.I);
      String s = this.o.method_1882();
      this.method_25423(var1, var2);
      this.o.method_1852(s);
      if (!this.o.method_1882().isEmpty()) {
         this.y();
      }

      this.I = this.m.N(i);
      this.m.y(this.I);
   }

   @Override
   public boolean method_64507() {
      return this.a.N();
   }

   @Override
   public boolean method_25403(class06613 var1, double var2, double var4) {
      if (this.J) {
         int i = this.b + 18;
         int j = i + 112;
         this.I = ((float)var1.t() - i - 7.5F) / (j - i - 15.0F);
         this.I = class04995.N(this.I, 0.0F, 1.0F);
         this.m.y(this.I);
         return true;
      } else {
         return super.method_25403(var1, var2, var4);
      }
   }

   @Override
   public boolean method_25401(double var1, double var3, double var5, double var7) {
      if (super.method_25401(var1, var3, var5, var7)) {
         return true;
      } else if (!this.L()) {
         return false;
      } else {
         this.I = this.m.N(this.I, var7);
         this.m.y(this.I);
         return true;
      }
   }

   @Override
   public boolean method_25400(class06626 var1) {
      if (this.e) {
         return false;
      } else if (g.U() != class06936.field_41055) {
         return false;
      } else {
         String s = this.o.method_1882();
         if (this.o.method_25400(var1)) {
            if (!Objects.equals(s, this.o.method_1882())) {
               this.y();
            }

            return true;
         } else {
            return false;
         }
      }
   }

   @Override
   public boolean method_25406(class06613 var1) {
      if (var1.v() == 0) {
         double d0 = var1.n() - this.T;
         double d1 = var1.t() - this.b;
         this.J = false;

         for (class06911 class06911 : class03771.L()) {
            if (this.N(class06911, d0, d1)) {
               this.N(class06911);
               return true;
            }
         }
      }

      return super.method_25406(var1);
   }

   @Override
   public boolean method_25402(class06613 var1, boolean var2) {
      if (var1.v() == 0) {
         double d0 = var1.n() - this.T;
         double d1 = var1.t() - this.b;

         for (class06911 class06911 : class03771.L()) {
            if (this.N(class06911, d0, d1)) {
               return true;
            }
         }

         if (g.U() != class06936.field_41053 && this.y(var1.n(), var1.t())) {
            this.J = this.L();
            return true;
         }
      }

      return super.method_25402(var1, var2);
   }

   @Override
   public boolean method_16803(class06601 var1) {
      this.e = false;
      return super.method_16803(var1);
   }

   public int getPageCount() {
      return FabricCreativeGuiComponents.getPageCount();
   }

   public boolean hasAdditionalPages() {
      return class03771.L().size() > (Objects.requireNonNull(class03771.P).y() ? 14 : 13);
   }

   public boolean switchToPage(int var1) {
      if (!this.N(var1)) {
         return false;
      } else if (p == var1) {
         return false;
      } else {
         p = var1;
         this.i();
         return true;
      }
   }

   public int getCurrentPage() {
      return p;
   }

   public class06911 getSelectedItemGroup() {
      return g;
   }

   public List getItemGroupsOnPage(int var1) {
      return class03771.L()
         .stream()
         .filter(var2 -> this.getPage(var2) == var1)
         .sorted(Comparator.comparing(class06911::M).thenComparingInt(class06911::R))
         .sorted((var0, var1x) -> Boolean.compare(var0.z(), var1x.z()))
         .toList();
   }

   public boolean setSelectedItemGroup(class06911 var1) {
      Objects.requireNonNull(var1, "itemGroup");
      if (g == var1) {
         return false;
      } else if (p != this.getPage(var1) && !this.switchToPage(this.getPage(var1))) {
         return false;
      } else {
         this.N(var1);
         return true;
      }
   }

   public int getPage(class06911 var1) {
      return FabricCreativeGuiComponents.COMMON_GROUPS.contains(var1) ? p : var1.fabric_getPage();
   }
}
