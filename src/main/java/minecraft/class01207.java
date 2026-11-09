package minecraft;

import Nursultan.class09444;
import Nursultan.class09451;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class01207 {
   private static final Logger E = LogUtils.getLogger();
   public static final String N = "palette";
   public static final String y = "palettes";
   public static final String L = "entities";
   public static final String u = "blocks";
   public static final String i = "pos";
   public static final String R = "state";
   public static final String M = "nbt";
   public static final String B = "pos";
   public static final String Z = "blockPos";
   public static final String z = "nbt";
   public static final String U = "size";
   private final List<class09444> W = Lists.newArrayList();
   private final List<class09451> m = Lists.newArrayList();
   private class00753 P = class00753.field_11176;
   private String s = "?";

   public class01207() {
      super();
   }

   public class05163 y(class01233 var1, class07209 var2) {
      return this.N(var2, var1.u(), var1.i(), var1.L());
   }

   public String y() {
      return this.s;
   }

   public static class04853 N(class07001 var0, class00500 var1) {
      return var0.<class04853>N_15("joint", class04853.field_54790).orElseGet(() -> N(var1));
   }

   private class07741 N(int... var1) {
      class07741 class07741 = new class07741();

      for (int ix : var1) {
         class07741.add(class07720.N(ix));
      }

      return class07741;
   }

   private class07741 N(double... var1) {
      class07741 class07741 = new class07741();

      for (double d0 : var1) {
         class07741.add(class07019.N(d0));
      }

      return class07741;
   }

   public static class04853 N(class00500 var0) {
      return class04884.U(var0).z().L() ? class04853.field_23330 : class04853.field_23329;
   }

   private static void N(class01228 var0, List<class01228> var1, List<class01228> var2, List<class01228> var3) {
      if (var0.L() != null) {
         var2.add(var0);
      } else if (!var0.y().i().m() && var0.y().W(class00515.field_12294, class07209.field_10980)) {
         var1.add(var0);
      } else {
         var3.add(var0);
      }
   }

   protected static class05163 N(class07209 var0, class06993 var1, class07209 var2, class07111 var3, class00753 var4) {
      class00753 class00753 = var4.method_34592(-1, -1, -1);
      class07209 class07209x = N(class07209.field_10980, var3, var1, var2);
      class07209 class07209x = N(class07209.field_10980.method_10081(class00753), var3, var1, var2);
      return class05163.N(class07209x, class07209x).N((class00753)var0);
   }

   public class07001 N(class07001 var1) {
      if (this.W.isEmpty()) {
         var1.N("blocks", new class07741());
         var1.N("palette", new class07741());
      } else {
         ArrayList arraylist = Lists.newArrayList();
         class01204 var3 = new class01204();
         arraylist.add(var3);

         for (int ix = 1; ix < this.W.size(); ix++) {
            arraylist.add(new class01204());
         }

         class07741 class07741xxx = new class07741();
         List<class01228> list = this.W.get(0).y();

         for (int j = 0; j < list.size(); j++) {
            class01228 var7 = list.get(j);
            class07001 class07001x = new class07001();
            class07001x.N("pos", this.N(var7.N().method_10263(), var7.N().method_10264(), var7.N().method_10260()));
            int k = var3.N(var7.y());
            class07001x.N("state", k);
            if (var7.L() != null) {
               class07001x.N("nbt", var7.L());
            }

            class07741xxx.add(class07001x);

            for (int var10 = 1; var10 < this.W.size(); var10++) {
               class01204 class01204x = (class01204)arraylist.get(var10);
               class01204x.N(this.W.get(var10).y().get(j).y(), k);
            }
         }

         var1.N("blocks", class07741xxx);
         if (arraylist.size() == 1) {
            class07741 class07741x = new class07741();

            for (class00500 class00500x : var3) {
               class07741x.add(class07717.N(class00500x));
            }

            var1.N("palette", class07741x);
         } else {
            class07741 class07741x = new class07741();

            for (class01204 class01204x : arraylist) {
               class07741 class07741xx = new class07741();

               for (class00500 class00500 : class01204x) {
                  class07741xx.add(class07717.N(class00500));
               }

               class07741x.add(class07741xx);
            }

            var1.N("palettes", class07741x);
         }
      }

      class07741 class07741xxxx = new class07741();

      for (class09451 class09451 : this.m) {
         class07001 class07001 = new class07001();
         class07001.N("pos", this.N(class09451.N.M, class09451.N.B, class09451.N.Z));
         class07001.N("blockPos", this.N(class09451.y.method_10263(), class09451.y.method_10264(), class09451.y.method_10260()));
         if (class09451.L != null) {
            class07001.N("nbt", class09451.L);
         }

         class07741xxxx.add(class07001);
      }

      var1.N("entities", class07741xxxx);
      var1.N("size", this.N(this.P.method_10263(), this.P.method_10264(), this.P.method_10260()));
      return class07717.i(var1);
   }

   public void N(class02055<class00891> var1, class07001 var2) {
      this.W.clear();
      this.m.clear();
      class07741 class07741x = var2.s("size");
      this.P = new class00753(class07741x.N(0, 0), class07741x.N(1, 0), class07741x.N(2, 0));
      class07741 class07741x = var2.s("blocks");
      Optional<class07741> optional = var2.P("palettes");
      if (optional.isPresent()) {
         for (int ix = 0; ix < optional.get().size(); ix++) {
            this.N(var1, optional.get().R(ix), class07741x);
         }
      } else {
         this.N(var1, var2.s("palette"), class07741x);
      }

      var2.s("entities").z().forEach(var1x -> {
         class07741 class07741xxx = var1x.s("pos");
         class06889 class06889 = new class06889(class07741xxx.N(0, 0.0), class07741xxx.N(1, 0.0), class07741xxx.N(2, 0.0));
         class07741 class07741x = var1x.s("blockPos");
         class07209 class07209 = new class07209(class07741x.N(0, 0), class07741x.N(1, 0), class07741x.N(2, 0));
         var1x.W("nbt").ifPresent(var3x -> this.m.add(new class09451(class06889, class07209, var3x)));
      });
   }

   private void N(class02055<class00891> var1, class07741 var2, class07741 var3) {
      class01204 class01204 = new class01204();

      for (int ix = 0; ix < var2.size(); ix++) {
         class01204.N(class07717.N(var1, var2.y(ix)), ix);
      }

      ArrayList arraylist2 = Lists.newArrayList();
      ArrayList arraylist = Lists.newArrayList();
      ArrayList arraylist1 = Lists.newArrayList();
      var3.z().forEach(var4x -> {
         class07741 class07741 = var4x.s("pos");
         class07209 class07209 = new class07209(class07741.N(0, 0), class07741.N(1, 0), class07741.N(2, 0));
         class00500 class00500 = class01204.N(var4x.y("state", 0));
         class07001 class07001 = var4x.W("nbt").orElse(null);
         N(new class01228(class07209, class00500, class07001), arraylist2, arraylist, arraylist1);
      });
      List<class01228> list = N(arraylist2, arraylist, arraylist1);
      this.W.add(new class09444(list));
   }

   public class00753 N() {
      return this.P;
   }

   public class07209 N(class07209 var1, class07111 var2, class06993 var3) {
      return N(var1, var2, var3, this.N().method_10263(), this.N().method_10260());
   }

   public void N(class07299 var1, class07209 var2, class00753 var3, boolean var4, List<class00891> var5) {
      if (var3.method_10263() >= 1 && var3.method_10264() >= 1 && var3.method_10260() >= 1) {
         class07209 class07209xxxx = var2.method_10081(var3).method_10069(-1, -1, -1);
         ArrayList arraylist = Lists.newArrayList();
         ArrayList arraylist1 = Lists.newArrayList();
         ArrayList arraylist2 = Lists.newArrayList();
         class07209 class07209x = new class07209(
            Math.min(var2.method_10263(), class07209xxxx.method_10263()),
            Math.min(var2.method_10264(), class07209xxxx.method_10264()),
            Math.min(var2.method_10260(), class07209xxxx.method_10260())
         );
         class07209 class07209xx = new class07209(
            Math.max(var2.method_10263(), class07209xxxx.method_10263()),
            Math.max(var2.method_10264(), class07209xxxx.method_10264()),
            Math.max(var2.method_10260(), class07209xxxx.method_10260())
         );
         this.P = var3;

         try (class04495 class04495 = new class04495(E)) {
            for (class07209 class07209xxx : class07209.method_10097(class07209x, class07209xx)) {
               class07209 class07209xxxx = class07209xxx.method_10059(class07209x);
               class00500 class00500 = var1.method_8320(class07209xxx);
               if (!var5.stream().anyMatch(class00500::N)) {
                  class00394 class00394 = var1.method_8321(class07209xxx);
                  class01228 class01228;
                  if (class00394 != null) {
                     class08303 class08303 = class08303.N(class04495, var1.method_30349());
                     class00394.u(class08303);
                     class01228 = new class01228(class07209xxxx, class00500, class08303.y());
                  } else {
                     class01228 = new class01228(class07209xxxx, class00500, null);
                  }

                  N(class01228, arraylist, arraylist1, arraylist2);
               }
            }

            List<class01228> list = N(arraylist, arraylist1, arraylist2);
            this.W.clear();
            this.W.add(new class09444(list));
            if (var4) {
               this.N(var1, class07209x, class07209xx, class04495);
            } else {
               this.m.clear();
            }
         }
      }
   }

   public static class07209 N(class01233 var0, class07209 var1) {
      return N(var1, var0.L(), var0.u(), var0.i());
   }

   public boolean N(class01001 var1, class07209 var2, class07209 var3, class01233 var4, class06069 var5, int var6) {
      if (this.W.isEmpty()) {
         return false;
      } else {
         List<class01228> list = var4.N(this.W, var2).y();
         if ((!list.isEmpty() || !var4.R() && !this.m.isEmpty()) && this.P.method_10263() >= 1 && this.P.method_10264() >= 1 && this.P.method_10260() >= 1) {
            class05163 class05163 = var4.M();
            ArrayList arraylist = Lists.newArrayListWithCapacity(var4.z() ? list.size() : 0);
            ArrayList arraylist1 = Lists.newArrayListWithCapacity(var4.z() ? list.size() : 0);
            ArrayList arraylist2 = Lists.newArrayListWithCapacity(list.size());
            int ix = Integer.MAX_VALUE;
            int j = Integer.MAX_VALUE;
            int k = Integer.MAX_VALUE;
            int l = Integer.MIN_VALUE;
            int i1 = Integer.MIN_VALUE;
            int j1 = Integer.MIN_VALUE;
            List<class01228> list1 = N(var1, var2, var3, var4, list);

            try (class04495 class04495 = new class04495(E)) {
               for (class01228 class01228 : list1) {
                  class07209 class07209xxx = class01228.N();
                  if (class05163 == null || class05163.y(class07209xxx)) {
                     class04688 class04688x = var4.z() ? var1.method_8316(class07209xxx) : null;
                     class00500 class00500 = class01228.y().N(var4.L()).N(var4.u());
                     if (class01228.L() != null) {
                        var1.method_8652(class07209xxx, class00869.ZX.W(), 820);
                     }

                     if (var1.method_8652(class07209xxx, class00500, var6)) {
                        ix = Math.min(ix, class07209xxx.method_10263());
                        j = Math.min(j, class07209xxx.method_10264());
                        k = Math.min(k, class07209xxx.method_10260());
                        l = Math.max(l, class07209xxx.method_10263());
                        i1 = Math.max(i1, class07209xxx.method_10264());
                        j1 = Math.max(j1, class07209xxx.method_10260());
                        arraylist2.add(Pair.of(class07209xxx, class01228.L()));
                        if (class01228.L() != null) {
                           class00394 class00394 = var1.method_8321(class07209xxx);
                           if (class00394 != null) {
                              if (!class07529.K && class00394 instanceof class03136) {
                                 class01228.L().N("LootTableSeed", var5.B());
                              }

                              class00394.y_1(class08308.N(class04495.N_46(class00394.J()), var1.method_30349(), class01228.L()));
                           }
                        }

                        if (class04688x != null) {
                           if (class00500.Y().u()) {
                              arraylist1.add(class07209xxx);
                           } else if (class00500.i() instanceof class07132) {
                              ((class07132)class00500.i()).N(var1, class07209xxx, class00500, class04688x);
                              if (!class04688x.u()) {
                                 arraylist.add(class07209xxx);
                              }
                           }
                        }
                     }
                  }
               }

               boolean flag = true;
               class07211[] aclass07211 = new class07211[]{
                  class07211.field_11036, class07211.field_11043, class07211.field_11034, class07211.field_11035, class07211.field_11039
               };

               while (flag && !arraylist.isEmpty()) {
                  flag = false;
                  Iterator iterator = arraylist.iterator();

                  while (iterator.hasNext()) {
                     class07209 class07209 = (class07209)iterator.next();
                     class04688 class04688x = var1.method_8316(class07209);

                     for (int i2 = 0; i2 < aclass07211.length && !class04688x.u(); i2++) {
                        class07209 class07209x = class07209.method_10093(aclass07211[i2]);
                        class04688 class04688xx = var1.method_8316(class07209x);
                        if (class04688xx.u() && !arraylist1.contains(class07209x)) {
                           class04688x = class04688xx;
                        }
                     }

                     if (class04688x.u()) {
                        class00500 class00500x = var1.method_8320(class07209);
                        class00891 class00891 = class00500x.i();
                        if (class00891 instanceof class07132) {
                           ((class07132)class00891).N(var1, class07209, class00500x, class04688x);
                           flag = true;
                           iterator.remove();
                        }
                     }
                  }
               }

               if (ix <= l) {
                  if (!var4.B()) {
                     class06890 class06890 = new class06890(l - ix + 1, i1 - j + 1, j1 - k + 1);
                     int k1 = ix;
                     int l1 = j;
                     int j2 = k;

                     for (Pair pair1 : arraylist2) {
                        class07209 class07209x = (class07209)pair1.getFirst();
                        class06890.method_1049(class07209x.method_10263() - k1, class07209x.method_10264() - l1, class07209x.method_10260() - j2);
                     }

                     N(var1, var6, class06890, k1, l1, j2);
                  }

                  for (Pair pair : arraylist2) {
                     class07209 class07209xxxx = (class07209)pair.getFirst();
                     if (!var4.B()) {
                        class00500 class00500x = var1.method_8320(class07209xxxx);
                        class00500 class00500xx = class00891.a_(class00500x, var1, class07209xxxx);
                        if (class00500x != class00500xx) {
                           var1.method_8652(class07209xxxx, class00500xx, var6 & -2 | 16);
                        }

                        var1.method_8408(class07209xxxx, class00500xx.i());
                     }

                     if (pair.getSecond() != null) {
                        class00394 class00394x = var1.method_8321(class07209xxxx);
                        if (class00394x != null) {
                           class00394x.method_5431();
                        }
                     }
                  }
               }

               if (!var4.R()) {
                  this.N(var1, var2, var4.L(), var4.u(), var4.i(), class05163, var4.U(), class04495);
               }
            }

            return true;
         } else {
            return false;
         }
      }
   }

   public static void N(class07284 var0, int var1, class07739 var2, class07209 var3) {
      N(var0, var1, var2, var3.method_10263(), var3.method_10264(), var3.method_10260());
   }

   public static void N(class07284 var0, int var1, class07739 var2, int var3, int var4, int var5) {
      class07218 class07218x = new class07218();
      class07218 class07218x = new class07218();
      var2.method_1046((var7x, var8, var9, var10) -> {
         class07218x.N(var3 + var8, var4 + var9, var5 + var10);
         class07218.N(class07218x, var7x);
         class00500 class00500xxx = var0.method_8320(class07218x);
         class00500 class00500x = var0.method_8320(class07218);
         class00500 class00500xx = class00500xxx.N(var0, var0, class07218x, var7x, class07218, class00500x, var0.method_8409());
         if (class00500xxx != class00500xx) {
            var0.method_8652(class07218x, class00500xx, var1 & -2);
         }

         class00500 class00500xxx = class00500x.N(var0, var0, class07218, var7x.b(), class07218x, class00500xx, var0.method_8409());
         if (class00500x != class00500xxx) {
            var0.method_8652(class07218, class00500xxx, var1 & -2);
         }
      });
   }

   public static List<class01228> N(class01001 var0, class07209 var1, class07209 var2, class01233 var3, List<class01228> var4) {
      ArrayList arraylist = new ArrayList();
      List<class01228> list = new ArrayList<>();

      for (class01228 class01228x : var4) {
         class07209 class07209 = N(var3, class01228x.N()).method_10081(var1);
         class01228 class01228x = new class01228(class07209, class01228x.y(), class01228x.L() != null ? class01228x.L().N() : null);
         Iterator<class01219> iterator = var3.Z().iterator();

         while (class01228x != null && iterator.hasNext()) {
            class01228x = iterator.next().N(var0, var1, var2, class01228x, class01228x, var3);
         }

         if (class01228x != null) {
            list.add(class01228x);
            arraylist.add(class01228x);
         }
      }

      for (class01219 class01219 : var3.Z()) {
         list = class01219.N(var0, var1, var2, arraylist, list, var3);
      }

      return list;
   }

   private void N(class07299 var1, class07209 var2, class07209 var3, class04490 var4) {
      List<class07049> list = var1.N(class07049.class, class00734.N(var2, var3), var0 -> !(var0 instanceof class08036));
      this.m.clear();

      for (class07049 class07049 : list) {
         class06889 class06889 = new class06889(
            class07049.method_23317() - var2.method_10263(), class07049.method_23318() - var2.method_10264(), class07049.method_23321() - var2.method_10260()
         );
         class08303 class08303 = class08303.N(var4.N_46(class07049.method_71370()), class07049.method_56673());
         class07049.method_5662(class08303);
         class07209 class07209;
         if (class07049 instanceof class00698) {
            class07209 = ((class00698)class07049).s().method_10059(var2);
         } else {
            class07209 = class07209.method_49638(class06889);
         }

         this.m.add(new class09451(class06889, class07209, class08303.y().N()));
      }
   }

   public List<class01228> N(class07209 var1, class01233 var2, class00891 var3) {
      return this.N(var1, var2, var3, true);
   }

   public List<class01203> N(class07209 var1, class06993 var2) {
      if (this.W.isEmpty()) {
         return new ArrayList<>();
      } else {
         class01233 class01233 = new class01233().N(var2);
         List<class01203> list = class01233.N(this.W, var1).N();
         ArrayList arraylist = new ArrayList(list.size());

         for (class01203 class01203 : list) {
            class01228 class01228 = class01203.N();
            arraylist.add(class01203.y(new class01228(N(class01233, class01228.N()).method_10081(var1), class01228.y().N(class01233.u()), class01228.L())));
         }

         return arraylist;
      }
   }

   public ObjectArrayList<class01228> N(class07209 var1, class01233 var2, class00891 var3, boolean var4) {
      ObjectArrayList objectarraylist = new ObjectArrayList();
      class05163 class05163 = var2.M();
      if (this.W.isEmpty()) {
         return objectarraylist;
      } else {
         for (class01228 class01228 : var2.N(this.W, var1).N(var3)) {
            class07209 class07209 = var4 ? N(var2, class01228.N()).method_10081(var1) : class01228.N();
            if (class05163 == null || class05163.y(class07209)) {
               objectarraylist.add(new class01228(class07209, class01228.y().N(var2.u()), class01228.L()));
            }
         }

         return objectarraylist;
      }
   }

   public class07209 N(class01233 var1, class07209 var2, class01233 var3, class07209 var4) {
      class07209 class07209x = N(var1, var2);
      class07209 class07209x = N(var3, var4);
      return class07209x.method_10059(class07209x);
   }

   public static class06889 N(class06889 var0, class07111 var1, class06993 var2, class07209 var3) {
      double d0 = var0.M;
      double d1 = var0.B;
      double d2 = var0.Z;
      boolean flag = true;
      switch (var1) {
         case field_11300:
            d2 = 1.0 - d2;
            break;
         case field_11301:
            d0 = 1.0 - d0;
            break;
         default:
            flag = false;
      }

      int ix = var3.method_10263();
      int j = var3.method_10260();
      switch (var2) {
         case field_11465:
            return new class06889(ix - j + d2, d1, ix + j + 1 - d0);
         case field_11463:
            return new class06889(ix + j + 1 - d2, d1, j - ix + d0);
         case field_11464:
            return new class06889(ix + ix + 1 - d0, d1, j + j + 1 - d2);
         default:
            return flag ? new class06889(d0, d1, d2) : var0;
      }
   }

   public void N(String var1) {
      this.s = var1;
   }

   public static class07209 N(class07209 var0, class07111 var1, class06993 var2, int var3, int var4) {
      var3--;
      var4--;
      int ix = var1 == class07111.field_11301 ? var3 : 0;
      int j = var1 == class07111.field_11300 ? var4 : 0;
      class07209 class07209 = var0;
      switch (var2) {
         case field_11465:
            class07209 = var0.method_10069(j, 0, var3 - ix);
            break;
         case field_11463:
            class07209 = var0.method_10069(var4 - j, 0, ix);
            break;
         case field_11464:
            class07209 = var0.method_10069(var3 - ix, 0, var4 - j);
            break;
         case field_11467:
            class07209 = var0.method_10069(ix, 0, j);
      }

      return class07209;
   }

   private static List<class01228> N(List<class01228> var0, List<class01228> var1, List<class01228> var2) {
      Comparator comparator = Comparator.<class01228>comparingInt(var0x -> var0x.N().method_10264())
         .thenComparingInt(var0x -> var0x.N().method_10263())
         .thenComparingInt(var0x -> var0x.N().method_10260());
      var0.sort(comparator);
      var2.sort(comparator);
      var1.sort(comparator);
      ArrayList arraylist = Lists.newArrayList();
      arraylist.addAll(var0);
      arraylist.addAll(var2);
      arraylist.addAll(var1);
      return arraylist;
   }

   public class05163 N(class07209 var1, class06993 var2, class07209 var3, class07111 var4) {
      return N(var1, var2, var3, var4, this.P);
   }

   private void N(class01001 var1, class07209 var2, class07111 var3, class06993 var4, class07209 var5, @Nullable class05163 var6, boolean var7, class04490 var8) {
      for (class09451 class09451 : this.m) {
         class07209 class07209 = N(class09451.y, var3, var4, var5).method_10081(var2);
         if (var6 == null || var6.y(class07209)) {
            class07001 class07001 = class09451.L.N();
            class06889 class06889 = N(class09451.N, var3, var4, var5).y(var2.method_10263(), var2.method_10264(), var2.method_10260());
            class07741 class07741 = new class07741();
            class07741.add(class07019.N(class06889.M));
            class07741.add(class07019.N(class06889.B));
            class07741.add(class07019.N(class06889.Z));
            class07001.N("Pos", class07741);
            class07001.b("UUID");
            N(var8, var1, class07001).ifPresent(var5x -> {
               float f = var5x.method_5832(var4);
               f += var5x.method_5763(var3) - var5x.method_36454();
               var5x.method_5808(class06889.M, class06889.B, class06889.Z, f, var5x.method_36455());
               var5x.method_5636(f);
               var5x.method_5847(f);
               if (var7 && var5x instanceof class07079) {
                  ((class07079)var5x).N(var1, var1.method_8404(class07209.method_49638(class06889)), class06113.field_16474, null);
               }

               var1.y(var5x);
            });
         }
      }
   }

   private static Optional<class07049> N(class04490 var0, class01001 var1, class07001 var2) {
      try {
         return class07078.N(class08308.N(var0, var1.method_30349(), var2), var1.method_8410(), class06113.field_16474);
      } catch (Exception exception) {
         return Optional.empty();
      }
   }

   public class00753 N(class06993 var1) {
      switch (var1) {
         case field_11465:
         case field_11463:
            return new class00753(this.P.method_10260(), this.P.method_10264(), this.P.method_10263());
         default:
            return this.P;
      }
   }

   public static class07209 N(class07209 var0, class07111 var1, class06993 var2, class07209 var3) {
      int ix = var0.method_10263();
      int j = var0.method_10264();
      int k = var0.method_10260();
      boolean flag = true;
      switch (var1) {
         case field_11300:
            k = -k;
            break;
         case field_11301:
            ix = -ix;
            break;
         default:
            flag = false;
      }

      int l = var3.method_10263();
      int i1 = var3.method_10260();
      switch (var2) {
         case field_11465:
            return new class07209(l - i1 + k, j, l + i1 - ix);
         case field_11463:
            return new class07209(l + i1 - k, j, i1 - l + ix);
         case field_11464:
            return new class07209(l + l - ix, j, i1 + i1 - k);
         default:
            return flag ? new class07209(ix, j, k) : var0;
      }
   }
}
